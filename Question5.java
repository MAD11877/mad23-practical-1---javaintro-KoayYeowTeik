import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     * e.g.
     * > 5
     * > 2
     * > 4
     * > 1
     * > 3
     * > 4
     * 4
     * 
     * e.g.
     * > 4
     * > 2
     * > 2
     * > 3
     * > 3
     * 2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);
    List<Integer> numberList = new ArrayList<>();
    int number = in.nextInt();
    for (int i = 0; i < number; i++) {
      numberList.add(in.nextInt());
    }
    System.out.println(numberList);
    int count = 0;
    int result = 0;
    for (int i : numberList) {
      int modecount = 0;
      for (int ii : numberList) {
        if (i == ii) {
          modecount++;
        }
      }
      if (modecount > count) {
        count = modecount;
        result = i;
      }

    }
    System.out.println(result);
  }
}
