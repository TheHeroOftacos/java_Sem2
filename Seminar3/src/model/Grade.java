package model;

public class Grade {
    private long gradeId;
    private int value;
    private Student student;
    private Course course;

    static long counter = 200000;
    

    public long getGradeId() {
        return gradeId;
    }
    public int getValue() {
        return value;
    }
    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }

    public void setGradeId() {
        gradeId = ++counter;
    }
    public void setValue(int inputValue) {
        if(inputValue >= 1 && inputValue <= 10) {
            value = inputValue;
        }
        else{
            value = 1;
        }
    }
    public void setStudent(Student inputStudent) {
        if(inputStudent != null) {
            student = inputStudent;
        }
        else{
            student = new Student();
        }
    }
    public void setCourse(Course inputCourse) {
        if(inputCourse != null) {
            course = inputCourse;
        }
        else{
            course = new Course("Unknown", (byte) 1, new Professor());
        }
    }
    
    public Grade(int inputValue, Student inputStudent, Course inputCourse){
        setGradeId();
        setValue(inputValue);
        setStudent(inputStudent);
        setCourse(inputCourse);
    }

    @Override
	public String toString() {
		String result = gradeId + ": " + value + " - " + student + " - " + course;
		return result;
	}
}

