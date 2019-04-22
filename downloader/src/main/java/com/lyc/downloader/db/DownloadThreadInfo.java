package com.lyc.downloader.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Liu Yuchuan on 2019/4/22.
 */
@Entity
public class DownloadThreadInfo {
    @Id(autoincrement = true)
    private Long id;
    private long tid;
    @Property(nameInDb = "start_position")
    private long startPosition;
    @Property(nameInDb = "downloaded_size")
    private long downloadedSize;
    @Property(nameInDb = "total_size")
    private long totalSize;
    @Property(nameInDb = "download_info_id")
    private long downloadInfoId;

    @Generated(hash = 2138354767)
    public DownloadThreadInfo(Long id, long tid, long startPosition,
                              long downloadedSize, long totalSize, long downloadInfoId) {
        this.id = id;
        this.tid = tid;
        this.startPosition = startPosition;
        this.downloadedSize = downloadedSize;
        this.totalSize = totalSize;
        this.downloadInfoId = downloadInfoId;
    }
    @Generated(hash = 1692126078)
    public DownloadThreadInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public long getTid() {
        return this.tid;
    }
    public void setTid(long tid) {
        this.tid = tid;
    }
    public long getStartPosition() {
        return this.startPosition;
    }
    public void setStartPosition(long startPosition) {
        this.startPosition = startPosition;
    }
    public long getDownloadedSize() {
        return this.downloadedSize;
    }
    public void setDownloadedSize(long downloadedSize) {
        this.downloadedSize = downloadedSize;
    }
    public long getTotalSize() {
        return this.totalSize;
    }
    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }
    public long getDownloadInfoId() {
        return this.downloadInfoId;
    }
    public void setDownloadInfoId(long downloadInfoId) {
        this.downloadInfoId = downloadInfoId;
    }
}
