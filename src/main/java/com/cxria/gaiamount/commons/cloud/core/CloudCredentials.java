package com.cxria.gaiamount.commons.cloud.core;

/**
 * @author xinwuy
 */
public class CloudCredentials {
    private String accessKeyId;
    private String accessKeySecret;
    private ServerType serverType;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public ServerType getServerType() {
        return serverType;
    }

    public void setServerType(ServerType serverType) {
        this.serverType = serverType;
    }

    public CloudCredentials(String accessKeyId, String accessKeySecret, ServerType serverType) {
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.serverType = serverType;
    }
}
