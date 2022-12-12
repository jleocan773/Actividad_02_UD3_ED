/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Ana
 * @author Jonathan 
 * @version 12/09/2022
 * 
 */
public class CCuenta {

    /**
     *
     */
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     */
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Identificación de la cuenta
    * @param sal Saldo de la cuenta
    * @param tipo Tipo interés de la cuenta
    *
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * Se crean los setters y getters para el @param nom 
     * @param nom
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     *
     * @return
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     *
     * @return
     */
    public double estado ()
    {
        return saldo;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     *
     * @return
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * 
   * Se crean los setters para @param cuenta y @param saldo  
     * @param cuenta
   */
  
    public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
   * 
   * Se crean el setter y getter para @param tipo  
     * @return 
   */

  public double getTipoInterés() {
    return tipoInterés;
  }

    /**
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
