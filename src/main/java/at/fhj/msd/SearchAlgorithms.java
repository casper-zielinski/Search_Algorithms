package at.fhj.msd;

public class SearchAlgorithms {

      private static int index;
      private static int t;
      private static int from;
      private static int to;
      private static int Algorithm_Depth = 0;

      /**
       * Simple Linear Search Algorithm using a while loop
       * 
       * @param a the array to search
       * @param x the target to find
       * @return the index of where x is in the a array
       */
      public static int linearSearch(int a[], int x) {
            index = 0;
            while (a[index] != x) {
                  ++index;
                  if (index >= a.length) {
                        return -1;
                  }

            }

            return index;
      }

      public static int binarySearch(int a[], int x) {
<<<<<<< HEAD

            int first = 0;
            int last = a.length - 1;

            while (first <= last) {
                  int mid = first + (last - first) / 2; //overflow handling; 
                  int midNumber = a[mid];

                  if (x == midNumber) {
                        return mid;
                  }
                  if (x < midNumber) {
                        last = mid - 1;
                  } else {
                        first = mid + 1;
                  }
            }
            return -1;


      }

      public static int interpolationSearch(int a[], int x) {
            return 0;
=======
            return 0;
      }

      public static int interpolationSearch(int a[], int x) {
            int first = 0;
            int last = a.length - 1;

            while (x >= a[first] && x <= a[last] && first <= last) {

                  int probe = first + (last - first) * (x - a[first]) / (a[last] - a[first]);

                  if (a[probe] == x) {
                        return probe;
                  }

                  else if (a[probe] < x) {
                        first = probe + 1;
                  }

                  else {
                        last = probe - 1;
                  }

            }

            return -1;
>>>>>>> Interpolation_Search
      }

      /**
       * The Quadratic Binary Search Algorithm implemented in Java
       * The t value is the same Value as the t in the Interpolation Search
       * But then it Searches from t the correct field using Square(n) steps, n being
       * the size of the list/array - 1
       * so the last index basically
       * 
       * @param a the array to search
       * @param x the target to find
       * @return the index of where x is in the a array
       */
      public static int quadraticBinarySearch(int a[], int x) {
            t = Calculate_t(a, 0, a.length - 1, x); // Calculating the First t Value

            if (a[t] < x) {
                  try {
                        while (!(a[t] >= x)) {
                              t += (int) Math.sqrt(a.length);
                        }
                  } catch (IndexOutOfBoundsException e) // if the t value is bigger then the last index of a, then t is
                                                        // asigned the last index of a
                  {
                        t = a.length - 1;
                  }

                  from = t - (int) Math.sqrt(a.length);
                  to = (int) t;

                  while (from <= to) // Checking in the new Block where the x Value is
                  {
                        if (a[from] == x) {
                              return from; // returning the index of the x Value
                        }

                        from++;
                  }
                  return -1; // if the x Value is not found, then it doesn't exist.

            } else if (a[t] > x) // this is the exact same Process as before, but here the value at the t index
                                 // is smaller than x
            {
                  try {
                        while (!(a[t] <= x)) {
                              t -= (int) Math.sqrt(a.length);
                        }
                  } catch (IndexOutOfBoundsException e) {
                        t = 0;
                  }

                  from = t - (int) Math.sqrt(a.length);
                  to = (int) t;

                  try {

                        while (from <= to) {
                              if (a[from] == x) {
                                    return from;
                              }

                              from++;
                        }
                        return -1;

                  } catch (IndexOutOfBoundsException e) {
                        return -1;
                  }

            }

            return t;
      }

      /**
       * A Calculator Method to Calculate the 't' value used in the Quadratic Binary
       * Search and Interpolation Search Algorithms
       */
      private static int Calculate_t(int a[], int from, int to, int x) {
            double divison_calc = (double) (x - a[from]) / (double) (a[to] - a[from]);
            t = from + (int) ((to - from) * divison_calc);
            return t;
      }
}
