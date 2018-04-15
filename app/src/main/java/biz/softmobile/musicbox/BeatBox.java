package biz.softmobile.musicbox;

import android.content.Context;
import android.content.res.AssetManager;
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

    private AssetManager mAsset;
    private List<Sound> mSound = new ArrayList<>();


    public BeatBox(Context context){
        mAsset = context.getAssets();
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
