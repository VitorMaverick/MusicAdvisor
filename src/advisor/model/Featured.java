package advisor.model;

public class Featured implements IUserIteraction {
    private final String name;
    private final String message;

    public Featured(String name, String message) {
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
        return "Featured{" +
                "---FEATURED---" +
                "" + message + '\'';
    }
}
