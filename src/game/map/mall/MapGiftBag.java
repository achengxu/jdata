package game.map.mall;

import game.data.mall.GiftBagData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 礼包
 */
public class MapGiftBag implements IMap, IParse {

	private static MapGiftBag instance;

	private Map<Integer, GiftBagData> map;

	private MapGiftBag() {
		map = new HashMap<Integer, GiftBagData>();
	}

	public static MapGiftBag getInstance() {
		if (null == instance) {
			instance = new MapGiftBag();
		}
		return instance;
	}

	public GiftBagData getData(int id) {
		return map.get(id);
	}

	public Map<Integer, GiftBagData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof GiftBagData) {
			GiftBagData data = (GiftBagData) obj;
			map.put(data.getId(), data);
		}
	}

	@Override
	public String getBeanName() {
		return "value.mall.gift.so";
	}

	@Override
	public String getIDataName() {
		return GiftBagData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
