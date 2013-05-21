package game.map.task;

import game.data.task.TaskListData;
import game.map.IMap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 故事集合表
 */
public class MapTaskList implements IMap {
	// 当前故事集合信息
	HashMap<Integer, TaskListData> map;
	HashMap<Integer, ArrayList<Integer>> mapList;

	private static MapTaskList data;

	private MapTaskList() {
		map = new HashMap<Integer, TaskListData>();
		mapList = new HashMap<Integer, ArrayList<Integer>>();
	}

	public static MapTaskList getInstance() {
		if (null == data)
			data = new MapTaskList();
		return data;
	}

	public TaskListData getData(int listId) {
		return map.get(listId);
	}

	public HashMap<Integer, ArrayList<Integer>> getList() {
		return mapList;
	}

	public HashMap<Integer, TaskListData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TaskListData) {
			TaskListData data = (TaskListData) obj;
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
