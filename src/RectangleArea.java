public class RectangleArea {

    public int area (Rectangle rectangle) {
        if (rectangle.getA() <= 0 || rectangle.getB() <= 0) {
            throw new IllegalArgumentException();
        }
        return rectangle.getA() * rectangle.getB();
    }
}
