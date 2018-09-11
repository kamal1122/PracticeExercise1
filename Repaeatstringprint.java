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
                  
                    int input_num=scan.nextInt();
                   int k=user_input.length();
                    k=k-input_num;
                  int i,j;
                   System.out.print(user_input);
                  for(i=1;i<=input_num;i++){
                      for(j=k;j<user_input.length();j++){
                          System.out.print(user_input.charAt(j));
                      }
                  }
                   
               }
}
                  
