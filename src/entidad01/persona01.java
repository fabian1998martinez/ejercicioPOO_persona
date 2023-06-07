
package entidad01;

import java.util.Scanner;
public class persona01 {
        /* Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
       sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
       atributo, puede hacerlo. Los métodos que se implementarán son:*/
     
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    
/* Un constructor por defecto.*/
    public persona01(){};
    
/* Un constructor con todos los atributos como parámetro. *//* Un constructor con todos los atributos como parámetro. */

    public persona01(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    /* Métodos getters y setters de cada atributo. */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
      al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
      Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
      O. Si no es correcto se deberá mostrar un mensaje*/
    
    public void crearPersona(){
      Scanner leer = new Scanner(System.in); 
       System.out.println("Ingrese su nombre ");
       String nombre = leer.nextLine();
       System.out.println("Ingrese su edad ");
       int edad = leer.nextInt();
       System.out.println("Ingrese el numero correcto . M / H u o");
        char sexo= leer.next().charAt(0);
       System.out.println("Ingrese su peso ");
       double peso = leer.nextDouble();
       System.out.println("Ingrese su altura ");
       double altura = leer.nextDouble();
       
       this.nombre = nombre;
       this.edad = edad;
       this.sexo = sexo;
       this.peso = peso;
       this.altura = altura;
       
       while(sexo != 'M' && sexo != 'H' && sexo != 'O'){
                System.out.println("Sexo incorrecto. Ingrese el sexo nuevamente (H, M, O): ");
                 sexo= leer.next().charAt(0);  
                 
       };
        sexo = sexo;
     
     System.out.println("Persona creada exitosamente.");
    }
    /* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
     kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
     significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
     Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
     persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
     de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
     función devuelve un 1.*/
    public int calcularImc(){
       double calculoimc = peso / (altura*altura);
      
       if(calculoimc < 20){
          System.out.println("Estas por de debajo de tu peso ideal");
          return -1;
       }else if (calculoimc >=20 && calculoimc <=25){
         System.out.println("Estas en tu peso ideal");
         return 0;
         
       }else {
           System.out.println("tienes sobre peso!!");
          return 1;
         
       }
    };
    
   /*  Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
         devuelve un booleano.*/
    
    public boolean esMayorDeEdad(){
      
        if(edad >=18){
            System.out.println("Es mayor de edad");
          return true;
        }else{
            System.out.println("Es menor de edad");
          return false;
        }
    
    }
}
