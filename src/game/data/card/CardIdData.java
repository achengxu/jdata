package game.data.card;

import game.data.IData;

import java.util.ArrayList;
import java.util.HashMap;

public final class CardIdData implements IData, Cloneable {

	private static final long serialVersionUID = 1L;
	/** 卡牌id */
	private int id;
	/** 卡牌名称 */
	private String name;
	/** 卡牌阵营1=仙,2=人,3=妖 */
	private int camp;
	/** 卡牌星级 */
	private int star;
	/** 灵力 */
	private int power;
	/** 简介 */
	private String display;
	/** 是否能够渡劫 */
	private int canUp;
	/** 渡劫消耗造化丹 */
	private int luckDan;
	/** 渡劫消耗造化金丹 */
	private int luckGold;
	/** 渡劫后的id */
	private int newId;
	/** 等级上限 */
	private int maxLevel;
	/** 卡种 */
	private int kind;
	/** 攻击调整值 */
	private float attackMix;
	/** 防御调整值 */
	private float defenseMix;
	/** 竖版 */
	private String big;
	/** 头像 */
	private String head;
	/** 造型 */
	private String image;
	/** 技能 */
	private ArrayList<Integer> skills;
	/** 属性 */
	private ArrayList<Integer> property;

	/********* 卡牌属性 ***********/
	/** 卡牌uuid */
	protected long uuid;
	// 卡牌格子索引
	protected int index;
	/** 卡牌等级 */
	protected int level;
	/** 卡牌经验 */
	protected int exp;
	/** 最大攻击 */
	protected int maxAttack;
	/** 最小攻击 */
	protected int minAttack;
	/** 最大防御 */
	protected int maxDefense;
	/** 最小防御 */
	protected int minDefense;

	protected int type;

	/** 排序规则(1=按最大攻击排,其他=最大防御排序) */

	public CardIdData() {
		name = "";
		head = "";
		image = "";
		uuid = index = level = exp = maxAttack = minAttack = maxDefense = minDefense = id = -1;
		skills = new ArrayList<Integer>();
		property = new ArrayList<Integer>();
	}

	public CardIdData(int id) {
		this();
		this.id = id;
	}

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

	public final int getCamp() {
		return camp;
	}

	public final void setCamp(int camp) {
		this.camp = camp;
	}

	public final int getStar() {
		return star;
	}

	public final void setStar(int star) {
		this.star = star;
	}

	public final int getPower() {
		return power;
	}

	public final void setPower(int power) {
		this.power = power;
	}

	public final String getDisplay() {
		return display;
	}

	public final void setDisplay(String display) {
		this.display = display;
	}

	public final int getCanUp() {
		return canUp;
	}

	public final void setCanUp(int canUp) {
		this.canUp = canUp;
	}

	public final int getLuckDan() {
		return luckDan;
	}

	public final void setLuckDan(int luckDan) {
		this.luckDan = luckDan;
	}

	public final int getLuckGold() {
		return luckGold;
	}

	public final void setLuckGold(int luckGold) {
		this.luckGold = luckGold;
	}

	public final int getNewId() {
		return newId;
	}

	public final void setNewId(int newId) {
		this.newId = newId;
	}

	public final int getMaxLevel() {
		return maxLevel;
	}

	public final void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public final int getKind() {
		return kind;
	}

	public final void setKind(int kind) {
		this.kind = kind;
	}

	public final float getAttackMix() {
		return attackMix;
	}

	public final void setAttackMix(float attackMix) {
		this.attackMix = attackMix;
	}

	public final float getDefenseMix() {
		return defenseMix;
	}

	public final void setDefenseMix(float defenseMix) {
		this.defenseMix = defenseMix;
	}

	public final String getHead() {
		return head;
	}

	public final void setHead(String head) {
		this.head = head;
	}

	public final String getBig() {
		return big;
	}

	public final void setBig(String big) {
		this.big = big;
	}

	public final String getImage() {
		return image;
	}

	public final void setImage(String image) {
		this.image = image;
	}

	public final ArrayList<Integer> getSkills() {
		return skills;
	}

	public final void setSkills(ArrayList<Integer> skills) {
		this.skills = skills;
	}

	public final long getUuid() {
		return uuid;
	}

	public final void setUuid(long uuid) {
		this.uuid = uuid;
	}

	public final int getIndex() {
		return index;
	}

	public final void setIndex(int index) {
		this.index = index;
	}

	public final int getLevel() {
		return level;
	}

	public final void setLevel(int level) {
		this.level = level;
	}

	public final int getExp() {
		return exp;
	}

	public final void setExp(int exp) {
		this.exp = exp;
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

	public final ArrayList<Integer> getProperty() {
		return property;
	}

	public final void setProperty(ArrayList<Integer> property) {
		this.property = property;
	}

	public final int getType() {
		return type;
	}

	public final void setType(int type) {
		this.type = type;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("camp", camp);
		map.put("star", star);
		map.put("power", power);
		map.put("display", display);
		map.put("canUp", canUp);
		map.put("luckDan", luckDan);
		map.put("luckGold", luckGold);
		map.put("newId", newId);
		map.put("maxLevel", maxLevel);
		map.put("kind", kind);
		map.put("attackMix", attackMix);
		map.put("defenseMix", defenseMix);
		map.put("head", head);
		map.put("image", image);
		map.put("big", big);
		map.put("skills", skills);
		map.put("uuid", uuid);
		map.put("index", index);
		map.put("level", level);
		map.put("exp", exp);
		map.put("maxAttack", maxAttack);
		map.put("minAttack", minAttack);
		map.put("maxDefense", maxDefense);
		map.put("minDefense", minDefense);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

	@Override
	public CardIdData clone() throws CloneNotSupportedException {
		return (CardIdData) super.clone();
	}

}
