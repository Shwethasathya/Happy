class ColorRunner{

public static void main(String[] args)
{
	
	System.out.println("main started");
	
	
	Color.save("violet");
	Color.save("Inidigo");
	Color.save("Blue");
	Color.save("g");
	Color.save("Yellow");
	Color.save("Orange");
	Color.save("Red");
	
	Color.displayDetails();
	boolean found=Color.find("black");


		System.out.println("color found : "+found);
}
}