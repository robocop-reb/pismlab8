

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        UnitBuilder builder = new UnitBuilder();
        director.buildPlane(builder);
        Unit plane = builder.getResult();
        director.buildSoldier(builder);
        Unit soldier = builder.getResult();
        director.buildTank(builder);
        Unit tank = builder.getResult();
        System.out.println("Unit built:\n" + plane.getUnitType());
        System.out.println("Plane health:\n" + plane.getUnitHealth());
        System.out.println("Unit built:\n" + soldier.getUnitType());
        System.out.println("Unit built:\n" + tank.getUnitType());
    }
}
