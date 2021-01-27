package edu.escuelaing.arep.lab1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testMean1(){
        List lis = new LinkedList();

        lis.add(160.0);
        lis.add(591.0);
        lis.add(114.0);
        lis.add(229.0);
        lis.add(230.0);
        lis.add(270.0);
        lis.add(128.0);
        lis.add(1657.0);
        lis.add(624.0);
        lis.add(1503.0);

        Double res = MeanAndStandardDeviation.mean(lis);
        assertEquals(550.6,res);
    }

    public void testMean2(){
        List lis = new LinkedList();

        lis.add(15.0);
        lis.add(69.9);
        lis.add(6.5);
        lis.add(22.4);
        lis.add(28.4);
        lis.add(65.9);
        lis.add(19.4);
        lis.add(198.7);
        lis.add(38.8);
        lis.add(138.2);

        Double res = MeanAndStandardDeviation.mean(lis);
        assertEquals(60.31999999999999,res);
    }

    public void testMean3(){
        List lis = new LinkedList();

        lis.add(186.0);
        lis.add(699.0);
        lis.add(132.0);
        lis.add(272.0);
        lis.add(291.0);
        lis.add(331.0);
        lis.add(199.0);
        lis.add(1890.0);
        lis.add(788.0);
        lis.add(1601.0);

        Double res = MeanAndStandardDeviation.mean(lis);
        assertEquals(638.9,res);
    }

    public void testStdeviation1(){
        List lis = new LinkedList();

        lis.add(160.0);
        lis.add(591.0);
        lis.add(114.0);
        lis.add(229.0);
        lis.add(230.0);
        lis.add(270.0);
        lis.add(128.0);
        lis.add(1657.0);
        lis.add(624.0);
        lis.add(1503.0);

        Double res = MeanAndStandardDeviation.stDeviation(lis);
        assertEquals(572.026844746915, res);
    }

    public void testStdeviation2(){
        List lis = new LinkedList();

        lis.add(15.0);
        lis.add(69.9);
        lis.add(6.5);
        lis.add(22.4);
        lis.add(28.4);
        lis.add(65.9);
        lis.add(19.4);
        lis.add(198.7);
        lis.add(38.8);
        lis.add(138.2);

        Double res = MeanAndStandardDeviation.stDeviation(lis);
        assertEquals(62.25583060601186,res);
    }

    public void testStdeviation3(){
        List lis = new LinkedList();

        lis.add(186.0);
        lis.add(699.0);
        lis.add(132.0);
        lis.add(272.0);
        lis.add(291.0);
        lis.add(331.0);
        lis.add(199.0);
        lis.add(1890.0);
        lis.add(788.0);
        lis.add(1601.0);

        Double res = MeanAndStandardDeviation.stDeviation(lis);
        assertEquals(625.6339806770231,res);
    }


}
