package level02.exercise1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {
    private final List<ContactEntry> entries = new ArrayList<>();


    public void add(ContactEntry entry) { entries.add(entry); }


    public List<ContactEntry> getContacts() { return Collections.unmodifiableList(entries); }
}
