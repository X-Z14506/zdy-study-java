package array.weapon;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-21
 * Time:16:20
 */

/**
 * 运输机是武器，能移动，不能攻击
 */
public class YunShuJi extends Weapon implements Moveable{

    private String name;
    public YunShuJi(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("运输机起飞");
    }
}
