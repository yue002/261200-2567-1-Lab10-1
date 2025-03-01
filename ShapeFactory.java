public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;

    public static int countCircle = 0;
    public static int countRectangle = 0;
    public static int countSquare = 0;
    public static int totalCount = 0;
    
    public static final int MAX_SHAPE_COUNT = 2;
    public static final int MAX_TOTAL_COUNT = 5;

    public static Shape getShape(int shapeType) {
        if (shapeType == TYPE_CIRCLE && countCircle < MAX_SHAPE_COUNT && totalCount < MAX_TOTAL_COUNT) {
            countCircle++;
            totalCount++;
            return new Circle();
        } else if (shapeType == TYPE_RECTANGLE && countRectangle < MAX_SHAPE_COUNT && totalCount < MAX_TOTAL_COUNT) {
            countRectangle++;
            totalCount++;
            return new Rectangle();
        } else if (shapeType == TYPE_SQUARE && countSquare < MAX_SHAPE_COUNT && totalCount < MAX_TOTAL_COUNT) {
            countSquare++;
            totalCount++;
            return new Square();
        }
        return null;
    }

    public static void reset() {
        countCircle = 0;
        countRectangle = 0;
        countSquare = 0;
        totalCount = 0;
    }
}
