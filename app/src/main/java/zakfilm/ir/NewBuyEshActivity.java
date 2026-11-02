package zakfilm.ir;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.adivery.sdk.*;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.ui.*;
import com.google.firebase.FirebaseApp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import eightbitlab.com.blurview.*;
import eightbitlab.com.blurview.BlurView;
import ir.amirsina.mykey.util.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import smartdevelop.ir.eram.showcaseviewlib.*;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import androidx.annotation.Nullable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
import android.widget.ImageView;
import android.content.pm.PackageManager;
import android.app.DownloadManager;
import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class NewBuyEshActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private android.os.Handler timerHandler;
	private Runnable timerRunnable;
	private boolean ch = false;
	private boolean isSubscribed = false;
	private String Eshtrak = "";
	private String Eshtrak1 = "";
	private String mPublicKey = "";
	private String Eshtrak2 = "";
	private String Eshtrak3 = "";
	private HashMap<String, Object> create = new HashMap<>();
	private String type = "";
	int RC_REQUEST;
	private double dayy = 0;
	private double coin = 0;
	private String imageUrl = "";
	private HashMap<String, Object> get_data = new HashMap<>();
	private HashMap<String, Object> g = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> Offer = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear112;
	private LinearLayout linear122;
	private LinearLayout linear113;
	private LinearLayout linear130;
	private LinearLayout linear115;
	private LinearLayout linear116;
	private LinearLayout linear111;
	private BlurView blurView;
	private LinearLayout linear50;
	private RelativeLayout relativelayout1;
	private ImageView imageview2;
	private LinearLayout linear104;
	private LinearLayout linear6;
	private LinearLayout linear105;
	private LinearLayout linear4;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private LinearLayout linear121;
	private TextView textview24;
	private LinearLayout linear131;
	private LinearLayout linear123;
	private TextView textview16;
	private TextView textview23;
	private ImageView imageview4;
	private ImageView imageview5;
	
	private ProgressDialog pd;
	private TimerTask t;
	private IabHelper mHelper;
	private SharedPreferences save;
	private AlertDialog.Builder dialogR;
	private MediaPlayer ok;
	private SharedPreferences gold;
	private SharedPreferences buy;
	private MediaPlayer m;
	private Intent i = new Intent();
	private SharedPreferences save2;
	private Calendar s = Calendar.getInstance();
	private RequestNetwork Net_Offer;
	private RequestNetwork.RequestListener _Net_Offer_request_listener;
	private RequestNetwork get;
	private RequestNetwork.RequestListener _get_request_listener;
	private RequestNetwork get_b;
	private RequestNetwork.RequestListener _get_b_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.new_buy_esh);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear112 = findViewById(R.id.linear112);
		linear122 = findViewById(R.id.linear122);
		linear113 = findViewById(R.id.linear113);
		linear130 = findViewById(R.id.linear130);
		linear115 = findViewById(R.id.linear115);
		linear116 = findViewById(R.id.linear116);
		linear111 = findViewById(R.id.linear111);
		blurView = findViewById(R.id.blurView);
		linear50 = findViewById(R.id.linear50);
		relativelayout1 = findViewById(R.id.relativelayout1);
		imageview2 = findViewById(R.id.imageview2);
		linear104 = findViewById(R.id.linear104);
		linear6 = findViewById(R.id.linear6);
		linear105 = findViewById(R.id.linear105);
		linear4 = findViewById(R.id.linear4);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		linear121 = findViewById(R.id.linear121);
		textview24 = findViewById(R.id.textview24);
		linear131 = findViewById(R.id.linear131);
		linear123 = findViewById(R.id.linear123);
		textview16 = findViewById(R.id.textview16);
		textview23 = findViewById(R.id.textview23);
		imageview4 = findViewById(R.id.imageview4);
		imageview5 = findViewById(R.id.imageview5);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		dialogR = new AlertDialog.Builder(this);
		gold = getSharedPreferences("gold", Activity.MODE_PRIVATE);
		buy = getSharedPreferences("buy", Activity.MODE_PRIVATE);
		save2 = getSharedPreferences("save2", Activity.MODE_PRIVATE);
		Net_Offer = new RequestNetwork(this);
		get = new RequestNetwork(this);
		get_b = new RequestNetwork(this);
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (ch) {
					type = "001";
					_buy_esh(Eshtrak1);
				}
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), BuyEshActivity.class);
				startActivity(i);
			}
		});
		
		_Net_Offer_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try {
					if (_response.isEmpty()) {
						
					} else {
						Offer = new Gson().fromJson(_response, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
						
					}
				} catch (Exception e) {
					
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_get_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				get_data = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
				if (save2.getString(String.valueOf((long)(dayy)), "").equals("")) {
					save2.edit().putString(String.valueOf((long)(dayy)), get_data.get("image").toString()).commit();
					save2.edit().putString(String.valueOf((long)(dayy)).concat("_button"), get_data.get("image_button").toString()).commit();
					save2.edit().putString(String.valueOf((long)(dayy)).concat("_color_back_text"), get_data.get("color_back_text").toString()).commit();
					save2.edit().putString(String.valueOf((long)(dayy)).concat("_color_text"), get_data.get("color_text").toString()).commit();
					Glide.with(getApplicationContext()).load(Uri.parse(get_data.get("image").toString())).into(imageview2);
					imageUrl = get_data.get("image").toString();
					
					LinearLayout myLayout = findViewById(R.id.linear111);
					
					new AsyncTask<Void, Void, Bitmap>() {
						@Override
						protected Bitmap doInBackground(Void... params) {
							try {
								java.net.URL url = new java.net.URL(imageUrl);
								java.net.HttpURLConnection connection = (java.net.HttpURLConnection) url.openConnection();
								connection.setDoInput(true);
								connection.connect();
								java.io.InputStream input = connection.getInputStream();
								Bitmap bitmap = android.graphics.BitmapFactory.decodeStream(input);
								return bitmap;
							} catch (Exception e) {
								return null;
							}
						}
						
						@Override
						protected void onPostExecute(Bitmap bitmap) {
							if (bitmap != null) {
								android.graphics.drawable.BitmapDrawable drawable = new android.graphics.drawable.BitmapDrawable(getResources(), bitmap);
								myLayout.setBackground(drawable);
							} else {
								myLayout.setBackgroundColor(0xFFDDDDDD);
							}
						}
					}.execute();
					_linear_g(linear4, 15, get_data.get("color_back_text").toString());
					_linear_g(linear105, 15, get_data.get("color_back_text").toString());
					_linear_g(linear6, 15, get_data.get("color_back_text").toString());
					_color_text(textview7, get_data.get("color_text").toString());
					_color_text(textview8, get_data.get("color_text").toString());
					_color_text(textview9, get_data.get("color_text").toString());
				} else {
					Glide.with(getApplicationContext()).load(Uri.parse(save2.getString(String.valueOf((long)(dayy)), ""))).into(imageview2);
					imageUrl = save2.getString(String.valueOf((long)(dayy)), "");
					
					LinearLayout myLayout = findViewById(R.id.linear111);
					
					// اجرای دانلود در پس‌زمینه (AsyncTask داخلی Sketchware)
					new AsyncTask<Void, Void, Bitmap>() {
						@Override
						protected Bitmap doInBackground(Void... params) {
							try {
								java.net.URL url = new java.net.URL(imageUrl);
								java.net.HttpURLConnection connection = (java.net.HttpURLConnection) url.openConnection();
								connection.setDoInput(true);
								connection.connect();
								java.io.InputStream input = connection.getInputStream();
								Bitmap bitmap = android.graphics.BitmapFactory.decodeStream(input);
								return bitmap;
							} catch (Exception e) {
								return null;
							}
						}
						
						@Override
						protected void onPostExecute(Bitmap bitmap) {
							if (bitmap != null) {
								android.graphics.drawable.BitmapDrawable drawable = new android.graphics.drawable.BitmapDrawable(getResources(), bitmap);
								myLayout.setBackground(drawable);
							} else {
								// اگه دانلود نشد یه رنگ بگذار
								myLayout.setBackgroundColor(0xFFDDDDDD);
							}
						}
					}.execute();
					_linear_g(linear4, 15, save2.getString(String.valueOf((long)(dayy)).concat("_color_back_text"), ""));
					_linear_g(linear105, 15, save2.getString(String.valueOf((long)(dayy)).concat("_color_back_text"), ""));
					_linear_g(linear6, 15, save2.getString(String.valueOf((long)(dayy)).concat("_color_back_text"), ""));
					_color_text(textview7, save2.getString(String.valueOf((long)(dayy)).concat("_color_text"), ""));
					_color_text(textview8, save2.getString(String.valueOf((long)(dayy)).concat("_color_text"), ""));
					_color_text(textview9, save2.getString(String.valueOf((long)(dayy)).concat("_color_text"), ""));
				}
				
				
				// روش صحیح: پس از اندازه‌گیری
				linear1.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
					@Override
					public void onGlobalLayout() {
						linear1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
						
						int height = linear1.getHeight(); // گرفتن ارتفاع linear1
						
						// تنظیم ارتفاع linear111 به همان مقدار
						ViewGroup.LayoutParams params = linear111.getLayoutParams();
						params.height = height;
						linear111.setLayoutParams(params);
					}
				});
				_a(linear112, 20, 20, 0, 0, 0xFF6A1B9A);
				linear112.setOutlineProvider(new ViewOutlineProvider() {
					@Override
					public void getOutline(View view, Outline outline) {
						int width = view.getWidth();
						int height = view.getHeight();
						if (width == 0 || height == 0) return;
						
						// شعاع گردی گوشه‌های بالا (مثلاً 50 پیکسل)
						float radius = 50f;
						
						// ساخت مسیر: دو گوشه بالا گرد، دو گوشه پایین تیز
						Path path = new Path();
						path.moveTo(0, radius);
						path.quadTo(0, 0, radius, 0);
						path.lineTo(width - radius, 0);
						path.quadTo(width, 0, width, radius);
						path.lineTo(width, height);
						path.lineTo(0, height);
						path.close();
						
						outline.setConvexPath(path);
					}
				});
				linear112.setClipToOutline(true);
				linear112.setVisibility(View.VISIBLE);
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_get_b_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				g = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		/*"لینر 89//"*/
		
		android.content.SharedPreferences prefs = getSharedPreferences("TimerPrefs", MODE_PRIVATE);
		long lastSavedDate = prefs.getLong("last_date", -1);
		int lastDayCount = prefs.getInt("day_count", 0);
		int currentDayNumber;
		
		if (lastSavedDate == -1) {
			currentDayNumber = 1;
		} else {
			long now = System.currentTimeMillis();
			long oneDay = 24L * 60L * 60L * 1000L;
			int daysPassed = (int) ((now - lastSavedDate) / oneDay);
			currentDayNumber = lastDayCount + daysPassed;
			if (currentDayNumber < 1) currentDayNumber = 1;
		}
		
		
		TextView tvHour = findViewById(R.id.textview7);
		TextView tvMinute = findViewById(R.id.textview8);
		TextView tvSecond = findViewById(R.id.textview9);
		
		dayy = currentDayNumber;
		
		prefs.edit().putLong("last_date", System.currentTimeMillis())
		.putInt("day_count", currentDayNumber).apply();
		
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.add(java.util.Calendar.DAY_OF_MONTH, 1);
		cal.set(java.util.Calendar.HOUR_OF_DAY, 0);
		cal.set(java.util.Calendar.MINUTE, 0);
		cal.set(java.util.Calendar.SECOND, 0);
		cal.set(java.util.Calendar.MILLISECOND, 0);
		long nextMidnight = cal.getTimeInMillis();
		long now = System.currentTimeMillis();
		long timeLeft = nextMidnight - now;
		
		final int[] dayCounter = {currentDayNumber};
		final long[] remaining = {timeLeft};
		
		new android.os.CountDownTimer(remaining[0], 1000) {
			@Override
			public void onTick(long millisUntilFinished) {
				remaining[0] = millisUntilFinished;
				long hours = remaining[0] / 3600000;
				long minutes = (remaining[0] % 3600000) / 60000;
				long seconds = (remaining[0] % 60000) / 1000;
				
				tvHour.setText(String.format("%02d", hours).replace("۰","0").replace("۱","1").replace("۲","2").replace("۳","3").replace("۴","4").replace("۵","5").replace("۶","6").replace("۷","7").replace("۸","8").replace("۹","9"));
				tvMinute.setText(String.format("%02d", minutes).replace("۰","0").replace("۱","1").replace("۲","2").replace("۳","3").replace("۴","4").replace("۵","5").replace("۶","6").replace("۷","7").replace("۸","8").replace("۹","9"));
				tvSecond.setText(String.format("%02d", seconds).replace("۰","0").replace("۱","1").replace("۲","2").replace("۳","3").replace("۴","4").replace("۵","5").replace("۶","6").replace("۷","7").replace("۸","8").replace("۹","9"));
			}
			@Override
			public void onFinish() {
				
				dayCounter[0]++;
				android.widget.Toast.makeText(NewBuyEshActivity.this, "New day started", Toast.LENGTH_SHORT).show();
				
				
				getSharedPreferences("TimerPrefs", MODE_PRIVATE).edit()
				.putLong("last_date", System.currentTimeMillis())
				.putInt("day_count", dayCounter[0]).apply();
				
				java.util.Calendar cal2 = java.util.Calendar.getInstance();
				cal2.add(java.util.Calendar.DAY_OF_MONTH, 1);
				cal2.set(java.util.Calendar.HOUR_OF_DAY, 0);
				cal2.set(java.util.Calendar.MINUTE, 0);
				cal2.set(java.util.Calendar.SECOND, 0);
				cal2.set(java.util.Calendar.MILLISECOND, 0);
				long newTimeLeft = cal2.getTimeInMillis() - System.currentTimeMillis();
				
				
				new android.os.CountDownTimer(newTimeLeft, 1000) {
					@Override
					public void onTick(long millisUntilFinished) {
						long h = millisUntilFinished / 3600000;
						long m = (millisUntilFinished % 3600000) / 60000;
						long s = (millisUntilFinished % 60000) / 1000;
						
						tvHour.setText(String.format("%02d", h).replace("۰","0").replace("۱","1").replace("۲","2").replace("۳","3").replace("۴","4").replace("۵","5").replace("۶","6").replace("۷","7").replace("۸","8").replace("۹","9"));
						tvMinute.setText(String.format("%02d", m).replace("۰","0").replace("۱","1").replace("۲","2").replace("۳","3").replace("۴","4").replace("۵","5").replace("۶","6").replace("۷","7").replace("۸","8").replace("۹","9"));
						tvSecond.setText(String.format("%02d", s).replace("۰","0").replace("۱","1").replace("۲","2").replace("۳","3").replace("۴","4").replace("۵","5").replace("۶","6").replace("۷","7").replace("۸","8").replace("۹","9"));
					}
					@Override
					public void onFinish() {
						
						android.widget.Toast.makeText(NewBuyEshActivity.this, "Day " + (dayCounter[0]+1) + " started", Toast.LENGTH_SHORT).show();
					}
				}.start();
			}
		}.start();
		get.startRequestNetwork(RequestNetworkController.GET, "https://fox-filme.ir/offer_Subscription/random_image.php", "", _get_request_listener);
		float radius = 15;
		
		View decorView = getWindow().getDecorView();
		
		//ViewGroup you want to start blur from. Choose root as close to BlurView in hierarchy as possible.
		
		ViewGroup rootView = (ViewGroup) decorView.findViewById(android.R.id.content);
		
		//Set drawable to draw in the beginning of each blurred frame (Optional). 
		//Can be used in case your layout has a lot of transparent space and your content
		//gets kinda lost after after blur is applied.
		
		Drawable windowBackground = decorView.getBackground();
		
		blurView.setupWith(rootView)
		.setFrameClearDrawable(windowBackground)
		.setBlurAlgorithm(new RenderScriptBlur(this))
		.setBlurRadius(radius)
		.setBlurAutoUpdate(true);
		linear112.setVisibility(View.GONE);
		/*"///////////************////////////"*/
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			final Window window = NewBuyEshActivity.this.getWindow();
			window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			window.setStatusBarColor(0xFF0F1620);
		}
		textview16.setText(save.getString("blit", ""));
		linear123.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF00E676, 0xFF263238));
		linear121.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF4FC3F7, 0xFF000000));
		try {
			_dialog();
isSubscribed = false;
ch = false;
// سه بلوک پایین شناسه محصول مایکت بزار
Eshtrak = "Eshtrak00";
Eshtrak1 = "Eshtrak001";
// در بلوک پایین کلید پرداخت مایکت بزار
mPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCrPdLhuywGkAUTil2rXAEUHtsNJioL8h2D5tbOVBZcdOHF6r/zo4wpCOhcddhJvgSfE3fgtreI7EB9zT8ZchPFbgbBpY737tV0za608sTeAIpfKNAQhnJOGVDmg6lk1YNyrXxGmKPdSx1fGlASdL4QLMRiGwY5hwUU071CviduvwIDAQAB";
//Needs RequestNetwork to work!
ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
NetworkInfo netInfo = cm.getActiveNetworkInfo();
if (netInfo != null && netInfo.isConnectedOrConnecting()) { mHelper = new IabHelper(this, mPublicKey);
mHelper.enableDebugLogging(true);
mHelper.startSetup(new IabHelper.OnIabSetupFinishedListener() {
	            public void onIabSetupFinished(IabResult result) {
		               
		
		                if (!result.isSuccess()) {
                          SketchwareUtil.showMessage(getApplicationContext(),
        "Code = " + result.getResponse() +
        "\nMsg = " + result.getMessage());
ch = false;
			                    return;
			                }
		
		                if (mHelper == null) return;

// موقعی که هر دفعه پرداخت چک میشه
_cancel_pd();

mHelper.queryInventoryAsync(mGotInventoryListener);

		            }
	        }); } else { SketchwareUtil.showMessage(getApplicationContext(), "لطفا اینترنت خود را بررسی کنید..."); }
} catch (Exception e) {
SketchwareUtil.showMessage(getApplicationContext(), "خطای سیستمی");
}
}

