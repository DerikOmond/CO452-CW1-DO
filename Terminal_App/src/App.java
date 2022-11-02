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

        ArrayList<String> options0 = new ArrayList<>();
        options0.add("P");
        options0.add("A");
        options0.add("R");
        options0.add("N");

        String userInput0;

        Scanner sc = new Scanner(System.in);
        String _continue;
        String addSongAgain;
        String removeSongAgain;

        do
        {
            do
            {
                System.out.println("Press 'P' to print all songs.");
                System.out.println("Press 'A' to add a song to the list.");
                System.out.println("Press 'R' to remove a song.");
                System.out.println("Press 'N' to view how many times you've played a song.");
                System.out.println("Press 'X' to exit.");

                userInput0 = sc.nextLine();
            }
            while (!(options0.contains(userInput0)));

            if (userInput0.equals("P"))
            {
                for (Song currentSong: songList)
                {
                    currentSong.print();
                }
            }

            else if (userInput0.equals("A"))
            {
                do
                {
                    System.out.print("Title: ");
                    String userTitle = sc.nextLine();

                    System.out.print("Artist: ");
                    String userArtist = sc.nextLine();

                    System.out.print("Play Count: ");
                    int userPlayCount = sc.nextInt();
                    sc.nextLine();

                    Song userAddedSong = new Song(userTitle, userArtist, userPlayCount);
                    songList.add(userAddedSong);

                    if (songList.contains(userAddedSong))
                    {
                        System.out.println("Your song has been added.");
                    }
                    else
                    {
                        System.out.println("Something went wrong.");
                        System.out.println("Your song has not been added.");
                    }

                    System.out.println("Add song again? ");
                    addSongAgain = sc.nextLine();

                }while (addSongAgain.equals("yes"));
            }

            else if (userInput0.equals("R"))
            {
                do
                {
                    System.out.println("Type as shown in printed values");

                    System.out.print("Song title: ");
                    String removeTitle = sc.nextLine().toLowerCase();

                    System.out.print("Artist name: ");
                    String removeArtist = sc.nextLine().toLowerCase();

                    for (Song currentSong1: songList)
                    {
                        if ((removeTitle.equals(currentSong1.getTitle().toLowerCase())) && (removeArtist.equals(currentSong1.getArtist().toLowerCase())))
                        {
                            System.out.println("You want to remove " + currentSong1.getTitle() + " by " + currentSong1.getArtist() + "?");
                            String removeSong = sc.nextLine();

                            if (removeSong.equals("yes"))
                            {
                                sc.nextLine();
                                songList.remove(currentSong1);
                                System.out.println(currentSong1.getTitle() + " has been removed from list.");
                            }
                            else
                            {
                                System.out.println("Okay");
                            }
                        }
                        else
                        {
                            System.out.println("Song couldn't be found.");
                            break;
                        }
                    }

                    System.out.println("Would you like to remove another song?");
                    removeSongAgain = sc.nextLine();
                }
                while(removeSongAgain.equals("yes"));
            }
            
            System.out.print("Continue? ");
            _continue = sc.nextLine();
        }
        while(_continue.equals("yes"));
    }
}
