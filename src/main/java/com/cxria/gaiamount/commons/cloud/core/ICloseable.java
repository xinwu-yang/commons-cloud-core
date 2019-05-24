package com.cxria.gaiamount.commons.cloud.core;

/**
 * @author xinwuy
 */
public interface ICloseable {
    /**
     * 关闭所有网络连接
     */
    default void close() {
    }
}
