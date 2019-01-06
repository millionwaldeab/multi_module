package com.example.theex.multiplemodulesapplicationsample;

import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk=Build.VERSION_CODES.LOLLIPOP) //add this if the test will include Lollipop
public class MainActivityTest {
    private MainActivity mMainActivity;

    @Before
    public void setUp(){
        mMainActivity = Robolectric.buildActivity(MainActivity.class).create().resume().get();
    }

    @Test
    public void testChangeFabText(){
        FloatingActionButton fab = mMainActivity.findViewById(R.id.fab);
        Assert.assertNotNull("TextView could not be found", fab);
        Assert.assertTrue("fab color", fab.hasFocus());
    }

    @Test
    public void testFabClick(){
        mMainActivity.fab.performClick();
        assert(mMainActivity.mHelloText.getText()).equals("Hey y'all");
    }
}
