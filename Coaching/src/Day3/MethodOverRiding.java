package Day3;
class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

class MethodOverRiding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
//Method overriding - if the same method is defined in both the superclass and the subclass,
// then the method of the subclass class overrides the method of the superclass.