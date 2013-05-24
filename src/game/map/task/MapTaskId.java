package game.map.task;

import game.data.task.TaskIdData;
import game.map.IMap;
import game.map.IParse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 任务表
 */
public class MapTaskId implements IMap,IParse {

	private static MapTaskId instance;

	// 节id=>节数据
	private Map<Integer, TaskIdData> map;
	// 章id=>节列表
	private Map<Integer, ArrayList<Integer>> listId;

	private MapTaskId() {
		map = new HashMap<Integer, TaskIdData>();
		listId = new HashMap<Integer, ArrayList<Integer>>();
	}

	public static MapTaskId getInstance() {
		if (null == instance)
			instance = new MapTaskId();
		return instance;
	}

	public TaskIdData getData(int taskId) {
		return map.get(taskId);
	}

	public Map<Integer, ArrayList<Integer>> toMap() {
		return listId;
	}

	public Map<Integer, TaskIdData> getMap() {
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

	@Override
	public String getBeanName() {
		return "value.task.id.so";
	}

	@Override
	public String getIDataName() {
		return TaskIdData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
