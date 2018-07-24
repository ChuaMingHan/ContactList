package sg.edu.rp.c346.contactlist;

/**
 * Created by 17010265 on 07/24/2018.
 */

public class ContactsItem {

    private String name;
    private int code;
    private int number;

    public ContactsItem(String name, int code, int number) {
        this.name = name;
        this.code = code;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ContactsItem{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", number=" + number +
                '}';
    }
}


