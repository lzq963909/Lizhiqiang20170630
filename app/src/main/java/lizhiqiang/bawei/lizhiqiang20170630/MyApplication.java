package lizhiqiang.bawei.lizhiqiang20170630;

import android.app.Application;

import org.xutils.x;
import org.xutils.BuildConfig;

/**
 * date: 2017/6/30
 * author: 李志强
 * function:
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }
}
