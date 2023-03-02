package task10.t01main;

import java.text.SimpleDateFormat;
import java.util.Date;

import static task10.t01main.Constants.*;

public class Product {
    private final String NAME;
    private final String DATA_PUBLICATION = setDataPublication();
    private final long ID_PRODUCT = setId();
    private final String DESCRIPTION;

    public Product(String name, String description) {
        this.NAME = name;
        this.DESCRIPTION = description;
    }

    public String getNAME() {
        return NAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public String getDATA_PUBLICATION() {
        return DATA_PUBLICATION;
    }

    public long getID_PRODUCT() {
        return ID_PRODUCT;
    }

    @Override
    public String toString() {
        return  BOOK_NAME + NAME + "\n" +
                DATE_PUBLICATION + DATA_PUBLICATION + "\n" +
                ID + ID_PRODUCT + "\n" +
                Constants.DESCRIPTION + DESCRIPTION + "\n";
    }

    public String printNameId() {
        return BOOK_NAME + NAME + " " + ID + ID_PRODUCT;
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
