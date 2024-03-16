package Day4;

public class Main {
    Animal animal;
    //Method
        public void callAnimalSound(String animalType){
            if(animalType.equals("dog")){
            // Assigning all properties of Dog to animal--> turns object
                animal = new Dog();
            }else if(animalType.equals("cat")){
                animal = new cat();
            }
            //Calling assigned animal object
            if(animal != null)
                animal.Sound();
            }
    public static void main(String[] args){
        Main main = new Main();
        //Calling Method
        main.callAnimalSound("dog");
        main.callAnimalSound("cat");
    }
}
