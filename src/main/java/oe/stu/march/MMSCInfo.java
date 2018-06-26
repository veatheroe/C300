package oe.stu.march;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2018/3/12.
 */
public final class MMSCInfo {
    private final String deviceID;
    private final String url;

    private final int maxAttachmentSizeBytes;

    public MMSCInfo(String deviceID, String url, int maxAttachmentSizeBytes) {
        this.deviceID = deviceID;
        this.url = url;
        this.maxAttachmentSizeBytes = maxAttachmentSizeBytes;
    }
    public MMSCInfo(MMSCInfo prototype){
        this.deviceID = prototype.deviceID;
        this.url = prototype.url;
        this.maxAttachmentSizeBytes = prototype.maxAttachmentSizeBytes;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public String getUrl() {
        return url;
    }

    public int getMaxAttachmentSizeBytes() {
        return maxAttachmentSizeBytes;
    }
}
