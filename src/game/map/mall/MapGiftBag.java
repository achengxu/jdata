package game.map.mall;

import game.data.mall.GiftBagData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 礼包
 */
public class MapGiftBag implements IMap {

	private static MapGiftBag root;

	private HashMap<Integer, GiftBagData> map;

	private MapGiftBag() {
		map = new HashMap<Integer, GiftBagData>();
	}

	public static MapGiftBag getInstance() {
		if (null == root) {
			root = new MapGiftBag();
		}
		return root;
	}

	public GiftBagData getData(int id) {
		return map.get(id);
	}

	public HashMap<Integer, GiftBagData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof GiftBagData) {
			GiftBagData data = (GiftBagData) obj;
			map.put(data.getId(), data);
		}
	}
}
