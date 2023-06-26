public class Turril{
    private int capacidad , cantAgua ;
    
    public Turril(){
        capacidad = 210 ;
        cantAgua = 0 ;
    }

    public void cargarAgua(){
        cantAgua = capacidad ;
    }
    
    public int getCapacidad(){
        return capacidad ;
    }
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad ;
    }
    
    public int getCantAgua(){
        return cantAgua ;
    }
    public void setCantAgua(int cantAgua){
        this.cantAgua=cantAgua ;
    }
}