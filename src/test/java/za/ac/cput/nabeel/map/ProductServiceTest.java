package za.ac.cput.nabeel.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ProductServiceTest {


    @Test
    public void testAdd() {

        Map<Integer,Product> map = new HashMap<>();
        ProductService service = new ProductService(map);
        Product product = new Product();
        product.setName("soda");
        product.setPrice(12);
        service.add(1,product);
        assertTrue(map.containsKey(1));
        assertTrue(map.containsValue(product));
    }

    @Test
    public void testFind() {

        Map<Integer,Product> map = new HashMap<>();
        ProductService service = new ProductService(map);
        Product product = new Product();
        product.setName("soda");
        product.setPrice(12);
        service.add(1,product);

        Product newProduct = service.find(1);
        assertEquals(newProduct,product);
        System.out.println(product.getName());
    }

    @Test
    public void testRemove() {

        Map<Integer,Product> map = new HashMap<>();
        ProductService service = new ProductService(map);
        Product product = new Product();
        product.setName("soda");
        product.setPrice(12);
        service.add(1,product);

        service.remove(1);
        assertFalse(map.containsKey(1));
    }
}