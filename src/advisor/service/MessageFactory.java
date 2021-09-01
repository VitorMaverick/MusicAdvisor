package advisor.service;

import advisor.model.*;

import java.util.Scanner;

public class MessageFactory {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        IteractionControler control = new IteractionControler();
        IUserIteraction strategy = null;
        boolean exit = false;

        do {
            String input = scanner.next();

            switch (input) {
                case ("featured"):
                    strategy = new Featured("featured", Client.featured());
                    break;
                case ("new"):
                    strategy= new NewAlbums("new", "---NEW RELEASES---\n" +
                            "Mountains [Sia, Diplo, Labrinth]\n" +
                            "Runaway [Lil Peep]\n" +
                            "The Greatest Show [Panic! At The Disco]\n" +
                            "All Out Life [Slipknot]" +
                            "Songs to Sing in the Shower");
                    break;
                case ("categories"):
                    strategy = new Categories("categories", "---CATEGORIES---\n" +
                            "Top Lists\n" +
                            "Pop\n" +
                            "Mood\n" +
                            "Latin");
                    break;
                case ("playlists"):
                    strategy = new Playlists("playlists", "---MOOD PLAYLISTS---\n" +
                            "Walk Like A Badass  \n" +
                            "Rage Beats  \n" +
                            "Arab Mood Booster  \n" +
                            "Sunday Stroll");
                    break;
                case ("exit"):
                    System.out.println("---GOODBYE!---");
                    exit = true;
                    break;
            }
            if(strategy != null && exit == false){
                System.out.println(control.getIteraction(strategy));
            }


        } while (exit == false);
    }
}
