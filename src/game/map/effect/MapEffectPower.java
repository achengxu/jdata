package game.map.effect;

import game.data.effect.EffectItemData;
import game.data.effect.EffectPowerData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Title: MapEffectPower
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

public final class MapEffectPower implements IMap, IParse {

	private static EffectItemData instance;

	private Map<Integer, EffectPowerData> map;

	private MapEffectPower() {
		map = new HashMap<Integer, EffectPowerData>();
	}

	public static final EffectItemData getInstance() {
		if (null == instance) {
			instance = new EffectItemData();
		}
		return instance;
	}

	@Override
	public Map<Integer, EffectPowerData> getMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof EffectPowerData) {
			EffectPowerData data = (EffectPowerData) obj;
			map.put(data.getId(), data);
		}
	}

	public EffectPowerData getData(int id) {
		return map.get(id);
	}

	@Override
	public String getBeanName() {
		return "value.effect.power.so";
	}

	@Override
	public String getIDataName() {
		return EffectPowerData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
