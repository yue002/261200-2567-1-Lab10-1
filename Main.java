public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(0);
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape(1);
        shape2.draw();
        Shape shape3 = ShapeFactory.getShape(2);
        shape3.draw();



    }
}
