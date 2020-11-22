package newPackage;

import java.util.Scanner;

// if, else if, else
public class Class11 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        int c;
        
        while(true) {
            c=rd.nextInt();
            
            if(c==1) {
                System.out.println("Hi");
            }
            
            else if(c==2) {
                System.out.println("Bye");
            }
            
            else {
                System.out.println("Uhhh");
            }
        }
    }
}

/*
1
Hi
2
Bye
3
Uhhh

 */
