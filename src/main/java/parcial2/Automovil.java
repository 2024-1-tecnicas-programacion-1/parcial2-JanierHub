package parcial2;

public class Automovil extends Vehiculo  {
      
    private int numeroPuertas; 
    private TipoCombustible tipoCombustible;
            
    public Automovil(String Marca, String Modelo, int year , int numeroPuertas) {
        super(Marca, Modelo, year);
        this.numeroPuertas = numeroPuertas;
        
    }
  
    @Override
    public void imprimirInfo() {
        super.imprimirInfo(); 
        System.out.println("Numero de puertas: " + numeroPuertas);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
 
    
    
}
