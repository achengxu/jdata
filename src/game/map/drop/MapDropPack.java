package game.map.drop;

import game.data.drop.DropPackData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

public class MapDropPack implements IMap,IParse {

	private static MapDropPack instance;

	private Map<Integer, DropPackData> map;

	private MapDropPack() {
		map = new HashMap<Integer, DropPackData>();
	}

	public static MapDropPack getInstance() {
		if (null == instance) {
			instance = new MapDropPack();
		}
		return instance;
	}

	public Map<Integer, DropPackData> getMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof DropPackData) {
			DropPackData data = (DropPackData) obj;
			map.put(data.getId(), data);
		}
	}

	public DropPackData getData(int id) {
		return map.get(id);
	}

	@Override
	public String getBeanName() {
		return "value.drop.data.so";
	}

	@Override
	public String getIDataName() {
		return DropPackData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
