import java.util.Scanner;
public class RecursCompfTest {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        RecursCompf c = new RecursCompf();  //c-ссылка на оббьект рекурсовного кальк// метод конструктор
       // System.out.println("Введите формулу -> ");

        while (true){
            System.out.println("Введите формулу -> ");
            c.compile(scanner.nextLine().toCharArray());  //метод экземпляра класса - передается формла
    }}
}
