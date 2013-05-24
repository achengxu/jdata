package game.map.trial;

import game.data.trial.TrialWorldData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 试炼界地图表
 */
public class MapTrialWorld implements IMap, IParse {

	private static MapTrialWorld instance;

	private Map<Integer, TrialWorldData> tdata;

	private MapTrialWorld() {
		tdata = new HashMap<Integer, TrialWorldData>();
	}

	public static MapTrialWorld getInstance() {
		if (null == instance) {
			instance = new MapTrialWorld();
		}
		return instance;
	}

	public TrialWorldData getData(int id) {
		return tdata.get(id);
	}

	public Map<Integer, TrialWorldData> getMap() {
		return tdata;
	}

	public void add(Object obj) {
		if (obj instanceof TrialWorldData) {
			TrialWorldData data = (TrialWorldData) obj;
			tdata.put(data.getId(), data);
		}

	}

	@Override
	public String getBeanName() {
		return "value.trial.world.so";
	}

	@Override
	public String getIDataName() {
		return TrialWorldData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
