

package com.mycompany.canetaazul;

import java.util.Locale;
import static java.util.Locale.US;
import java.util.Scanner;
import java.util.spi.LocaleServiceProvider;

/*
 // @author gabriel
 *clase caneta azul
modelo/marca: caracter - string
cor : caracter - String - azul
ponta: numero real - double 2.0
carga: numero iteiro - int - 50
tampa: atributo logico= boolean(true/false) - false

METODO
escrever
rabisco
pintar 
tampar
destampar

METODO  tampar() = ESTADO - tampada , 50%

objeto - uma caneta
classe - forma/molde

metodo rabiscar();SEMPRE vai ter ()
se (tampada) entao - sout = erro
else - sout rabiscar0
simSe
fimMetodo

metodo tampar();
tampada = verdadeira - true
fim metodo}
fim classe}

objeto - uma caneta
classe - forma/molde

c1 = new caneta; 
*depois do new e a classe que vou utilizar antes do new é o objeto que vai existir

c1.cor =azul
o atributo cor do objeto c1 esta recebendo "azul"

c1.ponta = 0.5;
c1.tampada = false

c1.escrever();

c2. = new caneta;


*/
public class Canetaazul {

    public static void main(String[] args) {
        Locale.setDefault(US);
        Scanner tecladoString = new Scanner (System.in);
        Scanner tecladoDouble = new Scanner (System.in);
        Scanner tecladoInt = new Scanner (System.in);
        
        System.out.println("digite a marca da caneta: ");
        String marcaC1 = tecladoString.nextLine();
        System.out.println("digite a cor da caneta");
        String corC1 = tecladoString.nextLine();
        System.out.println("digite a expessura da caneta");
        double pontaC1 = tecladoDouble.nextDouble();
        System.out.println("digite a carga da caneta");
        int cargaC1 = tecladoInt.nextInt();
        
        
        
        
        
        Caneta1 c1 = new Caneta1();
        c1.cor = corC1;
        c1.ponta = pontaC1;
        c1.carga = cargaC1;
        c1.marca = marcaC1;
        
        boolean respostaTampada = c1.perguntarTampar();
        c1.tampada = respostaTampada;
                
        c1.estado();
        c1.escrever();
      
        /*
        Caneta1 c2 = new Caneta1();
        c2.marca = "BIC";
        c2.cor = "preta";
        c2.destampar();
        c2.estado();
        c2.escrever();*/
    }

    private static void LocaleServiceProvider(Locale US) {
        
    }
}
