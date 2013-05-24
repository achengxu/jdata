package game.data.effect;

import game.data.IData;

import java.util.HashMap;
import java.util.Map;

/**
 * 渡劫成就
 * 
 * <p>
 * Title: EffectDJData
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

public final class EffectDJData implements IData {
	
	private static final long serialVersionUID = 1L;
	/** 编号 */
	private int id;
	/** 渡劫类型 */
	private int type;
	/** 历史渡劫总数量 */
	private int limit;
	/** 奖励道具 */
	private int awardValue;

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

	public final int getAwardValue() {
		return awardValue;
	}

	public final void setAwardValue(int awardValue) {
		this.awardValue = awardValue;
	}

	@Override
	public Map<String, Integer> toMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("id", id);
		map.put("type", type);
		map.put("limit", limit);
		map.put("awardValue", awardValue);
		return map;
	}

	@Override
	public String toString() {
		return toMap().toString();
	}

}
