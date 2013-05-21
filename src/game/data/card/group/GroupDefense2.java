package game.data.card.group;

import game.data.IData;

import java.util.HashMap;
import java.util.Map;

public class GroupDefense2 implements IData, IGroup {

	private static final long serialVersionUID = 1L;
	/** 等级 */
	private int level;
	/** 星级 */
	private int star;
	/** 最大攻击 */
	private int maxAttack;
	/** 最小攻击 */
	private int minAttack;
	/** 最大防御 */
	private int maxDefense;
	/** 最小防御 */
	private int minDefense;

	public final int getLevel() {
		return level;
	}

	public final void setLevel(int level) {
		this.level = level;
	}

	public final int getStar() {
		return star;
	}

	public final void setStar(int star) {
		this.star = star;
	}

	public final int getMaxAttack() {
		return maxAttack;
	}

	public final void setMaxAttack(int maxAttack) {
		this.maxAttack = maxAttack;
	}

	public final int getMinAttack() {
		return minAttack;
	}

	public final void setMinAttack(int minAttack) {
		this.minAttack = minAttack;
	}

	public final int getMaxDefense() {
		return maxDefense;
	}

	public final void setMaxDefense(int maxDefense) {
		this.maxDefense = maxDefense;
	}

	public final int getMinDefense() {
		return minDefense;
	}

	public final void setMinDefense(int minDefense) {
		this.minDefense = minDefense;
	}

	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("level", level);
		map.put("star", star);
		map.put("maxAttack", maxAttack);
		map.put("minAttack", minAttack);
		map.put("maxDefense", maxDefense);
		map.put("minDefense", minDefense);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
