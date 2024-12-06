// Определение класса Студент
public class Student {
    private String name;        // Имя студента
    private String faculty;     // Факультет
    private int enrollmentYear; // Год поступления
    private double rating;      // Рейтинг    // Конструктор
    public Student(String name, String faculty, int enrollmentYear, double rating) {
        this.name = name;
        this.faculty = faculty;
        this.enrollmentYear = enrollmentYear;
        this.rating = rating;
    }    // Методы класса
    public String getName() {
        return name;
    }    public String getFaculty() {
        return faculty;
    }    public int getEnrollmentYear() {
        return enrollmentYear;
    }    public double getRating() {
        return rating;
    }    public String info() {
        return "Имя: " + name + ", Факультет: " + faculty +
                ", Год поступления: " + enrollmentYear +
                ", Рейтинг: " + rating;
    }
}