package qf.com.news.model;

import rx.functions.Action1;

/**
 * Created by  javac on 2016/9/24.
 * email:kylin_javac@outlook.com
 * desc:
 */

public interface BaseModel<T> extends MvpModel {

    void getData(Action1<T> action1);

}
