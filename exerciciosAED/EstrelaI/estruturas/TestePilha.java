package EstrelaI.estruturas;

import java.util.Stack;

public class TestePilha {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Pilha p = new Pilha(5);
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);

        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
    }
}
