class BillionariesNames
{

static String[] bNames={null, null, null, null, null, null, null, null, null, null};
static int place=0;

static void save(String name)
{
	
	System.out.println("Saving Billionaries Names");
	
	if(place>9)
	{
		
		System.out.println("Not valid : exceed the array");
		return;
	}
	if(name!=null && name.length()<=10 || name.length()>10)
	{
		
		bNames[place]=name;
	System.out.println("Entered billionarie name is "+name+ "at position "+place);
	place++;
		
	}
	else{
		
		System.err.println("enterd billionarie name is not matching");
	}
}
static void display()
{
	System.out.println("display the details");
	
	for(int i=0; i<bNames.length; i++)
	{
		
		System.out.println("billionarie name is "+bNames[i]+ " at position "+i);
	}
	
}
static boolean find(String name)
{
	
	System.out.println("Searching the billionarie name "+name);
	
	for(int index=0; index<bNames.length; index++)
	{
		
		String ref=bNames[index];
		
		if(ref==name)
		{
			System.out.println("billionarie name found : "+name);
			return true;
		}
			
	}
	return false;
}

static String update(String oldBillionarie, String newBillionarie)
{
	
	System.out.println("Updating the billionarie name to new name");
	
	if(oldBillionarie!=null && newBillionarie!=null)
	{
		
		for(int i=0; i<bNames.length; i++)
		{
			if(oldBillionarie==bNames[i])
			{
				
			String ref=bNames[i];
			System.out.println("Billionarie name : "+bNames[i]+ " at position "+i+ " updated name is : "+newBillionarie);
			bNames[i]=newBillionarie;
		}
		
		}
	}
		return null;
}
static String update(int index, String newBillionarie)
{
	System.out.println("updating new value");
	
	if(newBillionarie!=null)
	{
		String ref=bNames[index];
		bNames[index]=newBillionarie;
		return newBillionarie;
		
	}
return null;	
}

static String delete(String name)
{
	if(name!=null)
	{
	
	System.out.println("deleting the name");
	for(int i=0; i<bNames.length; i++)
	{
	 if(name==bNames[i])
	 {
		String ref= bNames[i];
		System.out.println("name found : "+ref+ " deleting at position: "+i);
		bNames[i]=ref;
		return ref;
	}
 }
}
	else
	{
		System.err.println("not valid :cannot delete the name");
	}
	return null;
}
}