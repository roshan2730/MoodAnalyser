package moodAnalyser;

public class MoodAnalyser {

    private String moodMessage;

    public MoodAnalyser(){
    }

    public MoodAnalyser(String moodMessage) {
        this.moodMessage = moodMessage;
    }

    public String analyseMood() {
        try {
            if(moodMessage.contains("Sad")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e) {
            return "HAPPY";
        }

    }
}
