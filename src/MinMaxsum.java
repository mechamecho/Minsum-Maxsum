import java.util.Scanner;

/**
 * Created by Engineer on 5/20/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
        List<Integer> numberList= new ArrayList<>();
        long sum=0;
//        for(int arr_i=0; arr_i < 5; arr_i++){
//            arr[arr_i] = in.nextInt();
//            sum+=arr[arr_i];
//        }
        for (int i=0;i<5;i++){
            numberList.add(in.nextInt());
            sum+=numberList.get(i);
        }
//        long minsum=sum-arr[0];
//        long maxsum=sum-arr[0];
//        for (int i=0; i<5; i++){
//            long middlesum=sum-arr[i];
//            if(middlesum<minsum){
//                minsum=middlesum;
//            }
        long minsum=Long.MAX_VALUE;
        long maxsum=Long.MIN_VALUE;
        for(int i: numberList){
            long middlesum=sum-i;
            if(middlesum<minsum){
                minsum=middlesum;
            }
            if(maxsum<middlesum){
                maxsum=middlesum;
            }
        }
        System.out.print(minsum+" "+maxsum);
    }
}
