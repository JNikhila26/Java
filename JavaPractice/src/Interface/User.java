package Interface;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.copy();
        lenovo.paste();
        lenovo.cut();
        lenovo.camera();
    System.out.println("-----------------------------------");
        HP hp = new HP();
        hp.printing();
    System.out.println("-----------------------------------");
        Apple apple = new Apple();
        apple.copy();
        apple.cut();
        apple.paste();
    }
    
}
