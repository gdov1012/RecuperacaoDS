package SupermercadoOnlineConstrutor;
public class Main_Produto {
    public static void main(String[] args) {
       Produto p1 = new Produto("Roupas", 100);
       
       p1.nome = "Roupas";
       p1.preco = 100.00;
       p1.exibirInfo();
       p1.aplicarDesconto(10);   
    }
    
}
