package game.map.task;

import game.data.task.TaskIdData;
import game.map.IMap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 任务表
 */
public class MapTaskId implements IMap {

	private static MapTaskId task;

	// 节id=>节数据
	private HashMap<Integer, TaskIdData> map;
	// 章id=>节列表
	private HashMap<Integer, ArrayList<Integer>> listId;

	private MapTaskId() {
		map = new HashMap<Integer, TaskIdData>();
		listId = new HashMap<Integer, ArrayList<Integer>>();
	}

	public static MapTaskId getInstance() {
		if (null == task)
			task = new MapTaskId();
		return task;
	}

	public TaskIdData getData(int taskId) {
		return map.get(taskId);
	}

	public HashMap<Integer, ArrayList<Integer>> getMap() {
		return listId;
	}

	public HashMap<Integer, TaskIdData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TaskIdData) {
			TaskIdData data = (TaskIdData) obj;
			int taskId = data.getId();
			int taskList = data.getOwnerListId();
			map.put(taskId, data);
			if (this.listId.containsKey(taskList)) {
				this.listId.get(taskList).add(taskId);
			} else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(taskId);
				this.listId.put(taskList, list);
			}
		}
	}

}
