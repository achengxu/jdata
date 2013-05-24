package game.map.mall;

import game.data.mall.MallData;
import game.map.IMap;
import game.map.IParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 商城表
 */
public class MapMall implements IMap, IParse {

	private static MapMall instance;

	private Map<Integer, MallData> map;

	private MapMall() {
		map = new HashMap<Integer, MallData>();
	}

	public static MapMall getInstance() {
		if (null == instance)
			instance = new MapMall();
		return instance;
	}

	public MallData getData(int mallDataId) {
		return map.get(mallDataId);
	}

	public Map<Integer, MallData> getMap() {
		return map;
	}

	public void add(Object obj) {
		if (obj instanceof MallData) {
			MallData data = (MallData) obj;
			map.put(data.getItemId(), data);
		}
	}

	@Override
	public String getBeanName() {
		return "value.mall.data.so";
	}

	@Override
	public String getIDataName() {
		return MallData.class.getName();
	}

	@Override
	public IMap getRoot() {
		return this;
	}

}
