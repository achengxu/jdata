package game.data.card;

import game.data.IData;

import java.util.HashMap;
import java.util.Map;

public final class CardUpExpData implements IData {

	private static final long serialVersionUID = 1L;
	/** 等级 */
	private int level;
	/** 星级 */
	private int star;
	/** 炼化升级所需经验 */
	private int upExp;
	/** 炼化升级消耗系数 */
	private float expRatio;
	/** 被炼化提供经验 */
	private int beGetExp;
	/** 被炼化所需金币 */
	private int beNeedCoin;
	/** 出售金币 */
	private int sale;

	public final int getLevel() {
		return level;
	}

	public final void setLevel(int level) {
		this.level = level;
	}

	public final int getStar() {
		return star;
	}

	public final void setStart(int star) {
		this.star = star;
	}

	public final int getUpExp() {
		return upExp;
	}

	public final void setUpExp(int upExp) {
		this.upExp = upExp;
	}

	public final float getExpRatio() {
		return expRatio;
	}

	public final void setExpRatio(float expRatio) {
		this.expRatio = expRatio;
	}

	public final int getBeGetExp() {
		return beGetExp;
	}

	public final void setBeGetExp(int beGetExp) {
		this.beGetExp = beGetExp;
	}

	public final int getBeNeedCoin() {
		return beNeedCoin;
	}

	public final void setBeNeedCoin(int beNeedCoin) {
		this.beNeedCoin = beNeedCoin;
	}

	public final int getSale() {
		return sale;
	}

	public final void setSale(int sale) {
		this.sale = sale;
	}

	@Override
	public final Map<String, Number> toMap() {
		Map<String, Number> map = new HashMap<String, Number>();
		map.put("level", level);
		map.put("star", star);
		map.put("upExp", upExp);
		map.put("expRatio", expRatio);
		map.put("beGetExp", beGetExp);
		map.put("beNeedCoin", beNeedCoin);
		map.put("sale", sale);
		return map;
	}

	public final String toString() {
		return toMap().toString();
	}

}
