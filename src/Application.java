

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
    }
}
