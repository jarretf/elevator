
public class Elevator {

	public Button panel_button;
	public Door elevator_door;
	public int current_floor;
	
	public Elevator(int total_floors) {
		// TODO Auto-generated constructor stub
		current_floor=0;
		panel_button=new Panel_button(total_floors);
		elevator_door=new Door();
	}
	
	public void request_floor(int floor_no)
	{
		
	}
}
