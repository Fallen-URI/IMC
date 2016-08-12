/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsseMesmo;

/**
 *
 * @author aluno
 */
public class CalculoIMC {

    double altura;
    char sexo;
    double peso;
    double resultado;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    String calculaIMC(double altura, char sexo, double peso) {
        this.altura = altura;
        this.sexo = sexo;
        this.peso = peso;
        resultado = this.peso / (this.altura * this.altura);
        if ('M' == this.sexo) {
            if (resultado >= 20.7 && resultado <= 26.4) {
                return "Peso Ideal";
            } else {
                if (resultado > 26.4) {
                    return "Acima do peso";                    
                }
                if(resultado<=20.7){
                   return "Abaixo do peso";
                }
            }
        } else {
            if (resultado >= 19.1 && resultado <= 25.8) {
                return "Peso Ideal";
            } else {
                if (25.8 < resultado) {
                    return "Acima do peso";                    
                }
                if(resultado<19.1){
                    return "Abaixo do peso";
                }
            }
        }
        return "tente de novo";
    }
}