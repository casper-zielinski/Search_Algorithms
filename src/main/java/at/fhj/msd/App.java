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

    }
}
