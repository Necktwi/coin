
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya gowtham kudupudi
 * @date 2013-03-07 19:57:00
 */
@javax.faces.bean.ManagedBean
@javax.faces.bean.ApplicationScoped
public class Game {
    public Game(){
        tossCoin();
        colors.add(new SelectItem("red"));
        colors.add(new SelectItem("green"));
        colors.add(new SelectItem("blue"));
    }
    private Coin face;
    private List<SelectItem> colors = new ArrayList<SelectItem>();
    private String color;
    
    public void setFace(Coin face){
        this.face=face;
    }
    public Coin getFace(){
        return this.face;
    }
    public String tossCoin(){
        if(Math.random()>=0.5){
            setFace(Coin.HEAD);
        }else{
            setFace(Coin.TAIL);
        }
        return "index";
    }
    
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public List<SelectItem> getColors(){
        return this.colors;
    }
}

enum Coin{
    HEAD,TAIL
}
