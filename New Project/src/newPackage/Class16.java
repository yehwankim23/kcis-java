package newPackage;

import java.util.Scanner;

// guess
public class Class16 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        int n,g;
        
        System.out.print("Input: ");        
        n=(int)(Math.random()*10)+1;
        
        while(true) {
            g=rd.nextInt();
            
            if(g>n) {
                System.out.println("Go Down!");
            }
            
            else if(g<n) {
                System.out.println("Go Up");
            }
            
            else {
                System.out.println("Answer!");
                break;
            }
        }
    }
}

/*
Input: 5
Answer!

 */
