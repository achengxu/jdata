package game.data.mall;

import game.data.IData;

import java.util.HashMap;

/**
 * 商城数据
 */
public class MallData implements IData {
	private static final long serialVersionUID = 1L;
	// 商品名称
	private String name;
	// 道具id
	private int itemId;
	// 商品图标
	private String icon;
	/**
	 * 商品分类<br/>
	 * 1==>补品<br/>
	 * 2==>道具<br/>
	 * 2==>礼包<br/>
	 */
	private int kind;
	// 售价
	private int sale;
	// 数量
	private int num;
	// 每日限购数量
	private int dayBuy;
	// 永久限购数量
	private int canBuy;
	// 折扣
	private int discount;
	// 介绍
	private String display;


	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getItemId() {
		return itemId;
	}

	public final void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public final String getIcon() {
		return icon;
	}

	public final void setIcon(String icon) {
		this.icon = icon;
	}

	public final int getKind() {
		return kind;
	}

	public final void setKind(int kind) {
		this.kind = kind;
	}

	public final int getSale() {
		return sale;
	}

	public final void setSale(int sale) {
		this.sale = sale;
	}

	public final int getNum() {
		return num;
	}

	public final void setNum(int num) {
		this.num = num;
	}

	public final int getDayBuy() {
		return dayBuy;
	}

	public final void setDayBuy(int dayBuy) {
		this.dayBuy = dayBuy;
	}

	public final int getCanBuy() {
		return canBuy;
	}

	public final void setCanBuy(int canBuy) {
		this.canBuy = canBuy;
	}

	public final int getDiscount() {
		return discount;
	}

	public final void setDiscount(int discount) {
		this.discount = discount;
	}

	public final String getDisplay() {
		return display;
	}

	public final void setDisplay(String display) {
		this.display = display;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("itemId", itemId);
		map.put("icon", icon);
		map.put("kind", kind);
		map.put("sale", sale);
		map.put("num", num);
		map.put("dayBuy", dayBuy);
		map.put("canBuy", canBuy);
		map.put("discount", discount);
		map.put("display", display);
		return map;
	}

	@Override
	public String toString() {
		return toMap().toString();
	}

}
