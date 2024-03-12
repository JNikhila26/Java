package Interface;

public class Lenovo implements Laptop{

    @Override // Not mandatory to mention override
     public void copy(){
        System.out.println("Lenovo copy code");
     }
     @Override
    public void paste(){
        System.out.println("Lenovo paste code");
    }
     @Override
    public void cut(){
        System.out.println("Lenovo cut code");
    }
    @Override
    public void keyboard(){
        System.out.println("Lenovo keyboard code");

    }
    //  Extra code which not effects the Original doc
    public void camera(){
        System.out.println("Lenovo Camera code");

    }
}
