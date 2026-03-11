package model;

import modelenum.Profdegree;

public class Professor extends Person {
    //1. mainigie
    private long profId;
    private Person person;
    private Profdegree degree;

    static long counter = 0;
    //2. getter
    public long getProfId() {
        return profId;
    }
    public Person getPerson() {
		return person;
	}

    public Profdegree getDegree() {
        return degree;
    }
    //3. setter
	public void setProfId() {
		profId = ++counter;
	}
    public void setPerson(Person inputPerson) {
		if(inputPerson != null) {
			person = inputPerson;
		}
		else{
			person = new Person();
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
        super();
        setProfId();
        setDegree(Profdegree.other);
    }
    //4.2 argumentu konstruktors
    public Professor(String inputName,String inputSurname, String inputPersonCode, Profdegree inputDegree){
        super(inputName, inputSurname, inputPersonCode);
        setProfId();
        setDegree(inputDegree);
    }
    //5. toString
    @Override
	public String toString() {
		String result = profId + ": " + name + " " + surname + " (" + personCode + ") " + degree;
		return result;
	}
    //6. citas

}
