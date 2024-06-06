package parcial2;

public class Vehiculo {
    private String Marca; 
    private String Modelo; 
    private int year; 
    
    
    Vehiculo ( String Marca, String Modelo,int year){
    
    this.Marca = Marca; 
    this.Modelo = Modelo; 
    this.year = year; 
    
    }
    
    
     public void imprimirInfo (){
    
        System.out.println("Marca: "+ Marca);
        System.out.println("Modelo:"+ Modelo);
        System.out.println("Year: "+ year);
    
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getYear() {
        return year;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setYear(int year) {
        this.year = year;
    }
  
    
    
    }
   
    

