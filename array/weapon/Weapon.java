package array.weapon;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-21
 * Time:16:18
 */

/*
    武器类父类
 */
public class Weapon {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon() {

    }
    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
