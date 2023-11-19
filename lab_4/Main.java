public class Main {
    public static void main(String[] args) {
        // Примитивные типы данных
        int intValue = 2;
        switch (intValue) {
            case 1:
                System.out.println("Целое число: 1");
                break;
            case 2:
                System.out.println("Целое число: 2");
                break;
            default:
                System.out.println("Целое число по умолчанию: 3");
        }

        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("Символ: A");
                break;
            case 'B':
                System.out.println("Символ: B");
                break;
            default:
                System.out.println("Символ по умолчанию: С");
        }

        // Обертки примитивных типов данных
        String str = "billy";
        switch (str) {
            case "billy":
                System.out.println("Обертка String: billy");
                break;
            case "villy":
                System.out.println("Обертка String: villy");
                break;
            default:
                System.out.println("Обертка String: stranger");
        }

        // Перечисление (enum)
        // Пример перечисления (enum)
        enum DayOfWeek {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        DayOfWeek day = DayOfWeek.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("День недели: Понедельник");
                break;
            case TUESDAY:
                System.out.println("День недели: Вторник");
                break;
            default:
                System.out.println("День недели по умолчанию: Суббота");
        }
    }
}
