package mozhi.wifilocation.Database;

import org.litepal.crud.DataSupport;

/**
 * Created by 24599 on 2017/9/8.
 */

public class WiFiScanResult extends DataSupport {
    private String mac;
    private int level;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
