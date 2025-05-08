public class OutputHelper{
    public static void print(Object object) {
        System.out.println(object);
    }

    public static void init() {
        print("-----Sistema 3000-----");
        print("""
                [1]Adicionar contatos\t\t[2]Listar contatos
                [3]Buscar por nome\t\t[4]Editar contato
                [5]Remover contato\t\t[6]Salvar em arquivo
                [7]Carregar do arquivo\t\t[0] Sair
                \nEscolha:""");
    }
}
