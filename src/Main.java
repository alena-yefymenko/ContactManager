public class Main {

    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact alena = new Contact("Alena", "alena.efimka.@gmail.com", "+37125745411");
        myContactsManager.addContact(alena);

        Contact ben = new Contact("Ben","ben.bom@gmail.com","+37112345678");
        myContactsManager.addContact(ben);

        Contact nick = new Contact("Nick", "nick.nok@gmail.com","+37112345678");
        myContactsManager.addContact(nick);

        Contact result = myContactsManager.searchContact("Ben");
       // if (result != null) {
            System.out.println(result.getEmail());
       // }


    }

}
