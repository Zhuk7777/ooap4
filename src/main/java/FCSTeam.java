public class FCSTeam extends Team {
    public FCSTeam() {

        super(new FCSTeamFactory());
    }

    public void prepareTeam() {

        System.out.println("FCS team");
    }
}
