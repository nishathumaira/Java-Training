public class Looping {
	public static void main( String[] args ) {
        int n = 0; // integer variable assigned to 0
        while (n < 10) { // while value is less than 10
          System.out.println(n + " and " + (n + 10)); // print current value of n as well as n+10
          n++; // in each iteration increase by 1
        }
	} // while loop runs as long as the n < 10 is true, otherwise stops
}

class pow {
    public static void main(String[] args) {
      int n = 0;
      int n2 = 1;
      while (n < 10) {
        System.out.println(n + " and " + n2);
        n++; // In each iteration n is incremented by 1
        n2 *= 2; // is multiplied by 2 for the value of 2^n
      }
    }
  }
// rewriting ControlFlow with a For loop

class ControlFlow2 {
    public static void main(String[] args) {
      for (int n = 0; n < 10; n++) { // n set to 0 and a stop condition of n being less than 10 & after each iteration n is incremented by 1
        System.out.println(n + (n + 10));
      }
    } // loop runs as long as n is less than 10
  }

// rewriting pow with a For loop
class pow2 {
    public static void main(String[] args) {
      int n2 = 1; // n2 assigned with an initial value of 1
      for (int n = 0; n < 10; n++) { // n set to 0 and a stop condition of n being less than 10 & after each iteration n is incremented by 1
        System.out.println(n + " and " + n2);
        n2 *= 2; // after each iteration the value of result is times by 2
      }
    } // when n becomes equal to or greater than 10 this all ends
  }
