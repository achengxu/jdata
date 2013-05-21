package game.map.drop;

import game.data.drop.DropPackData;
import game.map.IMap;

import java.util.HashMap;

public class MapDropPack implements IMap {

	private static MapDropPack root;

	private HashMap<Integer, DropPackData> map;

	private MapDropPack() {
		map = new HashMap<Integer, DropPackData>();
	}

	public static MapDropPack getInstance() {
		if (null == root) {
			root = new MapDropPack();
		}
		return root;
	}

	@Override
	public HashMap<Integer, DropPackData> toMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof DropPackData) {
			DropPackData data = (DropPackData) obj;
			map.put(data.getId(), data);
		}
	}

	public DropPackData getData(int id) {
		return map.get(id);
	}
}
