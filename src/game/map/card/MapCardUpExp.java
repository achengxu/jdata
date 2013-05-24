package game.map.card;

import game.data.card.CardUpExpData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

public final class MapCardUpExp implements IMap,IParse {

	private static MapCardUpExp instance;

	private Map<Integer, Map<Integer, CardUpExpData>> map;

	private MapCardUpExp() {
		map = new HashMap<Integer, Map<Integer, CardUpExpData>>();
	}

	public static MapCardUpExp getInstance() {
		if (null == instance) {
			instance = new MapCardUpExp();
		}
		return instance;
	}

	@Override
	public Map<?, ?> getMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof CardUpExpData) {
			CardUpExpData data = (CardUpExpData) obj;
			int start = data.getStar();
			int level = data.getLevel();
			if (map.containsKey(start)) {
				map.get(start).put(level, data);
			} else {
				Map<Integer, CardUpExpData> info = new HashMap<Integer, CardUpExpData>();
				info.put(level, data);
				map.put(start, info);
			}
		}
	}

	public Map<Integer, CardUpExpData> getData(int start) {
		return map.get(start);
	}

	@Override
	public String getBeanName() {
		return "value.card.upexp.so";
	}

	@Override
	public String getIDataName() {
		return CardUpExpData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
