package unipe.aula.com.josiasandroidestagio_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class WebActivity extends AppCompatActivity {

    private EditText url_id;
    private WebView webview_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        url_id = (EditText) findViewById(R.id.url_id);
        webview_id = (WebView)  findViewById(R.id.webview_id);

        webview_id.setWebViewClient(new CustomWebClient());
        webview_id.getSettings().setLoadsImagesAutomatically(true);
        webview_id.getSettings().setJavaScriptEnabled(true);
        webview_id.getSettings().setSupportZoom(true);
    }

    /* As vezes pega as vezes não ?? problema com o meu cel */
    public void acessarURL(View view) {
        String urlAbrir = url_id.getText().toString();
        webview_id.loadUrl(urlAbrir);
    }

    private class CustomWebClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
