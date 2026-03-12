public class Main2 {
    public static void main(String[] args) {
        // Create a new ReportCard
        ReportCard myReport = new ReportCard("Gideon", 101);

        // Add subjects
        myReport.addSubject(new Subject("Math", 100, 95));
        myReport.addSubject(new Subject("Physics", 100, 88));
        myReport.addSubject(new Subject("CS", 100, 92));

        // Display the final output
        myReport.displayReport();
    }
}