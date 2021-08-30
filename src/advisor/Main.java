package advisor;

import advisor.service.Config;
import advisor.service.Session;
import advisor.service.MessageFactory;

import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        MessageFactory factory = new MessageFactory();

        if (args.length >= 1 && args[0].equals("-access")) { Config.SERVER_PATH = args[1]; }

        Session session = new Session(factory);


        session.autentica();

    }
}
