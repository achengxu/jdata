package game.map.trial;

import game.data.trial.TrialListData;
import game.map.IMap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 试炼集合表
 */
public class MapTrialList implements IMap {
	// 当前试炼集合信息
	HashMap<Integer, TrialListData> map;

	HashMap<Integer, ArrayList<Integer>> mapList;

	private static MapTrialList data;

	private MapTrialList() {
		map = new HashMap<Integer, TrialListData>();
		mapList = new HashMap<Integer, ArrayList<Integer>>();
	}

	public static MapTrialList getInstance() {
		if (null == data)
			data = new MapTrialList();
		return data;
	}

	public TrialListData getData(int listId) {
		return map.get(listId);
	}

	public HashMap<Integer, ArrayList<Integer>> getList() {
		return mapList;
	}

	public HashMap<Integer, TrialListData> toMap() {
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
}
