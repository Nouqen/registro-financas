package RegistroFinancas;

public class Gastos {
    private float valor;
    CategoriaGastos cg;
    
    public Gastos(){}
    
    public void GastoValor(float valor){
        this.valor = this.valor - valor;
        System.out.println("Gasto de: R$"+valor+" registrado na categoria: "+cg.getNomeGasto());
    }
}

