import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        //chamando a classe e o metodo dela que preenche a lista
        ListaProdutosUtils.listaProdutos();

        //obtém a lista de produtos e o nome da empresa
        List<Produto> listaDeProdutos = ListaProdutosUtils.getListaDeProdutos();
        String empresa = ListaProdutosUtils.getEmpresa();

        //chamando a classe e o metodo dela que imprime o cabeçalho e a lista completa de produtos
        ListaProdutosUtils.imprimeLista(listaDeProdutos, empresa);

        //chamando a classe e o metodo dela que faz o controle do input
        ListaProdutosUtils.comando();
    }
}