package game.map.shut;

import game.data.shut.SoulData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 碎片表
 */
public class MapSoul implements IMap {

	private static MapSoul data;

	private HashMap<Integer, SoulData> map;

	private MapSoul() {
		map = new HashMap<Integer, SoulData>();
	}

	public static MapSoul getInstance() {
		if (null == data)
			data = new MapSoul();
		return data;
	}

	public SoulData getData(int soulId) {
		return map.get(soulId);
	}

	public HashMap<Integer, SoulData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof SoulData) {
			SoulData data = (SoulData) obj;
			map.put(data.getId(), data);
		}
	}

}
