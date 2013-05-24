package game.map.trial;

import game.data.trial.TrialReLiveData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

public class MapTrialReLive implements IMap, IParse {

	private static MapTrialReLive instance;

	private Map<Integer, TrialReLiveData> map;

	private MapTrialReLive() {
		map = new HashMap<Integer, TrialReLiveData>();
	}

	public static MapTrialReLive getInstance() {
		if (null == instance) {
			instance = new MapTrialReLive();
		}
		return instance;
	}

	public static final void setRoot(MapTrialReLive root) {
		MapTrialReLive.instance = root;
	}

	@Override
	public Map<Integer, TrialReLiveData> getMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof TrialReLiveData) {
			TrialReLiveData data = (TrialReLiveData) obj;
			map.put(data.getId(), data);
		}
	}

	public TrialReLiveData getData(int id) {
		return map.get(id);
	}

	@Override
	public String getBeanName() {
		return "value.trial.relive.so";
	}

	@Override
	public String getIDataName() {
		return TrialReLiveData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
