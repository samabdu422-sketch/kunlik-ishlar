package uz.kunlik.ishlar;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView web;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        web = new WebView(this);
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        web.setWebViewClient(new WebViewClient());
        web.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView v, String url, String msg, JsResult r) {
                new AlertDialog.Builder(MainActivity.this).setMessage(msg)
                    .setPositiveButton("OK", (d, w) -> r.confirm())
                    .setOnCancelListener(d -> r.cancel()).show();
                return true;
            }
            @Override
            public boolean onJsConfirm(WebView v, String url, String msg, JsResult r) {
                new AlertDialog.Builder(MainActivity.this).setMessage(msg)
                    .setPositiveButton("Ha", (d, w) -> r.confirm())
                    .setNegativeButton("Yoʻq", (d, w) -> r.cancel())
                    .setOnCancelListener(d -> r.cancel()).show();
                return true;
            }
        });
        setContentView(web);
        web.loadUrl("file:///android_asset/index.html");
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
