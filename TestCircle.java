public class TestCircle {
    public static void main(String[] arg){
        Circle c1 = new Circle(2.0,"blue");
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.println(c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println(c2.getRadius());
        System.out.println(c2.getColor());
        System.out.println(c2.getArea());
        Circle c3 = new Circle();
        System.out.println(c3.getRadius());
        System.out.println(c3.getColor());
        System.out.println(c3.getArea());

        Circle r1 = new Circle();
        r1.setRectDim();
        System.out.println(r1.getRectArea());

        Circle s1 = new Circle();
        s1.name = "John";
        s1.roll_no = 2;
        System.out.println("Name is " + s1.name + " and roll no. is " + s1.roll_no);
    }
}
