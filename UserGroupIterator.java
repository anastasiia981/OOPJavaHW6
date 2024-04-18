import java.util.Iterator;
import java.util.List;

public class UserGroupIterator<E extends UserGroup<T>, T extends User> implements Iterator<T> {

    private int counter;
    private final List<T> users;

    public UserGroupIterator(E userGroup) {
        this.users = userGroup.getUserGroup();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < users.size();
    }

    @Override
    public T next() {
        if (!hasNext()){
            throw new RuntimeException("Students");
        }

        return users.get(counter++);
    }
}