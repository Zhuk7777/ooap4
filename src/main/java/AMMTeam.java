public class AMMTeam extends Team {
    public AMMTeam() {
        super(new AMMTeamFactory());
    }

    public void prepareTeam() {
        System.out.println("Amm Team");
    }
}