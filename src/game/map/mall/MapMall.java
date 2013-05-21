package game.map.mall;

import game.data.mall.MallData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 商城表
 */
public class MapMall implements IMap {

	private static MapMall _map;

	private HashMap<Integer, MallData> map;

	private MapMall() {
		map = new HashMap<Integer, MallData>();
	}

	public static MapMall getInstance() {
		if (null == _map)
			_map = new MapMall();
		return _map;
	}

	public MallData getData(int mallDataId) {
		return map.get(mallDataId);
	}

	public HashMap<Integer, MallData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof MallData) {
			MallData data = (MallData) obj;
			map.put(data.getItemId(), data);
		}
	}

}
