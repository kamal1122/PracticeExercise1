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
                    int i;
                   int flag=0;
                   for(i=0;i<user_input.length();i++){
                       if((user_input.charAt(i)-'a'>=0 && user_input.charAt(i)-'a'<=25) ||(user_input.charAt(i)-'A'>=0 &&user_input.charAt(i)-'A'<=25) ){
                           
                       
                   }
                   else{
                       flag=1;
                   }
                           }
                   if(flag==1){
                        System.out.println("error: please enter only letters");
                   }
                   if(flag==0){
                       for(i=0;i<user_input.length();i++){
                           if(user_input.charAt(i)=='a' ||user_input.charAt(i)=='A'||
                              user_input.charAt(i)=='e' ||user_input.charAt(i)=='E' ||
                              user_input.charAt(i)=='i' ||user_input.charAt(i)=='I' ||
                              user_input.charAt(i)=='o' ||user_input.charAt(i)=='O' ||
                              user_input.charAt(i)=='u' ||user_input.charAt(i)=='U' ){
                               System.out.println(user_input.charAt(i)+" is vowel");
                           }
                           else{
                                System.out.println(user_input.charAt(i)+" is consonant");
                           }
                       }
                   }
                   
               }
}
                  
