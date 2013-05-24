package game.map.trial;

import game.data.trial.TrialListData;
import game.map.IMap;
import game.map.IParse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 试炼集合表
 */
public class MapTrialList implements IMap, IParse {
	// 当前试炼集合信息
	private Map<Integer, TrialListData> map;

	private Map<Integer, ArrayList<Integer>> mapList;

	private static MapTrialList instance;

	private MapTrialList() {
		map = new HashMap<Integer, TrialListData>();
		mapList = new HashMap<Integer, ArrayList<Integer>>();
	}

	public static MapTrialList getInstance() {
		if (null == instance)
			instance = new MapTrialList();
		return instance;
	}

	public TrialListData getData(int listId) {
		return map.get(listId);
	}

	public Map<Integer, ArrayList<Integer>> getList() {
		return mapList;
	}

	public Map<Integer, TrialListData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TrialListData) {
			TrialListData data = (TrialListData) obj;
			int listId = data.getId();
			int mapId = data.getOwnerId();
			map.put(listId, data);
			if (this.mapList.containsKey(mapId)) {
				this.mapList.get(mapId).add(listId);
			} else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(listId);
				this.mapList.put(mapId, list);
			}
		}
	}

	@Override
	public String getBeanName() {
		return "value.trial.list.so";
	}

	@Override
	public String getIDataName() {
		return TrialListData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
