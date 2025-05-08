import java.io.*;

public class Contatos {
    private String nome;
    private String telefone;
    private String email;

    public Contatos(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void write() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(this.nome));
        writer.write(nome + "\n" + telefone + "\n" + email);
        writer.close();
    }

    public void read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(this.nome));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}