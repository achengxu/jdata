package game.data.card;

import game.data.IData;

import java.util.HashMap;

public class CardSkillData implements IData {
	private static final long serialVersionUID = 1L;
	/**
	 * 技能Id
	 */
	private int id;
	/**
	 * 技能名称
	 */
	private String name;
	/** 攻防辨认 */
	private int target;
	/** 发动机率 */
	private int odds;
	/**
	 * 作用对象
	 */
	private int role;
	/**
	 * 作用阵营
	 */
	private int camp;
	/**
	 * 作用方式1.加成 2.削弱
	 */
	private int type;
	/**
	 * 最大攻击力
	 */
	private int maxAttack;
	/**
	 * 最小攻击力
	 */
	private int minAttack;
	/**
	 * 最大防御力
	 */
	private int maxDefense;

	/**
	 * 最小防御力
	 */
	private int minDefense;

	/**
	 * 技能简介
	 */
	private String display;

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

	public final int getTarget() {
		return target;
	}

	public final void setTarget(int target) {
		this.target = target;
	}

	public final int getOdds() {
		return odds;
	}

	public final void setOdds(int odds) {
		this.odds = odds;
	}

	public final int getRole() {
		return role;
	}

	public final void setRole(int role) {
		this.role = role;
	}

	public final int getCamp() {
		return camp;
	}

	public final void setCamp(int camp) {
		this.camp = camp;
	}

	public final int getType() {
		return type;
	}

	public final void setType(int type) {
		this.type = type;
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

	public final String getDisplay() {
		return display;
	}

	public final void setDisplay(String display) {
		this.display = display;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("target", target);
		map.put("odds", odds);
		map.put("role", role);
		map.put("camp", camp);
		map.put("type", type);
		map.put("maxAttack", maxAttack);
		map.put("minAttack", minAttack);
		map.put("maxDefense", maxDefense);
		map.put("minDefense", minDefense);
		map.put("display", display);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}