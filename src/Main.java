


public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5}; // Example array
        Integer[] squaredNumbers = FilterExample.filter(numbers, SquareFilter.class);

        for (Integer number : squaredNumbers) {
            System.out.println(number);
        }
    }
}

