package game.data.card.group;

/**
 * @category 卡牌组属性
 */
public interface IGroup {

	int getLevel();

	int getStar();

	int getMaxAttack();

	int getMinAttack();

	int getMaxDefense();

	int getMinDefense();

	String toString();
}
