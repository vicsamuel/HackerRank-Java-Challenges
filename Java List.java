import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < num; i++) 
        {
            int val = sc.nextInt();
            list.add(val);
        }
        
        int qNum = sc.nextInt();
        for (int i = 0; i < qNum; i++)
        {
            String action = sc.next();
            if (action.equals("Insert")) 
            {
                int index = sc.nextInt();
                int val = sc.nextInt();
                list.add(index, val);
            }
            else
            {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        sc.close();
        
        for (Integer n : list) 
        {
            System.out.print(n + " ");
        }
    }
}