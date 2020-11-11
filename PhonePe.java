class PhonePe
{
	public static void printPhonePe(long PhoneNumber)
	{
		System.out.println(" Postpaid Phone Number " +PhoneNumber);
	}
	public static void printPhonePe(String DTH)
	{
		System.out.println(" Recharge Successfully The DTH Number is " +DTH);
	}
	public static void printPhonePe(String Electricitybill, String name, int amount)
	{
		System.out.println(" Your Electricity Bill Is Paid The Bill Number is " + Electricitybill + " Name: " + name + " Amount is " + amount );
	}
	public static void printPhonePe(int creditcardnumber, int amount)
	{
		System.out.println(" Amount paid Successfully " + creditcardnumber + " The Amount is " + amount );
	}
	public static void main(String args[])
	{
		PhonePe.printPhonePe( 951236874 );
		PhonePe.printPhonePe( "DTH1022345852231" );
		PhonePe.printPhonePe( "APS14478965522", "Goutham", 500 );
		PhonePe.printPhonePe( 123456, 1000 );
	}
}