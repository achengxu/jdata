package game.map.trial;

import game.data.trial.TrialWorldData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 试炼界地图表
 */
public class MapTrialWorld implements IMap {

	private static MapTrialWorld map;

	private HashMap<Integer, TrialWorldData> tdata;

	private MapTrialWorld() {
		tdata = new HashMap<Integer, TrialWorldData>();
	}

	public static MapTrialWorld getInstance() {
		if (null == map) {
			map = new MapTrialWorld();
		}
		return map;
	}

	public TrialWorldData getData(int id) {
		return tdata.get(id);
	}

	public HashMap<Integer, TrialWorldData> toMap() {
		return tdata;
	}

	public void add(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof TrialWorldData) {
			TrialWorldData data = (TrialWorldData) obj;
			tdata.put(data.getId(), data);
		}

	}
}
