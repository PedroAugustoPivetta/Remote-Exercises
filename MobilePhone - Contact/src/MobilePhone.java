import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName())  > -1 ){
            System.out.println("THIS CONTACT ALREADY EXISTS");
            return false;
        }
           this.myContacts.add(contact);
           System.out.println("CONTACT ADDED SUCCESSFULLY");
           return true;

    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (this.myContacts.contains(oldContact)){
            this.myContacts.set(findContact(oldContact), newContact);
            System.out.println("CONTACT REPLACED SUCCESSFULLY");
            return true;
        }
        System.out.println("CONTACT NOT FOUND");
        return false;
    }

    public boolean removeContact(Contact contact){
        if (this.myContacts.contains(contact)) {
            this.myContacts.remove(contact);
            System.out.println("CONTACT REMOVED SUCCESSFULLY");
            return true;
        }
        System.out.println("CONTACT NOT FOUND");
        return false;
    }

    private int findContact(Contact contact){
            return this.myContacts.indexOf(contact);
    }

    private int findContact(String information){
        for (Contact c : this.myContacts){
            if (Objects.equals(c.getName(), information) || (Objects.equals(c.getPhoneNumber(), information))){
                return this.myContacts.indexOf(c);
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        return this.myContacts.get(findContact(name));
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (Contact c : this.myContacts){
            System.out.println(findContact(c) + 1 + "." + " " + c.getName() + " -> " + c.getPhoneNumber());
        }
    }

}
