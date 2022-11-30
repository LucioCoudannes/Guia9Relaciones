
package Entidades;


public class Cuota {
    //número de cuota, monto total cuota, si está o no pagada, fecha de vencimiento, forma de pago
    
    private Integer ncouta;
    private Integer vcouta;
    private boolean pago;
    private String fechadevenc;
    private String formadepago;

    public Cuota() {
    }

    public Cuota(Integer ncouta, Integer vcouta, boolean pago, String fechadevenc, String formadepago) {
        this.ncouta = ncouta;
        this.vcouta = vcouta;
        this.pago = pago;
        this.fechadevenc = fechadevenc;
        this.formadepago = formadepago;
    }

    public Integer getNcouta() {
        return ncouta;
    }

    public void setNcouta(Integer ncouta) {
        this.ncouta = ncouta;
    }

    public Integer getVcouta() {
        return vcouta;
    }

    public void setVcouta(Integer vcouta) {
        this.vcouta = vcouta;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getFechadevenc() {
        return fechadevenc;
    }

    public void setFechadevenc(String fechadevenc) {
        this.fechadevenc = fechadevenc;
    }

    public String getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(String formadepago) {
        this.formadepago = formadepago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "ncouta=" + ncouta + ", vcouta=" + vcouta + ", pago=" + pago + ", fechadevenc=" + fechadevenc + ", formadepago=" + formadepago + '}';
    }
    
    
    
    
    
}
