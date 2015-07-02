
public class Elevator_door extends Door{

	public Elevator_door() {
		// TODO Auto-generated constructor stub
	}

	public void toggle_door()
	{
		if(state==0)
		{
			state=1;
			System.out.println("elevator door opens");
		}
		else
		{
			state=0;
			System.out.println("elevator door closes");
		}
	}
}
