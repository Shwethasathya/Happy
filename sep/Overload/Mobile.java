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
static int[] storageCapacitiesAvailability;
static int[] typeOfRamAvailable;

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
		for(int index=0; index<features.length; index++)
		{
			String ref=features[index];
			System.out.println("features are : "+ref+" is pointing to: "+index);
		
		}
	}
	if(serviceCentersAvailabilityPlaces!=null)
	{
		System.out.println("array is pointing to memory");
		for(int index=0; index<serviceCentersAvailabilityPlaces.length; index++)
		{
			String ref=serviceCentersAvailabilityPlaces[index];
			System.out.println("service centers : "+ref+" is pointing to: "+index);
		
		}
	}
	if(storageCapacitiesAvailability!=null)
	{
		System.out.println("array is pointing to memory");
		for(int index=0; index<storageCapacitiesAvailability.length; index++)
		{
			int ref=storageCapacitiesAvailability[index];
			System.out.println("storage are : "+ref+" is pointing to: "+index);
		
		}
	}
	if(typeOfRamAvailable!=null)
	{
		System.out.println("array is pointing to memory");
		for(int index=0; index<typeOfRamAvailable.length; index++)
		{
			int ref=typeOfRamAvailable[index];
			System.out.println("storage are : "+ref+" is pointing to: "+index);
		
		}
	}
	else{
		
	System.out.println("arrays are not pointing to memory");
	}
}

}