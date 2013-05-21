package game.map.trial;

import game.data.trial.TrialIdData;
import game.map.IMap;

import java.util.HashMap;

public class MapTrialId implements IMap {

	private static MapTrialId trial;

	private HashMap<Integer, TrialIdData> map;

	private MapTrialId() {
		map = new HashMap<Integer, TrialIdData>();
	}

	public static MapTrialId getInstance() {
		if (null == trial)
			trial = new MapTrialId();
		return trial;
	}

	public TrialIdData getData(int trialId) {
		return map.get(trialId);
	}

	public void info() {
		for (int id : map.keySet()) {
			System.out.println(getData(id));
		}
	}

	public HashMap<Integer, TrialIdData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TrialIdData) {
			TrialIdData data = (TrialIdData) obj;
			map.put(data.getId(), data);
		}
	}

}
