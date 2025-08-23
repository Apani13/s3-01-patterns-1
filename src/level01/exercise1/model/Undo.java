package level01.exercise1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Undo {

    private static Undo instance;
    private final List<Command> history;

    private Undo() {
        this.history = new ArrayList<>();
    }

    public static Undo getInstance() {

        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(Command command) {
        if (command != null) {
            history.add(command);
        }
    }

    public Command undoLast() {
        if (history.isEmpty()) {
            return null;
        }
        return history.remove(history.size() -1);

    }

    public String listCommands() {
       return history.stream()
               .map(Command::getName)
               .collect(Collectors.joining(", "));
    }

}
