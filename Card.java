class Card{

static String type;
static double height;
static double width;
static int price;
static String[] colors;

static void displayDetails()
{

System.out.println(type);
System.out.println(height);
System.out.println(width);
System.out.println(price);
//System.out.println(colors);
if(colors!=null)
{
	System.out.println("array is pointing to memory");
	for(int index=0; index<colors.length; index++)
	{
		String ref=colors[index];
		System.out.println("colors are : "+ref+" is pointing to: "+index);
		
	}
	
}
else
{
	System.out.println("arrays are not pointing to memory");
}
}
}
