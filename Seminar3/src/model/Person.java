package model;

public class Person {
    private String name;
	private String surname;
	private String personCode;

    public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}

    public void setName(String inputName) {
		if((inputName != null) && (!inputName.isEmpty()) && (inputName.matches("[A-Z][a-z]{2,15}([ ][A-Z][a-z]{2,15})?"))) {
			name = inputName;
		}
		else{
			name = "Unknown";
		}
	}
	public void setSurname(String inputSurname) {
		if((inputSurname != null) && (!inputSurname.isEmpty()) && (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([-]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			surname = inputSurname;
		}
		else{
			surname = "Unknown";
		}
	}
	public void setPersonCode(String inputPersonCode) {
		if((inputPersonCode != null) && (!inputPersonCode.isEmpty()) && (inputPersonCode.matches("[0-9]{6}[-]{1}[0-9]{5}"))) {
			personCode = inputPersonCode;
		}
		else{
			personCode = "Unknown";
		}
	}

    public Person(){
		setName("Janis");
		setSurname("Berzins");
		setPersonCode("123456-12345");
	}

    public Person(String inputName, String inputSurname, String inputPersonCode){
		setName(inputName);
		setSurname(inputSurname);
		setPersonCode(inputPersonCode);
	}

    @Override
	public String toString() {
		String result =name + " " + surname + " (" + personCode + ")";
		return result;
	}
}
