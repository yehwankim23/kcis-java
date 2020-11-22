package newPackage;

// class 2
public class Class25 {
    public static void main(String[] args) {
        Cal a=new Cal(0,50);
        
        System.out.println(a.getmean());
    }
}

class Cal {
    double a;
    double b;
    
    Cal() {}
    
    Cal(double c,double d) {
        a=c;
        b=d;
    }
    
    double getmean() {
        return (a+b)/2;
    }
}

/*
25.0

 */
