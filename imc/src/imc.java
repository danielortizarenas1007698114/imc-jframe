
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Ortiz
 */
public class imc {
    public imc(){
        
    }
    public double resultado(double peso, double estatura){
        double res = peso/Math.pow(estatura, 2);        
        return res ;
    }
    public String calcularIMC(double imc){
        String res = "";
        if (imc <= 15){
            res = "Delgadez muy severa";
        }else if(imc < 15.9 && imc > 15){
            res = "Delgadez severa";
        }else if(imc < 18.4 && imc >= 16){
            res = "Delgadez";
        }else if(imc < 24.9 && imc >= 18.5){
            res = "Peso saludable";
        }else if(imc < 29.9 && imc >= 25){
            res = "Sobrepeso";
        }else if(imc < 34.9 && imc >= 30){
            res = "Obesidad Severa";
        }else if(imc >= 40){
            res = "Obesidad mórbida";
        }
        return res;    
    }
    
    
    
}
