//import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Rectangle rect1 = new Rectangle(4,6);
    Rectangle rect2 = new Rectangle(12,8);
    boolean isRotated = ((rect1.getLength() == rect2.getWidth()) && (rect1.getWidth() == rect2.getLength()));
    boolean isCongruent = (isRotated || rect1.equals(rect2));
    boolean isSimilar = (isCongruent || (rect1.getLength() / rect2.getLength() == rect1.getWidth() / rect2.getWidth()));

    System.out.println(isRotated + " " + isCongruent + " " + isSimilar);
  }
}
