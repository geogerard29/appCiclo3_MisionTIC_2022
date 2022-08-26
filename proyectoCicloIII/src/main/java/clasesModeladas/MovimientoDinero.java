package clasesModeladas;

public class MovimientoDinero {

    // Agregar los atributos de MovimientoDinero:  monto
    String Concepto;
    Double Monto;
    String Usuario;
    String TipoMov;

    // Agregar metodo constructor
   public MovimientoDinero(String Concepto, Double Monto, String Usuario, String TipoMov) {
        this.Concepto = Concepto;
        this.Monto = Monto;
        this.Usuario = Usuario;
        this.TipoMov = TipoMov;
    }

    /*
    Para la creacion de montos positivos y negativos,
    una idea serìa crear un metodo que se llame ingresos (para crear montos positivos),
    y otro que se llame Egresos (para crear montos negativos cuando el retiro exceda le valor inicial
     */
    
    
    // Agregar getters y setters
    
     public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
        public String getTipoMov() {
        return TipoMov;
    }

    public void setTipoMov(String TipoMov) {
        this.TipoMov = TipoMov;
    }
    
}
