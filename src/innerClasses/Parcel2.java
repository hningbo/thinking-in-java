package innerClasses;

public class Parcel2 {
    class Contents{
        private int i = 11;
        public int value() {
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Destination d = to(dest);
        Contents c = contents();
        System.out.println(d.label);
    }



    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
    }
}

