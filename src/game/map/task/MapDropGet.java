package game.map.task;

import game.data.task.DropGetData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 掉落完成度表
 */
public class MapDropGet implements IMap {

	private static MapDropGet drop;

	private HashMap<Integer, DropGetData> map;

	private MapDropGet() {
		map = new HashMap<Integer, DropGetData>();
	}

	public static MapDropGet getInstance() {
		if (null == drop) {
			drop = new MapDropGet();
		}
		return drop;
	}

	public DropGetData getData(int id) {
		return map.get(id);
	}

	public HashMap<Integer, DropGetData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof DropGetData) {
			DropGetData data = (DropGetData) obj;
			map.put(data.getId(), data);
		}
	}
}
