package game.data.effect;

import game.data.IData;

import java.util.HashMap;
import java.util.Map;

/**
 * 个人成就
 * <p>
 * Title: EffectRoleData
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2013
 * </p>
 * 
 * @author linxiaokai.cn
 * @version 1.0 2013-5-23
 */

public final class EffectRoleData implements IData {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	/** 编号 */
	private int id;
	/** 类型 */
	private int type;
	/** 成就要求 */
	private int limit;
	/** 奖励类型 */
	private int awardType;
	/** 奖励 */
	private int awardValue;
	/** 成就名称 */
	private String name;
	/** 成就描述 */
	private String display;

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final int getType() {
		return type;
	}

	public final void setType(int type) {
		this.type = type;
	}

	public final int getLimit() {
		return limit;
	}

	public final void setLimit(int limit) {
		this.limit = limit;
	}

	public final int getAwardType() {
		return awardType;
	}

	public final void setAwardType(int awardType) {
		this.awardType = awardType;
	}

	public final int getAwardValue() {
		return awardValue;
	}

	public final void setAwardValue(int awardValue) {
		this.awardValue = awardValue;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getDisplay() {
		return display;
	}

	public final void setDisplay(String display) {
		this.display = display;
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("type", type);
		map.put("limit", limit);
		map.put("awardType", awardType);
		map.put("awardValue", awardValue);
		map.put("name", name);
		map.put("display", display);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}
}
