

import java.util.List;

public class StudyGroupContr extends StudentGroup {

    private StudyGroupService service;

    public StudyGroupContr() {
        this.service = new StudyGroupService();
    }

    public StudyGroupService getService() {
        return service;
    }

    public Teacher getTeacher() {
        return getService().getTeacher();
    }

    public List<StudyGroup> getStudents() {
        return getService().getStudyGroups();
    }

//    public StudentGroup addTeacherStudent(Teacher teacher, List<Student> student) {
//        return getService().addUser(teacher, student);
//    }
}