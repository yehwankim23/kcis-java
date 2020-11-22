package newPackage;

// 피보나치 수열
public class Class10 {
    public static void main(String[] args) {
        int a=1,b=1,c;
        
        System.out.println(a);
        
        for(int i=1;i<7;i++) {
            System.out.println(b);
            
            c=a+b;
            a=b;
            b=c;
        }
    }
}

/*
1
1
2
3
5
8
13

 */
