package com.zhang.mydemo.actionbar;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Context;

/**
 * Created by zjun on 2015/6/16.
 */
public class TabListener extends BaseListener implements ActionBar.TabListener {
    private static String tag = "tc>";
    public TabListener(Context ctx, IReportBack target) {
        super(ctx, target);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        this.mReportTo.reportBack(tag, "ontab selected:" + tab.getText());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        this.mReportTo.reportBack(tag, "ontab re selected:" + tab.getText());
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        this.mReportTo.reportBack(tag, "ontab un selected:" + tab.getText());
    }
}
