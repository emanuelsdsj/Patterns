/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author emanuelssj
 */
public abstract class WindowAbstract {
    protected IPlatform platform;

    public void setPlatform(IPlatform platform) {
        this.platform = platform;
    }
    
    public abstract void show();
    
}
