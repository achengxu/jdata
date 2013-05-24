package game.map.task;

import game.data.task.DropGetData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 掉落完成度表
 */
public class MapDropGet implements IMap,IParse {

	private static MapDropGet instance;

	private Map<Integer, DropGetData> map;

	private MapDropGet() {
		map = new HashMap<Integer, DropGetData>();
	}

	public static MapDropGet getInstance() {
		if (null == instance) {
			instance = new MapDropGet();
		}
		return instance;
	}

	public DropGetData getData(int id) {
		return map.get(id);
	}

	public Map<Integer, DropGetData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof DropGetData) {
			DropGetData data = (DropGetData) obj;
			map.put(data.getId(), data);
		}
	}

	@Override
	public String getBeanName() {
		return null;
	}

	@Override
	public String getIDataName() {
		return DropGetData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
