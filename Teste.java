package TrabalhoFinal_Lojavirtual;

import TrabalhoFinal_Lojavirtual.Conexao;
import TrabalhoFinal_Lojavirtual.Produto;
import TrabalhoFinal_Lojavirtual.Cliente;
import TrabalhoFinal_Lojavirtual.Vendedor;
import java.sql.Statement;
import java.sql.SQLException;

/* Desenvolvedores: Bruno Moroni, Everardo Antonio, Jessica de Freitas e Luiz Fernando
 * Objetivo:  apresentar um projeto de c�digo que atenda as necessidades de uma loja virtual 
 * de produtos diversos. O c�digo se baseia nas demandas do dia-a-dia de um com�rcio que precisa
 * ter controle sobre o estoque dos seus produtos, o tipo de cada e seu pre�o, al�m disso � 
 * necess�rio acompanhar da melhor maneira poss�vel as suas vendas, observando qual foi o vendedor 
 * que executou a venda e quem � o cliente, e tamb�m � preciso identific�-los. Ao final das opera��es
 * de compra e venda se torna fundamental retornar o saldo em caixa e de estoque, a fim de observar 
 * se h� lucro ou n�o e a disponibilidade dos produtos.
*/

public class Teste {
    public static void main(String args[])throws Exception{
        
        Conexao conexao = new Conexao();
        conexao.abrirConexao();
        
        
        Produto crud = new Produto(conexao.getConnection());
        
        //crud.adicionarNovoProduto(7, "agenda", "Escritorio", 20.00, 10, 743); 
        
        //crud.consultaEstoqueId(1);
        
        //crud.pesquisarProduto("Livro");
        
        //crud.atualizarEstoque(2, 1);
        
        //crud.removerProduto(7, "Lapiseira");
        
        
        
        Cliente crud1 = new Cliente(conexao.getConnection());
        
        //crud1.adicionarNovoCliente(11, "Dandara", "555555555", "Avenida Juazaeiro", "pix");
        
        //crud1.consultaClienteId(7);
        
        //crud1.Efetuarcompra(11, 1);
        
        //crud1.DeletarClienteId(10);
        
        Vendedor crud2 = new Vendedor(conexao.getConnection());
       // crud2.DeletarVendedorId(744);
        //crud2.ConsultarEmaildoVendedor("LeeSolar@gmail.com");
        
        
        
        
        
        
    }
}