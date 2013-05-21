package game.map.task;

import game.data.task.TaskInitData;
import game.map.IMap;

import java.util.Map;

/**
 * 任务初始化表
 */
public class MapTaskInit implements IMap {

	private static MapTaskInit init;

	private TaskInitData _data;

	private MapTaskInit() {
	}

	public static MapTaskInit getInstance() {
		if (null == init) {
			init = new MapTaskInit();
		}
		return init;
	}

	public TaskInitData getData() {
		return _data;
	}

	public Map<?, ?> toMap() {
		return null;
	}

	public void add(Object obj) {
		if (obj instanceof TaskInitData) {
			TaskInitData data = (TaskInitData) obj;
			_data = data;
		}
	}

}
