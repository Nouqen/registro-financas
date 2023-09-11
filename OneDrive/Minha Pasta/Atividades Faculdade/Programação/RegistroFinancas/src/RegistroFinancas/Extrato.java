package RegistroFinancas;

public class Extrato {
    private float valorFinal;
    private float[] dinheiroVetor = new float[100];
    private String[] categoriaVetor = new String[100];
    private String[] dataVetor = new String[100];
    private String[] horarioVetor = new String[100];
    private int x=0, y=0;
    
    public Extrato(){}

    public Extrato(float valorFinal, Entrada c, Gastos g) {
        this.valorFinal = valorFinal;
    }
    
    public void ColocarDinheiroCategoria(float dinheiro, String categoria, String dataFormatada, String horarioFormatado){
        dataVetor[x]=dataFormatada;
        horarioVetor[x]=horarioFormatado;
        dinheiroVetor[x]=dinheiro;
        categoriaVetor[x]=categoria;
        x++;
    }
    public void LerExtrato(){
        do{
            System.out.println(dataVetor[y]+" | "+horarioVetor[y]+" | "+dinheiroVetor[y]+" | "+categoriaVetor[y]);
            valorFinal=valorFinal+dinheiroVetor[y];
            y++;
        }while(y!=x);
        System.out.println("\nSaldo: "+valorFinal+"\n");
        y=0;
        valorFinal=0;
    }
}
