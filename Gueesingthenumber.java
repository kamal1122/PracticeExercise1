import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Random;

 class Solution {
               public static void  main(String[] args){
                   
                    Random rand = new Random();
                  int number=rand.nextInt(100);
                   Scanner scan =new Scanner(System.in);
                       int user_input=scan.nextInt();
                    
                   while(user_input!=number){
                       if(user_input>number){
                           System.out.println(" this number is greater than the actual number");
                       }
                       else{
                           System.out.println(" this number is less than the actual number");
                       }
                        
                      user_input=scan.nextInt();
                       
                       
                   }
                    System.out.println(" this number is the actual number");
                   
               }
}
                  
