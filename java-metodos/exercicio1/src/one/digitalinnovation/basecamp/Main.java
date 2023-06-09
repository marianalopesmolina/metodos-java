package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("------ CALCULADORA ------");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("------ MENSAGEM ------");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("------ EMPRÉSTIMO ------");
        Emprestimo.calcular(100, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(100, Emprestimo.getTresParcelas());
        Emprestimo.calcular(100, 5);

    }
}