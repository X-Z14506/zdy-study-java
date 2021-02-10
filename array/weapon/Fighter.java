package array.weapon;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-21
 * Time:16:20
 */

/**
 * 战斗机是武器，可以攻击，可以移动
 */
public class Fighter extends Weapon implements Moveable,Shootable{
    private String name;

    public Fighter() {

    }
    public Fighter(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("战斗机起飞");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机开火");
    }
}
