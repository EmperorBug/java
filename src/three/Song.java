package three;

public class Song {
    String title;
    String artist;
    String year;
    String country;

    public Song(String title, String artist, String year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public  Song(){}

    void show() {
        int t = 0;
        System.out.println("노래 제목 :"+title+", 가수 : "+artist+", 연도 : "+year+", 국적 : "+country);
    }
}
