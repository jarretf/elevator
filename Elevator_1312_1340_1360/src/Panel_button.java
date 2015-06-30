import java.util.Scanner;


public class Panel_button extends Button{

	int total_floors;
	public Panel_button(int total_floors) 
	{
		// TODO Auto-generated constructor stub
		this.total_floors=total_floors;
	}

	@Override
	public int user_request() 
	{
		Scanner sc= new Scanner(System.in);
		int request=sc.nextInt();
		while(request<0 || request>total_floors-1)
		{
			request=sc.nextInt();
		}
		return request;
		
	}

}
