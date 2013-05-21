package game.data.trial;

import game.data.IData;

import java.util.HashMap;
import java.util.Map;

/**
 * 试炼老板数据
 */
public class TrialBossData implements IData {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private int minDefen;
	private int maxDefen;
	private String icon;
	private String say1;
	private String say2;

	public TrialBossData() {
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

	public final int getMinDefen() {
		return minDefen;
	}

	public final void setMinDefen(int minDefen) {
		this.minDefen = minDefen;
	}

	public final int getMaxDefen() {
		return maxDefen;
	}

	public final void setMaxDefen(int maxDefen) {
		this.maxDefen = maxDefen;
	}

	public final String getIcon() {
		return icon;
	}

	public final void setIcon(String icon) {
		this.icon = icon;
	}

	public final String getSay1() {
		return say1;
	}

	public final void setSay1(String say1) {
		this.say1 = say1;
	}

	public final String getSay2() {
		return say2;
	}

	public final void setSay2(String say2) {
		this.say2 = say2;
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("icon", icon);
		map.put("name", name);
		map.put("minDefen", minDefen);
		map.put("maxDefen", maxDefen);
		map.put("say1", say1);
		map.put("say2", say2);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
