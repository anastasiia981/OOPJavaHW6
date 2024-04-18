import java.util.Comparator;
import java.util.List;

public interface UserGroupInterface<T extends User> {
    void setUserGroup(List<T> user);

    List<T> getUserGroup();

    void addUser(T user);

    void sortUsers();

    void sortUsers(Comparator<T> userComparator);

}