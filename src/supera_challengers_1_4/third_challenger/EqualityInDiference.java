package supera_challengers_1_4.third_challenger;

import java.util.ArrayList;
import java.util.List;

public class EqualityInDiference {

  protected int size;
  protected int verify;
  protected List<Integer> numbers;


  public int getSize() {
    return size;
  }
 
  public void setSize(int size) {
    this.size = size;
  }

  public int getVerify() {
    return verify;
  }

  public List<Integer> getValues() {
    return numbers;
  }

  public void setDefaultValues() {
    numbers  = new ArrayList<>();
    numbers.add(1);
    numbers.add(5);
    numbers.add(3);
    numbers.add(4);
    numbers.add(2);
    System.out.println();
    System.out.println("Os valores adicionados no array foram");
    numbers.forEach(n -> System.out.println(n));
  }

  public void getEqualityDiferencePairs(int target) {
    verify = 0;
    numbers.forEach(n -> {
      numbers.forEach(nChkec -> {
        if ((n - nChkec) == target) {
          verify += 1;
        }
      });
    });
    System.out.println();
  }
}
