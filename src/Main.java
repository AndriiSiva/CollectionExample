


public class Main {
    public static void main(String[] args) {

        // Test numbers
        Integer[] numbers = {1, 2, 3, 4};

        class DoubleFilter implements Filter {
            @Override
            public Object apply(Object o) {
                return ((Integer) o) * 2;
            }
        }

        Integer[] doubled = FilterExample.filter(numbers, DoubleFilter.class);
        for (Integer n : doubled) {
            System.out.print(n + " ");
        }
        System.out.println();


    // Test string
    String[] words = {"a", "b", "c"};

    class UpperFilter implements Filter {
        @Override
        public Object apply(Object o) {
            return ((String) o).toUpperCase();
        }
    }

    String[] upper = FilterExample.filter(words, UpperFilter.class);
        for(String s :upper) {
            System.out.print(s + " ");
        }
    }
}

