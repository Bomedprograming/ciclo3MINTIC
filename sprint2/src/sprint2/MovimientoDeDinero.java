/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprint2;

/**
 *
 * @author Monsalve
 */
public class MovimientoDeDinero extends Empresa {
    private double montoMovimiento;
    private String tipoDeMoviento;
    private String usuario;

    public MovimientoDeDinero(double montoMovimiento, String tipoDeMoviento, String usuario, String nombreEmpresa, String direccion, String telefono, String nit) {
        super(nombreEmpresa, direccion, telefono, nit);
        this.montoMovimiento = montoMovimiento;
        this.tipoDeMoviento = tipoDeMoviento;
        this.usuario = usuario;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getTipoDeMoviento() {
        return tipoDeMoviento;
    }

    public void setTipoDeMoviento(String tipoDeMoviento) {
        this.tipoDeMoviento = tipoDeMoviento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    
    
    
}
