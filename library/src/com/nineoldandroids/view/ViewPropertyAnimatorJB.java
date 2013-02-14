package com.nineoldandroids.view;

import android.view.View;

/**
 * MPme
 * User: romainpiel
 * Date: 14/02/2013
 * Time: 10:55
 */
public class ViewPropertyAnimatorJB extends ViewPropertyAnimatorICS {

    ViewPropertyAnimatorJB(View view) {
        super(view);
    }

    @Override
    public ViewPropertyAnimator withLayer() {
        android.view.ViewPropertyAnimator n = mNative.get();
        if (n != null) {
            n.withLayer();
        }
        return this;
    }

}
