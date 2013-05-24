package game.data.shut;

import game.data.IData;

import java.util.HashMap;
import java.util.Map;

/**
 * PVP 获得奖励
 */
public final class SoulGetData implements IData {

	private static final long serialVersionUID = 1L;
	/** 等级 */
	private int level;
	/** 胜利基础经验奖励 */
	private int exp;
	/** 胜利基础金钱奖励 */
	private int coin;
	/** 失败基础经验奖励 */
	private int failedExp;
	/** 失败基础金钱奖励 */
	private int failedCoin;
	/** 级差倍数 */
	private int times;

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

	public final int getCoin() {
		return coin;
	}

	public final void setCoin(int coin) {
		this.coin = coin;
	}

	public final int getFailedExp() {
		return failedExp;
	}

	public final void setFailedExp(int failedExp) {
		this.failedExp = failedExp;
	}

	public final int getFailedCoin() {
		return failedCoin;
	}

	public final void setFailedCoin(int failedCoin) {
		this.failedCoin = failedCoin;
	}

	public final int getTimes() {
		return times;
	}

	public final void setTimes(int times) {
		this.times = times;
	}

	@Override
	public Map<String, Integer> toMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("level", level);
		map.put("exp", exp);
		map.put("coin", coin);
		map.put("failedExp", failedExp);
		map.put("failedCoin", failedCoin);
		map.put("times", times);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}
}
