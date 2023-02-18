package equipmentsItems.weapon;

import equipmentsItems.BaseItem;

public class Weapon extends BaseItem {
    private int damage;
    private double attackSpeed;
    private double DamagePerSpeed;
    private String weaponType;

    public Weapon(String name, int RequiredLevel, String slot, int damage, double attackSpeed, String weaponType) {
        super(name, RequiredLevel, slot);
        this.damage = damage;                   //Weapon damage
        this.attackSpeed = attackSpeed;         //How many attacks per second
        this.DamagePerSpeed = damage * attackSpeed; //Damage per second = damage * attack speed
        this.weaponType = weaponType;           // type of weapon
    }

    public int getDamage() {
        return damage;
    }
    public double getAttackSpeed() {
        return attackSpeed;
    }
    public double getDamagePerSpeed() {
        return DamagePerSpeed;
    }
    public String getWeaponType() {
        return weaponType;
    }
    @Override
    public String toString() {
        return "Staff{" +
                "name='" + getName() + '\'' +
                ", RequiredLevel=" + getRequiredLevel() +
                ", slot='" + getSlot() + '\'' +
                ", damage=" + damage +
                ", attackSpeed=" + attackSpeed +
                ", Damage=" + DamagePerSpeed +
                ", type=" + weaponType +
                '}';
    }
}
