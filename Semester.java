import java.util.HashMap;
import java.util.Map;

 class Semester {
    private String semesterName;
    private Map<String, Integer> coursesMarks;

    public Semester(String semesterName) {
        this.semesterName = semesterName;
        this.coursesMarks = new HashMap<>();
    }

    public void addCourseMark(String courseName, int marks) {
        coursesMarks.put(courseName, marks);
    }

    public void displayCoursesMarks() {
        System.out.println("Semester: " + semesterName);
        System.out.println("Courses and Marks:");
        for (Map.Entry<String, Integer> entry : coursesMarks.entrySet()) {
            System.out.println("Course: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Semester semester1 = new Semester("Semester 1");
        semester1.addCourseMark("Mathematics", 85);
        semester1.addCourseMark("Physics", 78);
        semester1.addCourseMark("Computer Programming", 90);

        Semester semester2 = new Semester("Semester 2");
        semester2.addCourseMark("Circuit Analysis", 70);
        semester2.addCourseMark("Digital Electronics", 82);
        semester2.addCourseMark("Power Systems", 75);

        semester1.displayCoursesMarks();
        System.out.println();
        semester2.displayCoursesMarks();
    }
}
