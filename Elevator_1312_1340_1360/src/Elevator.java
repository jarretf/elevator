
public class Elevator {

	public Button panel_button;
	public Door elevator_door;
	
	public Elevator(int total_floors) {
		// TODO Auto-generated constructor stub
		panel_button=new Panel_button(total_floors);
		elevator_door=new Door();
	}

}
