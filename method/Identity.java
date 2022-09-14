class Identity{ 

static void printName(String name)
{
        System.out.println("entered printName");
        System.out.println("Name entered :"+name);
        
}
static void printNameAndEmail(String name, String email)
{
	System.out.println("printNameAndEmail");
	System.out.println("Name : "+name+" Email: "+email);
	
}
static void printNameAndMobileNumber(String name, long mobilenumber)
{
	System.out.println("Name :"+name+" Mobilenumber: "+mobilenumber);
}

static void printNameAndGender(String name, char gender)
{
	System.out.println("Name :"+name+" Gender: "+gender);
	
}
static void printNameAndWorking(String name, boolean working)
{
	
	System.out.println("Name : "+name+" work:"+working);
}

static void printNameAndShirtSize(String name, char shirtsize)
{
	
	System.out.println("Name : "+name+" shirt size:"+shirtsize);
	
}

}