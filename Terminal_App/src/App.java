//Imports
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception
    {
        //Arraylist of songs
        ArrayList<Song> songList = new ArrayList<>();

        //Each song and their attributes
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

        //Printing all first songs
        for (Song currentSong: songList)
        {
            currentSong.print();
        }

        // Arraylist of options available
        ArrayList<String> options0 = new ArrayList<>();
        options0.add("P");
        options0.add("A");
        options0.add("R");
        options0.add("N");

        // Arraylist of 'yes' options possible
        ArrayList<String> yesOptions = new ArrayList<>();
        yesOptions.add("yes");
        yesOptions.add("yeah");
        yesOptions.add("ye");
        yesOptions.add("y");
        yesOptions.add("yea");
        yesOptions.add("ya");

        //Arraylist of 'no' options possible
        ArrayList<String> noOptions = new ArrayList<>();
        noOptions.add("no");
        noOptions.add("n");
        noOptions.add("nah");
        noOptions.add("nope");
        noOptions.add("nop");

        //User input for making decision
        String userInput0;
        String _continue;
        String addSongAgain;
        String removeSongAgain;

        // do while loop to prevent having to restart program
        do
        {
            // Prompting user made decision through key input
            do
            {
                userInput0 = InputReader.getString("Press 'P' to print all songs" +
                "\n Press 'A' to add a song to the list" +
                "\n Press 'R' to remove a song" +
                "\n Press 'X' to exit");
            }
            while (!(options0.contains(userInput0)));

            // Option to print out all songs
            if (userInput0.equals("P"))
            {
                for (Song currentSong: songList)
                {
                    currentSong.print();
                }
            }

            //Option to add songs
            else if (userInput0.equals("A"))
            {
                do
                {
                    String userTitle = InputReader.getString("Title: ");
                    String userArtist = InputReader.getString("Artist: ");
                    int userPlayCount = InputReader.getInt("Play Count(According to Youtube.com): ");

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

                    addSongAgain = InputReader.getString("Add song again?");

                }while (yesOptions.contains(addSongAgain));
            }

            else if (userInput0.equals("R"))
            {
                do
                {
                    System.out.println("Type as shown in printed values");

                    String removeTitle = InputReader.getString("Title: ");
                    String removeArtist = InputReader.getString("Artist: ");

                    for (Song currentSong1: songList)
                    {
                        if ((removeTitle.equals(currentSong1.getTitle().toLowerCase())) && (removeArtist.equals(currentSong1.getArtist().toLowerCase())))
                        {
                            String removeSong = InputReader.getString("You want to remove " + currentSong1.getTitle() + " by " + currentSong1.getArtist() + "?");

                            if (yesOptions.contains(removeSong))
                            {
                                songList.remove(currentSong1);
                                System.out.println(currentSong1.getTitle() + " has been removed from list.");
                            }
                            else if (noOptions.contains(removeSong));

                        }
                    }
                    
                    removeSongAgain = InputReader.getString("Would you like to remove another song? ");
                }
                while(yesOptions.contains(removeSongAgain));
            }

            //Option to exit program entirely
            else if (userInput0.equals("X"))
            {
                System.exit(0);
            }
            
            // Continue/Restart program prompt
            _continue = InputReader.getString("Continue? ");
        }
        while(_continue.equals("yes"));
    }
}