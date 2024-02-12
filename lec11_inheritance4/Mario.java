package lec11_inheritance4;

public class Mario extends Character {
    public void speak() {
        super.speak();
        System.out.println("let's a go!");
    }
    public void jump() {
        System.out.println("interesting");
    }
}