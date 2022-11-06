//Imports
import java.util.ArrayList;
import java.awt.Desktop;
import java.net.URI;

public class App 
{
    public static void main(String[] args) throws Exception
    {
        //Arraylist of songs
        ArrayList<Song> songList = new ArrayList<>();

        //Each song originally in the list and their attributes
        Song s1 = new Song("Where Ya At", "Future (ft. Drake)", 312938482, "https://www.youtube.com/watch?v=lw3Or6eqIpI");
        songList.add(s1);

        Song s2 = new Song("Don't Play That", "King Von & 21 Savage", 13672589, "https://www.youtube.com/watch?v=-_JF_3PB4F0");
        songList.add(s2);

        Song s3 = new Song("Hop Out", "Ghetts", 106905, "https://www.youtube.com/watch?v=o6PNrPy2oOA");
        songList.add(s3);

        Song s4 = new Song("Lazarus", "Dave", 2356707, "https://www.youtube.com/watch?v=p8P-sLoRgM0");
        songList.add(s4);

        Song s5 = new Song("Out Tha Mud", "Roddy Ricch", 26687093, "https://www.youtube.com/watch?v=Y3JWPcDgZng");
        songList.add(s5);

        Song s6 = new Song("family ties", "Baby Keem, Kendrick Lamar", 72728511, "https://www.youtube.com/watch?v=v6HBZC9pZHQ");
        songList.add(s6);

        Song s7 = new Song("MIDDLE CHILD", "J. Cole", 242380998, "https://www.youtube.com/watch?v=WILNIXZr2oc");
        songList.add(s7);

        Song s8 = new Song("Fair Trade", "Drake ft. Travis Scott", 67927967, "https://www.youtube.com/watch?v=THVbtGqEO1o");
        songList.add(s8);

        Song s9 = new Song("King of My City", "A Boogie Wit Da Hoodie", 16801663, "https://www.youtube.com/watch?v=gnBBEv5a-F8");
        songList.add(s9);

        Song s10 = new Song("Bounce Back", "Big Sean", 186934393, "https://www.youtube.com/watch?v=phr1pOFK1V8");
        songList.add(s10);

        Song s11 = new Song("N95", "Kendrick Lamar", 50971260, "https://www.youtube.com/watch?v=zI383uEwA6Q");
        songList.add(s11);

        Song s12 = new Song("Broccoli", "DRAM ft. Lil Yatchy", 443899368, "https://www.youtube.com/watch?v=K44j-sb1SRY");
        songList.add(s12);

        Song s13 = new Song("T-Shirt", "Migos", 333658408, "https://www.youtube.com/watch?v=1VUa99-tJqs");
        songList.add(s13);

        //Printing all first songs
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("|                                                                Songs                                                           |%n");
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-50s | %-50s | %-20s |%n", "Title", "Artist", "Play Count");
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
        for (Song currentSong: songList)
        {
            currentSong.printTable();
        }
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");

        // Arraylist of options available to decide option pathway
        ArrayList<Integer> options0 = new ArrayList<>();
        options0.add(1);
        options0.add(2);
        options0.add(3);
        options0.add(4);
        options0.add(5);
        options0.add(6);

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

        //User input for making decision in different areas of the code
        //Instantiated as hierachy doesn't allow the variables to be instantiated later
        int userInput0;
        String _continue;
        String addSongAgain;
        String removeSongAgain;
        String findSongAgain;

        // do while loop to prevent having to restart program
        do
        {
            // Prompting user made decision through key input
            do
            {
                System.out.printf("\n" + "MAIN MENU" + "\n");


                userInput0 = InputReader.getInt("\n1. Print table of songs." +
                "\n2. Add songs." +
                "\n3. Remove song." +
                "\n4. Display songs according to minimum view count." +
                "\n5. Play song on youtube.com." +
                "\n6. Exit." +
                "\n--> ");
            }
            while (!(options0.contains(userInput0)));

            // Option to print out all songs
            if (userInput0 == 1)
            {
                System.out.println("");

                System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
                System.out.printf("|                                                                Songs                                                           |%n");
                System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
                System.out.printf("| %-50s | %-50s | %-20s |%n", "Title", "Artist", "Play Count");
                System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
                for (Song currentSong: songList)
                {
                    currentSong.printTable();
                }
                System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
            }

            //Option to add songs
            else if (userInput0 == 2)
            {
                do
                {
                    System.out.println("");
                    String userTitle = InputReader.getString("Title: ");
                    String userArtist = InputReader.getString("Artist: ");
                    int userPlayCount = InputReader.getInt("Play Count(According to Youtube.com or recorded by another source): ");
                    String userLink = InputReader.getString("Song URL (from youtube.com): ");

                    Song userAddedSong = new Song(userTitle, userArtist, userPlayCount, userLink);
                    songList.add(userAddedSong);

                    if (songList.contains(userAddedSong))
                    {
                        System.out.println("\n" + "Your song has been added." + "\n");
                    }
                    else
                    {
                        System.out.println("\nSomething went wrong.");
                        System.out.println("Your song has not been added." + "\n");
                    }

                    addSongAgain = InputReader.getString("Add song again?" + "\n--> ");

                }while (yesOptions.contains(addSongAgain));
            }

            //Option to remove song
            else if (userInput0 == 3)
            {
                do
                {
                    System.out.println("\n" + "TYPE AS SHOWN IN SONG LIST!!" + "\n");
                    System.out.println("IF SONG DOES NOT EXIST IN THE LIST, IT WILL NOT BE REMOVED!!" + "\n");

                    String removeTitle = InputReader.getString("Title: ").toLowerCase();
                    String removeArtist = InputReader.getString("Artist: ").toLowerCase();

                    for (Song currentSong1: songList)
                    {
                        if ((removeTitle.equals(currentSong1.getTitle().toLowerCase())) && (removeArtist.equals(currentSong1.getArtist().toLowerCase())))
                        {
                            String removeSong = InputReader.getString("You want to remove " + currentSong1.getTitle() + " by " + currentSong1.getArtist() + "?" + "\n--> ");

                            if (yesOptions.contains(removeSong))
                            {
                                songList.remove(currentSong1);
                                System.out.println("\n" + currentSong1.getTitle() + " has been removed from list.");
                            }

                            break;

                        }
                    }
                    
                    removeSongAgain = InputReader.getString("\n" + "Would you like to remove another song?" + "\n--> ");
                }
                while(yesOptions.contains(removeSongAgain));
            }

            //Option to to list songs above certain play count
            else if (userInput0  == 4)
            {
                System.out.println("");
                int minimumCount = InputReader.getInt("Minimum view count: ");
                System.out.println("");

                System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
                System.out.printf("|                                                                Songs                                                           |%n");
                System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
                System.out.printf("| %-50s | %-50s | %-20s |%n", "Title", "Artist", "Play Count");
                System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");

                for (Song songMin: songList)
                {
                    if (minimumCount <= songMin.getPlayCount())
                    {
                        songMin.printTable();
                    }
                }

                System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
            }

            //Finding song on youtube.com
            else if (userInput0 == 5)
            {
                do
                {
                    System.out.println("\n" + "TYPE AS SHOWN IN SONG LIST!!" + "\n");
                    System.out.println("IF SONG DOES NOT EXIST IN THE LIST, IT WILL NOT BE FOUND, AND LINK WILL NOT BE OPENED!!" + "\n");

                    String findTitle = InputReader.getString("Title: ").toLowerCase();
                    String findArtist = InputReader.getString("Artist: ").toLowerCase();

                    for (Song currentSong1: songList)
                    {
                        if ((findTitle.equals(currentSong1.getTitle().toLowerCase())) && (findArtist.equals(currentSong1.getArtist().toLowerCase())))
                        {
                            String findSong = InputReader.getString("You want to play " + currentSong1.getTitle() + " by " + currentSong1.getArtist() + "?" + "\n--> ");

                            if (yesOptions.contains(findSong))
                            {
                                Desktop d = Desktop.getDesktop();
                                d.browse(new URI(currentSong1.getLink()));
                            }

                        }
                    }
                    
                    findSongAgain = InputReader.getString("\n" + "Would you like to try play a song again?" + "\n--> ");
                }
                while(yesOptions.contains(findSongAgain));
            }
            
            // Option to exit program
            else if (userInput0  == 6)
            {
                System.out.println("Closing program...");
                System.exit(0);
            }

            // Continue/Restart program prompt
            _continue = InputReader.getString("\n" + "Continue? " +
            "\n--> ");
        }
        while(yesOptions.contains(_continue));
    }
}