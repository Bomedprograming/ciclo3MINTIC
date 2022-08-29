/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprint2;
import java.util.Scanner;

/**
 *
 * @author anaus
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //EMPRESA
        System.out.println("Digite el nombre de la empresa: ");
        String nombreEmpresa = sc.next();
        System.out.println("Digite dirección de la empresa: ");
        String direccion = sc.next();
        System.out.println("Digite el teléfono de la empresa: ");
        int telefono = sc.nextInt();
        System.out.println("Digite el NIT de la empresa: ");
        int nit = sc.nextInt();
        Empresa empresa1 = new Empresa(nombreEmpresa, direccion, telefono, nit) ;
        System.out.println("La empresa numero 1 es: " + empresa1.getNombreEmpresa());
        System.out.println("La dirección de la empresa numero 1 es: " + empresa1.getDireccion());
        System.out.println("El teléfono numero 1 es: " + empresa1.getTelefono());
        System.out.println("El nit de la empresa numero 1 es: " + empresa1.getNit());
        
        
        //EMPLEADO
         System.out.println("Digite el nombre del empleado: ");
        String nombreEmpleado = sc.next();
        System.out.println("Digite el correo del empleado: ");
        String Correo = sc.next();
        System.out.println("Digite la empresa de trabajo: ");
        String empresaEmpleado = sc.next();
        System.out.println("Digite cargo que desempeña el empleado: ");
        String cargo = sc.next();
        Empleado empleado1 = new Empleado(nombreEmpleado, Correo, empresaEmpleado, cargo,nombreEmpresa, direccion, telefono, nit) ;
        System.out.println("El empleado numero 1 es: " + empleado1.getNombreEmpleado());
        System.out.println("El correo del empleado numero 1 es: " + empleado1.getCorreo());
        System.out.println("La empresa donde trabaja el empleado numero 1 es: " + empleado1.getEmpresaEmpleado());
        System.out.println("El cargo del empleado numero 1 es: " + empleado1.getCargo());
        
        //MOVIMIENTO DE DINERO
        System.out.println("Digite el monto del movimiento (Numeros): ");
        double montoMovimiento = sc.nextDouble();
        System.out.println("Digite el tipo de movimiento: ");
        String tipoDeMoviento = sc.next();
        System.out.println("Digite el usuario: ");
        String usuario = sc.next();
        MovimientoDeDinero mdd1 = new MovimientoDeDinero(montoMovimiento, tipoDeMoviento, usuario, nombreEmpresa, direccion, telefono, nit) ;
        System.out.println("El movimiento numero 1 es: " + mdd1.getMontoMovimiento());
        System.out.println("El tipo de movimiento numero 1 es: " + mdd1.getTipoDeMoviento());
        System.out.println("El usuario del movimiento numero 1 es: " + mdd1.getUsuario());
        
    }
}
