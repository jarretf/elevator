import java.util.Scanner;


public class Building {

	Floor []floors;
	Elevator elevator;
	
	public Building(int total_floors) 
	{
		floors=new Floor[total_floors];
		createfloors(total_floors);
		elevator=new Elevator(total_floors,floors[0]);
		
		
		
		
	}
	
	public void press_floor_button(int request_floor,int direction)
	{
		Scanner sc=new Scanner(System.in);
	
		int response=floors[request_floor].up_button.user_request(floors[request_floor],elevator);
		if(response==0)
		{
			System.out.println("Elevator moving:- ");
			if(direction==0)//go down
			{
				for(int i=elevator.current_floor.floor_no;i>=request_floor;i--)
				{
					System.out.print(i+"... ");
				}
			}
			else if(direction==1)//go up
			{
				
				for(int i=elevator.current_floor.floor_no;i<=request_floor;i++)
				{
					System.out.print(i+"... ");
				}
			}
			System.out.println();
			elevator.current_floor.floor_no=request_floor;
			floors[request_floor].floor_door.toggle_door();
			elevator.elevator_door.toggle_door();
			
		}
		else if(response==-1)
		{
			System.out.println("WARNING: DOOR OPEN!!");
		}
	}
	public void press_elevator_button()
	{
		
	}
	
	private void createfloors(int total_floors)
	{
		floors[0]=new Floor(0, new Floor_button(), null);
		for(int i=1;i<total_floors-1;i++)
		{
			floors[i]=new Floor(i, new Floor_button(), new Floor_button());
		}
		floors[total_floors-1]=new Floor(total_floors-1, null, new Floor_button());
	}
}
