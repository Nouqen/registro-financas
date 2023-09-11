package RegistroFinancas;

public class CategoriaGastos {
    private int opcao;
    private String nomeGasto;
    
   public CategoriaGastos(){}
   
   public CategoriaGastos(int opcao){
       this.opcao = opcao;
   }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public String getNomeGasto() {
        return nomeGasto;
    }
  
    public void testeGasto(int opcaoGasto){
        switch (opcaoGasto) {
            case 1:
                this.nomeGasto = "Alimentação";
                break;
            case 2:
                this.nomeGasto = "Educação";
                break;
            case 3:
                this.nomeGasto = "Lazer";
                break;
            case 4:
                this.nomeGasto = "Contas";
                break;
            case 5:
                this.nomeGasto = "Emergências";
                break;
            case 6:
                this.nomeGasto = "Outros";
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
