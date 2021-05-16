package za.ac.cput.nabeel.list;

public class Item {

    private String name;
    private String desc;

    public Item(){}

    public Item(String name, String desc){
        this.name=name;
        this.setDesc(desc);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
