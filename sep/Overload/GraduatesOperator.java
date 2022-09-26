class GraduatesOperator{
	
	static int position=0;
	static String[] graduates={null, null, null, null, null, null};

	static void save(String name)
	{
		System.out.println("save : saving data");
		
		graduates[position]=name;	
		position++;


		for(int index=0; index<graduates.length; index++)
		{
		System.out.println("graduates name  :" +graduates[index]);
		}
		System.out.println("save : saving done");
}
}
