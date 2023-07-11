package supera_challengers_1_4.first_challenger;

import java.util.ArrayList;
import java.util.List;

public class OddPairs {

  protected List<Integer> numbers = new ArrayList<>();
  protected List<Integer> pairs = new ArrayList<>();
  protected List<Integer> odds = new ArrayList<>();
  protected List<Integer> pairsOdds = new ArrayList<>();

  public void setNumbers(int number) {
    numbers.add(number);
  }

  public void setDefaultNumbers() {
    numbers.add(309);
    numbers.add(2);
    numbers.add(0);
    numbers.add(1963);
    numbers.add(87);
    numbers.add(10);
    numbers.add(8);

    System.out.println();
    System.out.println("The set numbers were:");
    for (Integer number : numbers) {
      System.out.println(" >  " + number);
    }
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public List<Integer> getPairsBeforeOdd() {

    for (Integer number : numbers) {
      if (number % 2 == 0) {
        pairs.add(number);
      } else if (number % 2 != 0) {
        odds.add(number);
      }
    }

    pairsOdds.addAll(pairs);
    pairsOdds.addAll(odds);

    System.out.println();
    System.out.println("The sorted numbers are:");
    for (Integer number : pairsOdds) {
      System.out.println(" >  " + number);
    }

    return pairsOdds;
  }

  @Override
  public String toString() {
    return "OddPairs [pairsOdds=" + pairsOdds + "]";
  }
}
