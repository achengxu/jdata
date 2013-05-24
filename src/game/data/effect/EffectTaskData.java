package game.data.effect;

import game.data.IData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * <p>
 * Title: EffectTaskData
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

public final class EffectTaskData implements IData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 编号 */
	private int id;
	/** 掉落卡牌 */
	private ArrayList<Integer> cardList;
	/** 掉落元魂 */
	private int soulId;
	/** 奖励银元宝 */
	private int awardValue;

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final ArrayList<Integer> getCardList() {
		return cardList;
	}

	public final void setCardList(ArrayList<Integer> cardList) {
		this.cardList = cardList;
	}

	public final int getSoulId() {
		return soulId;
	}

	public final void setSoulId(int soulId) {
		this.soulId = soulId;
	}

	public final int getAwardValue() {
		return awardValue;
	}

	public final void setAwardValue(int awardValue) {
		this.awardValue = awardValue;
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("cardList", cardList);
		map.put("soulId", soulId);
		map.put("awardValue", awardValue);
		return map;
	}

	@Override
	public String toString() {
		return toMap().toString();
	}

}
