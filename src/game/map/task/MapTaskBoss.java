package game.map.task;

import game.data.task.TaskBossData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 老板表
 */
public class MapTaskBoss implements IMap {

	private static MapTaskBoss boss;

	private HashMap<Integer, TaskBossData> map;

	private MapTaskBoss() {
		map = new HashMap<Integer, TaskBossData>();
	}

	public static MapTaskBoss getInstance() {
		if (null == boss)
			boss = new MapTaskBoss();
		return boss;
	}

	public TaskBossData getData(int id) {
		return map.get(id);
	}

	public HashMap<Integer, TaskBossData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TaskBossData) {
			TaskBossData data = (TaskBossData) obj;
			map.put(data.getId(), data);
		}
	}
}
