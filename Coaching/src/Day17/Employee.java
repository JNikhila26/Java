package Day17;
import java.io.Serializable;

public class Employee implements Serializable{

    private int empId;
    private String empName;
    private Department department;


    public int getEmpId(){
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


}
