import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup extends UserGroup<Teacher> implements Iterable<Teacher>{
    private List<Teacher> teachers;

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public TeacherGroup() {
        this(new ArrayList<>());
    }

    public List<Teacher> getUserGroup() {
        return teachers;
    }

    public void setUserGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new UserGroupIterator<>(this);
    }

    public void addUser(Teacher teacher) {getUserGroup().add(teacher);}

    @Override
    public void sortUsers(Comparator<Teacher> userComparator) {
        getUserGroup().sort(userComparator);
    }

    public void sortUsers(){
        sortUsers(new UserComparator());
    }


}