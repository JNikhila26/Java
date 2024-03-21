package Day8;

public class thisKey {
    String name;

    public thisKey(String a){
        //this.name = name;
        name = a;
    }

    public void getName(){
        System.out.println("fruitName : "+this.name);
    }
    public void color(){

    }
    public void quality(){

    }
    public static void main(String[] args){
        thisKey f = new thisKey("Orange");
        f.getName();

        thisKey f1 = new thisKey("Apple");
        f1.getName();
    }
}
