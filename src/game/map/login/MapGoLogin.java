package game.map.login;

import game.data.login.GoLoginData;
import game.map.IMap;

import java.util.Map;

/**
 * 连续登录奖励表
 */
public class MapGoLogin implements IMap {

	private static MapGoLogin root;

	private GoLoginData data;

	public static MapGoLogin getInstance() {
		if (null == root) {
			root = new MapGoLogin();
		}
		return root;
	}

	@Override
	public Map<?, ?> toMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof GoLoginData) {
			data = (GoLoginData) obj;
			int start = 1;
			data.setCoinOddsStart(start);
			data.setCoinOddsEnd(start += data.getCoinOdds() - 1);
			data.setGoldOddsStart(start += 1);
			data.setGoldOddsEnd(start += data.getGoldOdds() - 1);
			data.setCardOddsStart(start += 1);
			data.setCardOddsStart(start += data.getCardOdds() - 1);
		}
	}

	public GoLoginData getData() {
		return data;
	}
}
