package game.map.card;

import game.data.card.CardTakeData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 抽卡表
 */
public final class MapCardTake implements IMap {

	private static MapCardTake root;

	private HashMap<Integer, CardTakeData> map;

	private MapCardTake() {
		map = new HashMap<Integer, CardTakeData>();
	}

	public static MapCardTake getInstance() {
		if (null == root) {
			root = new MapCardTake();
		}
		return root;
	}

	public HashMap<Integer, CardTakeData> toMap() {
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

}
