public class TanqueAgua{
    private int capacidad ;
    private int cantAgua ;
    
    public TanqueAgua(){
       capacidad = 950 ;
       cantAgua = 0 ;
    }
    
    public int cantTurriles(){
        int res = capacidad/210 ;
        return res ;
    }
    
    
    public int getCantAgua(){
        return cantAgua ;
    }
    public void setCantAgua(int cantAgua){
        this.cantAgua=cantAgua ;
    }
}