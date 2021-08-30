package advisor.model;

public class Categories implements IUserIteraction {

    private final String name;
    private final String message;

    public Categories(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "---CATEGORIES---" +
                "" + message + '\'';
    }
}
