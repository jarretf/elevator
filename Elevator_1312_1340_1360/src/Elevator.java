
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
	
	public void request_floor(int floor_no)
	{
		
	}
}
