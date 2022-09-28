class MovieData{
	
	static int position=0;
	static String[] movieName={null, null, null, null, null};

	static void save(String name)
	{
		System.out.println("save : saving data");
		
		movieName[position]=name;	
		position++;


		for(int i=0; i<movieName.length; i++)
		{
		System.out.println("movies name  :" +movieName[i]);
		}
}
}
