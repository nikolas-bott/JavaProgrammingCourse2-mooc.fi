import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }
    
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(!(object instanceof Item)){
            return false;
        }
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }
        
        Item newItem = (Item) object;
        return Objects.equals(this.getName(), newItem.getName());
    }
        //return false;
    
        
    public int hashCode(){
        return Objects.hash(name);
    }
    

    public int getWeight() {
        return weight;
    }

}
