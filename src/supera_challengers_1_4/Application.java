package supera_challengers_1_4;

import supera_challengers_1_4.first_challenger.OddPairs;

public class Application {

  public static void main(String[] args) {

    /* First challenge */
    System.out.println("--------------------------------------------------------------");
    System.out.println("1º)");    
    OddPairs oddPairs = new OddPairs();
    oddPairs.setDefaultNumbers();
    oddPairs.getPairsBeforeOdd();

    System.out.println("--------------------------------------------------------------");
  }
}
