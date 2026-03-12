import java.util.ArrayList;

public class ReportCard {
    private String studentName;
    private int rollNo;
    private ArrayList<Subject> subjects;

    public ReportCard(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject s) {
        subjects.add(s);
    }

    public double calculateOverallPercentage() {
        double totalObtained = 0;
        double totalMax = 0;

        for (Subject s : subjects) {
            totalObtained += s.getMarksObtained();
            totalMax += s.getMaxMarks();
        }

        if (totalMax == 0) return 0;
        return (totalObtained / totalMax) * 100;
    }

    public void displayReport() {
        System.out.println("------ REPORT CARD ------");
        System.out.println("Student: " + studentName + " | Roll No: " + rollNo);
        System.out.println("-------------------------");
        
        for (Subject s : subjects) {
            System.out.printf("%-15s: %.2f / %.2f (%.1f%%)\n", 
                s.getSubjectName(), s.getMarksObtained(), s.getMaxMarks(), s.getPercentage());
        }

        double overall = calculateOverallPercentage();
        System.out.println("-------------------------");
        System.out.printf("OVERALL PERCENTAGE: %.2f%%\n", overall);
        
        // Simple Grading Logic
        String grade = (overall >= 80) ? "A" : (overall >= 60) ? "B" : "C";
        System.out.println("OVERALL GRADE: " + grade);
    }
}