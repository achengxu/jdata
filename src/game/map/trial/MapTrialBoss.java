package game.map.trial;

import game.data.trial.TrialBossData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

;

/**
 * 老板表
 */
public class MapTrialBoss implements IMap, IParse {

	private static MapTrialBoss instance;

	private Map<Integer, TrialBossData> map;

	private MapTrialBoss() {
		map = new HashMap<Integer, TrialBossData>();
	}

	public static MapTrialBoss getInstance() {
		if (null == instance)
			instance = new MapTrialBoss();
		return instance;
	}

	public TrialBossData getData(int id) {
		return map.get(id);
	}

	public Map<Integer, TrialBossData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TrialBossData) {
			TrialBossData data = (TrialBossData) obj;
			map.put(data.getId(), data);
		}
	}

	@Override
	public String getBeanName() {
		return "value.trial.boss.so";
	}

	@Override
	public String getIDataName() {
		return TrialBossData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
