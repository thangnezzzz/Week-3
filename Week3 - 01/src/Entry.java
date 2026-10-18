public class Entry {
    private Date date;
    private double distance;
    private int duration;
    private String posRunFeeling;

    public Entry(Date date, double distance, int duration, String posRunFeeling){
        this.date = date;
        this.distance = distance;
        this.duration = duration;
        this.posRunFeeling = posRunFeeling;
    }
}
