package game.data.trial;

import game.data.IData;
import game.data.IDropPackData;

import java.util.HashMap;

/**
 * 试炼关卡数据
 */
public class TrialIdData implements IData, IDropPackData {

	private static final long serialVersionUID = 1L;
	// 试炼编号
	private int id;
	// 试炼名称
	private String name;
	// 试炼描述
	private String display;
	// 前置试炼
	private int befTriaId;
	// 后置试炼
	private int afterTrialId;
	// 所属集合
	private int ownerListId;
	// 战斗(boss)
	private int boss;
	// 消耗次数
	private int lostNum;
	// 消耗的元气
	private int needOrig;
	// 获得的经验
	private int getExp;
	// 打败boss银币奖励
	private int bossGiveCoin;
	// 打败boss经验奖励
	private int bossGiveExp;
	// 伙伴宝箱概率
	private int oddsCardBox;
	// 造化丹概率
	private int oddsOod;
	// 造化金丹概率
	private int oddsGold;
	// 伙伴宝箱
	private int dropPackId;

	public TrialIdData() {
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

	public final String getDisplay() {
		return display;
	}

	public final void setDisplay(String display) {
		this.display = display;
	}

	public final int getBefTriaId() {
		return befTriaId;
	}

	public final void setBefTriaId(int befTriaId) {
		this.befTriaId = befTriaId;
	}

	public final int getAfterTrialId() {
		return afterTrialId;
	}

	public final void setAfterTrialId(int afterTrialId) {
		this.afterTrialId = afterTrialId;
	}

	public final int getOwnerListId() {
		return ownerListId;
	}

	public final void setOwnerListId(int ownerListId) {
		this.ownerListId = ownerListId;
	}

	public final int getBoss() {
		return boss;
	}

	public final void setBoss(int boss) {
		this.boss = boss;
	}

	public final int getLostNum() {
		return lostNum;
	}

	public final void setLostNum(int lostNum) {
		this.lostNum = lostNum;
	}

	public final int getNeedOrig() {
		return needOrig;
	}

	public final void setNeedOrig(int needOrig) {
		this.needOrig = needOrig;
	}

	public final int getGetExp() {
		return getExp;
	}

	public final void setGetExp(int getExp) {
		this.getExp = getExp;
	}

	public final int getBossGiveCoin() {
		return bossGiveCoin;
	}

	public final void setBossGiveCoin(int bossGiveCoin) {
		this.bossGiveCoin = bossGiveCoin;
	}

	public final int getBossGiveExp() {
		return bossGiveExp;
	}

	public final void setBossGiveExp(int bossGiveExp) {
		this.bossGiveExp = bossGiveExp;
	}

	public final int getOddsCardBox() {
		return oddsCardBox;
	}

	public final void setOddsCardBox(int oddsCardBox) {
		this.oddsCardBox = oddsCardBox;
	}

	public final int getOddsOod() {
		return oddsOod;
	}

	public final void setOddsOod(int oddsOod) {
		this.oddsOod = oddsOod;
	}

	public final int getOddsGold() {
		return oddsGold;
	}

	public final void setOddsGold(int oddsGold) {
		this.oddsGold = oddsGold;
	}

	public final int getDropPackId() {
		return dropPackId;
	}

	public final void setDropPackId(int dropPackId) {
		this.dropPackId = dropPackId;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("display", display);
		map.put("befTriaId", befTriaId);
		map.put("afterTrialId", afterTrialId);
		map.put("ownerListId", ownerListId);
		map.put("boss", boss);
		map.put("lostNum", lostNum);
		map.put("needOrig", needOrig);
		map.put("getExp", getExp);
		map.put("bossGiveCoin", bossGiveCoin);
		map.put("bossGiveExp", bossGiveExp);
		map.put("oddsCardBox", oddsCardBox);
		map.put("oddsOod", oddsOod);
		map.put("oddsCardBox", oddsCardBox);
		map.put("oddsGold", oddsGold);
		map.put("oddsGold", oddsGold);
		map.put("dropPackId", dropPackId);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
