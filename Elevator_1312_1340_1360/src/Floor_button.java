


public class Floor_button extends Button {

	public Floor_button() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int user_request(Floor current_floor, Elevator elevator) 
	{
		// TODO Auto-generated method stub
		if(current_floor.floor_door.state==0 && elevator.elevator_door.state==0)
		{
			return 0;
		}
		else
		{
			
			return -1;
		}
	}

}
