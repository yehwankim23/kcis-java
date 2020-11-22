package newPackage;

// class 1
public class Class24 {
    public static void main(String[] args) {        
        GradeEleven a=new GradeEleven();
        a.shownum();
    }
}

class GradeEleven {
    int num=28;
    
    GradeEleven() {
        System.out.println("This is G11.");
    }
    
    void shownum() {
        System.out.println(num);
    }
}

/*
This is G11.
28

 */
