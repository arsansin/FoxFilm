package zakfilm.ir;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.media.MediaPlayer;
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
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.adivery.sdk.*;
import com.airbnb.lottie.*;
import com.google.android.exoplayer2.ui.*;
import com.google.firebase.FirebaseApp;
import eightbitlab.com.blurview.*;
import ir.amirsina.mykey.util.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import smartdevelop.ir.eram.showcaseviewlib.*;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class PurchaseActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private String link = "";
	private String amount = "";
	private HashMap<String, Object> create = new HashMap<>();
	private String type = "";
	
	private LinearLayout linear1;
	private LinearLayout web;
	private LinearLayout linear6;
	private LottieAnimationView lottie2;
	private TextView textview1;
	private LinearLayout linear5;
	private WebView webview1;
	
	private Intent intent = new Intent();
	private RequestNetwork net;
	private RequestNetwork.RequestListener _net_request_listener;
	private SharedPreferences gold;
	private TimerTask done;
	private SharedPreferences buy;
	private MediaPlayer media;
	private MediaPlayer ok;
	private AlertDialog.Builder er;
	private ProgressDialog prd;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.purchase);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		web = findViewById(R.id.web);
		linear6 = findViewById(R.id.linear6);
		lottie2 = findViewById(R.id.lottie2);
		textview1 = findViewById(R.id.textview1);
		linear5 = findViewById(R.id.linear5);
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		net = new RequestNetwork(this);
		gold = getSharedPreferences("gold", Activity.MODE_PRIVATE);
		buy = getSharedPreferences("buy", Activity.MODE_PRIVATE);
		er = new AlertDialog.Builder(this);
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				linear1.setVisibility(View.VISIBLE);
				web.setVisibility(View.GONE);
				if (webview1.getUrl().contains("Status=OK")) {
					// اگر پرداخت موفقیت آمیز بود
					_sabteEshterak();
					prd = new ProgressDialog(PurchaseActivity.this);
					prd.setTitle("درحال ثبت اشتراک...");
					prd.setCancelable(true);
					prd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
					prd.show();
				} else {
					if (webview1.getUrl().contains("Status=NOK")) {
						// اگر پرداخت به هر دلیل موفق نبود
						SketchwareUtil.showMessage(getApplicationContext(), "پرداخت تکمیل نشد");
						finish();
					}
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				web.setVisibility(View.VISIBLE);
				linear1.setVisibility(View.GONE);
				getWindow().setStatusBarColor(Color.parseColor("#FF232852"));
				getWindow().setNavigationBarColor(Color.parseColor("#FFffffff"));
				getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
				if (!webview1.getUrl().startsWith("https://zarinp.al/")) {
					getWindow().setStatusBarColor(Color.parseColor("#FFffffff"));
					getWindow().setNavigationBarColor(Color.parseColor("#FFffffff"));
					getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
				}
				super.onPageFinished(_param1, _param2);
			}
		});
		
		_net_request_listener = new RequestNetwork.RequestListener() {
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
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			final Window window = PurchaseActivity.this.getWindow();
			window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			window.setStatusBarColor(0xFFFFFFFF);
		}
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFFecf5fe".replace("0xFF" , "#")));
		}
		if (!SketchwareUtil.isConnected(getApplicationContext())) {
			SketchwareUtil.showMessage(getApplicationContext(), "اتصال اینترنتی ندارید");
			finish();
		}
		link = getIntent().getStringExtra("link");
		amount = getIntent().getStringExtra("amount");
		type = getIntent().getStringExtra("type");
		webview1.loadUrl(link);
		web.setVisibility(View.GONE);
		linear1.setVisibility(View.VISIBLE);
		webview1.setVerticalScrollBarEnabled(false);
		webview1.setHorizontalScrollBarEnabled(false);
	}
	
	@Override
	public void onBackPressed() {
		if (webview1.getUrl().contains(link)) {
			finish();
		} else {
			if (webview1.getUrl().contains("https://sepehr.shaparak.ir:8080/Mpay")) {
				webview1.goBack();
			}
		}
	}
	
	public void _sabteEshterak() {
		try {
			// 📁 مسیر فایل JSON داخل حافظه برنامه
			String addres = FileUtil.getPackageDataDir(getApplicationContext()).concat("/account.json");
			
			// 🧾 ساخت داده‌های حساب
			HashMap<String, Object> create = new HashMap<>();
			
			create.put("type", type);
			// اطمینان از ساختار HashMap
			create = new Gson().fromJson(
			new Gson().toJson(create),
			new TypeToken<HashMap<String, Object>>(){}.getType()
			);
			
			// 🕒 تاریخ فعلی (خرید)
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String dateBuy = sdf.format(calendar.getTime());
			
			// 📅 محاسبه تاریخ پایان بر اساس type
			int type = Integer.parseInt(create.get("type").toString());
			calendar.add(Calendar.MONTH, type);
			String dateEnd = sdf.format(calendar.getTime());
			
			// 🔹 ثبت در HashMap
			create.put("date_buy", dateBuy);
			create.put("date_end", dateEnd);
			
			// ✅ ذخیره در فایل JSON
			String jsonData = new Gson().toJson(create);
			FileUtil.writeFile(addres, jsonData);
			
			
			// برای اطمینان در Log چاپ کن
			Log.d("ACCOUNT_JSON", "Saved to: " + addres + "\n" + jsonData);
			gold.edit().putString("gold", "dghdhegejzy6e728274").commit();
			buy.edit().putString("buy", "1").commit();
			ok = MediaPlayer.create(getApplicationContext(), R.raw.playy);
			ok.start();
			SketchwareUtil.showMessage(getApplicationContext(), "اشتراک تمدید شد❤️");
			finish();
		} catch (Exception e) {
			er.setMessage("خطا:".concat("خرید اشتراک ".concat(getIntent().getStringExtra("type").concat(" ماهه ناموفق بود!".concat("کد پیگیری:".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(10000), (int)(99999)))).concat(" آنرا یادداشت کرده و برای پشتیبانی ارسال کنید.باتشکر")))))));
			er.setPositiveButton("بستن", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			er.create().show();
		}
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