package game.map.task;

import game.data.task.TaskWorldData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 任务世界地图表
 */
public class MapTaskWorld implements IMap, IParse {

	private static MapTaskWorld instance;

	private Map<Integer, TaskWorldData> map;

	private MapTaskWorld() {
		map = new HashMap<Integer, TaskWorldData>();
	}

	public static MapTaskWorld getInstance() {
		if (null == instance) {
			instance = new MapTaskWorld();
		}
		return instance;
	}

	public TaskWorldData getData(int id) {
		return map.get(id);
	}

	public Map<Integer, TaskWorldData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof TaskWorldData) {
			TaskWorldData data = (TaskWorldData) obj;
			map.put(data.getId(), data);
		}

	}

	@Override
	public String getBeanName() {
		return "value.task.world.so";
	}

	@Override
	public String getIDataName() {
		return TaskWorldData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}
}
