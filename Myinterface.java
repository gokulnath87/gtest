package javag;

public interface Myinterface {
    default void defaultMethod(){
        System.out.println("default method");
    }
    static void staticmethod(){
        System.out.println("static method");
    }
}
