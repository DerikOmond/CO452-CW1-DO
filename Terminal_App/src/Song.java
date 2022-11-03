public class Song
{
    //Attributes
    private String title;
    private String artist;
    private int playCount;

    //Song object onstructor
    public Song(String title, String artist, int playCount)
    {
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
    }

    //Getters
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
    
    //Print Method
    public void print()
    {
        System.out.println("");
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist);
        System.out.println("Play Count: " + this.playCount);
        System.out.println(" ");
    }
}
