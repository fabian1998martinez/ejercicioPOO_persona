
package proyecto01poo;

import entidad01.persona01;
public class Proyecto01POO {

    
    public static void main(String[] args) {
                //----------------------------------------------------------------------------------------------------------
        /*
         Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
         los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
         tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
         persona es mayor de edad.
         Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
         distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

         cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
         también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/
        persona01 newpersona1 = new persona01("EVELY", 20, 'M', 100, 1.70);
        persona01 newpersona2 = new persona01( "FABIAN", 12, 'H', 60.0, 1.70);
        
        newpersona1.crearPersona();
        newpersona2.crearPersona();
       
        double imc = newpersona1.calcularImc(); 
        double imc2 = newpersona2.calcularImc();
        boolean esmayor1 = newpersona1.esMayorDeEdad();
        boolean esmayor2 = newpersona2.esMayorDeEdad();
        
        double pesobajo = 0;
        double pesoideal=0;
        double sobrepeso=0;
        double mayordeedad=0;
        double menordeedad=0;
        
        
        
        if(imc == -1){
           pesobajo++;
        }else if (imc == 1){
            pesoideal++;
           }else{
            sobrepeso++;
        };
        
        if(esmayor1){
           mayordeedad++;
        }else{
          menordeedad++;
        }
        
        double porcentajePesoIdeal= (double) pesoideal/4*100;
        double porcentajeBajopeso= (double) pesobajo/4*100;
        double porcentajesobrepeso= (double) sobrepeso/4*100;
        double porcentajemayoredad = (double) mayordeedad/4*100;
        double porcentajemenordeedad=(double) menordeedad/4*100;
        
        
        // Imprimir resultados
System.out.println("Resultados:");
System.out.println("-------------");
System.out.println("Porcentaje de personas por debajo del peso ideal: " + porcentajeBajopeso + "%");
System.out.println("Porcentaje de personas por encima del peso ideal: " + porcentajesobrepeso+ "%");
System.out.println("Porcentaje de personas con el peso ideal: " + porcentajePesoIdeal+ "%");
System.out.println("Porcentaje de personas mayores de edad: " + porcentajemayoredad+ "%");
System.out.println("Porcentaje de personas menores de edad: " + porcentajemenordeedad + "%");
        
    }
    
}
