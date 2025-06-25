package Main;

public class thisKeyword {

	int x;    //instance variable;
	
	thisKeyword(int y){	
		
		
      x=y;
}
	public void display() {
		
	int	y=10;
	
	System.out.println(x);
	}
	
	public static void main(String[] args) {	
		
		
		thisKeyword sai = new thisKeyword(3);
		
		sai.display();
			
	}
}
