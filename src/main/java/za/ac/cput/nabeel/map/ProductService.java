package za.ac.cput.nabeel.map;

import java.util.HashMap;
import java.util.Map;

public class ProductService {


    private Map<Integer,Product> map;

    public ProductService(){

        map= new HashMap<>();
    }

    public ProductService(Map<Integer,Product> map){

        this.map = map;

    }

    public void add(int id, Product product){

        //System.out.println("Adding product: "+product.getName()+" for price: R" + product.getPrice() + " with id:" + id);
        map.put(id,product);

    }

    public Product find(int id){
       // System.out.println("Finding product with id:" + id);
        return map.get(id);
    }

    public void remove(int id){
        //System.out.println("Removing product with id:" + id);
        map.remove(id);
    }


}
