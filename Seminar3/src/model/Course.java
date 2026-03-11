package model;

public class Course {
    private long courseId;
    private String title;
    private int credits;
    private Professor professor;

    static long counter = 10000;


    public long getcourseId() {
        return courseId;
    }
    public String getTitle() {
        return title;
    }
    public int getCredits() {
        return credits;
    }
    public Professor getProfessor() {
        return professor;
    }

    public void setcourseId() {
        courseId = ++counter;
    }

    public void setTitle(String inputTitle) {
        if((inputTitle != null) && (!inputTitle.isEmpty()) && (inputTitle.matches("[A-Z][a-z]{2,15}([ ][A-Z][a-z]{2,15})?"))) {
            title = inputTitle;
        }
        else{
            title = "Unknown";
        }
    }

    public void setCredits(int inputCredits) {
        if(inputCredits > 0 && inputCredits < 10) {
            credits = inputCredits;
        }
        else{
            credits = 0;
        }
    }
    public void setProfessor(Professor inputProfessor) {
        if(inputProfessor != null) {
            professor = inputProfessor;
        }
        else{
            professor = new Professor();
        }
    }

    public Course(String inputTitle, int inputCredits, Professor inputProfessor){
        setcourseId();
        setTitle(inputTitle);
        setCredits(inputCredits);
        setProfessor(inputProfessor);
    }

    @Override
	public String toString() {
		String result = courseId + ": " + title + " (" + credits + " credits) - " + professor;
		return result;
	}
}
