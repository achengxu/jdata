package game.data.trial;

import game.data.IData;

import java.util.HashMap;
import java.util.Map;

/**
 * 试炼复活加成数据
 * 
 */
public final class TrialReLiveData implements IData {

	private static final long serialVersionUID = 1L;

	private int id;
	/** 消耗银币 */
	private int needCoin;
	/** 消耗金币 */
	private int needGold;
	/** 攻击加成 */
	private int addOdds;

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final int getNeedCoin() {
		return needCoin;
	}

	public final void setNeedCoin(int needCoin) {
		this.needCoin = needCoin;
	}

	public final int getNeedGold() {
		return needGold;
	}

	public final void setNeedGold(int needGold) {
		this.needGold = needGold;
	}

	public final int getAddOdds() {
		return addOdds;
	}

	public final void setAddOdds(int addOdds) {
		this.addOdds = addOdds;
	}

	@Override
	public Map<String, Integer> toMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("id", id);
		map.put("needCoin", needCoin);
		map.put("needGold", needGold);
		map.put("addOdds", addOdds);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
