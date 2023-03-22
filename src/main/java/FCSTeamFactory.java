public class FCSTeamFactory implements TeamFactory {
    public Director createLeadingDirector() {
        return new FCSDirector();
    }

    public Dancer createDancer() {
        return new FCSDancer();
    }

    public Singer createSinger() {
        return new FCSSinger();
    }
}
