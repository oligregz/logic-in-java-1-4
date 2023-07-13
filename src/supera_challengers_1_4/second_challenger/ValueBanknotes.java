package supera_challengers_1_4.second_challenger;

public class ValueBanknotes {

  protected double amount;
  protected int[] notes = { 100, 50, 20, 10, 5, 2 };
  protected double[] coins = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void printNotes() {
    System.out.println("NOTAS:");
    for (int note : notes) {
      int quantidadeNotas = (int) (amount / note);
      System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, (double) note);
      amount %= note;
    }
  }

  public void printCoins() {
    System.out.println("MOEDAS:");
    for (double coin : coins) {
      int quantidadeMoedas = (int) (amount / coin);
      System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, coin);
      amount %= coin;
    }
  }

  public void printNotesAndCoins() {
    System.out.println();
    printNotes();
    printCoins();
  }
}
