package ejerciciosunidad4;
import java.util.Scanner;
import javafx.scene.chart.Chart;
import javax.swing.*;
public class EjerciciosUnidad4 {
    
public static void main(String[] args) {
        
        int opc=0, salir =0;
        
       for(int y=0;y<3;y++){ 
            opc= Integer.parseInt(JOptionPane.showInputDialog(" Bienvenido seleccione una opcion deseada:\n"
                    
                    
                    + "1.area circulo              11.palabras mas largas y de cuantas letras es \n"
                    + "2.notas                     12.caracter de letra o numero\n"
                    + "3.centimetros a pulgadas     13.lados del triangulo\n"
                    + "4.orden inverso              14.estatura,peso,edad de una persona\n"
                    + "5.hipotenusa                 15.la tabla de  multiplicar\n"
                    + "6.hora actual                16.potencia\n"
                    + "7.parte decimal              17.suma entero\n"
                    + "8.numero par                 18.divisores\n"
                    + "9.calendario                 19.salir\n"
                    + "10.divicio exacta\n"));
                switch (opc){
                    case (1):
                        double pi=3.14;
                        double  radio = Double.parseDouble(JOptionPane.showInputDialog("ingresa el radio"));
                        double perimetro = 2*radio*pi;
                        double area = pi*Math.pow(radio,2);
                        JOptionPane.showMessageDialog(null,"perimetro"+perimetro+"\n"+"area:"+area);
                        
                        //retraso de y 
                        y=0;
                    break;
                    case (2):
                        int cal ;
                        double  suma = 0,promedio;
                        for(int i=0; i<=3;i++){
                            suma= suma + Double.parseDouble(JOptionPane.showInputDialog("ingrese la calificacion"));

                        }
                        promedio=suma/4;
                        JOptionPane.showMessageDialog(null,+promedio);
                        //retraso de y 
                        y=0;
                    break;
                    case (3):
                        
                        double cent= Double.parseDouble(JOptionPane.showInputDialog("ingrese los centimetros"));
                        double  pul= cent/2.54;     
                        JOptionPane.showMessageDialog(null,+pul);
                        //retraso de y 
                        y=0;
                    break;
                    case (4):
                        //int numeroIn= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "));
                        Invertir inv = new Invertir();
		
                        Scanner leer = new Scanner(System.in);

                        System.out.println("Ingrese numero");
                        int ingresar = leer.nextInt();

                        inv.invertir(ingresar);

                        
                        y=0;
                    break;
                    case (5):
                        double a = Double.parseDouble(JOptionPane.showInputDialog("ingrese el cateto a"));
                        double b = Double.parseDouble(JOptionPane.showInputDialog("ingrese el cateto b"));
                        double c = Math.sqrt((a*a)+ (b*b));     
                        JOptionPane.showMessageDialog(null,"la hipotenusa"+c);
                        //retraso de y 
                        y=0;
                    break;
                    case (6):
                       // Scanner	entrada = new Scanner( System.in );
		
                        HoraPresente horas = new HoraPresente();

                        //JOptionPane.showMessageDialog(null,"La Hora Actual Es?");
                       int ing = Integer.parseInt(JOptionPane.showInputDialog("La Hora Actual Es?"));

                        //JOptionPane.showMessageDialog(null,"Que hora sera dentro de");
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Que hora sera dentro de?"));


                        horas.HoraT(ing,cantidad);
		
                        y=0;
                    break;
                    case (7):
                        double decimal = Double.parseDouble(JOptionPane.showInputDialog("ingrese el decimal"));
                        JOptionPane.showMessageDialog(null,"el decimal es   "+(decimal/10));
                        //retraso de y 
                        y=0;     
                    break;
                    case (8):
                        int numero= Integer.parseInt(JOptionPane.showInputDialog("ingres un numero  "));  
                        if (numero%2==0)
                           JOptionPane.showMessageDialog(null,"El número es par");
                        else
                            JOptionPane.showMessageDialog(null,"El número es impar");
                          //retraso de y 
                        y=0;
                    break;
                    case (9):
                         int año= Integer.parseInt(JOptionPane.showInputDialog("que año quiere saber "));
                            
                         if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
                               JOptionPane.showMessageDialog(null,"El año es bisiesto");
                        else
                               JOptionPane.showMessageDialog(null,"El año no es bisiesto");

                        
                        //retraso de y 
                        y=0;
                    break;
                    case (10):
                        //retraso de y 
                        y=0;
                    break;
                    case (11): 
                        String palabra1=  JOptionPane.showInputDialog("ingrese una palbra");
                        String palabra2=  JOptionPane.showInputDialog("ingrese una palabra");
                        int largo;
                        if (palabra1.length()<palabra2.length()){
                            largo=palabra2.length();
                            JOptionPane.showMessageDialog(null,"la palabra "+ palabra2+ "  es la mas larga con "+ largo);                            
                            
                        }
                        else {
                            largo=palabra1.length();
                            JOptionPane.showMessageDialog(null,"la palabra "+ palabra1+ "  es la mas larga "+ largo);

                        }
                        //retraso de y 
                        y=0;
                    break;
                    case (12):
                        
                        String dato= JOptionPane.showInputDialog("ingrese un dato");
                        int codigo;
                        codigo= dato.hashCode();
                        //JOptionPane.showMessageDialog(null,codigo);
                        if (codigo>=48 && codigo <=57){
                            JOptionPane.showMessageDialog(null,"es un numero el que ingresaste");
                        }
                        else{
                            if (codigo>=65 && codigo<=90 || codigo>=97 && codigo<=122 ){
                                if(codigo>=65 && codigo<=90){
                                    JOptionPane.showMessageDialog(null,"es una letra mayuscula la que ingresaste ");
                                }
                                else{
                                     JOptionPane.showMessageDialog(null,"es una letra minuscula la que ingresaste ");
                                }
                            }
                            else{
                                 JOptionPane.showMessageDialog(null,"lo que ingresaste no es una letra ni un numero o  es una cadena ");
                            } 
                                
                        }
                        //retraso de y 
                        y=0;
                    break;
                    case (13):
                        int ladoa, ladob, ladoc;
                        ladoa= Integer.parseInt(JOptionPane.showInputDialog("ingrese lado a"));
                        ladob= Integer.parseInt(JOptionPane.showInputDialog("ingrese lado b"));
                        ladoc= Integer.parseInt(JOptionPane.showInputDialog("ingrese lado c"));
                        // comparacion de triangulo equilatero
                        if(ladoa==ladob && ladoa==ladoc){
                            JOptionPane.showMessageDialog(null,"es un triangulo equilatero ");
                        }
                        // triangulo isoseles 
                        if (ladoa == ladob){
                            JOptionPane.showMessageDialog(null,"es un triangulo isoseles ");
                        }
                        else{
                            if(ladoa==ladoc){
                                JOptionPane.showMessageDialog(null,"es un triangulo isoseles ");
                            }
                            else{
                                if(ladoc==ladob){
                                    JOptionPane.showMessageDialog(null,"es un triangulo isoseles ");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"es un triangulo escaleno ");
                                }
                            }
                        }
 
                        //retraso de y 
                        y=0;
                    break;
                    case (14):
                        int peso , edad;
                        double  masa, estatu;
                        String condicion;
                        peso = Integer.parseInt(JOptionPane.showInputDialog("ingrese el peso en kilos"));
                        estatu = Double.parseDouble(JOptionPane.showInputDialog("ingrese la estatura "));
                        edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad "));
                        masa= peso/(estatu*estatu);
                        JOptionPane.showMessageDialog(null,"su IMC es:\n "+ masa);
                        if (masa <= 22.0 && edad<45){
                            JOptionPane.showMessageDialog(null,"es bajo o medio riesco de enfermedades  ");
                        }else{
                            if(masa>22 && edad <=95){
                                JOptionPane.showMessageDialog(null,"es medio alto riesco de enfermedades  ");
                            }
                        }
                        //retraso de y 
                        y=0;
                    break;
                    case (15):
                        int mult=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
                        JOptionPane.showMessageDialog(null,"la tabla de multiplicar del "+(mult)+"es:\n\n"
                                + mult +"*1=" + mult*1+"\n"
                                + mult +"*2=" + mult*2+"\n"
                                + mult +"*3=" + mult*3+"\n"
                                + mult +"*4=" + mult*4+"\n"
                                + mult +"*5=" + mult*5+"\n"
                                + mult +"*6=" + mult*6+"\n"
                                + mult +"*7=" + mult*7+"\n"
                                + mult +"*8=" + mult*8+"\n"
                                + mult +"*9=" + mult*9+"\n"
                                + mult +"*10=" + mult*10+"\n");
                        //retraso de y 
                        y=0;
                    break;
                    case (16):
                        int cuadrado = 1;
                        int numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese la n potencia deseada"));
                        System.out.print("\n2^0= "+cuadrado);
 
                        for(int q=0;q<numero;q++){
                            cuadrado= cuadrado*2;
                            System.out.print("\n2^"+(q+1)+"= "+cuadrado);
                        }
                        
                        
                        //retraso de y 
                        y=0;
                    break;
                    case (17):
                        
                        int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 1"));
                        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 2"));
                        int sum= 0;
                        for(int q=num1;q<=num2;q++){
                            sum= sum + q;
                            
                        }
                        JOptionPane.showMessageDialog(null,"el decimal es   "+(sum));
                        
                        
                        //retraso de y 
                        y=0;
                    break;
                    case (18):
                        int numeroDi=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero "));
                        System.out.print("los divisores del "+ numeroDi+" son:\n");
 
                        for (int w=1;w<=numeroDi;w++){
                            //System.out.print(w+"\nfsdsdf"); 
                            if ((numeroDi%w)== 0){
                                System.out.print("\n"+w);
 
                                
                            }
                            
                        }
                         
                        
                        //retraso de y 
                        y=0;
                    break;
                    case (19):
                        y=4;


                    break;

                 
                }
           }  
       }
   }

        
    


