public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

        // Cadastro de clientes:
        supermercado.adicionarCliente("12345678901", "Ana Clara Cordeiro", "(11) 98765-4321", "cordeiro.anaclara263@gmail.com");
        supermercado.adicionarCliente("98765432109", "Rebeca Rodrigues", "(21) 99999-8888", "rodriguesrebeca518@outlook.com");
        supermercado.adicionarCliente("54789114423", "Lucas Lessa", "(11) 99748-3245", "lucaslessa14@hotmail.com");
        supermercado.adicionarCliente("78455225536", "Victor Costa", "(21) 98875-3241", "victorcosta030902@gmail.com");

        // Busca de cliente pelo CPF:
        String cpfBusca = "54789114423";
        Cliente clienteEncontrado = supermercado.buscarCliente(cpfBusca);
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nome: " + clienteEncontrado.getNome());
            System.out.println("CPF: " + clienteEncontrado.getCpf());
            System.out.println("Celular: " + clienteEncontrado.getCelular());
            System.out.println("Email: " + clienteEncontrado.getEmail());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}