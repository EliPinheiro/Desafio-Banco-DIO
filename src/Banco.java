import java.util.HashSet;
import java.util.Set;

public class Banco {
        private String nomeBanco;
        private Set<Cliente> listaClientes;

        public Banco(String nomeBanco){
                this.nomeBanco = nomeBanco;
                this.listaClientes = new HashSet<>();
        }

        public void adicionarCliente(Cliente cliente){
                listaClientes.add(cliente);
        }

        public String getNome() {
                return nomeBanco;
        }

        public Set<Cliente> getListaClientes() {
                return listaClientes;
        }
        public void exibirClientes(){
                for (Cliente c: listaClientes){
                        System.out.println(c);
                }
        }
}