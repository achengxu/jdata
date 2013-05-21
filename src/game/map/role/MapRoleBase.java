package game.map.role;

import game.data.role.RoleBaseData;
import game.map.IMap;

import java.util.HashMap;

/**
 * 人物经验升级表
 * 
 * @author un5n.com
 */
public class MapRoleBase implements IMap {

	private static MapRoleBase expRole;

	private HashMap<Integer, RoleBaseData> map;

	private MapRoleBase() {
		map = new HashMap<Integer, RoleBaseData>();
	}

	public static MapRoleBase getInstance() {
		if (null == expRole)
			expRole = new MapRoleBase();
		return expRole;
	}

	public RoleBaseData getData(int level) {
		return map.get(level);
	}

	public HashMap<Integer, RoleBaseData> toMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof RoleBaseData) {
			RoleBaseData data = (RoleBaseData) obj;
			map.put(data.getLevel(), data);
		}

	}

}
