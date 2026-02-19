import java.util.Scanner;
import java.util.Stack;

public class VerificadorEquilibrio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a expressão: ");
        String expressao = sc.nextLine();

        if (verificarEquilibrio(expressao)) {
            System.out.println("Os delimitadores estão corretamente balanceados.");
        } else {
            System.out.println("Os delimitadores NÃO estão balanceados.");
        }

        sc.close();
    }

    public static boolean verificarEquilibrio(String expressao) {

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            }

            if (c == ')' || c == ']' || c == '}') {

                if (pilha.isEmpty()) {
                    return false;
                }

                char topo = pilha.pop();

                if ((c == ')' && topo != '(') ||
                    (c == ']' && topo != '[') ||
                    (c == '}' && topo != '{')) {
                    return false;
                }
            }
        }

        // Se a pilha estiver vazia no final → está correto
        return pilha.isEmpty();
    }
}
