package game.data.role;

import game.data.IData;

import java.util.HashMap;

public class RoleBaseData implements IData {

	private static final long serialVersionUID = 1L;

	/** 等级 */
	private int level;
	/** 称号 */
	private String nickName;
	/** 文字颜色 */
	private String nickColor;
	/** 经验上限 */
	private int maxExp;
	/** 元气上限 */
	private int maxOriginal;
	/** 精气上限 */
	private int maxEssence;
	/** 灵气上限 */
	private int maxSpirit;
	/** 升级奖励银币 */
	private int upGiveCoin;
	/** 升级奖励元宝 */
	private int upGiveGold;
	/** 卡槽上限 */
	private int maxCardSlot;
	/** 好友上限 */
	private int maxFriend;

	public final int getLevel() {
		return level;
	}

	public final void setLevel(int level) {
		this.level = level;
	}

	public final String getNickName() {
		return nickName;
	}

	public final void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public final String getNickColor() {
		return nickColor;
	}

	public final void setNickColor(String nickColor) {
		this.nickColor = nickColor;
	}

	public final int getMaxExp() {
		return maxExp;
	}

	public final void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}

	public final int getMaxOriginal() {
		return maxOriginal;
	}

	public final void setMaxOriginal(int maxOriginal) {
		this.maxOriginal = maxOriginal;
	}

	public final int getMaxEssence() {
		return maxEssence;
	}

	public final void setMaxEssence(int maxEssence) {
		this.maxEssence = maxEssence;
	}

	public final int getMaxSpirit() {
		return maxSpirit;
	}

	public final void setMaxSpirit(int maxSpirit) {
		this.maxSpirit = maxSpirit;
	}

	public final int getUpGiveCoin() {
		return upGiveCoin;
	}

	public final void setUpGiveCoin(int upGiveCoin) {
		this.upGiveCoin = upGiveCoin;
	}

	public final int getUpGiveGold() {
		return upGiveGold;
	}

	public final void setUpGiveGold(int upGiveGold) {
		this.upGiveGold = upGiveGold;
	}

	public final int getMaxCardSlot() {
		return maxCardSlot;
	}

	public final void setMaxCardSlot(int maxCardSlot) {
		this.maxCardSlot = maxCardSlot;
	}

	public final int getMaxFriend() {
		return maxFriend;
	}

	public final void setMaxFriend(int maxFriend) {
		this.maxFriend = maxFriend;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("level", level);
		map.put("nickName", nickName);
		map.put("nickColor", nickColor);
		map.put("maxExp", maxExp);
		map.put("maxOriginal", maxOriginal);
		map.put("maxSpirit", maxSpirit);
		map.put("maxEssence", maxEssence);
		map.put("upGiveCoin", upGiveCoin);
		map.put("upGiveGold", upGiveGold);
		map.put("maxCardSlot", maxCardSlot);
		map.put("maxFriend", maxFriend);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}
