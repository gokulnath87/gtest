package javag;
public class defaultandstatic implements Myinterface {

public static void main(String[]args){
        defaultandstatic ds = new defaultandstatic();
        ds.defaultmethod();
        Myinterface.staticmethod();
        }
        public void defaultmethod() {
                System.out.println("i override it");
        }
}
