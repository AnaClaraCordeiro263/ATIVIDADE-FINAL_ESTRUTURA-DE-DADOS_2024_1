import java.util.HashMap;
import java.util.Map;
public class Supermercado {

    private Map<String, Cliente> cadastroClientes;

    public Supermercado() {
        cadastroClientes = new HashMap<>();
    }

    // Função hash
    private String calcularIndiceHash(String cpf) {
        return cpf;
    }

    // Método para adicionar um cliente ao cadastro.
    public void adicionarCliente(String cpf, String nome, String celular, String email) {
        String indice = calcularIndiceHash(cpf);
        cadastroClientes.put(indice, new Cliente(nome, cpf, celular, email));
    }

    // Método para buscar um cliente pelo CPF.
    public Cliente buscarCliente(String cpf) {
        String indice = calcularIndiceHash(cpf);
        return cadastroClientes.get(indice);
    }
}