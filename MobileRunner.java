class MobileRunner{

public static void main(String[] phone)
{

	System.out.println("entered main method");
	
	Mobile.mobileDetails();
	
	Mobile.type= "Smart phone";
	Mobile.model= "IV2201";
	Mobile.brand= "One plus";
	Mobile.price= 25000;
	Mobile.height= 15.83;
	Mobile.width= 7.33;
	Mobile.weight= 184;
	Mobile.noOfCamera= 3;
	Mobile.typeOfBattery= "inbuilt";
	Mobile.noOfColorAvailable= 3;
	Mobile.manufacturedPlace= "China";
	Mobile.chargerType= 'C';

	String[] color={"Arctic Sky", "Astral Black", "Winter Mist"};
	Mobile.colors=color;
	
	String[] ref={"Vibrant displays", "Latest features", "Top-notch cameras", "Long battery life"};
	Mobile.features=ref;
	
	String[] ref1={"vijaynagar", "rajajinagar", "magadi road"};
	Mobile.serviceCentersAvailabilityPlaces=ref1;

	Mobile.mobileDetails();
	
	System.out.println("end of main method");
}


}