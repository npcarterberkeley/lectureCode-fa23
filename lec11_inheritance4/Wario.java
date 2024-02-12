package lec11_inheritance4;

public class Wario extends Character {
    public void speak() {
        System.out.println("wario time!");
    }
    public static void main(String[] args) {
        Character c = new Mario();
        c.speak();
        c.jump();

    }
}
