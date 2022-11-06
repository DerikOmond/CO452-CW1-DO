public class Song
{
    //Attributes
    private String title;
    private String artist;
    private int playCount;
    private String songLink;

    //Song object onstructor
    public Song(String title, String artist, int playCount, String songLink)
    {
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
        this.songLink = songLink;
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
    public String getLink()
    {
        return this.songLink;
    }
    
    //Print Table Method
    public void printTable()
    {
        System.out.printf("| %-50s | %-50s | %20s |%n", this.title, this.artist, this.playCount);
    }    
}
