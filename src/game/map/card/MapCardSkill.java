package game.map.card;

import game.data.card.CardSkillData;
import game.map.IMap;

import java.util.HashMap;

public class MapCardSkill implements IMap {

	private static MapCardSkill root;

	private HashMap<Integer, CardSkillData> map;

	private MapCardSkill() {
		map = new HashMap<Integer, CardSkillData>();
	}

	public static MapCardSkill getInstance() {
		if (null == root) {
			root = new MapCardSkill();
		}
		return root;
	}

	public void add(Object obj) {
		if (obj instanceof CardSkillData) {
			map.put(((CardSkillData) obj).getId(), (CardSkillData) obj);
		}
	}

	public CardSkillData getData(int id) {
		return map.get(id);
	}

	public HashMap<Integer, CardSkillData> toMap() {
		return map;
	}

}
