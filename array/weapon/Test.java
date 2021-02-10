package array.weapon;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-21
 * Time:17:07
 */
public class Test {
    public static void main(String[] args) {
        //创建一个军队
        Army army = new Army(4);//军队只有4个武器

        //创建武器对象
        Weapon fighter = new Fighter("战斗机");
        Weapon fighter2 = new Fighter("战斗机1");
        Weapon tank = new Tank("坦克");
        Weapon gaoShePao = new GaoShePao("高射炮");
        Weapon yunShuJi = new YunShuJi("运输机");

        //添加武器
        System.out.println("===============添加武器===================");
        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(gaoShePao);
            army.addWeapon(yunShuJi);
            army.addWeapon(fighter2);
        } catch (WeaponIndexOutOfException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("===========让所有可移动的武器移动============");
        //让所有可移动的移动
        army.moveAll();

        System.out.println("============让所有可攻击的武器攻击=================");
        //让所有可攻击的攻击
        army.attackAll();
    }
}
