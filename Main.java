public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        shape2.draw();
        Shape shape3 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        shape3.draw();
        Shape shape4 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        shape4.draw();
        Shape shape5 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        shape5.draw();
        Shape shape6 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        shape6.draw();
        Shape shape7 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        shape7.draw();



    }
}
