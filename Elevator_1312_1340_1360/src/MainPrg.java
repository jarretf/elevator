
public class MainPrg 
{

	public static void main(String[] args) 
	{
		Building bldg=new Building(6);
		
		//Elevator is at ground floor, you are at third floor, you want to go to ground floor
			bldg.elevator.current_floor.floor_no=0;
			//bldg.press_floor_button(3, 0);
		
		//Elevator is at top floor, you are on third floor, you want to go to ground floor
			bldg.elevator.current_floor.floor_no=5;
			//bldg.press_floor_button(3, 0);
		
		//Elevator is at fifth floor(top most floor), you are at fifth floor, you want to go to second floor
			bldg.elevator.current_floor.floor_no=5;
			//bldg.press_floor_button(5, 0);
		
		//Elevator is at ground floor, you are at fifth floor, you want to go to ground floor
			bldg.elevator.current_floor.floor_no=0;
			//bldg.press_floor_button(5, 0);
	}

}
