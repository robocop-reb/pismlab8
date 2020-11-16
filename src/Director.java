

public class Director {
    public void buildSoldier(Builder builder){
        builder.setUnitType(UnitType.SOLDIER);
        builder.setUnitHealth(10);
        builder.setUnitArmor(5);
        builder.setUnitAttack(UnitAttackType.GUN);
        builder.setUnitDamage(1);
    }

    public void buildTank(Builder builder){
        builder.setUnitType(UnitType.TANK);
        builder.setUnitHealth(50);
        builder.setUnitArmor(25);
        builder.setUnitAttack(UnitAttackType.CANNON);
        builder.setUnitDamage(15);
    }

    public void buildPlane(Builder builder){
        builder.setUnitType(UnitType.PLANE);
        builder.setUnitHealth(20);
        builder.setUnitArmor(7);
        builder.setUnitAttack(UnitAttackType.ROCKET);
        builder.setUnitDamage(20);
    }
}
