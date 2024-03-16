package Day2;

public class variables {
    // Global variables or called Instance variables
    String carName = "Tesla"; //default val is NULL
    int carPrice = 20000; //default int value = 0

    //Undefined Variables
    int c;
    String k;
    boolean b;

    void methodOne(){
        int carModel = 2014; //Local Variable, must declare value
        System.out.println("carName : "+carName);
        System.out.println(carModel);
        System.out.println("Org carPrice : "+carPrice);
    }
    void methodTwo(){
        carPrice = 19000;
        //System.out.println(car_model); //carModel isn't declared in method2
        System.out.println("carName : "+carName);
    }
    void methodThree(){
        System.out.println("carName : "+carName);
        System.out.println("Modified carPrice :"+carPrice);
    }
    int methodFour(){
        int a = 10;
        int b = 13;
        int sum = a+b;
            return sum;
    }
    float methodFive(int a,int b){
        float sum = a+b;
        return sum;
    }
    //Method Calling
    void methodSix(){
        float res = methodFive(13,2);
        System.out.println("res :"+res);
    }
    public static void main(String args[]){
        variables v1 = new variables();
        v1.methodOne();
        v1.methodTwo();
        v1.methodThree();
        System.out.println("v1 : "+v1.carPrice);

        variables v2 = new variables();
        System.out.println("v2 : "+v2.carPrice);

        //Called by Method
        int four = v2.methodFour(); // or Just call v2.methodCheck()
        System.out.println("methodFour : "+four);

        //Call by value
        float five = v2.methodFive(25,32);
        System.out.println("methodFive : "+five);

        v2.methodSix();

    }
}
