
public class Floor
{
	public int floor_no;
	public Button up_button=null;
	public Button down_button=null;
	public Door floor_door;
	
	public Floor(int floor_no, Button up_button, Button down_button) 
	{
		this.floor_no = floor_no;
		this.up_button = up_button;
		this.down_button = down_button;
		this.floor_door=new Door();
	}
	
	public void request_elevator(int direction)
	{
		
	}

}
