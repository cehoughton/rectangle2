import org.junit.*;
import static org.junit.Assert.*;

public class Rectangle2Test {

  @Test
  public void newRectangle2_instantiatesCorrectly() {
    Rectangle2 testRectangle2 = new Rectangle2(2,2);
    assertEquals(true, testRectangle2 instanceof Rectangle2);
  }

  @Test
  public void newRectangle2_setsLength() {
    Rectangle2 testRectangle2 = new Rectangle2(2, 2);
    assertEquals(2, testRectangle2.getLength());
  }

  @Test
  public void newRectangle2_setWidth() {
    Rectangle2 testRectangle2 = new Rectangle2(2, 2);
    assertEquals(2, testRectangle2.getWidth());
  }

  @Test
  public void isSquare_whenNotASquare_false() {
    Rectangle2 testRectangle2 = new Rectangle2(2, 4);
    assertEquals(false, testRectangle2.isSquare());
  }

  @Test public void isSquare_allSidesEqual_true() {
    Rectangle2 testRectangle2 = new Rectangle2(2, 2);
    assertEquals(true, testRectangle2.isSquare());
  }

  @Test
  public void area_returnsTheAreaOfTheRectangle_450() {
  Rectangle2 testRectangle = new Rectangle2(15, 30);
  assertEquals(450, testRectangle.area());
}
}
