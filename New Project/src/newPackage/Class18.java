package newPackage;

import java.util.Scanner;

// factorization
public class Class18 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        int n,i;
        
        System.out.print("Input: ");
        n=rd.nextInt();
        
        for(i=1;i<=n;i++) {
            if(n%i==0) {
                System.out.println(i);
            }
        }
    }
}

/*
Input: 24
1
2
3
4
6
8
12
24

 */
