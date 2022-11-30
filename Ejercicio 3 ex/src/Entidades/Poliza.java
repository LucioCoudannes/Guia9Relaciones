
package Entidades;


public class Poliza {
    
    //número de póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total 
    //asegurado, incluye granizo, monto máximo granizo, tipo de cobertura
    
    private String npoliza;
    private Integer fechaI;
    private Integer fechaF;
    private Integer cantidadC;
    private String formadepago;
    private Double MTA;
    private boolean granizo=false;
    private Integer montogranizo;
    private String tipodecobertura;
    
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Cuota cuotas;

    public Poliza() {
    }

    public Poliza(String npoliza, Integer fechaI, Integer fechaF, Integer cantidadC, String formadepago, Double MTA, boolean granizo, Integer montogranizo, String tipodecobertura, Cliente cliente, Vehiculo vehiculo, Cuota Cuotas) {
        this.npoliza = npoliza;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
        this.cantidadC = cantidadC;
        this.formadepago = formadepago;
        this.MTA = MTA;
        this.granizo = granizo;
        this.montogranizo = montogranizo;
        this.tipodecobertura = tipodecobertura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cuotas = cuotas;
        
    }

    public String getNpoliza() {
        return npoliza;
    }

    public void setNpoliza(String npoliza) {
        this.npoliza = npoliza;
    }

    public Integer getFechaI() {
        return fechaI;
    }

    public void setFechaI(Integer fechaI) {
        this.fechaI = fechaI;
    }

    public Integer getFechaF() {
        return fechaF;
    }

    public void setFechaF(Integer fechaF) {
        this.fechaF = fechaF;
    }

    public Integer getCantidadC() {
        return cantidadC;
    }

    public void setCantidadC(Integer cantidadC) {
        this.cantidadC = cantidadC;
    }

    public String getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(String formadepago) {
        this.formadepago = formadepago;
    }

    public Double getMTA() {
        return MTA;
    }

    public void setMTA(Double MTA) {
        this.MTA = MTA;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public Integer getMontogranizo() {
        return montogranizo;
    }

    public void setMontogranizo(Integer montogranizo) {
        this.montogranizo = montogranizo;
    }

    public String getTipodecobertura() {
        return tipodecobertura;
    }

    public void setTipodecobertura(String tipodecobertura) {
        this.tipodecobertura = tipodecobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cuota getCuotas() {
        return cuotas;
    }

    public void setCuotas(Cuota cuotas) {
        this.cuotas = cuotas;
    }
    
    

    @Override
    public String toString() {
        return "Poliza{" + "npoliza=" + npoliza + ", fechaI=" + fechaI + ", fechaF=" + fechaF + ", cantidadC=" + cantidadC + ", formadepago=" + formadepago + ", MTA=" + MTA + ", granizo=" + granizo + ", montogranizo=" + montogranizo + ", tipodecobertura=" + tipodecobertura + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", cuotas=" + cuotas + '}';
    }
    
    
    
    
    
    
}
