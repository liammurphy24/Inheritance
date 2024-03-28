/**
 * Inheritance
 */
public class Inheritance {

    public static void main(String[] args) {

        int[] arr = new int[3];

        try{
        System.out.println("Howdy before exception");
        int value = arr[-1];
        } catch(Exception exception){
            System.out.println("Exception " + exception);
        } finally {
            System.out.println("hit the finally");
        }

        System.out.println("Howdy after exception");

        Student student = new Student("Liam");
        student.gpa = 3.0f;
        System.out.println(student.GetName());

        Instructor instructor = new Instructor("Joel");

        instructor.salary = 50000;

        User user = new User("Ronnie");
        System.out.println(user);

        System.out.println(student instanceof Student);
        System.out.println(student instanceof User);
        System.out.println(instructor instanceof User);


        Triangle triangle = new Triangle(5, 10);
        System.out.println(triangle.GetArea());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.GetArea());

        Circle circle = new Circle(6);
        System.out.println(circle.GetArea());
    }


}