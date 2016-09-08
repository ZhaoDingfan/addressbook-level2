package seedu.addressbook.data.person;

import seedu.addressbook.data.person.Person;

public class Tagging {
    private Person person;
    private Tag tag;
    private String status;
    
    private static final String TAG_ADD = "+";
    private static final String TAG_REMOVE = "-";
    
    public Tagging(Person person, Tag tag, String status) {
    	this.person = person;
    	this.tag = tag;
    	this.status = status;
    }
    
    public String toString() {
    	StringBuilder tagging = new StringBuilder();
    	if(status == "ADD") {
    		tagging.append(TAG_ADD);
    	} else {
    		tagging.append(TAG_REMOVE);
    	}
    	tagging.append(person.getName().toString());
    	tagging.append(" ");
    	tagging.append(tag.toString());
    	
    	return tagging;
    }
}
