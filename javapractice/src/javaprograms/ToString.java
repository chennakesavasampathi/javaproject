package javaprograms;

public class ToString {
	int x;
	int y;
	public static void main(String[] args) {
		ToString tostring=new ToString();
		System.out.println(tostring);
	}
	@Override
	public String toString() {
		return " x and y values  "+ x +" and "+y;
	}

}
//return "ToString x value=" +x + "y value "+y;