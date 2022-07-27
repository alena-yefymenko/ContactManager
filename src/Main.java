public class Main {

    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact contact = new Contact();
        contact.name = "Alena";
        contact.phoneNumber = "+37125745411";
        myContactsManager.addContact(contact);

        contact = new Contact();
        contact.name = "Ben";
        contact.phoneNumber = "+37112345678";
        myContactsManager.addContact(contact);

        contact = new Contact();
        contact.name = "Nick";
        contact.phoneNumber = "+37112345678";
        myContactsManager.addContact(contact);

        Contact result = myContactsManager.searchContact("Alena");
        System.out.println(result.phoneNumber);

    }

}
