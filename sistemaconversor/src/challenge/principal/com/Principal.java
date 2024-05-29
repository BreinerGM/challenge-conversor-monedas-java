package challenge.principal.com;

import challenge.conversor.com.Conversor;
import challenge.datos.com.Conversion;
import challenge.datos.com.ConversionER;
import challenge.generador.com.GeneradorDeArchivo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) throws IOException {
        GeneradorDeArchivo generadorArc = new GeneradorDeArchivo();
        Conversor conversor = new Conversor();
        List<Conversion> conversiones = new ArrayList<>();
        Scanner  ingreso = new Scanner(System.in);
        int opcion;
        int valor = 0;
        boolean flag = true;
        String menu = "******** M E N U    P R I N C I P A L ********"+"\n"+
                        "BIENVENIDO AL CONVERSOR DE MONEDAS BIGMONEY"+"\n"+
                        "1. Dólar ====>> Peso Argentino"+"\n"+
                        "2. Peso argentino ====>> Dólar"+"\n"+
                        "3. Dólar ====>> Real Brasileño"+"\n"+
                        "4. Real Brasileño ====>> Dólar"+"\n"+
                        "5. Dólar ====>> Peso Colombiano"+"\n"+
                        "6. Peso Colombiano ====>> Dólar"+"\n"+
                        "7. Salir"+"\n"+
                        "Elija una opción válida:  "+"\n"+
                      "**********************************************";
        do {
            try {
                System.out.println(menu);
                opcion = Integer.valueOf(ingreso.nextLine());
                Conversion conversion = new Conversion();
                ConversionER conver = new ConversionER(" ", "", 0, 0);
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese cuanto valor desea convertir: ");
                        valor = Integer.valueOf(ingreso.nextLine());
                        conver = conversor.conversorMon("USD", "ARS", valor);
                        conversion = new Conversion(conver);
                        System.out.println("El valor de " + valor + ".0 [" + conversion.getMonedaBase() + "]" + " corresponde al valor final de: " + conversion.getResultadoConversion() + "[" + conversion.getMonedaDeDestino() + "]");
                        System.out.println("/////////////////////////////////////////////////////////////");
                        conversiones.add(conversion);
                        generadorArc.guardarJson(conversiones);
                        break;
                    case 2:
                        System.out.println("Ingrese cuanto valor desea convertir: ");
                        valor = Integer.valueOf(ingreso.nextLine());
                        conver = conversor.conversorMon("ARS", "USD", valor);
                        conversion = new Conversion(conver);
                        System.out.println("El valor de " + valor + ".0 [" + conversion.getMonedaBase() + "]" + " corresponde al valor final de: " + conversion.getResultadoConversion() + "[" + conversion.getMonedaDeDestino() + "]");
                        System.out.println("/////////////////////////////////////////////////////////////");
                        conversiones.add(conversion);
                        generadorArc.guardarJson(conversiones);
                        break;
                    case 3:
                        System.out.println("Ingrese cuanto valor desea convertir: ");
                        valor = Integer.valueOf(ingreso.nextLine());
                        conver = conversor.conversorMon("USD", "BRL", valor);
                        conversion = new Conversion(conver);
                        System.out.println("El valor de " + valor + ".0 [" + conversion.getMonedaBase() + "]" + " corresponde al valor final de: " + conversion.getResultadoConversion() + "[" + conversion.getMonedaDeDestino() + "]");
                        System.out.println("/////////////////////////////////////////////////////////////");
                        conversiones.add(conversion);
                        generadorArc.guardarJson(conversiones);
                        break;
                    case 4:
                        System.out.println("Ingrese cuanto valor desea convertir: ");
                        valor = Integer.valueOf(ingreso.nextLine());
                        conver = conversor.conversorMon("BRL", "USD", valor);
                        conversion = new Conversion(conver);
                        System.out.println("El valor de " + valor + ".0 [" + conversion.getMonedaBase() + "]" + " corresponde al valor final de: " + conversion.getResultadoConversion() + "[" + conversion.getMonedaDeDestino() + "]");
                        System.out.println("/////////////////////////////////////////////////////////////");
                        conversiones.add(conversion);
                        generadorArc.guardarJson(conversiones);
                        break;
                    case 5:
                        System.out.println("Ingrese cuanto valor desea convertir: ");
                        valor = Integer.valueOf(ingreso.nextLine());
                        conver = conversor.conversorMon("USD", "COP", valor);
                        conversion = new Conversion(conver);
                        System.out.println("El valor de " + valor + ".0 [" + conversion.getMonedaBase() + "]" + " corresponde al valor final de: " + conversion.getResultadoConversion() + "[" + conversion.getMonedaDeDestino() + "]");
                        System.out.println("/////////////////////////////////////////////////////////////");
                        conversiones.add(conversion);
                        generadorArc.guardarJson(conversiones);
                        break;
                    case 6:
                        System.out.println("Ingrese cuanto valor desea convertir: ");
                        valor = Integer.valueOf(ingreso.nextLine());
                        conver = conversor.conversorMon("COP", "USD", valor);
                        conversion = new Conversion(conver);
                        System.out.println("El valor de " + valor + ".0 [" + conversion.getMonedaBase() + "]" + " corresponde al valor final de: " + conversion.getResultadoConversion() + "[" + conversion.getMonedaDeDestino() + "]");
                        System.out.println("/////////////////////////////////////////////////////////////");
                        conversiones.add(conversion);
                        generadorArc.guardarJson(conversiones);
                        break;
                    case 7:
                        flag = false;
                        break;
                }
            }catch (NumberFormatException ex){
                System.out.println("El valor que ingreso es erroneo "+ex.getMessage());
            }catch (RuntimeException | IOException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicacion.");
            }
        }while (flag);

    }
}
