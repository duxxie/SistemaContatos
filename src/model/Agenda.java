package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void carregarContatosDePasta(String caminhoDaPasta) {
        contatos.clear();
        File pasta = new File(caminhoDaPasta);

        if (!pasta.exists() || !pasta.isDirectory()) {
            System.out.println("Pasta inválida.");
            return;
        }

        File[] arquivos = pasta.listFiles((dir, name) -> name.endsWith(".txt"));

        if (arquivos == null) return;

        for (File arquivo : arquivos) {
            try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
                String nome = br.readLine();
                String telefone = br.readLine();
                String email = br.readLine();

                if (nome != null && telefone != null && email != null) {
                    Contato contato = new Contato(nome, telefone, email);
                    this.contatos.add(contato);
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + arquivo.getName());
            }
        }
    }

    public void listarContatos() throws IOException {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato carregado.");
            return;
        }
        for (Contato c : contatos) {
            read(c.getNome());
        }
    }

    public static void read(String nome) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/adicionados/" + nome + ".txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(nome + ": "+ line);
        }
    }
}