

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    private StudentGroup studentsGroup;
    private List<StudyGroup> studyGroups = new ArrayList<StudyGroup>();
    private Teacher teacher;

    public StudyGroupService() {
    }

    public StudyGroupService(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    public StudentGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    public void setStudyGroups(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}