@Override
protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
super.onActivityResult(_requestCode, _resultCode, _data);
if (mHelper == null) return;


if (!mHelper.handleActivityResult(_requestCode, _resultCode, _data)) {
	
	
	
	super.onActivityResult(_requestCode, _resultCode, _data);
}
else {
	
}
switch (_requestCode) {

default:
break;
}
}

public void _coloredShadowByIngsha(final View _view, final String _layoutColor, final String _shadowColor, final double _radius, final double _depth) {
android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
gd.setColor(Color.parseColor(_layoutColor)); 
gd.setCornerRadius((float)_radius);
_view.setBackground(gd);

if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
    _view.setOutlineAmbientShadowColor(Color.parseColor(_shadowColor));
    _view.setOutlineSpotShadowColor(Color.parseColor(_shadowColor));
    
    _view.setElevation((float)_depth); 
    
    _view.setClipToOutline(true);
}

}


public void _shape(final double _top1, final double _top2, final double _bottom2, final double _bottom1, final String _inside_color, final String _side_color, final double _side_size, final View _view) {
Double tlr = _top1;
Double trr = _top2;
Double blr = _bottom2;
Double brr = _bottom1;
Double sw = _side_size;
android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
s.setCornerRadii(new float[] {tlr.floatValue(),tlr.floatValue(), trr.floatValue(),trr.floatValue(), blr.floatValue(),blr.floatValue(), brr.floatValue(),brr.floatValue()}); 

s.setColor(Color.parseColor(_inside_color));
s.setStroke(sw.intValue(), Color.parseColor(_side_color));
_view.setBackground(s);
}


