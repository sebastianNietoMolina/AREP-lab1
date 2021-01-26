package edu.escuelaing.arep.lab1;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        List lis = new LinkedList();
        lis.add(160.0);
        lis.add(170.0);
        lis.add(180.0);
        MeanAndStandardDeviation.mean(lis);
    }
}
