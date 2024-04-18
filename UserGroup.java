
import java.util.ArrayList;
import java.util.List;

public abstract class UserGroup<T extends User> implements UserGroupInterface<T>{

    protected List<T> userGroup;

    public UserGroup() {
        this(new ArrayList<>());
    }

    public UserGroup(List<T> userGroup) {
        setUserGroup(userGroup);
    }







}