package game.map.card;

import game.data.card.CardSkillData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

public class MapCardSkill implements IMap, IParse {

	private static MapCardSkill instance;

	private Map<Integer, CardSkillData> map;

	private MapCardSkill() {
		map = new HashMap<Integer, CardSkillData>();
	}

	public static MapCardSkill getInstance() {
		if (null == instance) {
			instance = new MapCardSkill();
		}
		return instance;
	}

	public void add(Object obj) {
		if (obj instanceof CardSkillData) {
			map.put(((CardSkillData) obj).getId(), (CardSkillData) obj);
		}
	}

	public CardSkillData getData(int id) {
		return map.get(id);
	}

	public Map<Integer, CardSkillData> getMap() {
		return map;
	}

	@Override
	public String getBeanName() {
		return "value.card.skill.so";
	}

	@Override
	public String getIDataName() {
		return CardSkillData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
