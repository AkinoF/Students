// Определение класса Аспирант
public class Graduate extends Student {
    private String supervisor; // Руководитель
    private String specialtyCode; // Код специальности    // Конструктор
    public Graduate(String name, String faculty, int enrollmentYear,
                    double rating, String supervisor, String specialtyCode) {
        super(name, faculty, enrollmentYear, rating);
        this.supervisor = supervisor;
        this.specialtyCode = specialtyCode;
    }    // Методы класса
    public String getSupervisor() {
        return supervisor;
    }    public String getSpecialtyCode() {
        return specialtyCode;
    }    @Override
    public String info() {
        return super.info() + ", Руководитель: " + supervisor +
                ", Код специальности: " + specialtyCode;
    }
}
