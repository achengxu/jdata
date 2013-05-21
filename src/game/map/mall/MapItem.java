package game.map.mall;

import game.data.mall.ItemData;
import game.map.IMap;

import java.util.HashMap;

public class MapItem implements IMap {

	private static MapItem _mapItems;

	private HashMap<Integer, ItemData> map;

	private MapItem() {
		map = new HashMap<Integer, ItemData>();
	}

	public static MapItem getInstance() {
		if (null == _mapItems)
			_mapItems = new MapItem();
		return _mapItems;
	}

	public ItemData getData(int itemId) {
		return map.get(itemId);
	}

	public HashMap<Integer, ItemData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof ItemData) {
			ItemData data = (ItemData) obj;
			map.put(data.getId(), data);
		}
	}
}
