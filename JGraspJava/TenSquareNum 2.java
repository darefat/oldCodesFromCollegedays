/*
Excercise 10.17
   Project 7
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/


import java.math.BigDecimal;

/*
Excercise 10.17
   Project 7
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/


public class TenSquareNum {

    public static void main(String[] args) {

        BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal n = new BigDecimal(start);
        int count = 0;


        while (count < 10) {

            BigDecimal squared = n.multiply(n);
            if (squared.compareTo(longMaxValue) > 0) {
                count++;
                System.out.println(count+": " + n + " squared = " + squared);
            }
            n = n.add(BigDecimal.ONE);
        }
    }
  }
