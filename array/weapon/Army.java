package array.weapon;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-21
 * Time:15:25
 */

/*
        写一个类Army，代表一支军队，这个类有一个属性weapon数组w（用来存储该军队所拥有的所有武器）
     该类还提供了一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所拥有的最大武器数量，
     并用这一大小来初始化数组w
        该类还提供了一个方法addWeapon（Weapon wa），表示吧参数wa所代表的武器加入到数组w中，
     在这个类中还定义两个方法attackAll（）让w数组中的所有武器攻击：以及moveAll（）让w数组
     中的所有可移动的武器移动

        写一个主方法去测试以上程序
        提示：weapon是一个父类，应该有很多子武器
             这些武器欧诺个该有一些事可移动的，有一些是可攻击的
 */

import javax.xml.ws.WebServiceException;

/**
 * 军队
  */
public class Army {
    /**
     * 武器数组
     */
    private Weapon[] weapons;

    /**
     * 创建军队的构造方法
     * @param count
     */
    public Army(int count) {
        //动态初始化，每一个元素默认值是null
        this.weapons = new Weapon[count];
    }

    /**
     * 将武器加入到数组
     * @param weapon
     */
    public void addWeapon(Weapon weapon) throws WeaponIndexOutOfException {
        for (int i = 0;i < weapons.length;i++) {
            if (null == weapons[i]) {
                weapons[i] = weapon;
                System.out.println(weapon+"准备就绪");
                return;
            }
        }
        //程序执行到这里说明武器数组已经满了，添加武器失败，不能再往里面添加武器
        throw new WeaponIndexOutOfException("武器数量已经达到上限！");
    }

    /**
     * 所有武器攻击的方法
     */
    public void attackAll() {
        for (int i = 0;i < weapons.length;i++) {
            if (weapons[i] instanceof Shootable) {
                //调用子类中特有的方法，向下转型
                /**
                 * 注意：类在强制类型转换过程中，如果是类转换成接口类型，
                 *      name类和接口之间不需要存在继承关旭，也可以转换
                 *      java语法中允许
                 */
                Shootable shootable = (Shootable)weapons[i];
                shootable.shoot();
            }
        }
    }

    /**
     * 所有武器移动的方法
     */
    public void moveAll() {
        for (int i = 0;i < weapons.length;i++) {
            if (weapons[i] instanceof Moveable) {
                //调用子类中特有的方法，向下转型
                Moveable moveable = (Moveable) weapons[i];
                moveable.move();
            }
        }
    }
}
