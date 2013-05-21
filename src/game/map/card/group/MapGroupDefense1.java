package game.map.card.group;

import game.data.card.group.GroupDefense1;
import game.map.IMap;

import java.util.HashMap;
import java.util.Map;

public class MapGroupDefense1 implements IMap {

	private static MapGroupDefense1 root;

	private Map<Integer, Map<Integer, GroupDefense1>> map;

	private MapGroupDefense1() {
		map = new HashMap<Integer, Map<Integer, GroupDefense1>>();
	}

	public static MapGroupDefense1 getInstance() {
		if (null == root)
			root = new MapGroupDefense1();
		return root;
	}

	@Override
	public Map<?, ?> toMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof GroupDefense1) {
			GroupDefense1 data = (GroupDefense1) obj;
			int start = data.getStar();
			int level = data.getLevel();
			if (map.containsKey(start)) {
				map.get(start).put(level, data);
			} else {
				Map<Integer, GroupDefense1> info = new HashMap<Integer, GroupDefense1>();
				info.put(level, data);
				map.put(start, info);
			}
		}
	}

	public Map<Integer, GroupDefense1> getData(int start) {
		return map.get(start);
	}
}
