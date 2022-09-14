class ForestRunner{
	
	public static void main(String[] args)
	{
		
		System.out.println("main method");
		
		 String name= Forest.name;
	     int totalArea= Forest.totalArea;
	     String type= Forest.type;
	     String[] regions= Forest.regions;
	     String[] primaryAnimals= Forest.primaryAnimals;

         
		 System.out.println(name);
		 System.out.println(totalArea);
		 System.out.println(type);
		 System.out.println(regions);
		 System.out.println(primaryAnimals);
		 
		 
		 for(int index=0;index<Forest.regions.length; index++)
		 {
			 
			 String ref0= Forest.regions[index];
			 System.out.println("regions name:" +ref0);
		 }

		 
		 for(int index=0; index<Forest.primaryAnimals.length; index++)
		 {
			 
			 String ref0= Forest.primaryAnimals[index];
			 System.out.println("animals name:" +ref0);
		 }
		 }
}