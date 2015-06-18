package com.zhang.mydemo.actionbar;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.zhang.mydemo.R;

public abstract class BaseActionBarActivity extends DebugActivity {

    private String tag = null;
    public BaseActionBarActivity(String inTag) {
        super(R.menu.menu, R.layout.main, R.id.textViewId, inTag);
        tag = inTag;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = getTextView();
        tv.setText(tag);
    }

//    @Override
//    public boolean onMenuItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home){
//            this.reportBack(tag, "Home pressed");
//            return true;
//        }
//
//        if (item.getItemId() == R.id.menu_invoke_tabnav){
//            if (getNavMode() == ActionBar.NAVIGATION_MODE_TABS){
//                this.reportBack(tag, "You are already in tab nav");
//            } else {
//                this.invokeTabNav();
//            }
//            return true;
//        }
//
//        if (item.getItemId() == R.id.menu_invoke_listNav){
//            if (getNavMode() == ActionBar.NAVIGATION_MODE_LIST){
//                this.reportBack(tag, "You are already in list nav");
//            } else {
//                this.invokeListNav();
//            }
//            return true;
//        }
//
//        if (item.getItemId() == R.id.menu_invoke_standardnav){
//            if (getNavMode() == ActionBar.NAVIGATION_MODE_STANDARD){
//                this.reportBack(tag, "You are already in standard nav");
//            } else {
//                this.invokeStandardNav();
//            }
//            return true;
//        }
//
//        return false;
//    }

    private int getNavMode(){
        ActionBar bar = this.getActionBar();
        return bar.getNavigationMode();
    }

    private void invokeTabNav(){
        Intent i = new Intent(this, TabNavigationActionBarActivity.class);
        startActivity(i);
    }

    private void invokeListNav(){
        Intent i = new Intent(this, ListNavigationActionBarActivity.class);
        startActivity(i);
    }

    private void invokeStandardNav(){
        Intent i = new Intent(this, StandardNavigationActionBarActivity.class);
        startActivity(i);
    }
}
