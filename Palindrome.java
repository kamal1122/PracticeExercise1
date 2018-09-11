import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Palindrome {
               public static void  main(String[] args){
                   Scanner scan =new Scanner(System.in);
                    String user_input=scan.nextLine();
                    int i;
                   int flag=1;
                   int j=user_input.length()-1;
                   for(i=0;i<user_input.length();i++){
                       if(i>=j){
                           break;
                       }
                       if(user_input.charAt(i)!=user_input.charAt(j)){
                           flag=0;
                       }
                       j--;
                   }
                   if(flag==1){
                       System.out.print(user_input+" is a plaindrome ");
                           int sum=0;
                           for(i=0;i<user_input.length();i++){
                               if((user_input.charAt(i)-'0') %2==0){
                                   sum+=user_input.charAt(i)-'0';
                               }
                           }
                         if(sum>=25){
                              System.out.print("sum is greater than 25");
                         }
                       else{
                           System.out.print("sum is less than 25");
                       }
                   }
                   if(flag==0){
                       System.out.print(user_input+" is  not a plaindrome");
                   }
                   
                   
               }
}
