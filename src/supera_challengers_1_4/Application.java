package supera_challengers_1_4;

import supera_challengers_1_4.first_challenger.OddPairs;
import supera_challengers_1_4.fourth_challenger.Decoder;
import supera_challengers_1_4.second_challenger.ValueBanknotes;
import supera_challengers_1_4.third_challenger.EqualityInDiference;

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

    /* Third challenge */
    System.out.println("--------------------------------------------------------------");
    System.out.println("3º)");
    EqualityInDiference equalityInDiference = new EqualityInDiference();
    equalityInDiference.setDefaultValues();
    equalityInDiference.getEqualityDiferencePairs(2);
    System.out.println("Vezes em que a diferença entre pares são iguais ao valor alvo: "
    + equalityInDiference.getVerify());

    /* Third challenge */
    System.out.println("--------------------------------------------------------------");
    System.out.println("4º)");
    Decoder decoder = new Decoder();
    decoder.decoding();
  }
}
