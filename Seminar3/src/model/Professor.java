package model;

import modelenum.Profdegree;

public class Professor {
    //1. mainigie
    private long profId;
    private String name;
    private String surname;
    private String personCode;
    private Profdegree degree;

    static long counter = 0;
    //2. getter
    public long getProfId() {
        return profId;
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
    public Profdegree getDegree() {
        return degree;
    }
    //3. setter
	public void setProfId() {
		profId = ++counter;
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
	public void setDegree(Profdegree inputDegree) {
		if(inputDegree != null) {
            degree = inputDegree;
        }
        else{
            degree = Profdegree.other;
        }
	}
    
    //4.1 bezargumentu konstruktors
    public Professor(){
        setProfId();
        setName("Janis");
        setSurname("Berzins");
        setPersonCode("123456-12345");
        setDegree(Profdegree.master);
    }
    //4.2 argumentu konstruktors
    public Professor(String inputName, String inputSurname, String inputPersonCode, Profdegree inputDegree){
        setProfId();
        setName(inputName);
        setSurname(inputSurname);
        setPersonCode(inputPersonCode);
        setDegree(inputDegree);
    }
    //5. toString
    @Override
	public String toString() {
		String result = profId + ": " + name + " " + surname + " (" + personCode + ")" + " - " + degree;
		return result;
	}
    //6. citas

}
