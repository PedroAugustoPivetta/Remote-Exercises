//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    MobilePhone phone = new MobilePhone("12346567898");
    phone.addNewContact(Contact.createContact("Clara", "123456"));
    phone.addNewContact(Contact.createContact("Clara", "123456"));

    }
}