
public class CollageStudent extends Student {
    private int yearOfEducation;
    private String majorSubjectName;

    public int getYearOfEducation() {
        return yearOfEducation;
    }

    public void setYearOfEducation(int yearOfEducation) {
        this.yearOfEducation = yearOfEducation;
    }

    public String getMajorSubjectName() {
        return majorSubjectName;
    }

    public void setMajorSubjectName(String majorSubjectName) {
        this.majorSubjectName = majorSubjectName;
    }

    @Override
    public String getIdNumber() {
        return super.getIdNumber();
    }

    @Override
    public void setIdNumber(String idNumber) {
        super.setIdNumber(idNumber);
    }

    @Override
    public double getGpa() {
        return super.getGpa();
    }

    @Override
    public void setGpa(double gpa) {
        super.setGpa(gpa);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }


    public CollageStudent(String name, int age, String gender, String idNumber, double gpa, int yearOfEducation, String majorSubjectName) {
        super(name, age, gender, idNumber, gpa);
        this.yearOfEducation = yearOfEducation;
        this.majorSubjectName = majorSubjectName;
    }

    @Override
    public String toString() {
        return "CollageStudent{" +
                "yearOfEducation=" + yearOfEducation +
                ", majorSubjectName='" + majorSubjectName + '\'' +
                "} " + super.toString();
    }
}
