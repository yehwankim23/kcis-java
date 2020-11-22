package newPackage;

import java.util.Scanner;

// even or odd
public class Class15 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        int a;
        
        System.out.print("Input: ");
        a=rd.nextInt();
        
        if(a%2==0) {
            System.out.println("Even");
        }
        
        else {
            System.out.println("Odd");
        }
    }
}

/*
Input: 23
Odd

 */
