
public class Door 
{
	public int state;
	
	public Door() 
	{
		state=0;
	}
	
	public void toggle_door()
	{
		if(state==0)
		{
			state=1;
			System.out.println("door opens");
		}
		else
		{
			state=0;
			System.out.println("door closes");
		}
	}
}
