package game.map.card;

import game.data.card.CardIdData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 卡牌数值表
 * 
 * @author un5n.com
 */
public class MapCardId implements IMap, IParse {

	private Map<Integer, CardIdData> map;

	private static MapCardId instance;

	private MapCardId() {
		map = new HashMap<Integer, CardIdData>();
	}

	public static MapCardId getInstance() {
		if (null == instance)
			instance = new MapCardId();
		return instance;
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

	public Map<Integer, CardIdData> getMap() {
		return map;
	}

	public CardIdData getCardData(int cardId) {
		CardIdData data = null;
		try {
			data = map.get(cardId).clone();
		} catch (Exception e) {
			System.out.println(cardId);
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public String getBeanName() {
		return "value.card.data.so";
	}

	public String getIDataName() {
		return CardIdData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
