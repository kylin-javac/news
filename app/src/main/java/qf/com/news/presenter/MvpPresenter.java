package qf.com.news.presenter;


import java.lang.ref.WeakReference;

import qf.com.news.model.MvpModel;
import qf.com.news.mvpview.view.MvpView;

/**
 * Created by  javac on 2016/9/24.
 * email:kylin_javac@outlook.com
 * desc:
 */

public abstract class MvpPresenter<V extends MvpView, M extends MvpModel> {
    private WeakReference<V> weakreference;

    public M model;

    public MvpPresenter() {
        this.model = CreateModel();
    }

    public abstract M CreateModel();

    public void attch(V v) {
        weakreference = new WeakReference<V>(v);
        model = CreateModel();
    }

    public V getView() {
        if (weakreference != null) {
            V v = weakreference.get();
            return v;
        }
        return null;
    }

    public void deAttch() {
        if (weakreference != null) {
            weakreference.clear();
            weakreference = null;
        }
    }

    public abstract void getData();
}
