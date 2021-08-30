package advisor.model;

public class NewAlbums implements IUserIteraction {

    private final String name;
    private final String message;

    public NewAlbums(String name, String message) {
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
        return "---NEW RELEASES---" +
                "" + message + '\'';
    }
}
