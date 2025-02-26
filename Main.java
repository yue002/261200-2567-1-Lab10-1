public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        shape2.draw();
        Shape shape3 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        shape3.draw();
        Shape shape4 = ShapeFactory.getShape(2);
        shape4.draw();
        Shape shape5 = ShapeFactory.getShape(2);
        shape5.draw();
        Shape shape6 = ShapeFactory.getShape(2);
        shape6.draw();



    }
}
