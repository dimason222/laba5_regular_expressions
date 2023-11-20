package org.example;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
 public static void task1(){
     String phoneNumber = "(+380)50-333-33-33";
     boolean isValid = phoneNumber.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
     System.out.println(isValid ? "valid number" : "invalid number");
     String phoneNumber2 ="(+380)50-333-45-4";
     isValid = phoneNumber2.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
     System.out.println(isValid ? "valid number" : "invalid number");
 }
    public static void task2(){
        String text = "Я хочу    бути     програмістом";
        System.out.println(text);
        text = text.replaceAll("\\s+", " ");
        System.out.println(text);
        String text2 = "Я\nхочу\t\tбути         програмістом";
        System.out.println(text2);
        text2 = text2.replaceAll("\\s+", " ");
        System.out.println(text2);
    }
    public static void task3(){
        String tags = "<div>\n" +
                "<p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\n" +
                "дозволяють отримати з рядка додаткову інформацію.\n" +
                "<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\n" +
                "за заданим виразом і знаходить її - він просто повертає\n" +
                "знайдений рядок.</p>\n" +
                "<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n" +
                "</div>";
        tags = tags.replaceAll("<[^>]*>", "");
        System.out.println(tags);
    }
}