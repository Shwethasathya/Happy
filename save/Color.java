class Color{
	
	static int position=0;
	static String[] colors={null, null, null, null, null, null, null};

	static void save(String name)
	{
		System.out.println("save : saving data");

		if(position>7)
		{
			
			System.out.println("not valid : exceeded the array");
			return;
			
			
		}
		if(name!=null && name.length()>=3)
		{
			
		colors[position]=name;	
		System.out.println("entered color name is : " +name+ " at position " +position);
		position++;
		}
		
	else
	{
		
		System.out.println("not valid : entered color is not having length more than 3");
	}
	}
	static void displayDetails()
	{
		System.out.println("displaying details");
		
		for(int index=0; index<colors.length; index++)
		{
		System.out.println("COLOR IS  :" +colors[index]);
		}
	}
		
		static boolean find(String name)
		{
			System.out.println("Searching the color : "+name);
			for(int i=0; i<colors.length; i++)
			{
			String ref=colors[i];
			
			if(ref==name)
		{
			
			System.out.println("color found : "+name);
			return true;
			
		}
			
			}
		return false;
		
	}

}


