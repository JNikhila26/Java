package Day18;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Testtt {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.test.example.Testing");
            Object obj = c.getDeclaredConstructor().newInstance();
            Testing t = (Testing) obj;
            //t.method1();
            Method methodName = c.getMethod("method1");
            methodName.invoke(t);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}