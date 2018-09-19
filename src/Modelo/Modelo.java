
package Modelo;


public class Modelo {
    private double numero1 = 0;
    private double numero2 = 0;
    private String operador = "";
    private double total = 0;

    public double getNumero() {
        return numero1;
    }

    public void setNumero(double numero) {
        this.numero1 = numero;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public double operacion(){
        if(operador.equals("+")){
            return total =numero1+numero2;
        }
        if(operador.equals("-")){
            return total =numero1-numero2;
        }
        if(operador.equals("%")){
            return total =numero1%numero2;
        }
        if(operador.equals("*")){
            return total =numero1*numero2;
        }
        if(operador.equals("/")){
            return total =numero1/numero2;
        }
           return  0;
     }
  
}