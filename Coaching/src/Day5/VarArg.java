package Day5;

public class VarArg {
    void add(int ...a){
        int b = 0;
    for (int i=0;i<a.length;i++){
        b += a[i];
        System.out.println("val: "+b);
    }
        System.out.println(b);
    }
    public static void main(String args[]){
        VarArg va = new VarArg();
        //va.add(5);
        va.add(12,15);
        //va.add(2,3,4);
    }
}
