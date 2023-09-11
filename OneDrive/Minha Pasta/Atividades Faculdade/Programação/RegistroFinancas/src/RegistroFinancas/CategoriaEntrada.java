package RegistroFinancas;

public class CategoriaEntrada {
   private int opcao;
   private String nomeEntrada;
   
   public CategoriaEntrada(){}

    public CategoriaEntrada(int opcao) {
        this.opcao = opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public String getNomeEntrada() {
        return nomeEntrada;
    } 
   
   public void testeEntrada(int opcaoEntrada){
        switch (opcaoEntrada) {
            case 1:
                this.nomeEntrada = "Salário";
                break;
            case 2:
                this.nomeEntrada = "Freelance";
                break;
            case 3:
                this.nomeEntrada = "Outros";
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
