import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Solution {
               public static void  main(String[] args){
                   Scanner scan =new Scanner(System.in);
                  String user_input=scan.nextLine();
                      String reverse_string="";
                   for(int i=user_input.length()-1;i>=0;i--){
                        reverse_string+=user_input.charAt(i);
                   }
                   System.out.println(reverse_string);
               }
}
                  
