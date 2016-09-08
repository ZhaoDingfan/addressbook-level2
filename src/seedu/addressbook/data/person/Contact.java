package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
    private final String value;
    private boolean isPrivate;
    
    public Contact(String contact, boolean isPrivate) {
        this.isPrivate = isPrivate;
        contact = contact.trim();
        this.value = contact;
    }
    
    public String toString() {
        return value;
    }
    
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }
    
    public int hashCode() {
        return value.hashCode();
    }


    public boolean isPrivate() {
        return isPrivate;
    }
}
