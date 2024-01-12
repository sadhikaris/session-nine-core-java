package day3;

public class Function {

    public static void main(String[] args) {
        int aalu = 1;
        int baat = 2;
        int cow = 3;

      //  int add11 = add1(aalu,baat,cow) ;
        //System.out.println(add11);

        int dog = 4;
        int ees = 5;
        int fun = 6;

        int add22 = dog + ees + fun  ;
       // System.out.println(add22);

        int gun = 7;
        int hen = 8;
        int ink = 9;
        int jk = 10;

        int add33 = gun + hen + ink ;
       // System.out.println(add33);

        System.out.println(addAndReturn(1,2,3));
        addAndReturn(dog,ees,fun);
        addAndReturn(gun,hen,ink);
       //System.out.println(addAndReturn(aalu,baat,cow));


    }

    public static float addAndReturn(int a, int b, int c) {
        int add1 = a + b + c;
       // System.out.println(add1);
        return add1;
    }

}
