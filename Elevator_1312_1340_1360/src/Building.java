
public class Building {

	Floor []floors;
	Elevator elevator;
	
	public Building(int total_floors) 
	{
		floors=new Floor[total_floors];
		createfloors(total_floors);
		elevator=new Elevator(total_floors);
		
		
		
		
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
