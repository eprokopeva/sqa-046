package com.luxoft.sqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPoint {
    @Test
    public void testDistancePoit(){
        Point p1 = new Point (3,8);
        Point p2 = new Point (9,10);
        Assert.assertEquals(p1.distance(p2),6.324555320336759);

    }
}
