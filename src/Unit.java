import jdk.nashorn.internal.objects.annotations.Getter;


public class Unit {
    private final UnitType unitType;
    private final UnitAttackType attackType;
    private int unitHealth;
    private final int unitArmor;
    private final int unitDamage;

    public UnitType getUnitType() {
        return unitType;
    }

    public UnitAttackType getAttackType() {
        return attackType;
    }

    public int getUnitHealth() {
        return unitHealth;
    }

    public int getUnitArmor() {
        return unitArmor;
    }

    public int getUnitDamage() {
        return unitDamage;
    }

    public Unit(UnitType unitType, UnitAttackType attackType, int unitHealth, int unitArmor, int unitDamage) {
        this.unitType = unitType;
        this.attackType = attackType;
        this.unitHealth = unitHealth;
        this.unitArmor = unitArmor;
        this.unitDamage = unitDamage;
    }
}
