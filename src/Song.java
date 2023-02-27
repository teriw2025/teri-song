import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class Song {
    //properties
    private String title;

    private String artist;

    private ArrayList<String> tempArr = new ArrayList();


    //constructors
    public Song(String userTitle, String userArtist){
        title = userTitle;
        artist = userArtist;
    }

    //methods
    public String getArtist() {
        return artist;
    }
    public String getTitle() {
        return title;
    }

    public int howMany(ArrayList<String> names){
        int count = 0;

        for(String name: names){

            String lowerName = name.toLowerCase();

            if (tempArr.contains(lowerName) == false){
                tempArr.add(lowerName);
                count++;
            }
        }
        return count;
    }




}
