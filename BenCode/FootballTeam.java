public class FootballTeam implements IFootballTeam {
    private String name;
    private String city;
    private String mascot;


    public FootballTeam (
        String name,
        String city,
        String mascot
    )
    {
        this.name = name;
        this.city = city;
        this.mascot = mascot;
    }

    public int RosterSize() {
        return 53;
    }
    public int Budget() {
        return 15000000;
    }
    public String UniformColors() {
        return "Dark Home Kit & Bright Away Kit";
    }
}
