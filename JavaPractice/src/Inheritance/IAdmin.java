package Inheritance;

public interface IAdmin extends IGuest,IDeveloper {
    public void read();
    public void write();
    public void manage();
}