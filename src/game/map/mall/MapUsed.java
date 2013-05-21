package game.map.mall;

import game.data.mall.UsedData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 消耗表
 */
public class MapUsed implements IMap {

	private static MapUsed _map;

	private HashMap<Integer, UsedData> map;

	private MapUsed() {
		map = new HashMap<Integer, UsedData>();
	}

	public static MapUsed getInstance() {
		if (null == _map)
			_map = new MapUsed();
		return _map;
	}

	public UsedData getData(int consuId) {
		return map.get(consuId);
	}

	public HashMap<Integer, UsedData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof UsedData) {
			UsedData data = (UsedData) obj;
			map.put(data.getId(), data);
		}
	}
}
