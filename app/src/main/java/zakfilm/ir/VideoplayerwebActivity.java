package zakfilm.ir;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.*;
import android.widget.LinearLayout;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.adivery.sdk.*;
import com.google.android.exoplayer2.ui.*;
import com.google.firebase.FirebaseApp;
import eightbitlab.com.blurview.*;
import ir.amirsina.mykey.util.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import smartdevelop.ir.eram.showcaseviewlib.*;
import android.content.pm.PackageManager;
import android.app.DownloadManager;
import android.content.Context;
import android.net.ConnectivityManager;

public class VideoplayerwebActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private double back = 0;
	private boolean isAppInstalled = false;
	private String url = "";
	private String filen = "";
	
	private LinearLayout linear1;
	private WebView webview1;
	
	private TimerTask t;
	private RequestNetwork request;
	private RequestNetwork.RequestListener _request_request_listener;
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.videoplayerweb);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		request = new RequestNetwork(this);
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				if (_url.equals("https://upera.tv/app") || _url.equals("https://upera.tv/")) {
					finish();
					overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
				} else {
					
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		_request_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		back = 0;
		getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
		
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) { getWindow().getAttributes().layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES; }
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
		getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); 
		getWindow().setNavigationBarColor(0xFF000000);
		getWindow().setStatusBarColor(0xFF000000);
		try {
			webview1.clearCache(true);
			webview1.clearHistory();
		} catch (Exception e) {
			
		}
		//Check if ADM install
		PackageManager packageManager = getApplicationContext().getPackageManager();
		try {
			packageManager.getPackageInfo("com.dv.adm", PackageManager.GET_ACTIVITIES);
			isAppInstalled = true;
		} catch (PackageManager.NameNotFoundException e) {
			isAppInstalled = false;
		}
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF000000".replace("0xFF" , "#")));
		}
		webview1.loadUrl("https://z2fwzmlsbwrvd25sb2fkcw.gapfilm.ir/stream/ZARDFILM/32102/?src=GF_AG_ZARDF_40407");
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.setWebViewClient(new WebViewClient());
		
		webview1.setWebChromeClient(new WebChromeClient());
		webview1.setWebChromeClient(new CustomWebClient());
		webview1.getSettings().setDomStorageEnabled(true);  // فعال کردن ذخیره‌سازی DOM
		webview1.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
		
		webview1.getSettings().setMediaPlaybackRequiresUserGesture(false);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
			// برای Android 10 (API 29) و بالاتر
			webview1.getSettings().setForceDark(WebSettings.FORCE_DARK_ON);
		} else {
			// برای نسخه‌های پایین‌تر از API 29 - استفاده از CSS
			String darkModeCSS = "javascript:(function() {" +
			"var style = document.createElement('style');" +
			"style.innerHTML = 'body { background-color: #121212 !important; color: #ffffff !important; }';" +
			"document.head.appendChild(style);" +
			"})();";
			webview1.evaluateJavascript(darkModeCSS, null);
		}
		webview1.setDownloadListener(new DownloadListener() {
			public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
				
				if (isAppInstalled) {
					url = url;
					filen = url;
					try {
						Intent intent = new Intent(Intent.ACTION_VIEW);
						intent.setClassName("com.dv.adm", "com.dv.adm.AEditor");
						intent.putExtra("com.android.browser.application_id", getApplicationContext().getPackageName());
						intent.setData(Uri.parse(url));
						intent.putExtra("com.dv.adm.filename", filen);
						startActivity(intent);
					} catch (ActivityNotFoundException e) {
						e.printStackTrace();
						
						SketchwareUtil.showMessage(getApplicationContext(), e.toString());
					}
				} else {
					com.google.android.material.snackbar.Snackbar.make(linear1, "لطفا برنامه adm را در گوشی خود نصب کنید", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("باشه", new View.OnClickListener(){
						@Override
						public void onClick(View _view) {
							
						}
					}).show();
				}
			}
		});
	}
	
	@Override
	public void onBackPressed() {
		if (webview1.canGoBack()) {
			webview1.goBack();
		} else {
			finish();
			overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
		}
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
		_vpn();
		if (vpn()) {
			i.setClass(getApplicationContext(), ErrorActivity.class);
			startActivity(i);
			VideoplayerwebActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
		} else {
			
		}
	}
	public void _FullScreenLib() {
		// Note Again Some one coded this credit goes to him
	}
	public class CustomWebClient extends WebChromeClient {
		
		private View mCustomView;
		private WebChromeClient.CustomViewCallback mCustomViewCallback;
		protected FrameLayout frame;
		
		// Initially mOriginalOrientation is set to Landscape
		private int mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
		private int mOriginalSystemUiVisibility;
		
		// Constructor for CustomWebClient
		public CustomWebClient() {}
		
		public Bitmap getDefaultVideoPoster() {
			if (VideoplayerwebActivity.this == null) {
				return null;
			}
			return BitmapFactory.decodeResource(VideoplayerwebActivity.this.getApplicationContext().getResources(), 2130837573);
		}
		
		public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback viewCallback) {
			if (this.mCustomView != null) {
				onHideCustomView();
				return;
			}
			
			this.mCustomView = paramView;
			this.mOriginalSystemUiVisibility = VideoplayerwebActivity.this.getWindow().getDecorView().getSystemUiVisibility();
			
			// When CustomView is shown screen orientation changes to mOriginalOrientation (Landscape).
			VideoplayerwebActivity.this.setRequestedOrientation(this.mOriginalOrientation);
			
			// After that mOriginalOrientation is set to portrait.
			this.mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
			this.mCustomViewCallback = viewCallback;
			
			((FrameLayout) VideoplayerwebActivity.this.getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
			VideoplayerwebActivity.this.getWindow().getDecorView().setSystemUiVisibility(3846);
		}
		
		public void onHideCustomView() {
			((FrameLayout) VideoplayerwebActivity.this.getWindow().getDecorView()).removeView(this.mCustomView);
			this.mCustomView = null;
			VideoplayerwebActivity.this.getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
			
			// When CustomView is hidden, screen orientation is set to mOriginalOrientation (portrait).
			VideoplayerwebActivity.this.setRequestedOrientation(this.mOriginalOrientation);
			
			// After that mOriginalOrientation is set to landscape.
			this.mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
			this.mCustomViewCallback.onCustomViewHidden();
			this.mCustomViewCallback = null;
		}
	}
	
	{
		
		
	}
	
	
	public void _vpn() {
	}
	public boolean vpn() {
		String iface = "";
		try {
			for (java.net.NetworkInterface networkInterface : Collections.list(java.net.NetworkInterface.getNetworkInterfaces())) {
				if (networkInterface.isUp())
				iface = networkInterface.getName();
				Log.d("DEBUG", "IFACE NAME: " + iface);
				if ( iface.contains("tun") || iface.contains("ppp") || iface.contains("pptp")) {
					return true;
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return false;
	}
	{
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}