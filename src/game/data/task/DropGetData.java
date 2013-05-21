package game.data.task;

import game.data.IData;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 掉落完成度奖励表
 */
public class DropGetData implements IData {

	private static final long serialVersionUID = 1L;

	/** 编号 */
	private int id;
	/** 奖励元宝 */
	private int giveCoin;
	/** 掉落完成度 */
	private ArrayList<Integer> dropList;

	public DropGetData() {
		dropList = new ArrayList<Integer>();
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final int getGiveCoin() {
		return giveCoin;
	}

	public final void setGiveCoin(int giveCoin) {
		this.giveCoin = giveCoin;
	}

	public final ArrayList<Integer> getDropList() {
		return dropList;
	}

	public final void setDropList(ArrayList<Integer> dropList) {
		this.dropList = dropList;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("giveCoin", giveCoin);
		map.put("dropList", dropList);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}
}
