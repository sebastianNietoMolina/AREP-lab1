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


        //System.out.println(MeanAndStandardDeviation.mean(lis));
        System.out.println(MeanAndStandardDeviation.stDeviation(lis));
    }


}
