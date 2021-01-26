package edu.escuelaing.arep.lab1;

import java.util.List;

public class MeanAndStandardDeviation {

    public static Double mean(List<Double> meanList){
        Double sum = 0.0;
        for(Double data : meanList){
            System.out.println( "Todo bien?" );
            System.out.println( data );
            sum += data;
        }
        return sum/meanList.size();
    }

    public static Double stDeviation(List<Double> stdList){
        return 0.0;
    }
}
