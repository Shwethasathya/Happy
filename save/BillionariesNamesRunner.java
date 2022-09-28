class BillionariesNamesRunner{

public static void main(String[] args)
{
	
	System.out.println("main started");
	
	BillionariesNames.save("Mukesh Ambani");
	BillionariesNames.save("Goutham Adani");
	BillionariesNames.save("Shiv Nadar");
	BillionariesNames.save("Radhakishan Damani");
	BillionariesNames.save("Hinduja brothers");
	BillionariesNames.save("Cyrus Punnawalla");
	BillionariesNames.save("Pallonji Mistry");
	BillionariesNames.save("Uday Kotak");
	BillionariesNames.save("Godreg Family");
	BillionariesNames.save("Lakshmi Mittal");
	
	
	BillionariesNames.display();
	
	boolean found=BillionariesNames.find("Lakshmi Mittal");
	
		System.out.println("Billionarier Name found : "+found);
		
	BillionariesNames.update("Goutham Adani", "Sunil Mittal");
	BillionariesNames.display();
	
	BillionariesNames.update(2, "Lakshmi Mittal");
	BillionariesNames.display();
	
	BillionariesNames.delete("Uday Kotak");
	BillionariesNames.display();
}
}