
package parcial1g2;

import java.util.Scanner;

public class App {

    ////ZONA DE FUNCIONES
 
        ///Primera función rodamiento
        public static double calcularTasaRodamiento(String decada, int avaluo){
            try {
                ///Declaracion de variables
                    double precioConTasaRodamiento = 0;
    
                ///Condicionales para determinar tasas
            
                    if(decada.equals("90")){
                        precioConTasaRodamiento = avaluo * 0.0409;
                    }
                    else if(decada.equals("00")){
                        precioConTasaRodamiento = avaluo * 0.0434;
                    }
                    else if(decada.equals("10")){
                        precioConTasaRodamiento = avaluo * 0.0493;
                    }
                    else if(decada.equals("20")){
                        precioConTasaRodamiento = avaluo * 0.05680;
                    }
                    else if(decada.equals("otra")){
                        precioConTasaRodamiento = avaluo * 0.06;
                    }
                    else{
                        precioConTasaRodamiento = -1;
                    }
    
                    return precioConTasaRodamiento;
    
            } catch (Exception e) {
                return -1;
            }
 
        }
 
        ///Segunda funcion seguro 
        public static double calcularTasaSeguro(String decada, int avaluo ){
            try {
                ///Declaracion de variables
                    double precioConTasaSeguro = 0;
 
                ///Condicionales para determinar tasas
               
                    if(decada.equals("90")){
                        precioConTasaSeguro = avaluo * 0.00816;
                    }
                    else if(decada.equals("00")){
                        precioConTasaSeguro = avaluo * 0.00798;
                    }
                    else if(decada.equals("10")){
                        precioConTasaSeguro = avaluo * 0.00712;
                    }
                    else if(decada.equals("20")){
                        precioConTasaSeguro = avaluo * 0.00699;
                    }
                    else if(decada.equals("otra")){
                        precioConTasaSeguro = avaluo * 0.009;
                    }
                    else{
                        precioConTasaSeguro =-1;
                    }
    
                    return precioConTasaSeguro;
 
            } catch (Exception e) {
                return -1;
            }
 
        }

        public static int calcularTotalImpuestos(String decada, int avaluo){
            ///Datos
                double resultadoRodamientoFUno = 0;
                double resultadoSeguroFDos = 0;
                int resultadoTotalImpuestosFTres = 0;

            //Proceso
                resultadoRodamientoFUno = calcularTasaRodamiento(decada, avaluo);
                resultadoSeguroFDos = calcularTasaSeguro(decada, avaluo);
                resultadoTotalImpuestosFTres = (int)resultadoRodamientoFUno + (int)resultadoSeguroFDos;

            //Resultado
                return resultadoTotalImpuestosFTres;
        }

    
    public static void main(String[] args) {
        
        // Logica de solución
            try {

                ////Datos de entrada
                    double cantidadVehiculos = 0;
                    String decadaCarro = "";
                    int avaluoCarro = 0;


                ///Datos de salida
                    int resultadoTotalDeImpuestos = 0;


                    ///Llamada al Scanner
                        Scanner sc = new Scanner(System.in);

                    //Solicitud de dato al usuario
                        System.out.println("Ingrese la cantidad de vehiculos que desea procesar");
                        cantidadVehiculos = sc.nextInt();
                        sc.nextLine();

                    ////Implementacion del ciclo
                        for(int i = 1; i <= cantidadVehiculos; i ++){


                    ////Estructura a repetir las veces determinadas por el usuario

                        //Solicitud de datos al usuario
                            System.out.println("Ingrese la decada del carro: ");
                            decadaCarro = sc.nextLine();

                            System.out.println("Ingrese el avaluo del carro");
                            avaluoCarro = sc.nextInt();
                            sc.nextLine();
                        
                        ///INVOCACION de la función
                            //Dato de salida    =        funcion        (1variable main, 2variable main)
                            resultadoTotalDeImpuestos = calcularTotalImpuestos(decadaCarro, avaluoCarro);



                        ////Resultado Final 
                            System.out.println("Vehículo " + i +"\n Decada del modelo: "+ decadaCarro+"\n Avalúo:"+ avaluoCarro +"\n Total a Pagar: "+ resultadoTotalDeImpuestos);

                }

                
            } catch (Exception e) {
                
            }
        
    }

}
