package za.ac.cput.nabeel.list;


import java.util.ArrayList;
import java.util.List;

public class ItemService {

    private List<Item> list;

    public ItemService(){

        list= new ArrayList<Item>(){};
    }

    public ItemService(List<Item> list){

        this.list = list;

    }

    public void add(Item item){

        //System.out.println(item.getName());
        list.add(item);

    }

    public Item find(String name){

        for(Item item: list){
            if (item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

    public void remove(Item item){
        //System.out.println("Removing item with id:" + itemId);
        list.remove(item);
    }
}
