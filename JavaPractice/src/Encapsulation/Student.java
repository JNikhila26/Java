package Encapsulation;

public class Student {
    private int ID_Number;
    private String Name;
    private boolean isAttended;

    public Student(int ID_Number){
        this.ID_Number = ID_Number;
    }
    public void setStudentAttendance(boolean flag){
        if(!isAttended)
            isAttended = flag;
            System.out.println("Teacher assigned attendance to student");

    }
    public boolean getStudentAttendance(){
        System.out.println("Teacher accessed the student attendance");
        return isAttended;
    // To create multiple(Set & Get) for methods Right click--> source--> select Getters & Setters    
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public boolean isAttended() {
        return isAttended;
    }
    public void setAttended(boolean isAttended) {
        this.isAttended = isAttended;
    }
}
