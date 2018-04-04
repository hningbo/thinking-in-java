package innerClasses;

/*
Pratice 1
 */
public class Outer {
    class Inner{

    }
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.inner();

    }
}
