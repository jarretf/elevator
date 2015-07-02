
public class Elevator {

	public Button panel_button;
	public Door elevator_door;
	public Floor current_floor;
	
	public Elevator(int total_floors,Floor current_floor) {
		// TODO Auto-generated constructor stub
		this.current_floor=current_floor;
		this.panel_button=new Panel_button(total_floors);
		this.elevator_door=new Elevator_door();
	}
	
	public int get_direction(int request_floor_no)
	{
		if(request_floor_no>current_floor.floor_no)
		{
			return 1;
		}
		else if(request_floor_no<current_floor.floor_no)
		{
			return 0;
		}
		return -1;
	}
}
