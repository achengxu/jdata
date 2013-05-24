package game.map.effect;

import game.data.effect.EffectRoleData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Title: MapEffectRole
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2013
 * </p>
 * 
 * @author linxiaokai.cn
 * @version 1.0 2013-5-24
 */

public final class MapEffectRole implements IMap, IParse {

	private static MapEffectRole instance;

	/** 成就id=成就数据 */
	private Map<Integer, EffectRoleData> map;

	private Map<Integer, Map<Integer, EffectRoleData>> typeToData;

	private MapEffectRole() {
		map = new HashMap<Integer, EffectRoleData>();
		typeToData = new HashMap<Integer, Map<Integer, EffectRoleData>>();
	}

	public static final MapEffectRole getInstance() {
		if (null == instance) {
			instance = new MapEffectRole();
		}
		return instance;
	}

	public Map<Integer,EffectRoleData> getTypeMap(int type) {
		return typeToData.get(type);
	}

	@Override
	public Map<Integer, EffectRoleData> getMap() {
		return map;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof EffectRoleData) {
			EffectRoleData data = (EffectRoleData) obj;
			map.put(data.getId(), data);
			int type = data.getType();
			int limit = data.getLimit();
			if(typeToData.containsKey(type)){
				typeToData.get(type).put(limit, data);
			}else{
				Map<Integer, EffectRoleData> map = new HashMap<Integer, EffectRoleData>();
				map.put(limit, data);
				typeToData.put(type, map);
			}
		}
	}

	public EffectRoleData getData(int id) {
		return map.get(id);
	}

	@Override
	public String getBeanName() {
		return "value.effect.role.so";
	}

	@Override
	public String getIDataName() {
		return EffectRoleData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
