package game.map.trial;

import game.data.trial.TrialReLiveData;
import game.map.IMap;

import java.util.HashMap;

public class MapTrialReLive implements IMap {

	private static MapTrialReLive root;

	private HashMap<Integer, TrialReLiveData> map;

	private MapTrialReLive() {
		map = new HashMap<Integer, TrialReLiveData>();
	}

	public static MapTrialReLive getInstance() {
		if (null == root) {
			root = new MapTrialReLive();
		}
		return root;
	}

	public static final void setRoot(MapTrialReLive root) {
		MapTrialReLive.root = root;
	}

	@Override
	public HashMap<Integer, TrialReLiveData> toMap() {
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
}
