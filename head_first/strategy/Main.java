package head_first.strategy;

import head_first.strategy.behaviors.WeaponBehavior;
import head_first.strategy.behaviors.AxeBehavior;
import head_first.strategy.behaviors.BowAndArrowBehavior;
import head_first.strategy.behaviors.KnifeBehavior;
import head_first.strategy.behaviors.SwordBehavior;
import head_first.strategy.characters.Character;
import head_first.strategy.characters.King;
import head_first.strategy.characters.Knight;
import head_first.strategy.characters.Queen;
import head_first.strategy.characters.Troll;

public class Main {

    public static void main(String[] args) {
        WeaponBehavior w = new AxeBehavior();
        Character c = new King();
        c.setWeapon(w);
        c.fight();

        w = new BowAndArrowBehavior();
        c = new Knight();
        c.setWeapon(w);
        c.fight();

        w = new KnifeBehavior();
        c = new Queen();
        c.setWeapon(w);
        c.fight();

        w = new SwordBehavior();
        c = new Troll();
        c.setWeapon(w);
        c.fight();
    }
}
