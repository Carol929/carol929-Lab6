import java.util.Random;

abstract class Thing {
  protected int row;
  protected int col;
  protected int dir;
  protected char lab;

  Thing(int row, int col, char lab) { this.row=row; this.col=col; this.lab=lab; this.dir=0; }

  // public void rightTurn()           
  public void rightTurn() { dir = (dir + 1) % 4; }

  // public void leftTurn()            
  public void leftTurn()  { dir = (dir + 3) % 4; }

  // public void step()                
  public void step() {
    final int[] dc = {0, 1, 0, -1};
    final int[] dr = {1, 0, -1, 0};
    row += dr[dir]; col += dc[dir];
  }

  // public abstract void maybeTurn(Random  
  public abstract void maybeTurn(Random rand);

  public String toString() { return row + " " + col + " " + lab; }
}
