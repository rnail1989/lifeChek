package tech.itpark;

import java.util.ArrayList;
import java.util.List;

public class NoteManager {
    public List<Note> items = new ArrayList<>();
    private int nextId = 1;

    public void save(Note item) {
        if (item.getId() == 0) {
            item.setId(nextId);
            nextId++;
            items.add(item);
        }
    }


}
