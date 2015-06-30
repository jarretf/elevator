import java.util.Scanner;


public class Panel_button extends Button{

	int total_floors;
	public Panel_button(int total_floors) 
	{
		// TODO Auto-generated constructor stub
		this.total_floors=total_floors;
	}

	@Override
	public int user_request(Floor current_floor, Elevator elevator) 
	{
		if(current_floor.floor_door.state==0 && elevator.elevator_door.state==0)
		{
			Scanner sc= new Scanner(System.in);
			int request=sc.nextInt();
			while(request<0 || request>total_floors-1)
			{
				request=sc.nextInt();
			}
			sc.close();
			return request;
		}
		else
		{
			System.out.println("WARNING: DOOR OPEN!!");
			return -1;
		}
	}

}
