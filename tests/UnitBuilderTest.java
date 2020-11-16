import org.junit.Assert;

import org.junit.Test;

public class UnitBuilderTest {
    @Test public void valueTest() throws Exception{
        Director director = new Director();
        UnitBuilder builder = new UnitBuilder();
        director.buildPlane(builder);
        Unit plane = builder.getResult();
        Assert.assertEquals(plane.getAttackType(),UnitAttackType.ROCKET);
    }
    @Test public void objTest() throws Exception{
        Director director = new Director();
        UnitBuilder builder = new UnitBuilder();
        director.buildPlane(builder);
        Unit plane = builder.getResult();
        Assert.assertEquals(plane.getUnitType(),UnitType.SOLDIER);
    }

}