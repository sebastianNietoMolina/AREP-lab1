package edu.escuelaing.arep.lab1;

import java.util.List;

public class MeanAndStandardDeviation {

    public static List<Double> secondList = new LinkedList<Double>();

     public static Double mean(List<Double> meanList){
         Double sum = 0.0;
         for(Double num : meanList){
             secondList.add(num);
             sum += num;
         }
         Double res = sum/meanList.size();
         return res;
    }

    public static Double stDeviation(List<Double> stdList){
        clear();
        Double meanData = mean(stdList);
        Double rest = 0.0;
        for(Double num : secondList){
            rest += Math.pow(num-meanData,2);
        }
        Double res = rest/(secondList.size()-1);
        clear();
        return Math.sqrt(res);
    }

    public static void clear(){
        for(Double num : secondList){
            secondList.clear();
        }
    }

}
