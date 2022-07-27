public class Main {

    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact alena = new Contact("Alena", "", "+37125745411");
        myContactsManager.addContact(alena);

        Contact ben = new Contact("Ben","","+37112345678");
        myContactsManager.addContact(ben);

        Contact nick = new Contact("Nick", "","+37112345678");
        myContactsManager.addContact(nick);

        Contact result = myContactsManager.searchContact("Alena");
       // if (result != null) {
            System.out.println(result.getPhoneNumber());
       // }


    }

}
