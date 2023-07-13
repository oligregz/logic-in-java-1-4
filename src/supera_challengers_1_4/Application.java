package supera_challengers_1_4;

import supera_challengers_1_4.first_challenger.OddPairs;
import supera_challengers_1_4.second_challenger.ValueBanknotes;

public class Application {

  public static void main(String[] args) {

    /* First challenge */
    System.out.println("--------------------------------------------------------------");
    System.out.println("1º)");
    OddPairs oddPairs = new OddPairs();
    oddPairs.setDefaultNumbers();
    oddPairs.getPairsBeforeOdd();

    /* Second challenge */
    System.out.println("--------------------------------------------------------------");
    System.out.println("2º)");
    ValueBanknotes valueBanknotes = new ValueBanknotes();
    valueBanknotes.setAmount(576.73);
    valueBanknotes.printNotesAndCoins();
  }
}
