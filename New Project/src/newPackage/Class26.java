package newPackage;

import java.util.Scanner;

// login
public class Class26 {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        while(true) {
            System.out.print("ID: ");
            String ID=rd.nextLine();
            
            System.out.print("PW: ");
            String PW=rd.nextLine();
            
            if(ID.equals("yehwankim23")) {
                if(PW.equals("rladPghks")) {
                    System.out.print("Log In Dwem!");
                    break;
                }
                
                else {
                    System.out.println("Incorrect Password. Please try again.");
                    System.out.println();
                }
            }
            
            else {
                System.out.println("Incorrect ID. Please try again.");
                System.out.println();
            }
        }
    }
}

/*
ID: a
PW: a
Incorrect ID. Please try again.

ID: yehwankim23
PW: a
Incorrect Password. Please try again.

ID: yehwankim23
PW: rladPghks
Log In Dwem!
 */
