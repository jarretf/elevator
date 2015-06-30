
public class MainPrg 
{

	public static void main(String[] args) 
	{
		Building bldg=new Building(5);
		
		//Elevator is at ground floor, you are at third floor, you want to go to ground floor
		bldg.floors[2].request_elevator(0);
		bldg.elevator.request_floor(0);
		
		
	}

}
