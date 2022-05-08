/*
Nombre: Casillas Garcia Alberto Isai
Grupo: TCI 9-3
Matricula: 2019030596
 */
package tarea1;

/**
 *
 * @author ISAI
 */
public class Boletos {
    
    //ATRIBUTOS
    private int numBoleto;
    private String nomCliente;
    private String destino;
    private int tipoViaje;
    private float precio;
    private String fecha;
    
    // MÉTODOS
    // Constructores
    // Constructor vacío
    public Boletos() {
        
    }
    
    // Constructor de parámetros
    public Boletos(int numBoleto, String nomCliente, String destino, int tipoViaje, float precio, String fecha){
        this.numBoleto = numBoleto;
        this.nomCliente = nomCliente;
        this.destino = destino;
        this.tipoViaje = tipoViaje;
        this.precio = precio;
        this.fecha = fecha;
    }
    
    // Constructor de copia
    public Boletos(Boletos boletos) {
        
    }

    /**
     * @return the numBoleto
     */
    public int getNumBoleto() {
        return numBoleto;
    }

    /**
     * @param numBoleto the numBoleto to set
     */
    public void setNumBoleto(int numBoleto) {
        this.numBoleto = numBoleto;
    }

    /**
     * @return the nomCliente
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * @param nomCliente the nomCliente to set
     */
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the tipoViaje
     */
    public int getTipoViaje() {
        return tipoViaje;
    }

    /**
     * @param tipoViaje the tipoViaje to set
     */
    public void setTipoViaje(int tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public float calcularSubtotal() {
        float subTotal= 0.0f;
        
        if(this.tipoViaje==1)
            subTotal = this.precio;
        
        if (this.tipoViaje==2) 
            subTotal = this.precio * 1.8f;
        
        return subTotal;
        
    }
    
    public float calcularImpuesto() {
        return this.calcularSubtotal() * 0.16f;
        
    }
    
    public float calcularDescuento(int edad) {
        float descuento = 0.0f;
        
        if(edad>=60)
            descuento = this.calcularSubtotal() * 0.50f;
        
        return descuento;
        
    }
    
    public float calcularTotal(int edad) {
        float total = 0.0f;
        total = (this.calcularSubtotal() - this.calcularDescuento(edad)) + this.calcularImpuesto();
        return total;
    }
    
}
