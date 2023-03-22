public class AMMTeamFactory implements TeamFactory {
    public Director createLeadingDirector() {
        return new AMMDirector();
    }
    public Dancer createDancer() {
        return new AMMDancer();
    }


    public Singer createSinger() {
        return new AMMSinger();
    }
}