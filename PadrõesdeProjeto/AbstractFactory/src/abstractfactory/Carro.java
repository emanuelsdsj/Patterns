package abstractfactory;

/**
 *
 * @author Emanuel
 */
public class Carro {
    
    Roda roda;
    Som som;
    
    public void setRoda(Roda roda){
        this.roda = roda;
    }
    
    public void setSom(Som som){
        this.som = som;
    }
    
}
