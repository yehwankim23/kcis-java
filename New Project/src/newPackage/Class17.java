package newPackage;

import java.util.Scanner;

// prime numbers
public class Class17 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        int n,i,j,v,c;
        
        System.out.print("Input: ");
        n=rd.nextInt();
        
        for(i=2;i<n;i++) {
            v=0;c=0;
            
            for(j=1;j<=i;j++) {
                if(i%j==0) {
                    c++;
                }
                
                if(c>2) {
                    v=1;
                    break;
                }
            }
            
            if(v==0) {
                System.out.println(i);
            }
        }
    }
}

/*
Input: 100
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97

 */
