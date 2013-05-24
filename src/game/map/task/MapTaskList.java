package game.map.task;

import game.data.task.TaskListData;
import game.map.IMap;
import game.map.IParse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 故事集合表
 */
public class MapTaskList implements IMap,IParse {
	// 当前故事集合信息
	private Map<Integer, TaskListData> map;
	private Map<Integer, ArrayList<Integer>> mapList;

	private static MapTaskList instance;

	private MapTaskList() {
		map = new HashMap<Integer, TaskListData>();
		mapList = new HashMap<Integer, ArrayList<Integer>>();
	}

	public static MapTaskList getInstance() {
		if (null == instance)
			instance = new MapTaskList();
		return instance;
	}

	public TaskListData getData(int listId) {
		return map.get(listId);
	}

	public Map<Integer, ArrayList<Integer>> getList() {
		return mapList;
	}

	public Map<Integer, TaskListData> getMap() {
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

	@Override
	public String getBeanName() {
		return "value.task.list.so";
	}

	@Override
	public String getIDataName() {
		return TaskListData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
