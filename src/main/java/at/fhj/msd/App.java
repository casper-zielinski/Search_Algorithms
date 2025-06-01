package at.fhj.msd;

/**
 * Hello world!
 */
public class App {

      private static int[] hundred = java.util.stream.IntStream.rangeClosed(1, 100).toArray();
      private static int[] thousand =java.util.stream.IntStream.rangeClosed(1, 1000).toArray();
      private static int[] tenthousand = java.util.stream.IntStream.rangeClosed(1, 10000).toArray();
      private static int[] hundredthousand = java.util.stream.IntStream.rangeClosed(1, 100000).toArray();

    public static void main(String[] args) {
<<<<<<< HEAD
        long start = System.currentTimeMillis();

        int[] a = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                15, 20, 25, 30, 35, 40, 45, 50, 55, 60,
                65, 70, 75, 80, 85, 90, 95, 100, 110, 120,
                130, 140, 150, 160, 170, 180, 190, 200, 220, 240,
                260, 280, 300, 320, 340, 360, 380, 400, 420, 440
        };

        int index = SearchAlgorithms.interpolationSearch(a, 340);

        long end = System.currentTimeMillis();

        long duration = end - start;

        System.out.printf("Found Index: %d || Duration: %d", index, duration);
=======
        Static_analysis static_analysis = new Static_analysis();
        
        System.out.println(static_analysis.TimeMeasureLinearSearch(1, "Best Case", hundred));
        System.out.println(static_analysis.TimeMeasureLinearSearch(5000, "Avarage Case", tenthousand));
        System.out.println(static_analysis.TimeMeasureLinearSearch(50000, "Avarage Case", hundredthousand));
        System.out.println(static_analysis.TimeMeasureLinearSearch(100000, "Worst Case", hundredthousand));
        System.out.println(static_analysis.TimeMeasureLinearSearch(1000000, "Worst Case", hundredthousand));

        System.out.println();

        System.out.println(static_analysis.TimeMeasureBinarySearch(1, "Best Case", hundred));
        System.out.println(static_analysis.TimeMeasureBinarySearch(5000, "Avarage Case", tenthousand));
        System.out.println(static_analysis.TimeMeasureBinarySearch(50000, "Avarage Case", hundredthousand));
        System.out.println(static_analysis.TimeMeasureBinarySearch(1000000, "Worst Case", hundredthousand));

        System.out.println();

        System.out.println(static_analysis.TimeMeasureInterpolationSearch(1, "Best Case", hundred));
        System.out.println(static_analysis.TimeMeasureInterpolationSearch(5000, "Avarage Case", tenthousand));
        System.out.println(static_analysis.TimeMeasureInterpolationSearch(50000, "Avarage Case", hundredthousand));
        System.out.println(static_analysis.TimeMeasureInterpolationSearch(100000, "Worst Case", hundredthousand));
        System.out.println(static_analysis.TimeMeasureInterpolationSearch(1000000, "Worst Case", hundredthousand));

        System.out.println();

        System.out.println(static_analysis.TimeMeasureQuadraticBinarySearch(1, "Best Case", hundred));
        System.out.println(static_analysis.TimeMeasureQuadraticBinarySearch(5000, "Avarage Case", tenthousand));
        System.out.println(static_analysis.TimeMeasureQuadraticBinarySearch(50000, "Avarage Case", hundredthousand));
        System.out.println(static_analysis.TimeMeasureQuadraticBinarySearch(1000000, "Worst Case", hundredthousand));




>>>>>>> 847adb7c57e7a8c699ac733ec2b8a719ecda52ed
    }
}
