package game.map.shut;

import game.data.shut.SoulData;
import game.map.IMap;
import game.map.IParse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 碎片表
 */
public class MapSoul implements IMap, IParse {

	private static MapSoul instance;

	private Map<Integer, SoulData> map;

	private Map<Integer, List<Integer>> cardMap;

	private MapSoul() {
		map = new HashMap<Integer, SoulData>();
		cardMap = new HashMap<Integer, List<Integer>>();
	}

	public static MapSoul getInstance() {
		if (null == instance)
			instance = new MapSoul();
		return instance;
	}

	public SoulData getData(int soulId) {
		return map.get(soulId);
	}

	public Map<Integer, SoulData> getMap() {
		return map;
	}

	public Map<Integer, List<Integer>> getCardMap() {
		return cardMap;
	}

	public void add(Object obj) {
		if (obj instanceof SoulData) {
			SoulData data = (SoulData) obj;
			int soulId = data.getId();
			int cardId = data.getCardId();
			map.put(soulId, data);
			if (cardMap.containsKey(cardId)) {
				cardMap.get(cardId).add(soulId);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(soulId);
				cardMap.put(cardId, list);
			}
		}
	}

	@Override
	public String getBeanName() {
		return "value.shut.soul.so";
	}

	@Override
	public String getIDataName() {
		return SoulData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
