package com.mycompany.cpf_validate;

import java.util.Scanner;
           
        import newpackage.cpf;

public class NewMain {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            String CPF;

        System.out.printf("Informe o CPF: ");
            CPF = ler.next();

        System.out.printf("\nResultado: ");
               
            if (cpf.isCPF(CPF) == true)
                System.out.printf("%s\n", cpf.imprimeCPF(CPF));
            else System.out.printf("Erro, o CPF informado é inválido!\n");

    }
    
}
