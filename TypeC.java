import java.util.Random;

public class TypeC extends Thing {
  private int stepsInSide = 1, sideProgress = 0, growAfter = 0;

  public TypeC(int row, int col) { super(row, col, 'y'); }

  // public void maybeTurn(Random      
  public void maybeTurn(Random rand) {
    sideProgress++;
    if (sideProgress >= stepsInSide) {
      sideProgress = 0;
      rightTurn();
      growAfter ^= 1;
      if (growAfter == 0) stepsInSide++;
    }
  }
}
