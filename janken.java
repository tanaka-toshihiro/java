package java;

import java.util.Scanner;

public class janken {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
       
        int a = scan,nextInt();
        int b = scan,nextInt();

        if(a==1){
            if(b==2){
             System.out.println("a wins");
            }else if(b==3){
             System.out.println("b wins");
            } 
         }else if(a==2){
             if(b==3){
              System.out.println("a wins");
             }else if(b==1){
              System.out.println("b wins");
             } 
         }else if(a==3){
             if(b==1){
              System.out.println("a wins");
             }else if(b==2){
              System.out.println("b wins");
             } 
         }else{ 
              System.out.println("draw");
         }
         
    }
}