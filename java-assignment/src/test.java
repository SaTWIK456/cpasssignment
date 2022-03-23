
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Side :  ");
		double side=sc.nextDouble();
		System.out.println("Height=  ");
		double height=sc.nextDouble();
		System.out.println("Radius :  ");
		double radius=sc.nextDouble();

		Shape cc=new Circle(radius,"Circle");
		double circle=cc.getArea();
		System.out.println("Area of a Circle : "+ circle);

		Shape sqr=new Square(side,"Square");
		double square=sqr.getArea();
		System.out.println("Area of  a Square :  "+ square);

		Shape cyl=new Cylinder(height,radius,"Cylinder");
		double cylinder=cyl.getArea();
		System.out.println("Volume of a Cylinder =: "+ cylinder);

		Shape sphr=new Sphere(radius,"Sphere");
		double sphere=sphr.getArea();
		System.out.println("Volume of a Sphere :  "+ sphere);

		Shape c=new Cube("Cube",side);
		double cube=c.getArea();
		System.out.println("Volume of  a Cube :  "+ cube);

		Shape glm=new Glome(radius,"Glome");
		double glome=glm.getArea();
		System.out.println("Volume of a Glome :  "+ glome);

	}

}
