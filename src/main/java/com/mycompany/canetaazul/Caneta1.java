
package com.mycompany.canetaazul;

import java.util.Scanner;


//@author gabriel
 
public class Caneta1 {
    String marca;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    
    void estado(){
        System.out.println("informações da caneta");
        System.out.println("Uma caneta" + this.cor);
        System.out.println("marca:" + this.marca);
        System.out.println("ponta:" + this.ponta);
        System.out.println("carga:" + this.carga);
        System.out.println( "Ela esta tempada ? " + (this.tampada ? "sim" : "não"));
    }
    
    void escrever(){
      if(this.tampada== true){
           System.out.println("esta tampada! não posso escrever\n");     
      }else{
          System.out.println("esta destampada ! eu posso escrever\n");
      }  
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
        
    }
    boolean perguntarTampar(){
        Scanner tecladoBoolean = new Scanner(System.in);
        System.out.println("a caneta esta tampada? (SIM/NÃO)");
        String resposta = tecladoBoolean.nextLine();
        
        if(resposta.equals("sim")){
            return true;
        }else if(resposta.equals("não") || resposta.equals("nao")){
            return false;
        }else{
            System.out.println("resposta inválida, por favor digite 'sim'ou 'não'");
            return perguntarTampar();
        }
            
    }
}
