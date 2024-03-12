public class Strings{
    public static void main(String[] args) throws Exception {
    //REFERENCE DATA TYPES  
    //STRINGS 
        String msg = "Hey,Nikhila";
        String update_msg = "Hey, Nikhila" + " Jonnalagadda";
        System.out.println(msg);
        System.out.println(update_msg);
        //Methods  
        System.out.println(update_msg.endsWith("Jonnalagadda")); // Checking and returns true/false value
        System.out.println(update_msg.length());
        System.out.println(update_msg.indexOf("J"));
        System.out.println(update_msg.replace("Jonnalagadda","J"));
        System.out.println(update_msg);
    //ESCAPING SEQUENCES
        String sample1 = "\\Nikhila\\J";
        String sample2 = "\n Java Practice";
        System.out.println("1: " +sample1+ ",2: " +sample2);
    }
    
}
