
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void imprimirClientes() {
        if (contas == null || contas.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("Clientes titulares:");
        java.util.Set<String> nomes = new java.util.LinkedHashSet<>();
        for (Conta c : contas) {
            if (c.getCliente() != null && c.getCliente().getNome() != null) {
                nomes.add(c.getCliente().getNome());
            }
        }

        for (String nomeCliente : nomes) {
            System.out.println(nomeCliente);
        }
    }

}
