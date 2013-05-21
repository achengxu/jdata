package game.data.task;

import game.data.IData;

import java.util.HashMap;

public class TaskInitData implements IData {
	private static final long serialVersionUID = 1L;

	/** default start world map */
	private int startMap;
	/** default start list */
	private int startList;
	/** default start id */
	private int startId;

	public final int getStartMap() {
		return startMap;
	}

	public final void setStartMap(int startMap) {
		this.startMap = startMap;
	}

	public final int getStartList() {
		return startList;
	}

	public final void setStartList(int startList) {
		this.startList = startList;
	}

	public final int getStartId() {
		return startId;
	}

	public final void setStartId(int startId) {
		this.startId = startId;
	}

	public HashMap<String, Integer> toMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("startMap", startMap);
		map.put("startList", startList);
		map.put("startId", startId);
		return map;
	}

	@Override
	public String toString() {
		return toMap().toString();
	}

}
