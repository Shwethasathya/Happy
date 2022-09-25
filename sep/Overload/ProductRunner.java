class ProductRunner{

public static void main(String[] sample)
{
	System.out.println("main: product details");
	
	String name=sample[0];
	String type=sample[1];
    String price=sample[2];
	String quantity=sample[3];
	String quality=sample[4];
	
	System.out.println("index 0 :"+name);
	System.out.println("index 1 :"+type);
    System.out.println("index 2 :"+price);
	System.out.println("index 3 :"+quantity);
	System.out.println("index 4 :"+quality);
	
	int convertedPrice=Integer.parseInt(price);
	System.out.println("converted price : "+convertedPrice);
	if(convertedPrice<=250){
		
		System.out.println("price of the product");
		
	}
	else{
		System.out.println("price for the product is more");
		
	}
    
    int convertedquantity=Integer.parseInt(quantity);
	System.out.println(" converted quantity : "+convertedquantity);
	if(convertedquantity<=5)
	{
		
		System.out.println("correct quantity");
	}
	else{
		System.out.println("quantity is not correct");
	}
    System.out.println("calculating total price");
	
	double total=convertedPrice*convertedquantity;
	System.out.println("total amount : "+total);
	
	}
}