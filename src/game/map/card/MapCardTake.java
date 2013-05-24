package game.map.card;

import game.data.card.CardTakeData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 抽卡表
 */
public final class MapCardTake implements IMap, IParse {

	private static MapCardTake instance;

	private Map<Integer, CardTakeData> map;

	private MapCardTake() {
		map = new HashMap<Integer, CardTakeData>();
	}

	public static MapCardTake getInstance() {
		if (null == instance) {
			instance = new MapCardTake();
		}
		return instance;
	}

	public Map<Integer, CardTakeData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof CardTakeData) {
			CardTakeData data = (CardTakeData) obj;
			int id = data.getId();
			map.put(id, data);
		}
	}

	public CardTakeData getData(int id) {
		return map.get(id);
	}

	@Override
	public String getBeanName() {
		return "value.card.take.so";
	}

	@Override
	public String getIDataName() {
		return CardTakeData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
