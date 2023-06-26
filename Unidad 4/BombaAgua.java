public class BombaAgua{
    private int cantAguaTrans ;
    private Turril turril ;
    private TanqueAgua tanqueAgua ;
    
    public BombaAgua(){
        cantAguaTrans = 7 ;
    }
    
    public void bombear(){
        int cantAguaTurr = turril.getCantAgua() ; //210
        cantAguaTurr = cantAguaTurr - cantAguaTrans; //203
        turril.setCantAgua(cantAguaTurr) ; // mandar valor
                                      // invocando método setter
        int cantAguaTanque = tanqueAgua.getCantAgua() ; //0
        cantAguaTanque = cantAguaTanque + cantAguaTrans ; // 7
        tanqueAgua.setCantAgua(cantAguaTanque); // mandar valor
    }
    
    public int cantVecesBombear(){
        int res = 210 / cantAguaTrans ;
        return res ;
    }
    
    
    public void conectarTurril(Turril turril){
        this.turril=turril;
    }
    
    public void conectarTanque(TanqueAgua tanqueAgua){
        this.tanqueAgua = tanqueAgua ;
    }
}