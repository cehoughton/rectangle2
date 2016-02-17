import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {

  @Test
  public void volume_determinesTheVolumeOfTheCube_27000() {
    Rectangle2 testRectangle = new Rectangle2(30, 30);
    Cube testCube = new Cube(testRectangle);
    assertEquals(27000, testCube.volume());
  }

  @Test
public void surfaceArea_determinesTheSurfaceAreaOfACube_5400() {
  Rectangle2 testRectangle2 = new Rectangle2(30, 30);
  Cube testCube = new Cube(testRectangle2);
  assertEquals(5400, testCube.surfaceArea());
}
}
