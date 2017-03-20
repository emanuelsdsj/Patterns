/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author thiago
 */
public class Tag implements ITag{

    private boolean collapsed;
    private String tag;
    private ArrayList<ITag> tags = new ArrayList<ITag>(); 
    
    public Tag(String tag){
        this.tag = tag;
        this.collapsed = false;
    }
    
    public void setCollapse(boolean bool) {
        this.collapsed = bool;
    }
    
    public boolean addTags(ITag tag){
        return tags.add(tag);
    }
    
    public boolean removeTags(ITag tag){
        return tags.remove(tag);
    }
    
    public void printTag(){
        System.out.println("<" + this.tag + ">");
        if(collapsed == false)
            for(ITag tag : this.tags)    
                tag.printTag();
        System.out.println("</" + this.tag + ">");
    }
    
}
