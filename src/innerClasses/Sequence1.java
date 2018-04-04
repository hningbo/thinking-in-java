package innerClasses;

public class Sequence1 {
    private class SequcenceSelector implements Selector{
        @Override
        public boolean end() {
            return false;
        }

        @Override
        public Object current() {
            return null;
        }

        @Override
        public void next() {

        }
    }
}
