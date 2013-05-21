package game.data.task;

import game.data.IData;
import game.data.IDropPackData;

import java.util.HashMap;

/**
 * 任务数据
 */
public class TaskIdData implements IData, IDropPackData {
	private static final long serialVersionUID = 1L;
	// 任务id
	private int id;
	// 任务名称
	private String name;
	// 任务描述
	private String display;
	// 前置故事
	private int befTaskId;
	// 后置节
	private int after;
	// 所属小地图
	private int ownerListId;
	// BOSS战斗对话
	private int bossCopySayId;
	// BOSSID
	private int bossId;
	// 等级需求
	private int needLevel;
	// 所需元气值
	private int needOrig;
	// 单次完成度
	private int onceComp;
	// 基础奖励经验
	private int baseGiveExp;
	// 最小奖励银币
	private int minGiveCoin;
	// 最大银币奖励
	private int maxGiveCoin;
	// 获得剧情道具
	private int juqingItemId;
	// 主线剧情
	private int mainHis;
	// 掉落包id
	private int dropPackId;
	// 掉落完成度
	private int dropCompId;
	// 掉落宝箱概率
	private int oddsDropBox;
	// 随机推送几率
	private int oddsPush;
	// 双倍经验几率
	private int oddsDExp;
	// 双倍银币几率
	private int oddsDCoin;
	// 随机boss几率
	private int oddsBoss;
	/** 通关奖励银币 */
	private int passCoin;
	/** 通关奖励元宝 */
	private int passGold;

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

	public final int getBefTaskId() {
		return befTaskId;
	}

	public final void setBefTaskId(int befTaskId) {
		this.befTaskId = befTaskId;
	}

	public final int getAfter() {
		return after;
	}

	public final void setAfter(int after) {
		this.after = after;
	}

	public final int getOwnerListId() {
		return ownerListId;
	}

	public final void setOwnerListId(int ownerListId) {
		this.ownerListId = ownerListId;
	}

	public final int getBossCopySayId() {
		return bossCopySayId;
	}

	public final void setBossCopySayId(int bossCopySayId) {
		this.bossCopySayId = bossCopySayId;
	}

	public final int getBossId() {
		return bossId;
	}

	public final void setBossId(int bossId) {
		this.bossId = bossId;
	}

	public final int getNeedLevel() {
		return needLevel;
	}

	public final void setNeedLevel(int needLevel) {
		this.needLevel = needLevel;
	}

	public final int getNeedOrig() {
		return needOrig;
	}

	public final void setNeedOrig(int needOrig) {
		this.needOrig = needOrig;
	}

	public final int getOnceComp() {
		return onceComp;
	}

	public final void setOnceComp(int onceComp) {
		this.onceComp = onceComp;
	}

	public final int getBaseGiveExp() {
		return baseGiveExp;
	}

	public final void setBaseGiveExp(int baseGiveExp) {
		this.baseGiveExp = baseGiveExp;
	}

	public final int getMinGiveCoin() {
		return minGiveCoin;
	}

	public final void setMinGiveCoin(int minGiveCoin) {
		this.minGiveCoin = minGiveCoin;
	}

	public final int getMaxGiveCoin() {
		return maxGiveCoin;
	}

	public final void setMaxGiveCoin(int maxGiveCoin) {
		this.maxGiveCoin = maxGiveCoin;
	}

	public final int getJuqingItemId() {
		return juqingItemId;
	}

	public final void setJuqingItemId(int juqingItemId) {
		this.juqingItemId = juqingItemId;
	}

	public final int getMainHis() {
		return mainHis;
	}

	public final void setMainHis(int mainHis) {
		this.mainHis = mainHis;
	}

	public final int getDropPackId() {
		return dropPackId;
	}

	public final void setDropPackId(int dropPackId) {
		this.dropPackId = dropPackId;
	}

	public final int getDropCompId() {
		return dropCompId;
	}

	public final void setDropCompId(int dropCompId) {
		this.dropCompId = dropCompId;
	}

	public final int getOddsDropBox() {
		return oddsDropBox;
	}

	public final void setOddsDropBox(int oddsDropBox) {
		this.oddsDropBox = oddsDropBox;
	}

	public final int getOddsPush() {
		return oddsPush;
	}

	public final void setOddsPush(int oddsPush) {
		this.oddsPush = oddsPush;
	}

	public final int getOddsDExp() {
		return oddsDExp;
	}

	public final void setOddsDExp(int oddsDExp) {
		this.oddsDExp = oddsDExp;
	}

	public final int getOddsDCoin() {
		return oddsDCoin;
	}

	public final void setOddsDCoin(int oddsDCoin) {
		this.oddsDCoin = oddsDCoin;
	}

	public final int getOddsBoss() {
		return oddsBoss;
	}

	public final void setOddsBoss(int oddsBoss) {
		this.oddsBoss = oddsBoss;
	}

	public final int getPassCoin() {
		return passCoin;
	}

	public final void setPassCoin(int passCoin) {
		this.passCoin = passCoin;
	}

	public final int getPassGold() {
		return passGold;
	}

	public final void setPassGold(int passGold) {
		this.passGold = passGold;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("display", display);
		map.put("befTaskId", befTaskId);
		map.put("ownerSMallMap", ownerListId);
		map.put("bossCopySayId", bossCopySayId);
		map.put("bossId", bossId);
		map.put("needLevel", needLevel);
		map.put("needOrig", needOrig);
		map.put("onceComp", onceComp);
		map.put("baseGiveExp", baseGiveExp);
		map.put("minGiveCoin", minGiveCoin);
		map.put("maxGiveCoin", maxGiveCoin);
		map.put("oddsDropBox", oddsDropBox);
		map.put("juqingItemId", juqingItemId);
		map.put("mainHis", mainHis);
		map.put("dropPackId", dropPackId);
		map.put("dropCompId", dropCompId);
		map.put("after", after);
		map.put("oddsPush", oddsPush);
		map.put("oddsDExp", oddsDExp);
		map.put("oddsDCoin", oddsDCoin);
		map.put("oddsBoss", oddsBoss);
		map.put("passCoin", passCoin);
		map.put("passGold", passGold);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
