public class Subject {
    private String subjectName;
    private double maxMarks;
    private double marksObtained;

    // Constructor
    public Subject(String subjectName, double maxMarks, double marksObtained) {
        this.subjectName = subjectName;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }

    // Getters and Seters
    public String getSubjectName() { return subjectName; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }

    public double getMaxMarks() { return maxMarks; }
    public void setMaxMarks(double maxMarks) { this.maxMarks = maxMarks; }

    public double getMarksObtained() { return marksObtained; }
    public void setMarksObtained(double marksObtained) { this.marksObtained = marksObtained; }

    // Method to get percentage for this specific subject
    public double getPercentage() {
        return (marksObtained / maxMarks) * 100;
    }
}