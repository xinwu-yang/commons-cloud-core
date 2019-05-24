package com.cxria.gaiamount.commons.cloud.core;

/**
 * @author xinwuy
 */
public class ApiCore {
    /**
     * 云商认证的AK/SK
     */
    private CloudCredentials cloudCredentials;
    /**
     * Cloud类型
     */
    private ServerType serverType;

    public CloudCredentials getCloudCredentials() {
        return cloudCredentials;
    }

    public ServerType getServerType() {
        return serverType;
    }

    public ApiCore(CloudCredentials cloudCredentials, ServerType serverType) {
        this.cloudCredentials = cloudCredentials;
        this.serverType = serverType;
    }
}
