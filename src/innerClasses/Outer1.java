package innerClasses;

/*
Pratice 1
 */
public class Outer1 {
    private String s;

    public Outer1(String s){
        this.s = s;
    }
    class Inner{
        public String toString()
        {
            return Outer1.this.s;
        }
    }
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer1 outer = new Outer1("sddd");
        Inner inner = outer.inner();
        System.out.println(inner.toString());

    }
}
