public class Cube {
  Rectangle2 mFace;

  public Cube(Rectangle2 rectangle) {
    mFace = rectangle;
  }

  public int volume() {
    int length = mFace.getLength();
    return length * length * length;
  }

  public int surfaceArea() {
  return mFace.area() * 6;
}
}
