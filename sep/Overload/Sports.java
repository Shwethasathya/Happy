class Sports{

static void cricketTeamMembers(String[] names)
{
System.out.println("cricket team: player names");

for(int i=0; i<names.length; i++)
{
System.out.println(" cricket team players are : "+names[i]);

}
}
static void kabbadiTeamMembersJerseyNos(int[] nos)
{
	System.out.println("Kabbadi team : jersy numbers");
	for(int i=0; i<nos.length; i++)
	{
		System.out.println("kabbadi players jersey numbers : "+nos[i]);
	}
}

static void FootBallTeamMembersSalary(double[] salaries)
{
	for(int i=0; i<salaries.length; i++)
	{
		System.out.println("Football team : Salary");
		System.out.println("Salary of football players : "+salaries[i]);
		
	}
}
static void ludoTeamMobileNumber(long[] nos)
{
	for(int i=0; i<nos.length; i++)
	{
     System.out.println("Ludo team mobile numbers : "+nos[i]);		
		
	}
}
static void hockeyTeamMembersNoOfMatches(int[] matches)
{
	for(int i=0; i<matches.length; i++)
	{
		System.out.println("number of matches played by hockey team : "+matches);
	}
}
static void kokoTeamMembersCountryCode(long[] names)
{
	System.out.println("Exection of koko team member");
	//System.out.println("length : "+names.length);
	for(int i=0; i<names.length; i++)
	{
		System.out.println("country code of koko team : "+names[i]);
		
	}
}
static void lagoriTeamMembersAlive(boolean[] names)
{
	for(int i=0; i<names.length; i++)
	{
			System.out.println("lagori team members alive or not: "+names[i]);
	}
}
}

