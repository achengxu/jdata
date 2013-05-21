package game.map.trial;

import game.data.trial.TrialBossData;
import game.map.IMap;

import java.util.HashMap;

;

/**
 * 老板表
 */
public class MapTrialBoss implements IMap {

	private static MapTrialBoss boss;

	private HashMap<Integer, TrialBossData> map;

	private MapTrialBoss() {
		map = new HashMap<Integer, TrialBossData>();
	}

	public static MapTrialBoss getInstance() {
		if (null == boss)
			boss = new MapTrialBoss();
		return boss;
	}

	public TrialBossData getData(int id) {
		return map.get(id);
	}

	public HashMap<Integer, TrialBossData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TrialBossData) {
			TrialBossData data = (TrialBossData) obj;
			map.put(data.getId(), data);
		}
	}
}
