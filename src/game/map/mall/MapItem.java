package game.map.mall;

import game.data.mall.ItemData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

public class MapItem implements IMap, IParse {

	private static MapItem instance;

	private Map<Integer, ItemData> map;

	private MapItem() {
		map = new HashMap<Integer, ItemData>();
	}

	public static MapItem getInstance() {
		if (null == instance)
			instance = new MapItem();
		return instance;
	}

	public ItemData getData(int itemId) {
		return map.get(itemId);
	}

	public Map<Integer, ItemData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof ItemData) {
			ItemData data = (ItemData) obj;
			map.put(data.getId(), data);
		}
	}

	@Override
	public String getBeanName() {
		return "value.mall.item.so";
	}

	@Override
	public String getIDataName() {
		return ItemData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
