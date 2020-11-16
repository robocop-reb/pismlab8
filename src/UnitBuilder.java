

public class UnitBuilder implements Builder {
    private UnitType unitType;
    private UnitAttackType attackType;
    private int unitHealth;
    private int unitArmor;
    private int unitDamage;

    @Override
    public void setUnitType(UnitType type) {
        this.unitType = type;
    }

    @Override
    public void setUnitHealth(int unitHealth) {
        this.unitHealth = unitHealth;
    }

    @Override
    public void setUnitArmor(int unitArmor) {
        this.unitArmor = unitArmor;
    }

    @Override
    public void setUnitAttack(UnitAttackType type) {
        this.attackType = type;
    }

    @Override
    public void setUnitDamage(int unitDamage) {
        this.unitDamage = unitDamage;
    }

    public Unit getResult() {
        return new Unit(unitType, attackType, unitHealth, unitArmor, unitDamage);
    }
}
