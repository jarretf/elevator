import java.util.Scanner;


public class Floor_button extends Button {

	public Floor_button() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int user_request() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int request=sc.nextInt();
		while(request!=0 || request!=1)
		{
			request=sc.nextInt();
		}
		return request;
	}

}
