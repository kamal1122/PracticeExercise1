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
                     
                       int k=user_input.charAt(0);
                  if(k-'0'>=0 && k-'0'<=9){
                      System.out.println("It is a number");
                  }
                  else if(k-'A'>=0 && k-'A'<=25){
                      System.out.println("It is a Capital Letter");
                  }
                   else if(k-'a'>=0 && k-'a'<=25){
                      System.out.println("It is a small Letter");
                  }
                   else{
                        System.out.println("It is a special symbol");
                   }
               }
}
                  
