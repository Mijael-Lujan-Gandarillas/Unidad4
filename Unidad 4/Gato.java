public class Gato {
    private int edad ;
    private double peso ;
    private String nombre ;
    
        public Gato(int edad, double peso, String nombre){
        this.edad = edad ;
        this.peso = peso ;
        this.nombre = nombre ;
    }

    public double Getpeso(){
    return peso ;
    }
    
    public void setPeso(double valor){
        peso = valor ;
    }
}   