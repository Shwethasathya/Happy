class TempleDataOperator{
	
	static int position=0;
	static String[] templeName={null, null, null, null, null, null};

	static void save(String name)
	{
		System.out.println("save : saving data");
		
		templeName[position]=name;	
		position++;


		for(int i=0; i<templeName.length; i++)
		{
		System.out.println("movies name  :" +templeName[i]);
		}
		System.out.println("save : saving done");
}
}
