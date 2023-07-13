package supera_challengers_1_4.fourth_challenger;
import java.util.ArrayList;


public class Decoder {

  protected String text;
  protected String[] linesArray;
  protected ArrayList<String> lines;

  public String getText() {
    System.out.println();
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setDefaultText() {
    this.text = "5"
    + "\nI ENIL SIHTHSIREBBIG S"
    + "\nLEVELKAYAK"
    + "\nH YPPAHSYADILO"
    + "\nABCDEFGHIJKLMNOPQRSTUVWXYZ"
    + "\nVOD OWT SNEH HCNERF EGDIRTRAP A DNA SE";
  }

  public void setLines() {
    setDefaultText();
    linesArray = text.split("\\r?\\n");
    lines = new ArrayList<>();
    for (String line : linesArray) {
      lines.add(line);
    }
    System.out.println();
  }

  public void decoding() {
    setLines();

    lines.forEach(line -> {
      String reversedLine = reverseLine(line);
      if (!reversedLine.isEmpty())
      System.out.println(reversedLine);
    });
  }

  private String reverseLine(String line) {
    if (line.length() < 2) {
      return "";
    }

    StringBuilder reversedLine = new StringBuilder();
    int half = line.length() / 2;
    
    for (int i = half - 1; i >= 0; i--) {
      reversedLine.append(line.charAt(i));
    }

    for (int i = line.length() - 1; i >= half; i--) {
      reversedLine.append(line.charAt(i));
    }

    return reversedLine.toString();
  }
}