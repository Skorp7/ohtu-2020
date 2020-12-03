package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players.txt";

        Statistics stats = new Statistics(new PlayerReaderImpl(url));
          
//        Matcher m = new And(new HasFewerThan(5, "points"),
//                new HasAtLeast(1, "assists"),
//                new PlaysIn("PHI")
//        );
//        Matcher m = new And(
//                new All()
//        );
//        System.out.println(stats.matches(new All()).size());
        
Matcher m = new And(
    new HasAtLeast(50, "points"),
    new Or( 
        new PlaysIn("NYR"),
        new PlaysIn("NYI"),
        new PlaysIn("BOS")
    )
);   

        
        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }
    }
}
