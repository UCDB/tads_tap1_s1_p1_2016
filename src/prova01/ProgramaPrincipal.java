package prova01;

/**
 * Prova UCDB
 */
public class ProgramaPrincipal {


    public static void main(String[] args) {

        GerenciadorCliente gc =  new GerenciadorCliente();

        //Cadastrando clientes
        gc.add (new Cliente ("Jão", 90.0));
        gc.add (new Cliente ("Ze", 85.7));
        gc.add (new Cliente ("Maria", 55.7));

        Cliente [] ordenados=  gc.getClientesOrdenados();

        Cliente maisLeve = gc.getMaisLeve();
        maisLeve.imprimirDados();

        Cliente maisPesado = gc.getMaisPesado();
        maisPesado.imprimirDados();

        double mediaPesos=   gc.mediaPesos();
        System.out.println(mediaPesos);

        //Buscando um cliente
        Cliente c=  gc.buscarPorNome("Jão");

        //Cria produtos passando como parametro no construtor o preco de cada produto
        Produto computador = new Produto(2500.0);
        Produto televisao = new Produto(4500);

        //Cria um objeto de Venda
        Venda venda1 =  new Venda();

        //Adiciona Produtos e quantidade na Venda
        venda1.addProduto(computador, 2);
        venda1.addProduto(televisao,1 );
        //Vincula um cliente que foi buscado pelo gerenciador de Cliente
        venda1.setCliente(c);

        //Imprimindo Dados da Venda
        System.out.println("Cliente:" + venda1.getCliente().getNome()); //Saida Jão
        System.out.println("Total da Venda:"+ venda1.calcularTotal() ); //Saida 9500


    }
}
