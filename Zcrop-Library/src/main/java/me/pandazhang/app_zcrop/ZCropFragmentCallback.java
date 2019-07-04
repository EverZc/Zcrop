package me.pandazhang.app_zcrop;

public interface ZCropFragmentCallback {

    /**
     * Return loader status
     */
    void loadingProgress(boolean showLoader);

    /**
     * Return cropping result or error
     */
    void onCropFinish(ZCropFragment.UCropResult result);

}
