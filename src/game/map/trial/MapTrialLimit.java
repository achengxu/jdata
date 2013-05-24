package game.map.trial;

import game.data.trial.TrialLimitData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 试炼次数表
 */
public final class MapTrialLimit implements IMap,IParse {

	private static MapTrialLimit instance;

	public Map<Integer, Integer> map;

	private MapTrialLimit() {
		map = new HashMap<Integer, Integer>();
	}

	public static MapTrialLimit getInstance() {
		if (null == instance) {
			instance = new MapTrialLimit();
		}
		return instance;
	}

	public int getData(int level) {
		return map.get(level);
	}

	public Map<Integer, Integer> getMap() {
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

	@Override
	public String getBeanName() {
		return "value.trial.limit.so";
	}

	@Override
	public String getIDataName() {
		return TrialLimitData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
