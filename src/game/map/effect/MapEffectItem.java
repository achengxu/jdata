package game.map.effect;

import game.data.effect.EffectItemData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Title: MapEffectItem
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

public final class MapEffectItem implements IMap,IParse {

	private static MapEffectItem instance;

	private Map<Integer, EffectItemData> map;

	private MapEffectItem() {
		map = new HashMap<Integer, EffectItemData>();
	}

	public static final MapEffectItem getInstance() {
		if (null == instance) {
			instance = new MapEffectItem();
		}
		return instance;
	}

	public Map<Integer, EffectItemData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof EffectItemData) {
			EffectItemData data = (EffectItemData) obj;
			map.put(data.getId(), data);
		}
	}

	public EffectItemData getData(int id) {
		return map.get(id);
	}

	@Override
	public String getBeanName() {
		return "value.effect.item.so";
	}

	@Override
	public String getIDataName() {
		return EffectItemData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
