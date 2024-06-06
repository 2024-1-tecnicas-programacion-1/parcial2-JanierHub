package parcial2;

public class Motocicleta  extends Vehiculo {
    
    private TipoMotocicleta ipomotocicleta; 
    
    public Motocicleta(String Marca, String Modelo, int year) {
        super(Marca, Modelo, year);
    }
    
    @Override
    public void imprimirInfo() {
        super.imprimirInfo(); 
    }

    public TipoMotocicleta getIpomotocicleta() {
        return ipomotocicleta;
    }

    public void setIpomotocicleta(TipoMotocicleta ipomotocicleta) {
        this.ipomotocicleta = ipomotocicleta;
    }

    
    
}
