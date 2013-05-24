package game.map.role;

import game.data.role.RoleBaseData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 人物经验升级表
 * 
 * @author un5n.com
 */
public class MapRoleBase implements IMap, IParse {

	private static MapRoleBase instance;

	private Map<Integer, RoleBaseData> map;

	private MapRoleBase() {
		map = new HashMap<Integer, RoleBaseData>();
	}

	public static MapRoleBase getInstance() {
		if (null == instance)
			instance = new MapRoleBase();
		return instance;
	}

	public RoleBaseData getData(int level) {
		return map.get(level);
	}

	public Map<Integer, RoleBaseData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof RoleBaseData) {
			RoleBaseData data = (RoleBaseData) obj;
			map.put(data.getLevel(), data);
		}
	}

	@Override
	public String getBeanName() {
		return "value.role.base.so";
	}

	@Override
	public String getIDataName() {
		return RoleBaseData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
