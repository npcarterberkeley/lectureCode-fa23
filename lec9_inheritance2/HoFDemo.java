package lec9_inheritance2;

/**
 * Created by hug on 2/6/2017.
 * Demonstrates higher order functions in Java.
 */
public class HoFDemo {
    public static int do_twice(IntUnaryFunction f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        //IntUnaryFunction tenX = new TenX();
        TenX tenX = new TenX();  // tenX is subclass of IntUnaryFunction
        //therefore it works.
        System.out.println(do_twice(tenX, 2));
    }
}
