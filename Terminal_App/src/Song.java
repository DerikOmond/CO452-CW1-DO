public class Song
{
    private String title;
    private String artist;
    private int playCount;

    public void Song(String title, String artist, int playCount)
    {
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getArtist()
    {
        return this.artist;
    }

    public int getPlayCount()
    {
        return this.playCount;
    }
    
    public void print()
    {
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist);
        System.out.println("Play Count: " + this.playCount);
    }
}
