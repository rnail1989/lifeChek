package tech.itpark;

public class Note {
    private int id;
    private String field;
    private double cost;
    private long created;

    public Note(int id, String field, double cost, long created) {
        this.id = id;
        this.field = field;
        this.cost = cost;
        this.created = created;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}


