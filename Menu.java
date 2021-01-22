import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    //private Date lastUpdated = new Date;
    private String lastUpdated;

    public Menu(ArrayList<MenuItem> menuItems){
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }


    public String   getLastUpdated(){return lastUpdated;}
    public void     setLastUpdated(String newUpdate){lastUpdated = newUpdate;}
}
