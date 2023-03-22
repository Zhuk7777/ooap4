public abstract class Team {
    protected TeamFactory teamFactory = null;

    public Team(TeamFactory teamFactory) {
        this.teamFactory = teamFactory;
    }

    protected Dancer dancer;
    protected Director leadingDirector;
    protected Singer singer;

    protected abstract void prepareTeam();
    protected void createTeam() {
        dancer = teamFactory.createDancer();
        singer = teamFactory.createSinger();
        leadingDirector = teamFactory.createLeadingDirector();
    }

    public void performing(){
        createTeam();
        prepareTeam();
        leadingDirector.management();
        singer.sing();
        dancer.dance();
    }

}
