
package ohtu;

public class Player implements Comparable<Player> {
    
    private String name;
    private String nationality;
    private int assists;
    private int goals;
    private String team;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " team " + team + " " + goals + " + "+ assists + " = " + (this.getGoals() + this.getAssists());
    }

    @Override
    public int compareTo(Player other) {
        int pointsOther = other.getGoals() + other.getAssists();
        int pointsThis = this.getGoals() + this.getAssists();
        return pointsOther-pointsThis;
    }
      
}
