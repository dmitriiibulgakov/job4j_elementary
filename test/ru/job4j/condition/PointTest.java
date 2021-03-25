package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then1_41() {
        double expected = 1.41;
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to54then5_83() {
        double expected = 5.83;
        Point point1 = new Point(0, 1);
        Point point2 = new Point(5, 4);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to55then0() {
        int expected = 0;
        Point point1 = new Point(5, 5);
        Point point2 = new Point(5, 5);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to555then866() {
        double expected = 8.66;
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(5, 5, 5);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to000then0() {
        double expected = 0;
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(0, 0, 0);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
