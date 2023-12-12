import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class lesson2 {
public static void main(String[] args){
    System.out.println(task0(40, 's', 'h'));
//    task1();
    task3(wordRepeat(10,"test"));

}
    static String task0(int n, char c1, char c2){
        /* Текст задачи:
        Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
        которая состоит из чередующихся символов c1 и c2, начиная с c1. */
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < n/2; i++){
            stringBuilder.append(c1).append(c2);
        }
        return stringBuilder.toString();
    }
static void task1(String str){
//        Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
//
//🔑 **Ответ:** результат - a4b3c1d2 для примера
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] != chars[i-1]){
                stringBuilder.append(chars[i-1]).append(count + 1);
                count = 0;
            } else {
                count++;
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(count+1);
        System.out.println(stringBuilder);
    }
    static boolean task2(String str){
        //        Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
        //        (возвращает boolean значение).
                StringBuilder stringBuilder = new StringBuilder(str);
                String str2 = stringBuilder.reverse().toString();
                return str.equals(str2);
            }
    static void task3(String str)  {
    //        Текст задачи:
    //        Напишите метод, который составит строку, состоящую из 100 повторений
    //        слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
        try (FileWriter writer = new FileWriter("text.txt",true)){
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static String wordRepeat(int n, String str){
        return str.repeat(n);
    }
    static void task4(String str){
    //        Текст задачи:
    //        Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
    //        который запишет эту строку в простой текстовый файл, обработайте исключения.
            Logger logger = Logger.getAnonymousLogger();
            try {
                FileHandler fh = new FileHandler("log.txt", true);
                logger.addHandler(fh);
                SimpleFormatter simpleFormatter = new SimpleFormatter();
                fh.setFormatter(simpleFormatter);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try (FileWriter writer = new FileWriter("/dfg/text.txt", true)){
                writer.write(str);
                writer.flush();
            } catch (IOException e) {
                logger.log(Level.WARNING, e.getMessage());
            }

        }

}