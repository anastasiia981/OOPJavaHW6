import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User implements Comparator<Teacher>, UserInterface{
    private Integer teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Integer teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Integer getId() {
        return teacherId;
    }

    public void setId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return getSecondName().compareTo(o1.getSecondName());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName= " + getFirstName() +
                " secondName= " + getSecondName() +
                " patronymic= " + getPatronymic() +
                " dateOfBirth= " + getDateOfBirth() +
                " teacherId= " + getId() +
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