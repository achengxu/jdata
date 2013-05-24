package game.map.effect;

import game.data.effect.EffectDJData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Title: MapEffectDJ
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2013
 * </p>
 * 
 * @author linxiaokai.cn
 * @version 1.0 2013-5-24
 */

public final class MapEffectDJ implements IMap, IParse {

	private static MapEffectDJ instance;

	private Map<Integer, EffectDJData> map;

	private MapEffectDJ() {
		map = new HashMap<Integer, EffectDJData>();
	}

	public static final MapEffectDJ getInstance() {
		if (null == instance) {
			instance = new MapEffectDJ();
		}
		return instance;
	}

	@Override
	public Map<Integer, EffectDJData> getMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof EffectDJData) {
			EffectDJData data = (EffectDJData) obj;
			map.put(data.getId(), data);
		}
	}

	public EffectDJData getData(int id) {
		return map.get(id);
	}

	@Override
	public String getBeanName() {
		return "value.effect.dj.so";
	}

	@Override
	public String getIDataName() {
		return EffectDJData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
