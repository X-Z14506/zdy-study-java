package array.weapon;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-21
 * Time:16:19
 */

/**
 * 坦克是一个武器，可移动，可攻击
 */
public class Tank extends Weapon implements Moveable,Shootable{
    private String name;

    public Tank(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void shoot() {
        System.out.println("坦克移动");
    }

    @Override
    public void move() {
        System.out.println("坦克射击");
    }


}
