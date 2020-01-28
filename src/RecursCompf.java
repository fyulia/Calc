public class RecursCompf {
    private static final int DEFSIZE = 255;
    private char[] str;
    private int index;
    private void compileF() {   // 2)
        compileT();

        if (index >= str.length) return;
        if (str[index] == '+') {
            index++;
            compileF();
            System.out.print("+ ");
            return;
        }
        if (str[index] == '-') {
            index++;
            compileF();
            System.out.print("- ");
        }

    }
    private void compileT() {
        compileM();

        if (index >= str.length) return;
        if (str[index] == '*') {
            index++;
            compileT();
            System.out.print("* ");
            return;
        }
        if (str[index] == '/') {
            index++;
            compileT();
            System.out.print("/ ");
        }

    }
    private void compileM() {
        if (str[index] == '(') {
            index++;
            compileF();
            index++;
        } else
            compileV();
    }
    private void compileV() {
        System.out.print("" + str[index++] + " ");
    }   //просто вывод
    public void RecursCompf() { str = new char[DEFSIZE]; } // 1) выделили память для str на 255
    public void compile(char[] str) { //метод
        this.str = str;  // перееменной экземпляра класса присваевается значение
        index = 0;       // индес элемента
        compileF();      // метод вызывается
        System.out.println("\n");
    }
}
