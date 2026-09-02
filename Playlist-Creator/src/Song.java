public class Song {
    private String title;
    private Double duration;

    public Song(String title, Double duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return this.title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
