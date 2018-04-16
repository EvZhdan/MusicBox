package biz.softmobile.musicbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkmngkfj on 13.04.2018.
 */

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";
    private static final int MAX_SOUNDS = 5;

    private AssetManager mAsset;
    private List<Sound> mSound = new ArrayList<>();
    private SoundPool mSoundPool;


    public BeatBox(Context context){
        mAsset = context.getAssets();
        //этот конструктор считается устаревшим
        //но он нужен для обеспечения совместимости
        mSoundPool = new SoundPool(MAX_SOUNDS, AudioManager.STREAM_MUSIC,0);
        loadSounds();
    }

    private void loadSounds(){
        String[] soundNames;
        try {
            soundNames = mAsset.list(SOUNDS_FOLDER);
            Log.i(TAG,"Found " + soundNames.length + " sounds");
        } catch (IOException e) {
            Log.e(TAG,"Could not list assets,e");
            return;
        }

        for(String filename : soundNames){
            String assetPath = SOUNDS_FOLDER + "/"+filename;
            Sound sound = new Sound(assetPath);
            mSound.add(sound);
        }
    }

    public List<Sound> getmSound(){
        return mSound;
    }


}
