package innerClasses;

/*
    Pratice 4
 */
public class Sequence1 {
    Object[] items;
    private int next = 0;
    public Sequence1(int size){
        items = new Object[size];
    }
    public void add(Object o){
        if(next<items.length){
            items[next++] = o;
        }
    }
    private class SequenceSelector implements Selector{
        private int i;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i<items.length){
                i++;
            }
        }

        public Sequence1 sequence1(){
            return Sequence1.this;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence1 sequence1 = new Sequence1(10);
        for(int i = 0; i<10; i++){
            sequence1.add(Integer.toString(i));
        }
        Selector selector = sequence1.selector();
        while(!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }

    }
}
