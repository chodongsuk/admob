package kr.ds.admob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAdView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private LinearLayout viewNativeRoot;
    private AdAdmobNativeAdvancedView mAdAdmobNativeAdvancedView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewNativeRoot = (LinearLayout) findViewById(R.id.view_native_root);
        mAdAdmobNativeAdvancedView = new AdAdmobNativeAdvancedView(getApplicationContext());
        mAdAdmobNativeAdvancedView.setContainer(viewNativeRoot).setLayout(R.layout.admob_content_top).setCallBack(new AdAdmobNativeAdvancedView.ResultListener() {
            @Override
            public <T> void OnLoad() {

            }

            @Override
            public <T> void OnFail() {
                viewNativeRoot.setVisibility(View.GONE);
            }
        });
    }
}
