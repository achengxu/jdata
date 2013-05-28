package game.data.card;

import game.data.IData;
import gear.util.MathUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 抽卡数据
 */
public class CardTakeData implements IData {

	private static final long serialVersionUID = 1L;
	/** id */
	private int id;
	private ArrayList<Integer> cardList1;
	private ArrayList<Integer> cardList2;
	private ArrayList<Integer> cardList3;
	private ArrayList<Integer> cardList4;
	private ArrayList<Integer> cardList5;
	/** 单次友情点 */
	private int onceFP;
	/** 六次友情点 */
	private int sisxFP;
	/** 单次金元宝 */
	private int onceGold;
	/** 六次金元宝 */
	private int sisxGold;
	/** 单次引神咒 */
	private int onceGod;

	public CardTakeData() {
		cardList1 = new ArrayList<Integer>();
		cardList2 = new ArrayList<Integer>();
		cardList3 = new ArrayList<Integer>();
		cardList4 = new ArrayList<Integer>();
		cardList5 = new ArrayList<Integer>();
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final ArrayList<Integer> getCardList1() {
		return cardList1;
	}

	public final void setCardList1(ArrayList<Integer> cardList1) {
		this.cardList1 = cardList1;
	}

	public final ArrayList<Integer> getCardList2() {
		return cardList2;
	}

	public final void setCardList2(ArrayList<Integer> cardList2) {
		this.cardList2 = cardList2;
	}

	public final ArrayList<Integer> getCardList3() {
		return cardList3;
	}

	public final void setCardList3(ArrayList<Integer> cardList3) {
		this.cardList3 = cardList3;
	}

	public final ArrayList<Integer> getCardList4() {
		return cardList4;
	}

	public final void setCardList4(ArrayList<Integer> cardList4) {
		this.cardList4 = cardList4;
	}

	public final ArrayList<Integer> getCardList5() {
		return cardList5;
	}

	public final void setCardList5(ArrayList<Integer> cardList5) {
		this.cardList5 = cardList5;
	}

	public final int getOnceFP() {
		return onceFP;
	}

	public final void setOnceFP(int onceFP) {
		this.onceFP = onceFP;
	}

	public final int getSisxFP() {
		return sisxFP;
	}

	public final void setSisxFP(int sisxFP) {
		this.sisxFP = sisxFP;
	}

	public final int getOnceGold() {
		return onceGold;
	}

	public final void setOnceGold(int onceGold) {
		this.onceGold = onceGold;
	}

	public final int getSisxGold() {
		return sisxGold;
	}

	public final void setSisxGold(int sisxGold) {
		this.sisxGold = sisxGold;
	}

	public final int getOnceGod() {
		return onceGod;
	}

	public final void setOnceGod(int onceGod) {
		this.onceGod = onceGod;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("cardList1", cardList1);
		map.put("cardList2", cardList2);
		map.put("cardList3", cardList3);
		map.put("cardList4", cardList4);
		map.put("cardList5", cardList5);
		map.put("onceFP", onceFP);
		map.put("sisxFP", sisxFP);
		map.put("onceGold", onceGold);
		map.put("sisxGold", sisxGold);
		map.put("onceGod", onceGod);
		return map;
	}

	public int get() {
		int random = MathUtil.random(1, 10000);
		List<Integer> list = new ArrayList<Integer>();
		if (random < 40001) {
			list = cardList1;
		} else if (random >= 4001 && random < 7001) {
			list = cardList2;
		} else if (random >= 7001 && random < 8501) {
			list = cardList3;
		} else if (random >= 8501 && random < 9501) {
			list = cardList4;
		} else {
			list = cardList5;
		}
		int index = MathUtil.random(0, list.size() - 1);
		return list.get(index);
	}

	public String toString() {
		return toMap().toString();
	}

}
