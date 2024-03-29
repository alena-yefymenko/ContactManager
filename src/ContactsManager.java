import javax.swing.*;

public class ContactsManager {
    Contact[] myFriends;
    int friendsCount;

    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            Contact contact = myFriends[i];
            if (contact.getName().equals(searchName)) {
                return contact;
            }

        }

        return null;
    }

}
