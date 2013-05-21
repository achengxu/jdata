package game.data.mall;

import game.data.IData;

import java.util.HashMap;

/**
 * 消耗品数据
 */
public class UsedData implements IData {
	private static final long serialVersionUID = 1L;

	private int id;
	//
	private String name;
	//
	private String icon;
	//
	private String display;
	// 元气值恢复百分比
	private int oodsRecOrig;
	// 精气值恢复百分比
	private int oodsRecEsse;

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

	public final String getIcon() {
		return icon;
	}

	public final void setIcon(String icon) {
		this.icon = icon;
	}

	public final String getDisplay() {
		return display;
	}

	public final void setDisplay(String display) {
		this.display = display;
	}

	public final int getOodsRecOrig() {
		return oodsRecOrig;
	}

	public final void setOodsRecOrig(int oodsRecOrig) {
		this.oodsRecOrig = oodsRecOrig;
	}

	public final int getOodsRecEsse() {
		return oodsRecEsse;
	}

	public final void setOodsRecEsse(int oodsRecEsse) {
		this.oodsRecEsse = oodsRecEsse;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("display", display);
		map.put("oodsRecOrig", oodsRecOrig);
		map.put("oodsRecEsse", oodsRecEsse);
		map.put("icon", icon);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}
}
