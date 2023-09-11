package RegistroFinancas;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RegistroFinancasExe {
    public static void main(String[] args) {
        CategoriaEntrada ce1 = new CategoriaEntrada();
        CategoriaGastos cs1 = new CategoriaGastos();
        Entrada e1 = new Entrada();
        Gastos g1 = new Gastos();
        Extrato ex1 = new Extrato();
        int opcaoCategoria;
        int opcao;
        float dinheiro;
        String categoria;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Realizar registro: \n1 - Entrada\n2 - Gasto\n3 - Extrato\n0 - Sair");
            opcao = scanner.nextInt();
            if(opcao == 1){
                System.out.println("Informe a categoria da entrada: \n1 - Salário\n2 - Freelance\n3 - Outros");
                opcaoCategoria = scanner.nextInt();
                ce1.testeEntrada(opcaoCategoria);
                categoria=ce1.getNomeEntrada();
                System.out.println("Informe o valor: ");
                e1.ce=ce1;
                dinheiro = scanner.nextFloat();
                e1.EntradaValor(dinheiro);
                LocalDate data = LocalDate.now();
                DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalTime horario = LocalTime.now();
                DateTimeFormatter formatarHorario = DateTimeFormatter.ofPattern("HH:mm:ss");
                String horarioFormatado = horario.format(formatarHorario);
                String dataFormatada = data.format(formatarData);
                ex1.ColocarDinheiroCategoria(dinheiro,categoria,dataFormatada,horarioFormatado);
            }else if(opcao == 2){
                System.out.println("Informe a categoria da entrada: \n1 - Alimentação\n2 - Educação\n3 - Lazer\n4 - Contas\n5 - Emergências\n6 - Outros");
                opcaoCategoria = scanner.nextInt();
                cs1.testeGasto(opcaoCategoria);
                categoria=cs1.getNomeGasto();
                System.out.println("Informe o valor: ");
                dinheiro = scanner.nextFloat();
                g1.cg=cs1;
                g1.GastoValor(dinheiro);
                dinheiro=dinheiro*-1;
                LocalDate data = LocalDate.now();
                DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalTime horario = LocalTime.now();
                DateTimeFormatter formatarHorario = DateTimeFormatter.ofPattern("HH:mm:ss");
                String horarioFormatado = horario.format(formatarHorario);
                String dataFormatada = data.format(formatarData);
                ex1.ColocarDinheiroCategoria(dinheiro,categoria,dataFormatada,horarioFormatado);
            }else if (opcao == 3){
                ex1.LerExtrato();
            }else if(opcao == 0){
                System.out.println("Fechando o programa");
            }else{
                System.out.println("Opção invalida");
            }
        }while(opcao != 0);
    }
}