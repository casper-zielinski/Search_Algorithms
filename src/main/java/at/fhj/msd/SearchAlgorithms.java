package at.fhj.msd;

public class SearchAlgorithms {



      public static int linearSearch(int a[], int x)
      {
            int i = 0;
            while (a[i] != x)
            {
                  ++i;
                  if (i >= a.length)
                  {
                        return -1;
                  }

            }

            return i;
      }

      public static int binarySearch(int a[], int x)
      {
            return 0;
      }

      public static int interpolationSearch(int a[], int x)
      {
            return 0;
      }

      public static int quadraticBinarySearch(int a[], int x)
      {
            return 0;
      }
}
