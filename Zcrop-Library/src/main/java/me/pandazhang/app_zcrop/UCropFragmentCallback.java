package me.pandazhang.app_zcrop;

public interface UCropFragmentCallback {

    /**
     * Return loader status
     */
    void loadingProgress(boolean showLoader);

    /**
     * Return cropping result or error
     */
    void onCropFinish(UCropFragment.UCropResult result);

}
