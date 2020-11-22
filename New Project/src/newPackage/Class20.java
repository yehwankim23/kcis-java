package newPackage;

import java.util.Scanner;

// star ascending
public class Class20 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        int a,i,j;
        
        System.out.print("Input: ");
        a=rd.nextInt();
        
        for(i=1;i<=a;i++) {
            for(j=0;j<i;j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}

/*
Input: 7
*
**
***
****
*****
******
*******

 */
