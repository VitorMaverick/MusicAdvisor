package advisor.model;

public class Playlists implements IUserIteraction {

    private final String name;
    private final String message;

    public Playlists(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "---MOOD PLAYLISTS---" +
                "" + message + '\'';
    }
}
