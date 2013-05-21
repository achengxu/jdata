package game.data.task;

import game.data.IData;

import java.util.HashMap;

/**
 * 老板数据
 */
public class TaskBossData implements IData {

	private static final long serialVersionUID = 1L;

	/** bossId */
	private int uuid;
	/** bossId */
	private int id;
	/** BOSS图像 */
	private String icon;
	/** BOSS名称 */
	private String name;
	/** 对应卡牌id */
	private int cardId;
	/** 能否被降伏 */
	private int canFall;
	/** 降服成功率 */
	private int fallOdds;
	/** 道具降伏需要数量 */
	private int fallNUm;
	/** 降伏成功率 */
	private int fallNum;
	/** BOSS 最大防御力 */
	private int maxDefen;
	/** BOSS 最小防御力 */
	private int minDefen;
	/** 额外经验奖励 */
	private int andExp;
	/** 额外银币奖励 */
	private int andCoin;
	/** 小助手对话 */
	private String say1;
	/** BOSS对话 */
	private String say2;

	public final int getUuid() {
		return uuid;
	}

	public final void setUuid(int uuid) {
		this.uuid = uuid;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getIcon() {
		return icon;
	}

	public final void setIcon(String icon) {
		this.icon = icon;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getCardId() {
		return cardId;
	}

	public final void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public final int getCanFall() {
		return canFall;
	}

	public final void setCanFall(int canFall) {
		this.canFall = canFall;
	}

	public final int getFallOdds() {
		return fallOdds;
	}

	public final void setFallOdds(int fallOdds) {
		this.fallOdds = fallOdds;
	}

	public final int getFallNUm() {
		return fallNUm;
	}

	public final void setFallNUm(int fallNUm) {
		this.fallNUm = fallNUm;
	}

	public final int getFallNum() {
		return fallNum;
	}

	public final void setFallNum(int fallNum) {
		this.fallNum = fallNum;
	}

	public final int getMaxDefen() {
		return maxDefen;
	}

	public final void setMaxDefen(int maxDefen) {
		this.maxDefen = maxDefen;
	}

	public final int getMinDefen() {
		return minDefen;
	}

	public final void setMinDefen(int minDefen) {
		this.minDefen = minDefen;
	}

	public final int getAndExp() {
		return andExp;
	}

	public final void setAndExp(int andExp) {
		this.andExp = andExp;
	}

	public final int getAndCoin() {
		return andCoin;
	}

	public final void setAndCoin(int andCoin) {
		this.andCoin = andCoin;
	}

	public final String getSay1() {
		return say1;
	}

	public final void setSay1(String say1) {
		this.say1 = say1;
	}

	public final String getSay2() {
		return say2;
	}

	public final void setSay2(String say2) {
		this.say2 = say2;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("icon", icon);
		map.put("name", name);
		map.put("cardId", cardId);
		map.put("canFall", canFall);
		map.put("fallNum", fallNum);
		map.put("maxDefen", maxDefen);
		map.put("minDefen", minDefen);
		map.put("andExp", andExp);
		map.put("andCoin", andCoin);
		map.put("say1", say1);
		map.put("say2", say2);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}
}
