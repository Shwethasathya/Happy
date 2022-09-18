class Person{

static void work(String company, double salary)
{

System.out.println("entered work");
if (company=="Infosys"&&salary==60000);
{
	System.out.println("company name is :"+company+ "salary is : "+salary);
	
}

}
static void work(String company, double salary, String destination)
{
	System.out.println("entered second method");
	if(company=="hynetic" &&salary==75000&&destination=="senior engineer")
	{
		System.out.println("company name is :"+company+ "salary is : "+salary+ "destination is :"+destination);
	}
	
}


}



