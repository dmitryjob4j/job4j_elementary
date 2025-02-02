package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.3.Тестирование
 * 3.Тесты для определения расстояния между точками.[#159459#127169]Test
 *  * 1.2.1.Классы и объекты
 *  * 2.1.Рефакторинг - Расстояние между точками.[#122587#127044]Test
 */
public class PointTest {

    @Test
    public void when00to20Then2Distance() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to42Then2I82Distance() {
        double expected = 3.16;
        int x1 = 1;
        int y1 = 3;
        int x2 = 4;
        int y2 = 2;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to50Then5Distance() {
        double expected = 5;
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to82Then6I92Distance() {
        double expected = 7.07;
        int x1 = 1;
        int y1 = 3;
        int x2 = 8;
        int y2 = 2;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}