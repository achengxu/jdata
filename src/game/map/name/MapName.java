package game.map.name;

import game.data.name.NameManData;
import game.data.name.NameTagData;
import game.data.name.NameWomenData;
import game.map.IMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapName implements IMap {

	private static MapName instance;

	private List<String> tag;

	private List<String> man;

	private List<String> women;

	private MapName() {
		tag = new ArrayList<String>();
		man = new ArrayList<String>();
		women = new ArrayList<String>();
	}

	public static MapName getInstance() {
		if (null == instance)
			instance = new MapName();
		return instance;
	}

	public List<String> getTag() {
		return tag;
	}

	public List<String> getMan() {
		return man;
	}

	public List<String> getWomen() {
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

	public Map<?, ?> getMap() {
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

	public void add(int index, String value) {
		if (index == TAG) {
			addTag(value);
		} else if (index == WOMEN) {
			addWomen(value);
		} else if (index == MAN) {
			addMan(value);
		}
	}

	public final static int TAG = 0;
	public final static int WOMEN = 1;
	public final static int MAN = 2;

}