public void _removeScollBar(final View _view) {
_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
}


public void _dialog() {
pd = new ProgressDialog(NewBuyEshActivity.this);
pd.setMessage("درحال بارگذاری لطفا کمی صبر کنید...");
pd.setCancelable(false);
pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
pd.show();
}


public void _cancel_pd() {
ch = true;
try {
t = new TimerTask() {
@Override
public void run() {
runOnUiThread(new Runnable() {
@Override
public void run() {
pd.dismiss();
}
});
}
};
_timer.schedule(t, (int)(3000));
} catch (Exception e) {
 
}
}


public void _Extra() {
}
IabHelper.QueryInventoryFinishedListener mGotInventoryListener = new IabHelper.QueryInventoryFinishedListener() {
	        public void onQueryInventoryFinished(IabResult result, Inventory inventory) {
		            
		

		            if (mHelper == null) return;
		
		            // Is it a failure?
		            if (result.isFailure()) {
			                // خطا در ارتباط با سرور
			                return;
			            }
		            
		            // ثبت محصول و تعداد پلن ها 
Purchase p = inventory.getPurchase(Eshtrak);
            isSubscribed = (p != null && verifyDeveloperPayload(p));
Purchase p1 = inventory.getPurchase(Eshtrak1);
            isSubscribed = (p1 != null && verifyDeveloperPayload(p1));
		
		 }
};
boolean verifyDeveloperPayload(Purchase p) {
	        String payload = p.getDeveloperPayload();
	        return true;
	  }
    IabHelper.OnConsumeFinishedListener mConsumeFinishedListener = new IabHelper.OnConsumeFinishedListener() {
	        public void onConsumeFinished(Purchase purchase, IabResult result) {
		            
		

		            if (mHelper == null) return;
		
		            if (result.isSuccess()) {
			                 
			            }
		            else {
			                 
			            }
		            
		        }
	    };
