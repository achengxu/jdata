package game.data.shut;

import game.data.IData;

import java.util.HashMap;

/**
 * 碎片数据
 */
public class SoulData implements IData {

	private static final long serialVersionUID = 1L;
	/** 碎片编号 */
	private int id;
	/** 卡牌id */
	private int cardId;
	/** 魂魄石名称 */
	private String name;
	/** 夺取几率 */
	private int oddsGet;
	/** 所需精气 */
	private int needOrig;

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final int getCardId() {
		return cardId;
	}

	public final void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getOddsGet() {
		return oddsGet;
	}

	public final void setOddsGet(int oddsGet) {
		this.oddsGet = oddsGet;
	}

	public final int getNeedOrig() {
		return needOrig;
	}

	public final void setNeedOrig(int needOrig) {
		this.needOrig = needOrig;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("cardId", cardId);
		map.put("name", name);
		map.put("oddsGet", oddsGet);
		map.put("needOrig", needOrig);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
