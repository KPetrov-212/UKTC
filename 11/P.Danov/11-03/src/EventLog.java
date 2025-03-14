import java.util.ArrayList;
import java.util.List;

class EventLogFullException extends Exception {
    public EventLogFullException(String message) {
        super(message);
    }
}

class InvalidEventIndexException extends Exception {
    public InvalidEventIndexException(String message) {
        super(message);
    }
}

public class EventLog {
    private List<String> events;
    private static final int MAX_EVENTS = 100;

    public EventLog() {
        events = new ArrayList<>();
    }

    public void addEvent(String event) throws EventLogFullException {
        if (events.size() >= MAX_EVENTS) {
            throw new EventLogFullException("Event log is full.");
        }
        events.add(event);
    }

    public void editEvent(int index, String newEvent) throws InvalidEventIndexException {
        if (index < 0 || index >= events.size()) {
            throw new InvalidEventIndexException("Invalid event index.");
        }
        events.set(index, newEvent);
    }

    public void removeEvent(int index) throws InvalidEventIndexException {
        if (index < 0 || index >= events.size()) {
            throw new InvalidEventIndexException("Invalid event index.");
        }
        events.remove(index);
    }

    public void print() {
        if (events.isEmpty()) {
            System.out.println("No events recorded.");
        } else {
            for (int i = 0; i < events.size(); i++) {
                System.out.println(i + ". " + events.get(i));
            }
        }
    }

    public List<String> getEvents() {
        return events;
    }

    public int getEventCount() {
        return events.size();
    }
}
