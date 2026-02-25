package model;
//modelu klase
public class Student {
	//1. mainigie
	private long studId;
	private String name;
	private String surname;
	private String personCode;
	//palig mainigais, kam nevajag ne set ne get
	private static long counter = 0;
	//2. get funkcija
	public long getStudId() {
		return studId;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}
	//3. set funkcija
	public void setStudId(){
		studId = counter;
		counter++;

	}
	public void setName(String inputName) {
		if((inputName != null) && (!inputName.isEmpty()) && (inputName.matches("[A-Z]{1}[a-z]{2,15}( {1}[A-Z]{1}[a-z]{2,15})?"))) {
			name = inputName;
		}
	}

	//4.1 bezargumentu konstruktors
	//4.2 argumentiem konstruktors
	//5. toString funkcija
	//6. visas parejas funkcijas pec nepieciesibas

	
}
