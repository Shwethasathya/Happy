class PoliticianData{
	
	static int position=0;
	static String[] pName={null, null, null, null, null, null};

	static void save(String name)
	{
		System.out.println("save : saving data");
		
		pName[position]=name;	
		position++;


		for(int index=0; index<pName.length; index++)
		{
		System.out.println("Politicians name  :" +pName[index]);
		}
		System.out.println("save : saving done");
}
}