IabHelper.OnIabPurchaseFinishedListener mPurchaseFinishedListener = new IabHelper.OnIabPurchaseFinishedListener() {
	        public void onIabPurchaseFinished(IabResult result, Purchase purchase) {
		            
		

		            if (mHelper == null) return;
		
		            if (result.isFailure()) {
			                // وقتی پرداخت لغو یا انجام نشد.
SketchwareUtil.showMessage(getApplicationContext(), "پرداخت انجام نشد!");
			                return;
			            }
		            if (!verifyDeveloperPayload(purchase)) {
			                
			                return;
			            }
		
		            
                     //وقتی پرداخت موفقیت آمیز بود.
mHelper.consumeAsync(purchase, mConsumeFinishedListener);
if (type.equals("00")) {
if (save.contains("blit")) {
if (save.getString("blit", "").isEmpty()) {
save.edit().putString("blit", "0").commit();
}
} else {
save.edit().putString("blit", "0").commit();
}
save.edit().putString("blit", String.valueOf((long)(Double.parseDouble(save.getString("blit", "")) + 1))).commit();
SketchwareUtil.showMessage(getApplicationContext(), "1+ بلیط دانلود دریافت شد🔥");
} else {
_sabteEshterak();
}
m = MediaPlayer.create(getApplicationContext(), R.raw.coicku);
m.start();


		        }
	    };
{
}


