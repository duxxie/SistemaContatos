import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        InputHelper input = new InputHelper();
        Agenda agenda = new Agenda();

        OutputHelper.init();
        int decisao = input.scanInt("Insira Opção");

        String nome;
        String telefone;
        String email;

        switch (decisao){
            case 1:
                OutputHelper.print("Adicionar contatos:");
                nome = input.scanString("Insira o Nome:");
                telefone = input.scanString("Insira o Telefone");
                email = input.scanString("Insira o email");
                Contatos novoContato = new Contatos(nome, telefone, email);
                novoContato.write();
                break;
            case 2:
                OutputHelper.print("Listar Contatos:");
                break;
        }




    }

    public void println(Object object) {
        System.out.println(object);
    }
}