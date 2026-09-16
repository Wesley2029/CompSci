public class Song {
    private String title;
    private String artist;
    private int durationSeconds;

    public Song(String title, String artist, int durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    public Song() {
        title = "Unknown";
        artist = "Unknown";
        durationSeconds = 0;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getDurationSeconds() {
        return durationSeconds;
    }
    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    public double getDurationMinutes() {
        return (double) durationSeconds / 60;
    }
    public String getArtistInitial() {
        return artist.substring(0,1);
    }
    public int getTitleLength() {
        return title.length();
    }
    public String getLabel() {
        return title + " - " + artist;
    }
    public String toString() {
        return title + " by " + artist + " (" + durationSeconds + "s)";
    }
    public boolean equals(Song other) {
        if (other.title.equals(title) && other.artist.equals(artist)) {
            return true;
        }
        else {
            return false;
        }
    }
    }
