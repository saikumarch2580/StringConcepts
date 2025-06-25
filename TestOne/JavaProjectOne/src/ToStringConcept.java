
public class ToStringConcept {

	private String name;
	private String city;
	public static void main(String[] args) {
		
		ToStringConcept str = new ToStringConcept("Sairam", "Rajahmundry");
		
		System.out.println(str);
				
  
	}

	public  ToStringConcept(String name, String city) {
		
		this.name =name;
		this.city=city;
		
		
	}

/*	@Override
	public String toString() {
		return "ToStringConcept [name=" + name + ", city=" + city + "]";
	} */
	
	public String toString() {
		
		
		
		return "name = "+name+", city ="+city+";";
		
		
	}
}
