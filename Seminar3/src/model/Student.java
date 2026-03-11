package model;
//modelu klase
public class Student extends Person {
	//1. mainigie
	private long studId;

	//palig mainigais, kam nevajag ne set ne get
	private static long counter =10000;
	//2. get funkcija
	public long getStudId() {
		return studId;
	}

	//3. set funkcija
	public void setStudId(){
		studId = counter;
		counter++;

	}

	//4.1 bezargumentu konstruktors
	public Student(){
		super(); //izsauc autoo person() construct
		setStudId();
	}
	//4.2 argumentiem konstruktors
	public Student(String inputName, String inputSurname, String inputPersonCode){
		super(inputName, inputSurname, inputPersonCode); //izsauc auto person() construct ar argumentiem
		setStudId();
	}
	//5. toString funkcija
	@Override
	public String toString() {
		String result = studId +": " + name + " " + surname + " (" + personCode + ")";
		return result;
	}
	//6. visas parejas funkcijas pec nepieciesibas
	

	
}
