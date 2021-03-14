package StreamIo.arraylistll;

public class Students {
    private String name;
    private int id;
    private double percentageScore;

    public Students(String name,int id,double percentageScore){
        this.name = name;
        this.id = id;
        this.percentageScore = percentageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPercentageScore() {
        return percentageScore;
    }

    public void setPercentageScore(double percentageScore) {
        this.percentageScore = percentageScore;
    }
    @Override
    public String toString() {
        return "Student info: [" + "Name: " + name + "\tId: " + id + "\tPercentageScore: " +
        percentageScore + "]";
    }

}
