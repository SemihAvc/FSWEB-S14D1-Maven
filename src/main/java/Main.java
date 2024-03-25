import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import java.awt.*;

public class Main {
    public static  void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("*********************************************");
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getHeight());

        System.out.println("rectangle.area= " + rectangle.getY());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getHeight());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("*********************************************");
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "Ramazan", 50000);
        System.out.println(juniorDeveloper1);
        SeniorDeveloper seniorDeveloper2 = new SeniorDeveloper(2 , "Hüsnü", 80000);
        System.out.println(seniorDeveloper2);

    }
}