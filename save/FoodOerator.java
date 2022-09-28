class FoodOerator{
	
	static int position=0;
	static String[] foodName={null, null, null, null, null, null};

	static void save(String foodItem)
	{
		System.out.println("save : saving data");
		
		foodName[position]=foodItem;	
		position++;


		for(int index=0; index<foodName.length; index++)
		{
		System.out.println("Food Items are  :" +foodName[index]);
		}
		System.out.println("save : saving done");
}
}
