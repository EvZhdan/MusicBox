package biz.softmobile.musicbox;

/**
 * Created by dkmngkfj on 15.04.2018.
 */

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath) {
        this.mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length-1];
        mName = fileName.replace(".wav","");
    }
    public String getmAssetPath(){
        return mAssetPath;
    }

    public String getmName(){
        return mName;
    }

    public Integer getSoundId(){
        return mSoundId;
    }

    public void setmSoundId(Integer soundId){
        mSoundId = soundId;
    }
}
