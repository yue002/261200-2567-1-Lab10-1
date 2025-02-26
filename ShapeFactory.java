public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;
    public static final int MAX_SHAPES_PER_TYPE = 2;
    public static final int MAX_TOTAL_SHAPES = 5;

    private static int totalShapes = 0;
    private static int circleCount = 0;
    private static int rectangleCount = 0;
    private static int squareCount = 0;

    public static Shape getShape(int shapeType) {
        if (totalShapes >= MAX_TOTAL_SHAPES) {
            System.out.println("Cannot create more shapes. Maximum limit reached.");
            return null;
        }

        if (shapeType == TYPE_CIRCLE) {
            if (circleCount < MAX_SHAPES_PER_TYPE) {
                circleCount++;
                totalShapes++;
                return new Circle();
            }
        } else if (shapeType == TYPE_RECTANGLE) {
            if (rectangleCount < MAX_SHAPES_PER_TYPE) {
                rectangleCount++;
                totalShapes++;
                return new Rectangle();
            }
        } else if (shapeType == TYPE_SQUARE) {
            if (squareCount < MAX_SHAPES_PER_TYPE) {
                squareCount++;
                totalShapes++;
                return new Square();
            }
        } else {
            System.out.println("Invalid shape type.");
            return null;
        }

        System.out.println("Cannot create more of this shape type. Maximum limit reached.");
        return null;
    }
}
