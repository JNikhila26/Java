package Day4.RuntimePoly;

public class Mode {
    Payment m=null;
    public void typeOfPayment(String mType){
        if(mType.equals("upi")){
            m = new UPI();
        }else if(mType.equals("credit")){
            m = new Credit();
        }else if(mType.equals("debit")) {
            m = new Debit();
        }
        m.payType();
    }
    public static void main(String[] args){
        Mode ma = new Mode();
        //Calling Method
        ma.typeOfPayment("upi");
        ma.typeOfPayment("credit");
        ma.typeOfPayment("debit");
        //ma.typeOfPayment("payment");
    }

}
