public class Calc extends Compf {
    private StackInt s;
    private static int char2int(char c) {
        return (int)c - (int)'0';
    }
    protected int symOther(char c) {
        if (c < '0' || c > '8') {
            System.out.println("Недопустимый символ: " + c);
            System.exit(0);
        }
        return SYM_OTHER;
    }
    protected void nextOper(char c) {
        int second = s.pop();
        int first = s.pop();
        switch (c) {
            case '+':
                s.push(first + second); break;
            case '-':
                s.push(first - second); break;
            case '*':
                s.push(first * second); break;
            case '/':
                s.push(first / second); break;
        }
    }
    protected void nextOther(char c) {
        if(N){
            int chisl = ((s.pop())*8)+char2int(c);
            s.push(chisl);
            N = true;
        }
        else {
            s.push(char2int(c));
            N = true;
        }
    }
    public Calc() {
        s = new StackInt();
    }
    public final void compile(char[] str) {
        super.compile(str);
        String a = Integer.toString(s.top());
        System.out.println("" + Integer.parseInt(a,10));

    }
   /* protected String ret(int n)
    {
        String a = Integer.toString(n);
        char[] mas = a.toCharArray();
        return a ;
    }*/
}
