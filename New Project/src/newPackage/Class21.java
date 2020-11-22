package newPackage;

import java.util.Scanner;

// list
public class Class21 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        int x,i,n;
        
        System.out.print("Length of List: ");
        x=rd.nextInt();
        
        System.out.println("");
        
        int scr[]=new int[x];
        
        for(i=0;i<scr.length;i++) {
            System.out.print("Number "+(i+1)+": ");
            
            scr[i]=rd.nextInt();
        }
        
        System.out.println("");
        
        while(true) {
            System.out.print("Input: ");
            n=rd.nextInt();
            
            if(0<n && n<(x+1)) {
                System.out.print("Output: ");
                
                System.out.println(scr[n-1]);
                
                System.out.println("");
                
                n=5;
            }
            
            else {
                System.out.println("Error");
                
                System.out.println("");
            }
        }
    }
}

/*
Length of List: 5

Number 1: 1
Number 2: 3
Number 3: 5
Number 4: 7
Number 5: 9

Input: 0
Error

Input: 1
Output: 1

Input: 2
Output: 3

Input: 3
Output: 5

Input: 4
Output: 7

Input: 5
Output: 9

Input: 6
Error

Input: 
 */
