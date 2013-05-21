package game.data.trial;

import game.data.IData;

import java.util.HashMap;

/**
 * 试炼地图数据
 */
public class TrialWorldData implements IData {

	private static final long serialVersionUID = 1L;

	/** 故事地图编号 */
	private int id;
	/** 故事地图名称 */
	private String name;
	/** 前置地图 */
	private int beforeId;

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getBeforeId() {
		return beforeId;
	}

	public final void setBeforeId(int beforeId) {
		this.beforeId = beforeId;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("beforeId", beforeId);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}
}
