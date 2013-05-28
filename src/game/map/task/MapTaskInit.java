package game.map.task;

import game.data.task.TaskInitData;
import game.map.IMap;
import game.map.IParse;

import java.util.Map;

/**
 * 任务初始化表
 */
public class MapTaskInit implements IMap, IParse {

	private static MapTaskInit instance;

	private TaskInitData _data;

	private MapTaskInit() {
	}

	public static MapTaskInit getInstance() {
		if (null == instance) {
			instance = new MapTaskInit();
		}
		return instance;
	}

	public TaskInitData getData() {
		return _data;
	}

	public Map<?, ?> getMap() {
		return null;
	}

	public void add(Object obj) {
		if (obj instanceof TaskInitData) {
			TaskInitData data = (TaskInitData) obj;
			_data = data;
		}
	}

	@Override
	public String getBeanName() {
		return "value.task.init.so";
	}

	@Override
	public String getIDataName() {
		return TaskInitData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
