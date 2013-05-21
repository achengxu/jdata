package game.data.task;

import game.data.IData;

import java.util.HashMap;

/**
 * 任务集合数据
 */
public class TaskListData implements IData {
	private static final long serialVersionUID = 1L;
	// 任务集合id
	private int id;
	// 任务集合名称
	private String name;
	// 任务前置集合
	private int befListId;
	// 归属任务地图Id
	private int ownerId;

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

	public final int getBefListId() {
		return befListId;
	}

	public final void setBefListId(int befListId) {
		this.befListId = befListId;
	}

	public final int getOwnerId() {
		return ownerId;
	}

	public final void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("befListId", befListId);
		map.put("ownerId", ownerId);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
