package head_first.strategy.characters;

import head_first.strategy.behaviors.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }

    public void fight() {
        this.weapon.useWeapon();
    }
}
