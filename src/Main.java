public class Main {
    public static void main(String[] args) {
        PopMusic crashBand = new PopMusic();
        RockMusic rollingStones = new RockMusic();
        ClassicMusic theBeatles = new ClassicMusic();

        MusicStyles[] musicGroups = {crashBand, rollingStones, theBeatles};
        for (int i = 0; i < musicGroups.length; i++) {
            musicGroups[i].playMusic();
        }
    }
}