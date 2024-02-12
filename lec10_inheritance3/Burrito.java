package lec10_inheritance3;

public class Burrito extends Food {
    private boolean hasGuac;

    public void Food() {


    }
    public Burrito() {
        System.out.println("burrito constructor");
        hasGuac = true;
    }

    public static void main(String[] args) {
        Burrito b = new Burrito();
    }
}
