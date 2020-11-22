package newPackage;

import java.util.Scanner;

// switch, break
public class Class13 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        int a;
        
        System.out.print("Input: ");
        
        a=rd.nextInt();
        
        switch(a) {
            case 1:
                System.out.println("1");
                break;
                
            case 2:
                System.out.println("2");
                break;
        }
    }
}

/*
Input: 1
1

 */
