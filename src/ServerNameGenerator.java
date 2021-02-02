import java.util.Arrays


public class ServerNameGenerator {
    public static void main(String[] args) {
        ServerNameGenerator server = new ServerNameGenerator();

//        Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns

        String[] adjectives = {"verbose", "bombastic", "lyrical", "infamous", "situational", "just", "final", "kind", "awesome", "gnarly"};

        String[] nouns = {"El Guapo", "hats", "strategery", "awareness", "award", "countdown", "journey", "Dude", "half-pipe", "economy"};

        System.out.println(server.nameGenerator(adjectives, nouns));
    }

//    Create a method that will return a random element from an array of strings.

    private int randomAdj = (int)(Math.random()*10);
    private int randomNoun = (int)(Math.random()*10);

    public String nameGenerator(String[] adj, String[] noun){
        return adj[randomAdj] + "-" + noun[randomNoun];
    }



}
