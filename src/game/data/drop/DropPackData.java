package game.data.drop;

import game.data.IData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/** 掉落包 */
public class DropPackData implements IData {
	private static final long serialVersionUID = 1L;
	/** 掉落包id */
	private int id;
	/** 碎片 (1-3000) */
	private ArrayList<Integer> patchList;
	/** 卡牌列表 1(3001-7000) */
	private ArrayList<Integer> cardList1;
	/** 卡牌列表 2(7001-8500) */
	private ArrayList<Integer> cardList2;
	/** 卡牌列表 2(8501-9500) */
	private ArrayList<Integer> cardList3;
	/** 卡牌列表 2(9501-10000) */
	private ArrayList<Integer> cardList4;

	public DropPackData() {
		patchList = new ArrayList<Integer>();
		cardList1 = new ArrayList<Integer>();
		cardList2 = new ArrayList<Integer>();
		cardList3 = new ArrayList<Integer>();
		cardList4 = new ArrayList<Integer>();
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final ArrayList<Integer> getPatchList() {
		return patchList;
	}

	public final void setPatchList(ArrayList<Integer> patchList) {
		this.patchList = patchList;
	}

	public final ArrayList<Integer> getList(int index) {
		if (index >= 0 && index <= 4000) {
			return patchList;
		} else if (index > 4000 && index <= 7000) {
			return cardList1;
		} else if (index > 7000 && index <= 8500) {
			return cardList2;
		} else if (index > 8500 && index <= 9500) {
			return cardList3;
		} else {
			return cardList4;
		}
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

	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("patchList", patchList);
		map.put("cardList1", cardList1);
		map.put("cardList2", cardList2);
		map.put("cardList3", cardList3);
		map.put("cardList4", cardList4);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
