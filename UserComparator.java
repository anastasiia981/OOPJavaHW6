import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getSecondName().compareTo(o2.getSecondName());
    }
}