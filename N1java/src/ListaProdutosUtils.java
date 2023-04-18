import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//classe com todos os utilitarios
public class ListaProdutosUtils
{
    //criando objeto scanner estatico para usar em todos os metodos
    //criando variaveis estaticas para serem usadas nos metodos
    static Scanner scanner = new Scanner(System.in);
    static String empresa;
    static List<Produto> listaDeProdutos;

    //criando o metodo que solicita nome da empresa e preenche a lista com os produtos
    public static void listaProdutos()
    {
        //Scanner do nome da empresa
        System.out.print("Digite o nome da empresa: ");
        empresa = scanner.next();

        //instanciando objeto arraylist do tipo Produto e atribui a variavel
        listaDeProdutos = new ArrayList<>();

        //iniciando laço para preencher a lista
        for (int i = 0; i < 6; i++)
        {
            //scan nome do produto
            System.out.print("Digite o nome do produto Nº" + (i + 1) + ":");
            String nome = scanner.next();

            //scan preço do produto
            System.out.print("Digite o preço do produto Nº" + (i + 1) + ":");
            String preco = scanner.next();

            //instanciando objeto produto e salvando na lista com atributos recebidos do input
            Produto item = new Produto(nome, preco);
            listaDeProdutos.add(item);
        }
    }

    //Criando metodo para acessar o atributo/dados da variavel do tipo lista
    public static List<Produto> getListaDeProdutos()
    {
        return listaDeProdutos;
    }

    //Criando metodo para acessar a variavel com nome da empresa
    public static String getEmpresa()
    {
        return empresa;
    }

    //criando metodo que formata o cabeçalho e imprime a lista
    public static void imprimeLista(List<Produto> listaDeProdutos, String empresa)
    {
        System.out.println();
        System.out.println("======================");
        System.out.println("Empresa: " + empresa);
        System.out.println("======================");
        System.out.println("Lista de produtos: ");
        System.out.println();

        for (int i = 0; i < listaDeProdutos.size(); i++)
        {
            Produto produto = listaDeProdutos.get(i);
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }
    }
    //criando o metodo que controla o input do usuario
    public static void comando()
    {
        System.out.println("Digite Promo ou Exit");
        while (true)
        {
            String comando = scanner.next();
            if (comando.equals("Exit"))
            {
                System.out.println("Sistema encerrado");
                break;
            }
            else if (comando.equals("Promo"))
            {
                System.out.println("chama método para adicionar elemento em promocao");
            }
        }
    }
}