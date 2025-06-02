package at.fhj.msd;

/**
 * Hello world!
 */
public class Static_Analytics {

      private static int[] hundred = java.util.stream.IntStream.rangeClosed(1, 100).toArray();
      private static int[] thousand =java.util.stream.IntStream.rangeClosed(1, 1000).toArray();
      private static int[] tenthousand = java.util.stream.IntStream.rangeClosed(1, 10000).toArray();
      private static int[] hundredthousand = java.util.stream.IntStream.rangeClosed(1, 100000).toArray();

public static void main(String[] args) {


        int best = hundred[0];                      // Anfang (Best Case)
        int average = hundred[hundred.length / 2];  // Mitte (Average Case)
        int worst = hundred[hundred.length - 1] + 1; // Nicht im Array (Worst Case)

        System.out.println("=== SEARCH ALGORITHMS PERFORMANCE TEST ===");
        System.out.println("Array Size: " + hundred.length);
        System.out.println();


        System.out.println("=== LINEAR SEARCH ===");
        test("Linear Search", hundred, best, average, worst, SearchAlgorithms::linearSearch);

        System.out.println("\n=== BINARY SEARCH ===");
        test("Binary Search", hundred, best, average, worst, SearchAlgorithms::binarySearch);

        System.out.println("\n=== INTERPOLATION SEARCH ===");
        test("Interpolation Search", hundred, best, average, worst, SearchAlgorithms::interpolationSearch);

        System.out.println("\n=== QUADRATIC BINARY SEARCH ===");
        test("Quadratic Binary Search", hundred, best, average, worst, SearchAlgorithms::quadraticBinarySearch);

        System.out.println();
        System.out.println("Array Size: " + thousand.length);
        System.out.println();


        best = thousand[0];                      // Anfang (Best Case)
        average = thousand[thousand.length / 2];  // Mitte (Average Case)
        worst = thousand[thousand.length - 1] + 1; // Nicht im Array (Worst Case)

        System.out.println("=== LINEAR SEARCH ===");
        test("Linear Search", thousand, best, average, worst, SearchAlgorithms::linearSearch);

        System.out.println("\n=== BINARY SEARCH ===");
        test("Binary Search", thousand, best, average, worst, SearchAlgorithms::binarySearch);

        System.out.println("\n=== INTERPOLATION SEARCH ===");
        test("Interpolation Search", thousand, best, average, worst, SearchAlgorithms::interpolationSearch);

        System.out.println("\n=== QUADRATIC BINARY SEARCH ===");
        test("Quadratic Binary Search", thousand, best, average, worst, SearchAlgorithms::quadraticBinarySearch);

        System.out.println();
        System.out.println("Array Size: " + tenthousand.length);
        System.out.println();


        best = tenthousand[0];                      // Anfang (Best Case)
        average = tenthousand[tenthousand.length / 2];  // Mitte (Average Case)
        worst = tenthousand[tenthousand.length - 1] + 1; // Nicht im Array (Worst Case)

        System.out.println("=== LINEAR SEARCH ===");
        test("Linear Search", tenthousand, best, average, worst, SearchAlgorithms::linearSearch);

        System.out.println("\n=== BINARY SEARCH ===");
        test("Binary Search", tenthousand, best, average, worst, SearchAlgorithms::binarySearch);

        System.out.println("\n=== INTERPOLATION SEARCH ===");
        test("Interpolation Search", tenthousand, best, average, worst, SearchAlgorithms::interpolationSearch);

        System.out.println("\n=== QUADRATIC BINARY SEARCH ===");
        test("Quadratic Binary Search", tenthousand, best, average, worst, SearchAlgorithms::quadraticBinarySearch);

        System.out.println();
        System.out.println("Array Size: " + hundredthousand.length);
        System.out.println();

        best = hundredthousand[0];                      // Anfang (Best Case)
        average = hundredthousand[hundredthousand.length / 2];  // Mitte (Average Case)
        worst = hundredthousand[hundredthousand.length - 1] + 1; // Nicht im Array (Worst Case)

        System.out.println("=== LINEAR SEARCH ===");
        test("Linear Search", hundredthousand, best, average, worst, SearchAlgorithms::linearSearch);

        System.out.println("\n=== BINARY SEARCH ===");
        test("Binary Search", hundredthousand, best, average, worst, SearchAlgorithms::binarySearch);

        System.out.println("\n=== INTERPOLATION SEARCH ===");
        test("Interpolation Search", hundredthousand, best, average, worst, SearchAlgorithms::interpolationSearch);

        System.out.println("\n=== QUADRATIC BINARY SEARCH ===");
        test("Quadratic Binary Search", hundredthousand, best, average, worst, SearchAlgorithms::quadraticBinarySearch);

        System.out.println();
        System.out.println("=== PERFORMANCE TEST COMPLETED ===");
        
    }

    @FunctionalInterface
    interface SearchFunction {
        int apply(int[] array, int x);
    }

    private static void test(String name, int[] array, int best, int average, int worst, SearchFunction method) {
        System.out.printf("Best Case:    %d ms\n", measure(method, array, best));
        System.out.printf("Average Case: %d ms\n", measure(method, array, average));
        System.out.printf("Worst Case:   %d ms\n", measure(method, array, worst));
    }

    private static long measure(SearchFunction method, int[] array, int x_of_case) {
        int repetitions = 100000;  // Wiederholungen
        long totalTime = 0;

        for (int i = 0; i < repetitions; i++) {
            long start = System.nanoTime();
            method.apply(array, x_of_case);
            long end = System.nanoTime();
            totalTime += (end - start);
        }
        return totalTime / repetitions / 1_000_000; // Durchschnitt in ms
}

}