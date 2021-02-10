package array.weapon;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-21
 * Time:16:20
 */

/**
 * 高射炮是武器，只能攻击，不能移动
 */
public class GaoShePao extends Weapon implements Shootable{

    private String name;
    public GaoShePao(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void shoot() {
        System.out.println("高射炮开炮");
    }
}
