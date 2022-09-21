class Mobile{

static String type;
static String model;
static String brand;
static double price;
static double height;
static double width;
static double weight;
static int noOfCamera;
static String typeOfBattery;
static int noOfColorAvailable;
static String manufacturedPlace;
static char chargerType;

static String[] colors; 
static String[] features;
static String[] serviceCentersAvailabilityPlaces;


static void mobileDetails()
{
	
	System.out.println(type);
	System.out.println(model);
	System.out.println(brand);
	System.out.println(price);
	System.out.println(height);
	System.out.println(width);
	System.out.println(weight);
	System.out.println(noOfCamera);
	System.out.println(typeOfBattery);
	System.out.println(noOfColorAvailable);
	System.out.println(manufacturedPlace);
	System.out.println(chargerType);
	
	if(colors!=null)
	{
		System.out.println("array is pointing to memory");
		
		for(int index=0; index<colors.length; index++)
		{
			String ref=colors[index];
			System.out.println("colors are : "+ref+" is pointing to: "+index);
		
		}
	}
	if(features!=null)
	{
		System.out.println("array is pointing to memory");
		for(int index=0; index<colors.length; index++)
		{
			String ref=colors[index];
			System.out.println("colors are : "+ref+" is pointing to: "+index);
		
		}
	}
	if(serviceCentersAvailabilityPlaces!=null)
	{
		System.out.println("array is pointing to memory");
		for(int index=0; index<colors.length; index++)
		{
			String ref=colors[index];
			System.out.println("colors are : "+ref+" is pointing to: "+index);
		
		}
	}
	else{
		
	System.out.println("arrays are not pointing to memory");
	}
}

}