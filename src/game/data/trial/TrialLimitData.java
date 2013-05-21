package game.data.trial;

import game.data.IData;

import java.util.HashMap;
import java.util.Map;

/**
 * 试炼限制(试炼次数)数据
 */
public class TrialLimitData implements IData {

	private static final long serialVersionUID = 1L;

	private int level;

	private int num;

	public final int getLevel() {
		return level;
	}

	public final void setLevel(int level) {
		this.level = level;
	}

	public final int getNum() {
		return num;
	}

	public final void setNum(int num) {
		this.num = num;
	}

	public Map<String, Integer> toMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("level", level);
		map.put("num", num);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
