package game.map.card.group;

import game.data.card.group.GroupAttack2;
import game.map.IMap;

import java.util.HashMap;
import java.util.Map;

public class MapGroupAttack2 implements IMap {

	private static MapGroupAttack2 root;

	private Map<Integer, Map<Integer, GroupAttack2>> map;

	private MapGroupAttack2() {
		map = new HashMap<Integer, Map<Integer, GroupAttack2>>();
	}

	public static MapGroupAttack2 getInstance() {
		if (null == root)
			root = new MapGroupAttack2();
		return root;
	}

	@Override
	public Map<?, ?> toMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof GroupAttack2) {
			GroupAttack2 data = (GroupAttack2) obj;
			int start = data.getStar();
			int level = data.getLevel();
			if (map.containsKey(start)) {
				map.get(start).put(level, data);
			} else {
				Map<Integer, GroupAttack2> info = new HashMap<Integer, GroupAttack2>();
				info.put(level, data);
				map.put(start, info);
			}
		}
	}

	public Map<Integer, GroupAttack2> getData(int start) {
		return map.get(start);
	}
}
