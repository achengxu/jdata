package game.map.trial;

import game.data.trial.TrialLimitData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 试炼次数表
 */
public final class MapTrialLimit implements IMap {

	private static MapTrialLimit root;

	public HashMap<Integer, Integer> map;

	private MapTrialLimit() {
		map = new HashMap<Integer, Integer>();
	}

	public static MapTrialLimit getInstance() {
		if (null == root) {
			root = new MapTrialLimit();
		}
		return root;
	}

	public int getData(int level) {
		return map.get(level);
	}

	public HashMap<Integer, Integer> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TrialLimitData) {
			TrialLimitData data = (TrialLimitData) obj;
			int level = data.getLevel();
			int num = data.getNum();
			map.put(level, num);
		}

	}
}
