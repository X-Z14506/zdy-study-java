package array.weapon;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-21
 * Time:16:46
 */

/**
 * 自定义的武器数组下标越界的异常
 */
public class WeaponIndexOutOfException extends Exception{
    public WeaponIndexOutOfException() {
    }

    public WeaponIndexOutOfException(String s) {
        super(s);
    }
}
