package Encapsulation;

public class Teacher {
    public static void main(String[] args) {
        Student s = new Student(101);
        //s.isAttended = true; Data makes private(Student Class) so that unauthorized person cann't access the data!
        s.setStudentAttendance(true);
        s.getStudentAttendance();
    }
    
}
