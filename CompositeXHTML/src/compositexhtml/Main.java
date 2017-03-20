/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositexhtml;

import composite.Tag;
import composite.Texto;

/**
 *
 * @author thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Tag html = new Tag("html");
        Tag div = new Tag("div");
        Tag p = new Tag("p");
        Texto text = new Texto("Ola galera");
        
        html.setCollapse(false);
        div.setCollapse(false);
        p.setCollapse(false);
        
        html.addTags(div);
        div.addTags(p);
        p.addTags(text);
        
        html.printTag();
    }
    
}
