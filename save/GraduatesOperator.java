class GraduatesOperator{
	
	static int position=0;
	static String[] graduates={null, null, null, null, null, null};

	static void save(String name)
	{
		System.out.println("save : saving data");
		
		if(name!=null && name.length()>5)
		{
			
			System.out.println("graduates names are coorect");
			return;
		}else
		{
			
			System.err.println("not a valid name : name not matching the criteria");
		}
		graduates[position]=name;	
		System.out.println("entered the graduates name : " +graduates[position] +", position : "+position);
		position++;
	}
	static void displayDetails()
	{
		System.out.println("displaying details");
		
		for(int index=0; index<graduates.length; index++)
		{
		System.out.println("graduates name  :" +graduates[index]);
		}
		System.out.println("save : saving done");
}

}
