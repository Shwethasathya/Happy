class vehical{

static double Transport(String Source, String Destination)
{
System.out.println("entered transort");
if (Source=="Bangalore"&&Destination=="mysore")
{
return 350;
}
return 0;
}



static double Transport(String Source, String Destination, double Ontime)
{
	System.out.println("entered transport source,destination,ontime");
	if(Source=="Bangalore"&&Destination=="udupi" && Ontime==3)
	{
		System.out.println("source is :"+Source+"  Destination value is  :"+Destination+"  ontime is  :" +Ontime);

		return 3;
	}
return 0;	
}

static boolean Transport(String Destination)
{
	System.out.println("entered tranpsort destination");
	if(Destination=="Mysore")
	{
		System.out.println("Destination is :"+Destination);
		return true;
	}
	return false;
}
static boolean Transport(String Destination, double Ontime)
{
	System.out.println("entered transport destination and ontime");
	if(Destination=="udupi"&&Ontime==8)
	{
		System.out.println("Destination is :"+Destination+ "Ontime is :"+Ontime);
		return true;
		
	}
	return false;
}
static boolean Transport(double Ontime)
{
	
	System.out.println("entered Transport Ontime");
	if(Ontime==4)
	{
		System.out.println("Entered value is :"+Ontime);
		return true;
	}
	return false;
}
}









//Vehicle: double transport(source,destination)
  //             double transport(source,destination,ontime)
    //          boolean transport(destination)
      //      boolean transort(destination,ontime)
        //    boolean transport(ontime) 
