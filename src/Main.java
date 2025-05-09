import model.Agenda;
import model.Contatos;
import service.InputHelper;
import service.OutputHelper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        InputHelper input = new InputHelper();
        Agenda agenda = new Agenda();

        OutputHelper.init();
        int decisao;

        String nome;
        String telefone;
        String email;

        do{
            decisao = input.scanInt("Insira Opção");
            switch (decisao){
                case 1:
                    OutputHelper.print("Adicionar contatos:");
                    nome = input.scanString("Insira o Nome:");
                    telefone = input.scanString("Insira o Telefone:");
                    email = input.scanString("Insira o email:");
                    Contatos novoContato = new Contatos(nome, telefone, email);
                    novoContato.write();
                    break;
                case 2:

                    break;
                case 3:
                    OutputHelper.print("Ler Contato:");
                    nome = input.scanString("Insira o Nome:");
                    Contatos.read(nome);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                }
        }while (decisao != 0);
    }

    public void println(Object object) {
        System.out.println(object);
    }
}