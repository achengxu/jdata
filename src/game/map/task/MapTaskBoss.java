package game.map.task;

import game.data.task.TaskBossData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 老板表
 */
public class MapTaskBoss implements IMap, IParse {

	private static MapTaskBoss instance;

	private Map<Integer, TaskBossData> map;

	private MapTaskBoss() {
		map = new HashMap<Integer, TaskBossData>();
	}

	public static MapTaskBoss getInstance() {
		if (null == instance)
			instance = new MapTaskBoss();
		return instance;
	}

	public TaskBossData getData(int id) {
		return map.get(id);
	}

	public Map<Integer, TaskBossData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TaskBossData) {
			TaskBossData data = (TaskBossData) obj;
			map.put(data.getId(), data);
		}
	}

	@Override
	public String getBeanName() {
		return "value.task.boss.so";
	}

	@Override
	public String getIDataName() {
		return TaskBossData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
