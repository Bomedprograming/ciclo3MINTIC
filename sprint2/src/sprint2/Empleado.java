/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprint2;

/**
 *
 * @author Monsalve
 */
public class Empleado extends Empresa {
    
    private String nombreEmpleado;
    private String Correo;
    private String empresaEmpleado;
    private String cargo;

    public Empleado(String nombreEmpleado, String Correo, String empresaEmpleado, String cargo, String nombreEmpresa, String direccion, int telefono, int nit) {
        super(nombreEmpresa, direccion, telefono, nit);
        this.nombreEmpleado = nombreEmpleado;
        this.Correo = Correo;
        this.empresaEmpleado = empresaEmpleado;
        this.cargo = cargo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
