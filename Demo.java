import java.util.*;
interface Information
{
float pi=3.14f;
	public float area();
	public float circurmfrance();
	public float volume();
}
abstract class shape2d implements Information
{
	float s,r;
	public shape2d(float s, float r)
	{
		this.s=s;
		this.r=r;
	}
	public float area()
	{
		float d=s*s;
		System.out.println("Square area:"+d);
		float n= pi*r*r;
		System.out.println("Circle area:"+n);
		return 0;
	}
	public float circurmfrance()
	{
		float h=2*pi*r;
		System.out.println("circle circumfrance is :"+h);
		float j=4*s;
		System.out.println("square perametere is:"+j); 
	    return 0;
	}
	
}
class shape3d extends shape2d{
	float a;
 public shape3d(float s,float r,float a)
 {
	 super(s,r);
	 this.a=a;
 }
 
 public float volume()
 {
	 float k=a*a*a;
	 System.out.println("the volume of cube is "+k);
 	float v=(4/3)*pi*(r*r*r);
	System.out.println("the volume of sphere is :"+v);
	return 0;
}	
} 


class Demo{
 public static void main(String[] args)
 {
	 String choice;
do{
	Scanner sc=new Scanner(System.in);
	System.out.println(" The available choices are:  ");
	System.out.println("To execute('Yes'):");
	System.out.println("To exit('No'):");
	System.out.print("Enter your choice:");
	choice=sc.nextLine();
	System.out.println("your choice is:"+choice);
	switch(choice)
	{
	case "Yes":	
	System.out.print("Enter the  side of the square:");
	float s= sc.nextFloat();
	sc.nextLine();
	System.out.print("Enter the  side of the radius:");
	float r=sc.nextFloat();
	sc.nextLine();
	System.out.print("Enter the side of the cube :");
	float a=sc.nextFloat();
	sc.nextLine();
	shape3d sh = new shape3d(s,r,a);
	sh.area();
		sh.circurmfrance();
		sh. volume();
		break;
		/*case "No":
		System.out.println("Exit");
		sc.close();*/
		default:
		//System.out.println("Invalid choice");
		System.out.print("came out from the program"); 
		break;
}
}while(!choice.equalsIgnoreCase("No"));
}
}