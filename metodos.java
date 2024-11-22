import java.util.Stack;
import java.util.Scanner;

public class metodos {
    Scanner sc = new Scanner(System.in);

    public String palabra() {
        String dialgo = "";
        System.out.println("Ingrese una palabra");
        dialgo = sc.next();
        return dialgo;
    }

    public void invertir(String dialgo) {
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < dialgo.length(); i++) {
            pila.push(dialgo.charAt(i));
        }
        StringBuilder invertir = new StringBuilder();
        for (int i = 0; i < dialgo.length(); i++) {
            invertir.append(pila.pop());
        }
        System.out.println("cadena invertida: " + invertir);
        System.out.println(" cantidad de caracteres: " + dialgo.length());
    }
}