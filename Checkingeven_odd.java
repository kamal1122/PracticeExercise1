import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Checking {
               public static void  main(String[] args){
                   Scanner scan =new Scanner(System.in);
                    int user_input=scan.nextInt();
                    if(user_input>=20 && user_input<=30 && user_input%2==1){
                        System.out.print("Tom");
                    }
                    if(user_input>=20 && user_input<=30 && user_input%2==0){
                         System.out.print("Jerry");
                    }
               }
}
                  
