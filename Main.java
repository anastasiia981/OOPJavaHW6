import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        StudentGroup students = new StudentGroup();
        StudyService studyGroupService = new StudyService(students);

        studyGroupService.addStudent("Петр", "Петров", "Петрович", LocalDate.of(1989, 01, 01));
        studyGroupService.addStudent("Иван", "Иванов", "Петрович", LocalDate.of(1989, 01, 01));
        studyGroupService.addStudent("Семен", "Семенов", "Петрович", LocalDate.of(1989, 01, 01));
        studyGroupService.addStudent("Николай", "Николаве", "Петрович", LocalDate.of(1989, 01, 01));
        studyGroupService.addStudent("Константин", "4Константинов", "Петрович", LocalDate.of(1989, 01, 01));

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        students.sortUsers();

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        TeacherGroup teams = new TeacherGroup();
        TeacherService service = new TeacherService(teams);

        service.addTeacher("Екатерина", "Тучкина", "Максимовна", LocalDate.of(1989, 01, 01));
        service.addTeacher("Екатерина", "Кучкина", "Максимовна", LocalDate.of(1989, 01, 01));
        service.addTeacher("Екатерина", "Мучкина", "Максимовна", LocalDate.of(1989, 01, 01));


        for (Teacher teacher : teams) {
            System.out.println(teacher);
        }

        System.out.println();

        students.sortUsers();

        for (Teacher teacher : teams) {
            System.out.println(teacher);
        }
    }
}