public void _buy_esh(final String _eshtrak) {
String payload = "";
mHelper.launchPurchaseFlow(this, _eshtrak, RC_REQUEST,
                mPurchaseFinishedListener, payload);
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
SketchwareUtil.showMessage(getApplicationContext(), "اشتراک یه ماهه فعال شد❤️");
/*"اینجا بعدا یه دیالوگ بزار وقتی کاربر به ناهه خرید براش ظاهر میشه چون قبلا گذاشتیم یه ساله میموند"*/
} catch (Exception e) {
dialogR.setMessage("خطا:".concat("خرید اشتراک ".concat(type.concat(" ماهه ناموفق بود!".concat("کد پیگیری:".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(10000), (int)(99999)))).concat(" آنرا یادداشت کرده و برای پشتیبانی ارسال کنید.باتشکر")))))));
dialogR.setPositiveButton("بستن", new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface _dialog, int _which) {

}
});
dialogR.create().show();
}
}


public void _buy_ok_dialog() {
final com.google.android.material.bottomsheet.BottomSheetDialog a = new com.google.android.material.bottomsheet.BottomSheetDialog(NewBuyEshActivity.this);
View lay = getLayoutInflater().inflate(R.layout.check_esh, null);
a.setContentView(lay);
a.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
final LinearLayout linear  = (LinearLayout)lay.findViewById(R.id.linear);
final LinearLayout button  = (LinearLayout)lay.findViewById(R.id.button);
final ImageView image  = (ImageView)lay.findViewById(R.id.image);
a.setCancelable(true);
a.show();
button.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0xFFFFFFFF));
if (type.equals("1")) {
linear.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0xFF3F51B5));
image.setImageResource(R.drawable.llo_3);
} else {
if (type.equals("3")) {
linear.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0xFF009688));
image.setImageResource(R.drawable.llo_2);
} else {
if (type.equals("6")) {
linear.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0xFFFF9800));
image.setImageResource(R.drawable.llo_1);
} else {
linear.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0xFFFF9100));
image.setImageResource(R.drawable.llo_4);
}
}
}
button.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View _view){
a.dismiss();
finish();
}
});
}


