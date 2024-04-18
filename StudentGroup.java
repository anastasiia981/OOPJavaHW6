import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentGroup extends UserGroup<Student> implements Iterable<Student>{
    private List<Student> students;

    public List<Student> getUserGroup() {
        return students;
    }

    public void setUserGroup(List<Student> students) {
        this.students = students;
    }

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public StudentGroup() {
        this(new ArrayList<>());
    }

    @Override
    public UserGroupIterator iterator() {
        return new UserGroupIterator(this);
    }

    public void addUser(Student student) {
        getUserGroup().add(student);
    }

    public void sortUsers(Comparator<Student> userComparator) {
        getUserGroup().sort(userComparator);
    }

    public void sortUsers() {
        sortUsers(new UserComparator());
    }



}