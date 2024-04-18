import java.time.LocalDate;
import java.util.Comparator;

public class Student extends User implements Comparator<Student>, UserInterface {
    private Integer studentId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Integer studentid) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentid;
    }

    public Integer getId() {
        return studentId;
    }

    public void setId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return getSecondName().compareTo(o1.getSecondName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", patronymic='" + getPatronymic() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", studentId=" + getId() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
                user.getSecondName() != null) {
            return false;
        }
        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
                user.getPatronymic() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }

}