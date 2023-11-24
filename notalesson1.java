/* public class notalesson1 {
    static public void main(String[] args){
        
    }
} */

/**
 * notalesson1
 */
import java.util.Scanner;
public class notalesson1 {
    public static void main(String[] args) {
        System.out.println("Bye, world");
        System.out.println("Hey"); //coment
        int a = 6;
        System.out.println(a++); //6
        System.out.println(a); //7
        System.out.println(++a); //8
        a = a-- - --a;
        System.out.println(a); //2
        int[] arr[] = new int[3][5];
            for (int[] line : arr) {
                for (int item : line) {
                    System.out.printf("%d ", item);
                }
                System.out.println();
            }
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        System.out.printf("Привет, %s!", name);
        iScanner.close();
        }
    }    
/* Присваивание: =
Арифметические: *, /, +, -, %, ++, --
Операции сравнения: <, >, ==, !=, >=, <=
Логические операции: ||, &&, ^, !
Побитовые операции <<, >>, &, |, ^ */ //<< и >> побитовые сдвиги, и, или
