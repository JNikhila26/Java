package Day17;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        OutputStream os = new FileOutputStream("/Users/nikhilajonnalagadda/Downloads/Uday 24-Month STEM OPT_Calculator.xlsx");
        ObjectOutputStream obs = new ObjectOutputStream(os);

        Employee emp = new Employee();
        emp.setEmpId(102);
        emp.setEmpName("Nikki");

        Department d = new Department();
        d.setName("hello");
        emp.setDepartment(d);

        obs.writeObject(emp);


        InputStream is = new FileInputStream("/Users/nikhilajonnalagadda/Downloads/Uday 24-Month STEM OPT_Calculator.xlsx");
        ObjectInputStream ois = new ObjectInputStream(is);

        Employee s1=null;
        s1=(Employee) ois.readObject();
        ois.close();
        is.close();

        System.out.println(s1.getEmpName());
    }
}
