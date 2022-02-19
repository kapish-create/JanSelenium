package selenium.com;

public class ParentChild {

	int speedLimit=90;
	

}

class Child extends ParentChild{
	int speedLimit=120;
	public static void main(String[] args) {
		ParentChild obj=new Child();
		System.out.println(obj.speedLimit);
				
	}
	
	
}

