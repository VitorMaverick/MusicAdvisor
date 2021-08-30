package advisor.service;

import java.util.Scanner;

public class Session {

    MessageFactory factory;
    String url = null;

    public Session(MessageFactory factory, String url) {
        this.factory = factory;
        this.url = url;
    }

    public Session(MessageFactory factory) { this.factory = factory; }

    public void autentica() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();

        while (!(command.equals("auth") || command.equals("exit"))) {

            System.out.println("Please, provide access for application.");
            command = scanner.next();

        }
        if (command.equals("auth")) {

            Server server = new Server();
            server.createHttpServer();
            server.authRequest();

            while(Config.ACCESS_TOKEN != "" ){
                factory.execute();
            }

        } else {
            System.out.println("---GOODBYE!---");
        }


    }
}
