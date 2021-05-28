import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

    HashSet<String> pairs = new HashSet<String>(t);
        for(int i = 0; i < t; i++)
        {
            pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")" );
            System.out.println(pairs.size());        
        }
   }
}
import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   boolean run;
   
   public void printArray(Object[] arr)
   {
       for (Object obj : arr)
       {
           System.out.println(obj);
       }
   }
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}