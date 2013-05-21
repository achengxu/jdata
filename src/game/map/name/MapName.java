package game.map.name;

import game.data.name.NameManData;
import game.data.name.NameTagData;
import game.data.name.NameWomenData;
import game.map.IMap;

import java.util.ArrayList;
import java.util.Map;

public class MapName implements IMap {

	private static MapName data;

	private ArrayList<String> tag;

	private ArrayList<String> man;

	private ArrayList<String> women;

	private MapName() {
		tag = new ArrayList<String>();
		man = new ArrayList<String>();
		women = new ArrayList<String>();
	}

	public static MapName getInstance() {
		if (null == data)
			data = new MapName();
		return data;
	}

	public ArrayList<String> getTag() {
		return tag;
	}

	public ArrayList<String> getMan() {
		return man;
	}

	public ArrayList<String> getWomen() {
		return women;
	}

	public void addTag(String name) {
		if (isTrue(name)) {
			tag.add(name);
		}
	}

	public void addMan(String name) {
		if (isTrue(name)) {
			man.add(name);
		}
	}

	public void addWomen(String name) {
		if (isTrue(name)) {
			women.add(name);
		}
	}

	public boolean isTrue(String value) {
		return null != value && value.trim().length() > 0;
	}

	public Map<?, ?> toMap() {
		return null;
	}

	public void add(Object obj) {
		if (obj instanceof NameTagData) {
			addTag(obj.toString());
		} else if (obj instanceof NameWomenData) {
			addWomen(obj.toString());
		} else if (obj instanceof NameManData) {
			addMan(obj.toString());
		}
	}

}
