package game.map.trial;

import game.data.trial.TrialIdData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

public class MapTrialId implements IMap, IParse {

	private static MapTrialId instance;

	private Map<Integer, TrialIdData> map;

	private MapTrialId() {
		map = new HashMap<Integer, TrialIdData>();
	}

	public static MapTrialId getInstance() {
		if (null == instance)
			instance = new MapTrialId();
		return instance;
	}

	public TrialIdData getData(int trialId) {
		return map.get(trialId);
	}

	public void info() {
		for (int id : map.keySet()) {
			System.out.println(getData(id));
		}
	}

	public Map<Integer, TrialIdData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TrialIdData) {
			TrialIdData data = (TrialIdData) obj;
			map.put(data.getId(), data);
		}
	}

	@Override
	public String getBeanName() {
		return "value.trial.id.so";
	}

	@Override
	public String getIDataName() {
		return TrialIdData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
