 public interface State {
    Juca getJuca();
    void printStats(String status);

    void enter();
    void execute();
    void leave();
}
