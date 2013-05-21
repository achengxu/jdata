package game.data.mall;

import game.data.IData;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 礼包数据
 */
public class GiftBagData implements IData {

	private static final long serialVersionUID = 1L;

	private int id;
	// 名称
	private String name;
	// 包含道具
	private ArrayList<Integer> items;
	// 卡牌数据列表
	private ArrayList<Integer> cards;
	// 包含消耗品
	private ArrayList<Integer> consus;
	// 道具数量
	private ArrayList<Integer> itemsNum;
	// 消耗品数量
	private ArrayList<Integer> consusNum;
	// 卡牌数量
	private ArrayList<Integer> cardsNum;
	// 包含银币
	private int coinNum;
	// 包含金币
	private int goldNum;
	// 礼品图标
	private String giftIocn;
	// 介绍
	private String display;

	public GiftBagData() {
		items = new ArrayList<Integer>();
		consus = new ArrayList<Integer>();
		itemsNum = new ArrayList<Integer>();
		consusNum = new ArrayList<Integer>();
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

	public final ArrayList<Integer> getItems() {
		return items;
	}

	public final void setItems(ArrayList<Integer> items) {
		this.items = items;
	}

	public final ArrayList<Integer> getCards() {
		return cards;
	}

	public final void setCards(ArrayList<Integer> cards) {
		this.cards = cards;
	}

	public final ArrayList<Integer> getConsus() {
		return consus;
	}

	public final void setConsus(ArrayList<Integer> consus) {
		this.consus = consus;
	}

	public final ArrayList<Integer> getItemsNum() {
		return itemsNum;
	}

	public final void setItemsNum(ArrayList<Integer> itemsNum) {
		this.itemsNum = itemsNum;
	}

	public final ArrayList<Integer> getConsusNum() {
		return consusNum;
	}

	public final void setConsusNum(ArrayList<Integer> consusNum) {
		this.consusNum = consusNum;
	}

	public final ArrayList<Integer> getCardsNum() {
		return cardsNum;
	}

	public final void setCardsNum(ArrayList<Integer> cardsNum) {
		this.cardsNum = cardsNum;
	}

	public final int getCoinNum() {
		return coinNum;
	}

	public final void setCoinNum(int coinNum) {
		this.coinNum = coinNum;
	}

	public final int getGoldNum() {
		return goldNum;
	}

	public final void setGoldNum(int goldNum) {
		this.goldNum = goldNum;
	}

	public final String getGiftIocn() {
		return giftIocn;
	}

	public final void setGiftIocn(String giftIocn) {
		this.giftIocn = giftIocn;
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
		map.put("items", items);
		map.put("consus", consus);
		map.put("cardList", cards);
		map.put("cardNum", cardsNum);
		map.put("itemNum", itemsNum);
		map.put("consuNum", consusNum);
		map.put("coinNum", coinNum);
		map.put("goldNum", goldNum);
		map.put("giftIocn", giftIocn);
		map.put("display", display);
		return map;
	}

	@Override
	public String toString() {
		return toMap().toString();
	}

}
