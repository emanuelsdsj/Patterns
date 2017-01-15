
package AbstractFactoryConsoles;

/**
 *
 * @author Emanuel
 */
public class NintendoSwitchFactory extends VideoGameFactory{

    public Console montarConsole() {
        return new ConsoleNintendoSwitch();
    }

    public Controle montarControle() {
        return new ControleJoyCons();
    }
    
}
