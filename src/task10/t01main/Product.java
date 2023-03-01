package task10.t01main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private String name;
    private final String DATA_PUBLICATION = setDataPublication();
    private final long ID_PRODUCT = setId();
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDATA_PUBLICATION() {
        return DATA_PUBLICATION;
    }

    public long getID_PRODUCT() {
        return ID_PRODUCT;
    }

    @Override
    public String toString() {
        return  "Название: " + name + "\n" +
                "Дата публицкации: " + DATA_PUBLICATION + "\n" +
                "ID: " + ID_PRODUCT + "\n" +
                "Описание: " + description + "\n";
    }

    public String printNameId() {
        return "Название: " + name + " ID: " + ID_PRODUCT;
    }

    private long setId() {
        return (long) (Math.random() * 1000000000);
    }

    private String setDataPublication() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date((long) (1212121212121L * Math.random()));
        return format.format(date);
    }
}
