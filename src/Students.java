// Главный класс для тестирования
import java.util.Arrays;public class Students {
    public static void main(String[] args) {
        // Массив студентов
        Student[] students = {
                new Student("Иван Петров", "Экономический", 2023, 4.8),
                new Student("Мария Сидорова", "Экономический", 2023, 4.5),
                new Student("Алексей Иванов", "Экономический", 2023, 4.9),
                new Student("Анна Кузнецова", "Технический", 2022, 4.1),
                new Student("Петр Смирнов", "Экономический", 2023, 4.7)
        };        // Массив аспирантов
        Graduate[] graduates = {
                new Graduate("Ольга Васильева", "Экономический", 2021, 4.6, "Дмитрий Сергеев", "05.13.11"),
                new Graduate("Сергей Федоров", "Технический", 2020, 4.2, "Александр Петров", "05.13.10"),
                new Graduate("Екатерина Лебедева", "Экономический", 2019, 4.7, "Ирина Николаева", "05.13.11")
        };        // Получение информации о трех студентах первого курса с самым высоким рейтингом
        Arrays.sort(students, (s1, s2) -> Double.compare(s2.getRating(), s1.getRating()));
        System.out.println("Топ-3 студента 1-го курса экономического факультета:");
        for (int i = 0; i < 3; i++) {
            System.out.println(students[i].info());
        }        // Проверка аспирантов специальности 05.13.11, завершающих обучение в текущем году
        System.out.println("\nАспиранты специальности 05.13.11, завершающие обучение:");
        for (Graduate gs : graduates) {
            if (gs.getSpecialtyCode().equals("05.13.11") && gs.getEnrollmentYear() == 2023) {
                System.out.println(gs.info());
            }
        }        // Получение полной информации обо всех студентах и аспирантах
        System.out.println("\nПолная информация о студентах и аспирантах:");
        for (Student s : students) {
            System.out.println(s.info());
        }
        for (Graduate gs : graduates) {
            System.out.println(gs.info());
        }
    }
}