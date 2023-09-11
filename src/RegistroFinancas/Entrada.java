package RegistroFinancas;

public class Entrada {
    private float valor;
    CategoriaEntrada ce;
    
    public Entrada(){}
    
    public void EntradaValor(float valor){
        this.valor = this.valor + valor;
        System.out.println("Entrada de: R$"+valor+" registrado na categoria: "+ce.getNomeEntrada());
    }
}