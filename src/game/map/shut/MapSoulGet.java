package game.map.shut;

import game.data.shut.SoulGetData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * PVP 获得奖励表
 */
public final class MapSoulGet implements IMap, IParse {

	private static MapSoulGet instance;

	private Map<Integer, SoulGetData> map;

	private MapSoulGet() {
		map = new HashMap<Integer, SoulGetData>();
	}

	public static MapSoulGet getInstance() {
		if (null == instance) {
			instance = new MapSoulGet();
		}
		return instance;
	}

	public Map<Integer, SoulGetData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof SoulGetData) {
			SoulGetData data = (SoulGetData) obj;
			map.put(data.getLevel(), data);
		}
	}

	public SoulGetData getData(int level) {
		return map.get(level);
	}

	@Override
	public String getBeanName() {
		return "value.shut.get.so";
	}

	@Override
	public String getIDataName() {
		return SoulGetData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
