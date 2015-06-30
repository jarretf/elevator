
public class Building {

	Floor []floors;
	Elevator elevator;
	
	public Building(int total_floors) 
	{
		floors=new Floor[total_floors];
		createfloors(total_floors);
		elevator=new Elevator(total_floors);
		
		
		
		
	}
	
	public void press_floor_button(int current_floor,int direction)
	{
		int response=floors[current_floor].up_button.user_request(floors[current_floor],elevator);
		if(response==0)
		{
			if(direction==0)//go down
			{
				//for(int i=)
			}
			else if(direction==1)//go up
			{
				
			}
		}
		else if(response==-1)
		{
			
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
