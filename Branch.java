class Branch
{
	public static void main(String[] args)
	{
		String branch="IT";
		int first_year=20000;
		int second_year=30000;
		int third_year=40000;
		int fourth_year=50000;
		int total=(first_year+second_year+third_year+fourth_year);
		switch(branch)
		{
			case "IT":
				System.out.println("Computer Science fee details");
				System.out.println("First year fee: "+first_year);
				System.out.println("Second year fee: "+second_year);
				System.out.println("Third year fee: "+third_year);
				System.out.println("Fourth year fee: "+fourth_year);
				System.out.println("Total fee: "+total);
				break;
			case "ECE":
				System.out.println("Electronics fee details");
				System.out.println("First year fee: "+first_year);
				System.out.println("Second year fee: "+second_year);
				System.out.println("Third year fee: "+third_year);
				System.out.println("Fourth year fee: "+fourth_year);
				System.out.println("Total fee: "+total);
				break;
			case "CIVIL":
				System.out.println("Civil Fee details");
				System.out.println("First year fee: "+first_year);
				System.out.println("Second year fee: "+second_year);
				System.out.println("Third year fee: "+third_year);
				System.out.println("Fourth year fee: "+fourth_year);
				System.out.println("Total fee: "+total);
				break;
			case "MECHANICAL":
				System.out.println("Mechanical Fee details");
				System.out.println("First year fee: "+first_year);
				System.out.println("Second year fee: "+second_year);
				System.out.println("Third year fee: "+third_year);
				System.out.println("Fourth year fee: "+fourth_year);
				System.out.println("Total fee: "+total);
				break;
			case "EEE":
				System.out.println("Electrical fee details");
				System.out.println("First year fee: "+first_year);
				System.out.println("Second year fee: "+second_year);
				System.out.println("Third year fee: "+third_year);
				System.out.println("Fourth year fee: "+fourth_year);
				System.out.println("Total fee: "+total);
				break;
			default:
				System.out.println("Enter a valid Branch");
			}
	}
}