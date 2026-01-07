public class Course extends Content {

    private int workLoad;

    @Override
    public double calculateXp() {
        return DEFAULT_XP * workLoad;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    public String toString() {
        return "Course [workLoad=" + workLoad + ", title=" + getTitle() + ",description=" + getDescription()
                + "]";
    }

}