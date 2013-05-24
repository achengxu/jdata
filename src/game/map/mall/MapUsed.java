package game.map.mall;

import game.data.mall.UsedData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 消耗表
 */
public class MapUsed implements IMap,IParse {

	private static MapUsed instance;

	private Map<Integer, UsedData> map;

	private MapUsed() {
		map = new HashMap<Integer, UsedData>();
	}

	public static MapUsed getInstance() {
		if (null == instance)
			instance = new MapUsed();
		return instance;
	}

	public UsedData getData(int consuId) {
		return map.get(consuId);
	}

	public Map<Integer, UsedData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof UsedData) {
			UsedData data = (UsedData) obj;
			map.put(data.getId(), data);
		}
	}

	@Override
	public String getBeanName() {
		return "value.mall.consu.so";
	}

	@Override
	public String getIDataName() {
		return UsedData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
