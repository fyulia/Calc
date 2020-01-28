import java.util.Scanner;
public class CalcTest {
    public static void main(String[] args) throws Exception {
        Calc c = new Calc();

        Scanner scanner = new Scanner(System.in);
        // RecursCompf c = new RecursCompf();  //c-ссылка на оббьект рекурсовного кальк// метод конструктор

        while (true){
            System.out.println("Введите формулу -> ");
            c.compile(scanner.nextLine().toCharArray());
    }
    }
}