public void _Net_offer(final String _icon_image, final String _Offer_image, final String _coin, final String _Linear_Background_1, final String _Linear_Background_2, final String _Linear_Background_3) {

}


public void _a(final View _view, final double _n1, final double _n2, final double _n3, final double _n4, final int _color) {
{
android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
SketchUi.setColor(_color);SketchUi.setCornerRadii(new float[]{
d*(float)_n1,d*(float)_n1,d*(float)_n2 ,d*(float)_n2,d*(float)_n3,d*(float)_n3 ,d*(float)_n4,d*(float)_n4});
_view.setBackground(SketchUi);
}
}


public void _linear_g(final View _view, final double _n, final String _color) {

GradientDrawable drawable = new GradientDrawable();
drawable.setCornerRadius((float) _n);
drawable.setColor(Color.parseColor(_color));
_view.setBackground(drawable);
}


public void _color_text(final View _view, final String _color) {
((TextView) _view).setTextColor(Color.parseColor(_color));
}


public void _lightEffect(final View _view, final double _n) {
final RelativeLayout layout = (RelativeLayout) _view.getParent();
final int botonX = (int) (_view.getX());
final int botonY = (int) (_view.getY());
final int botonAncho = (int) (_view.getWidth());
final int botonAlto = (int) (_view.getHeight());

// Crear el haz de luz
final ImageView luz = new ImageView(layout.getContext());
luz.setLayoutParams(new RelativeLayout.LayoutParams(botonAncho * 2, botonAlto)); 
luz.setImageResource(R.drawable.light); // Reemplázalo con un recurso semitransparente
luz.setAlpha((float)_n); // Opacidad inicial
layout.addView(luz);
luz.bringToFront(); // Coloca el haz de luz sobre el botón

// Iniciar el haz de luz desde fuera del botón
luz.setX(botonX - botonAncho);
luz.setY(botonY);

// Animación de desplazamiento
ObjectAnimator moverX = ObjectAnimator.ofFloat(luz, "x", botonX - botonAncho, botonX + botonAncho);
ObjectAnimator alpha = ObjectAnimator.ofFloat(luz, "alpha", 0.3f, 0.6f, 0.3f);

moverX.setDuration(1500);
alpha.setDuration(1500);
moverX.setRepeatCount(ValueAnimator.INFINITE);
alpha.setRepeatCount(ValueAnimator.INFINITE);

moverX.setInterpolator(new AccelerateDecelerateInterpolator());
alpha.setInterpolator(new AccelerateDecelerateInterpolator());

AnimatorSet animSet = new AnimatorSet();
animSet.playTogether(moverX, alpha);
animSet.start();
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