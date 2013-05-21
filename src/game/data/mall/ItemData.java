package game.data.mall;

import game.data.IData;

import java.util.HashMap;

public class ItemData implements IData {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String icon;
	private String display;

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

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("icon", icon);
		map.put("display", display);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
