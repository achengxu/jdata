package game.map.effect;

import java.util.HashMap;
import java.util.Map;

import game.data.effect.EffectStartData;
import game.map.IMap;
import game.map.IParse;

/**
 * <p>
 * Title: MapEffectStart
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

public final class MapEffectStart implements IMap,IParse {

	private static MapEffectStart instance;

	private Map<Integer, EffectStartData> map;

	private MapEffectStart() {
		map = new HashMap<Integer, EffectStartData>();
	}

	public static final MapEffectStart getInstance() {
		if (null == instance) {
			instance = new MapEffectStart();
		}
		return instance;
	}

	@Override
	public Map<Integer, EffectStartData> getMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof EffectStartData) {
			EffectStartData data = (EffectStartData) obj;
			map.put(data.getId(), data);
		}
	}

	public EffectStartData getData(int id) {
		return map.get(id);
	}

	@Override
	public String getBeanName() {
		return "value.effect.start.so";
	}

	@Override
	public String getIDataName() {
		return EffectStartData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
