package game.map.card.group;

import game.data.card.group.GroupAttack1;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

public class MapGroupAttack1 implements IMap, IParse {

	private static MapGroupAttack1 instance;

	private Map<Integer, Map<Integer, GroupAttack1>> map;

	private MapGroupAttack1() {
		map = new HashMap<Integer, Map<Integer, GroupAttack1>>();
	}

	public static MapGroupAttack1 getInstance() {
		if (null == instance)
			instance = new MapGroupAttack1();
		return instance;
	}

	@Override
	public Map<?, ?> getMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof GroupAttack1) {
			GroupAttack1 data = (GroupAttack1) obj;
			int start = data.getStar();
			int level = data.getLevel();
			if (map.containsKey(start)) {
				map.get(start).put(level, data);
			} else {
				Map<Integer, GroupAttack1> info = new HashMap<Integer, GroupAttack1>();
				info.put(level, data);
				map.put(start, info);
			}
		}
	}

	public Map<Integer, GroupAttack1> getData(int start) {
		return map.get(start);
	}

	@Override
	public String getBeanName() {
		return "value.group.attack1.so";
	}

	@Override
	public String getIDataName() {
		return GroupAttack1.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
