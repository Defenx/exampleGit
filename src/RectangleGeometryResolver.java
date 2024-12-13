public class RectangleGeometryResolver {

    int perimeter(Rectangle rectangle) {
        if(rectangle.getA() <= 0) {
            throw new IllegalArgumentException();
        }
        if(rectangle.getB() <= 0) {
            throw new IllegalArgumentException();
        }
        return (rectangle.getA() + rectangle.getB()) * 2;
    }
}