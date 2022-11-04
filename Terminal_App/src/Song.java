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
    
    //Print Table Method
    public void printTable()
    {
        System.out.printf("| %-50s | %-50s | %20s |%n", this.title, this.artist, this.playCount);
    }    
}
