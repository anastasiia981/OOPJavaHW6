import java.time.LocalDate;

public class StudyService {
    private StudentGroup group;
    private static int id;

    public StudyService(StudentGroup group) {
        this.group = group;
    }

    public void addStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        group.addUser(new Student(firstName, secondName, patronymic, dateOfBirth, ++id));
    }
}