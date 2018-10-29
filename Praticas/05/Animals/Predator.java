public interface Predator{
    public void run();
    public boolean caught(Prey prey);
    public void eat(Prey prey);
}