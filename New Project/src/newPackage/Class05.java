package newPackage;

import java.util.Scanner;

// storing numbers
public class Class05 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print("Input Two Numbers: ");
        
        a=rd.nextInt();
        b=rd.nextInt();
        System.out.println("a="+a+" b="+b);
        
        c=a;a=b;b=c;
        System.out.println("a="+a+" b="+b);
        
    }
}

/*
Input Two Numbers: 2 3
a=2 b=3
a=3 b=2

 */
