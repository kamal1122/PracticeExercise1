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
                     int sum=0;
                   int len=user_input.length();
                   int[] arr = new int[len];
                  
                   int flag=1;
                       for(int i=0;i<user_input.length();i++){
                           if(user_input.charAt(i)-'0'>=0 && user_input.charAt(i)-'0'<=9){
                              int k=(user_input.charAt(i))-'0';
                               arr[i]=k;
                              
                               if(k%2==0){
                                   sum=sum+k;
                               }
                           }
                           else{
                               flag=0;
                           }
                          
                           
                       }
                      
                      
                  
           Arrays.sort(arr);
      

        
                  if(flag==1){
                      System.out.println("sum of even numbers is equal to "+sum);
                      for(int i=len-1;i>=0;i--){
                          System.out.print( arr[i]);
                      }
                      System.out.print("\n");
                      if(sum>=15){
                           System.out.print("True");
                      }
                      else{
                          System.out.print("False");
                      }
                  }
                   else{
                       System.out.println("please enter only numbers");
                   }
                   
               }
}
                  
