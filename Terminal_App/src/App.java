import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {
        ArrayList<Song> songList = new ArrayList<>();

        Song s1 = new Song("Where Ya At", "Future", 312938482);
        songList.add(s1);

        Song s2 = new Song("Don't Play That", "King Von & 21 Savage", 13672589);
        songList.add(s2);

        Song s3 = new Song("Hop Out", "Ghetts", 106905);
        songList.add(s3);

        Song s4 = new Song("Lazarus", "Dave", 2356707);
        songList.add(s4);

        Song s5 = new Song("Out Tha Mud", "Roddy Ricch", 26687093);
        songList.add(s5);

        Song s6 = new Song("family ties", "Baby Keem, Kendrick Lamar", 72728511);
        songList.add(s6);

        Song s7 = new Song(" MIDDLE CHILD", "J. Cole", 242380998 );
        songList.add(s7);

        Song s8 = new Song("Fair Trade", "Drake ft. Travis Scott", 67927967);
        songList.add(s8);

        Song s9 = new Song("King of My City", "A Boogie Wit Da Hoodie", 16801663);
        songList.add(s9);

        Song s10 = new Song("Bounce Back", "Big Sean", 186934393);
        songList.add(s10);

        Song s11 = new Song("N95", "Kendrick Lamar", 50971260);
        songList.add(s11);

        Song s12 = new Song("Broccoli", "DRAM ft. Lil Yatchy", 443899368);
        songList.add(s12);

        Song s13 = new Song("T-Shirt", "Migos", 333658408);
        songList.add(s13);

        for (Song currentSong: songList)
        {
            currentSong.print();
        }

        Scanner sc = new Scanner(System.in);
        String _continue;
        do
        {

            System.out.print("Continue? ");
            _continue = sc.nextLine();
        }
        while(_continue.equals("yes"));
    }
}
