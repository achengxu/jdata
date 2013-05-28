package game.map.effect;

import game.data.effect.EffectTaskData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Title: MapEffectTaskData
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

public final class MapEffectTaskData implements IMap, IParse {

	private static MapEffectTaskData instance;

	private Map<Integer, EffectTaskData> map;

	private MapEffectTaskData() {
		map = new HashMap<Integer, EffectTaskData>();
	}

	public static final MapEffectTaskData getInstance() {
		if (null == instance) {
			instance = new MapEffectTaskData();
		}
		return instance;
	}

	@Override
	public Map<Integer, EffectTaskData> getMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof EffectTaskData) {
			EffectTaskData data = (EffectTaskData) obj;
			map.put(data.getId(), data);
		}
	}

	public EffectTaskData getData(int id) {
		return map.get(id);
	}

	@Override
	public String getBeanName() {
		return "value.effect.task.so";
	}

	@Override
	public String getIDataName() {
		return EffectTaskData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
