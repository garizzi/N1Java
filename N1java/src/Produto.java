//criando objeto produto com seus metodo e atributos
public class Produto
{
    private String nome;
    private String preco;

    public Produto(String nome, String preco)
        {
            this.nome = nome;
            this.preco = preco;
        }
        public String getNome()
        {
            return nome;
        }

        public String getPreco()
        {
            return preco;
        }
}