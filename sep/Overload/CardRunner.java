class CardRunner{

public static void main(String[] args)
{

	System.out.println("entered main method");
	
	Card.displayDetails();

	Card.type="metro card";
	Card.height=2.1;
	Card.width=4.2;
	Card.price=50;
	String[] color={"green","blue"};
	Card.colors=color;
	
	Card.displayDetails();
	
	
	System.out.println("end of main method");
}

}