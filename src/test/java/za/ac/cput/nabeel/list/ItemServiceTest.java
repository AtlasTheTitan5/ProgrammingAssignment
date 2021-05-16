package za.ac.cput.nabeel.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ItemServiceTest {

    @Test
    public void testAddToList() {


        List<Item> list = new ArrayList<>();
        ItemService service = new ItemService(list);
        Item item = new Item();
        Item item2 = new Item();
        item.setName("corn");
        service.add(item);
        assertTrue(list.contains(item));
    }

    @Test
    public void testFindInList() {


        List<Item> list = new ArrayList<>();
        ItemService service = new ItemService(list);
        Item item = new Item();
        item.setName("grapes");
        item.setDesc("green");
        service.add(item);
        Item newItem = service.find("grapes");
        assertEquals(newItem,item);
        System.out.println(item.getName());
    }

    @Test
    public void testRemoveFromList() {

        List<Item> list = new ArrayList<>();
        ItemService service = new ItemService(list);
        Item item = new Item();
        item.setName("pear");
        item.setDesc("old");
        service.add(item);

        Item item2 = new Item();
        item2.setName("apple");
        item2.setDesc("green");
        service.add(item2);

        Item item3 = new Item();
        item3.setName("grape");
        item3.setDesc("purple");
        service.add(item3);

        service.remove(item);
        assertFalse(list.contains(item));
        System.out.println("contains "+item.getName() + " > "+ list.contains(item));
        System.out.println("contains " +item2.getName() + " > "+ list.contains(item2));
        System.out.println("contains " +item3.getName() + " > "+ list.contains(item3));
    }
}