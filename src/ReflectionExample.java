import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectionExample {
    //Getting the information of a class from the Class object is called Reflection
    public static void main(String[] args) {
        Class<ArrayList> arrayListClass = ArrayList.class;
        System.out.println("Name:"+arrayListClass.getName());
        Method[] declaredMethods = arrayListClass.getDeclaredMethods();
        for(Method method : declaredMethods){
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            System.out.println("{Method:"+name+" Returns:"+returnType.getName()+"}");

        }
    }
}
