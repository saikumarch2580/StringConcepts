package JavaPractice;

public class MethodOverloading {
	
	public int add (int a, int b) {
		
		int cal = a+b;
		
		return cal;
	}
    public int add(int a, int b, int c) {
    	
    	int cal = a+b+c;
    	
    	return cal;
    }
    
    public float add(float a, float b, float c) {
    	
    	float cal = a+b+c;
    	
    	return cal;
    	
    }
	public static void main(String[] args) {
    
		MethodOverloading md = new MethodOverloading();
		
		int k =md.add(3, 4, 5);
		int l=md.add(4, 7);
		int m= md.add(23, 23, 435);
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		
		

	}

}
