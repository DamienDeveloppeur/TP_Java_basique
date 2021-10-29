package tp;

import java.util.ArrayList;

public class TpJava07 {
    public static void main (String[] args){
        int nbr = Integer.parseInt(args[0]);
        int index = 2;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(arr.size() != nbr ){
            if(!arr.contains(findNextPrimeNumber(index))) arr.add(findNextPrimeNumber(index));
            index++;
        }
        System.out.println(arr);
    }

    public static int findNextPrimeNumber(int nbr){
        boolean flag = false;
        while (!flag) {
          if(checkNumberPrime(nbr)) {
              int result = nbr;
              flag = true;
              return nbr;
          }
          nbr++;
        }
        return nbr;
    }
    public static boolean checkNumberPrime(int nbr){
        for(int i = 2; i <= nbr/2; ++i){
            if(nbr % i == 0) return false;
        }
        return true;
    }
}
