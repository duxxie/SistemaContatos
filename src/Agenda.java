import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contatos> agenda = new ArrayList<>();

    public void add(Contatos contatos) {
        this.agenda.add(contatos);
    }

    public void remove(Contatos contatos) {
        this.agenda.remove(contatos);
    }
}
