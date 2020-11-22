package newPackage;

import java.util.Scanner;

// star descending
public class Class19 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        int a,i;
        
        System.out.print("Input: ");
        a=rd.nextInt();
        
        while(a>0) {
            for(i=0;i<a;i++) {
                System.out.print("*");
            }
            
            System.out.println("");
            
            a--;
        }
    }
}

/*
Input: 7
*******
******
*****
****
***
**
*

 */
