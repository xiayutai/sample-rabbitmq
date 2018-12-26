package com.xyt.sample.rabbitmq.provider.model;

import java.io.Serializable;

/**
 * 摘要:生成文件通知
 *
 * @author xyt
 * @create 2018-11-10 16:58
 **/

public class FileStatusNotice implements Serializable {
    private static final long serialVersionUID = 8965064738088352608L;
    /**
     * 唯一id
     */
    private String uuid;
    /**
     * OSS下载URL地址
     */
    private String  ossUrl;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOssUrl() {
        return ossUrl;
    }

    public void setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
    }
}
