
public class Floor_door extends Door{

	public Floor_door() {
		// TODO Auto-generated constructor stub
	}
	
	public void toggle_door()
	{
		if(state==0)
		{
			state=1;
			System.out.println("floor door opens");
		}
		else
		{
			state=0;
			System.out.println("floor door closes");
		}
	}
}
