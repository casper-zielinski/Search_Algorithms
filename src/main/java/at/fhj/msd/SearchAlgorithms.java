package at.fhj.msd;

public class SearchAlgorithms {


      /**
       * Simple Linear Search Algorithm using a while loop
       * @param a the array to search
       * @param x the target to find
       * @return the index of where x is in the a array
       */
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
