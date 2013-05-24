package game.map.effect;

import game.data.effect.EffectCardData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Title: MapEffectCard
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

public final class MapEffectCard implements IMap, IParse {

	private static MapEffectCard instance;

	private Map<Integer, EffectCardData> map;

	private MapEffectCard() {
		map = new HashMap<Integer, EffectCardData>();
	}

	public static final MapEffectCard getInstance() {
		if (null == instance) {
			instance = new MapEffectCard();
		}
		return instance;
	}

	public Map<Integer, EffectCardData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof EffectCardData) {
			EffectCardData data = (EffectCardData) obj;
			map.put(data.getId(), data);
		}
	}

	public EffectCardData getData(int id) {
		return map.get(id);
	}

	@Override
	public String getBeanName() {
		return "value.effect.card.so";
	}

	@Override
	public String getIDataName() {
		return EffectCardData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
