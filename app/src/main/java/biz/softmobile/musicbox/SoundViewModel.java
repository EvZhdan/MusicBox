package biz.softmobile.musicbox;

/**
 * Created by dkmngkfj on 15.04.2018.
 */

public class SoundViewModel {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    public Sound getmSound(){
        return mSound;
    }

    public String getTitle(){
        return mSound.getmName();
    }

    public void setSound(Sound sound){
        mSound = sound;
    }
}
