package game.data.login;

import game.data.IData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 连续登录奖励
 */
public class GoLoginData implements IData {

	/** 1=元宝,2=银币,3=卡牌 */
	public static final int TYPE_GOLD = 1;
	public static final int TYPE_COIN = 2;
	public static final int TYPE_CARD = 3;
	private static final long serialVersionUID = 1L;
	/** 银元宝几率 */
	private int coinOdds;
	/** 金元宝几率 */
	private int goldOdds;
	/** 卡牌几率 */
	private int cardOdds;
	/** 最小银币值 */
	private int minCoin;
	/** 最大银币值 */
	private int maxCoin;
	/** 卡牌列表 */
	private ArrayList<Integer> cardList;
	/** 金元宝奖励 */
	private int gold;

	private int coinOddsStart;
	private int coinOddsEnd;
	private int goldOddsStart;
	private int goldOddsEnd;
	private int cardOddsStart;
	private int cardOddsEnd;

	/**
	 * @return the coinOdds
	 */
	public int getCoinOdds() {
		return coinOdds;
	}

	/**
	 * @param coinOdds
	 *            the coinOdds to set
	 */
	public void setCoinOdds(int coinOdds) {
		this.coinOdds = coinOdds;
	}

	/**
	 * @return the goldOdds
	 */
	public int getGoldOdds() {
		return goldOdds;
	}

	/**
	 * @param goldOdds
	 *            the goldOdds to set
	 */
	public void setGoldOdds(int goldOdds) {
		this.goldOdds = goldOdds;
	}

	/**
	 * @return the cardOdds
	 */
	public int getCardOdds() {
		return cardOdds;
	}

	/**
	 * @param cardOdds
	 *            the cardOdds to set
	 */
	public void setCardOdds(int cardOdds) {
		this.cardOdds = cardOdds;
	}

	/**
	 * @return the minCoin
	 */
	public int getMinCoin() {
		return minCoin;
	}

	/**
	 * @param minCoin
	 *            the minCoin to set
	 */
	public void setMinCoin(int minCoin) {
		this.minCoin = minCoin;
	}

	/**
	 * @return the maxCoin
	 */
	public int getMaxCoin() {
		return maxCoin;
	}

	/**
	 * @param maxCoin
	 *            the maxCoin to set
	 */
	public void setMaxCoin(int maxCoin) {
		this.maxCoin = maxCoin;
	}

	/**
	 * @return the cardList
	 */
	public ArrayList<Integer> getCardList() {
		return cardList;
	}

	/**
	 * @param cardList
	 *            the cardList to set
	 */
	public void setCardList(ArrayList<Integer> cardList) {
		this.cardList = cardList;
	}

	/**
	 * @return the gold
	 */
	public int getGold() {
		return gold;
	}

	/**
	 * @param gold
	 *            the gold to set
	 */
	public void setGold(int gold) {
		this.gold = gold;
	}

	/**
	 * @return the coinOddsStart
	 */
	public int getCoinOddsStart() {
		return coinOddsStart;
	}

	/**
	 * @param coinOddsStart
	 *            the coinOddsStart to set
	 */
	public void setCoinOddsStart(int coinOddsStart) {
		this.coinOddsStart = coinOddsStart;
	}

	/**
	 * @return the coinOddsEnd
	 */
	public int getCoinOddsEnd() {
		return coinOddsEnd;
	}

	/**
	 * @param coinOddsEnd
	 *            the coinOddsEnd to set
	 */
	public void setCoinOddsEnd(int coinOddsEnd) {
		this.coinOddsEnd = coinOddsEnd;
	}

	/**
	 * @return the goldOddsStart
	 */
	public int getGoldOddsStart() {
		return goldOddsStart;
	}

	/**
	 * @param goldOddsStart
	 *            the goldOddsStart to set
	 */
	public void setGoldOddsStart(int goldOddsStart) {
		this.goldOddsStart = goldOddsStart;
	}

	/**
	 * @return the goldOddsEnd
	 */
	public int getGoldOddsEnd() {
		return goldOddsEnd;
	}

	/**
	 * @param goldOddsEnd
	 *            the goldOddsEnd to set
	 */
	public void setGoldOddsEnd(int goldOddsEnd) {
		this.goldOddsEnd = goldOddsEnd;
	}

	/**
	 * @return the cardOddsStart
	 */
	public int getCardOddsStart() {
		return cardOddsStart;
	}

	/**
	 * @param cardOddsStart
	 *            the cardOddsStart to set
	 */
	public void setCardOddsStart(int cardOddsStart) {
		this.cardOddsStart = cardOddsStart;
	}

	/**
	 * @return the cardOddsEnd
	 */
	public int getCardOddsEnd() {
		return cardOddsEnd;
	}

	/**
	 * @param cardOddsEnd
	 *            the cardOddsEnd to set
	 */
	public void setCardOddsEnd(int cardOddsEnd) {
		this.cardOddsEnd = cardOddsEnd;
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("coinOdds", coinOdds);
		map.put("goldOdds", goldOdds);
		map.put("cardOdds", cardOdds);
		map.put("minCoin", minCoin);
		map.put("maxCoin", maxCoin);
		map.put("cardList", cardList);
		map.put("gold", gold);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
