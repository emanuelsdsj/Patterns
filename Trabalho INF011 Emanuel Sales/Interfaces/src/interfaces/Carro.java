
package interfaces;

public class Carro {
    private IRoda roda;
    private IMotor motor;
    private ISom som;

    public void setRoda(IRoda roda) {
        this.roda = roda;
    }

    public void setMotor(IMotor motor) {
        this.motor = motor;
    }

    public void setSom(ISom som) {
        this.som = som;
    }
}
