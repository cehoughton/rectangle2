public class Rectangle2 {
private int mLength;
private int mWidth;


public Rectangle2(int length, int width) {
  mLength = length;
  mWidth = width;

 }

 public int getLength() {
   return mLength;
 }

 public int getWidth() {
   return mWidth;
 }

 public boolean isSquare() {
   return mLength == mWidth;
 }

 public int area() {
  return mLength * mWidth;
 } 
}
