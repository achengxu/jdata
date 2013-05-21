package game.map.task;

import game.data.task.TaskWorldData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 任务世界地图表
 */
public class MapTaskWorld implements IMap {

	private static MapTaskWorld map;

	private HashMap<Integer, TaskWorldData> tdata;

	private MapTaskWorld() {
		tdata = new HashMap<Integer, TaskWorldData>();
	}

	public static MapTaskWorld getInstance() {
		if (null == map) {
			map = new MapTaskWorld();
		}
		return map;
	}

	public TaskWorldData getData(int id) {
		return tdata.get(id);
	}

	public HashMap<Integer, TaskWorldData> toMap() {
		// return map;
		return tdata;
	}

	public void add(Object obj) {
		if (obj instanceof TaskWorldData) {
			TaskWorldData data = (TaskWorldData) obj;
			tdata.put(data.getId(), data);
		}

	}
}
