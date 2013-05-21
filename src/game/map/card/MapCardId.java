package game.map.card;

import game.data.card.CardIdData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 卡牌数值表
 * 
 * @author un5n.com
 */
public class MapCardId implements IMap {

	private HashMap<Integer, CardIdData> map;

	private static MapCardId card;

	private MapCardId() {
		map = new HashMap<Integer, CardIdData>();
	}

	public static MapCardId getInstance() {
		if (null == card)
			card = new MapCardId();
		return card;
	}

	public void add(Object data) {
		if (null != data) {
			if (data instanceof CardIdData)
				map.put(((CardIdData) data).getId(), (CardIdData) data);
		}
	}

	public void clear() {
		map.clear();

	}

	public HashMap<Integer, CardIdData> toMap() {
		return map;
	}

	public CardIdData getCardData(int cardId) {
		CardIdData data = null;
		try {
			data = map.get(cardId).clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
