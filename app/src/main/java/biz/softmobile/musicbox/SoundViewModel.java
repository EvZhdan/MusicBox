package biz.softmobile.musicbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by dkmngkfj on 15.04.2018.
 */

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    public Sound getmSound(){
        return mSound;
    }

    @Bindable
    public String getTitle(){
        return mSound.getmName();
    }
    public void setSound(Sound sound){
        mSound = sound;
        notifyChange();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
