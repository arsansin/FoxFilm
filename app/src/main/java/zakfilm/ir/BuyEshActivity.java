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
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
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

public class BuyEshActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private android.os.Handler timerHandler;
	private Runnable timerRunnable;
	private double coin = 0;
	private double dayy = 0;
	private HashMap<String, Object> g = new HashMap<>();
	private String imageUrl = "";
	private HashMap<String, Object> get_data = new HashMap<>();
	private boolean isSubscribed = false;
	private String masrfi = "";
	private String Eshtrak = "";
	private String Eshtrak1 = "";
	private String Eshtrak2 = "";
	private String Eshtrak3 = "";
	private String mPublicKey = "";
	private String baronsi = "";
	private String silveri = "";
	private String goldeni = "";
	int RC_REQUEST;
	private HashMap<String, Object> create = new HashMap<>();
	private String type = "";
	private boolean ch = false;
	
	private ArrayList<HashMap<String, Object>> Offer = new ArrayList<>();
	
	private LinearLayout linear113;
	private ScrollView vscroll1;
	private LinearLayout content;
	private LinearLayout linear112;
	private LinearLayout linear114;
	private LinearLayout back10;
	private LinearLayout back11;
	private LinearLayout back12;
	private LinearLayout linear115;
	private LinearLayout linear17;
	private CardView cardview1;
	private LinearLayout linear111;
	private BlurView blurView;
	private LinearLayout linear1;
	private RelativeLayout relativelayout1;
	private LinearLayout linear108;
	private ImageView imageview2;
	private LinearLayout linear104;
	private LinearLayout linear6;
	private LinearLayout linear105;
	private LinearLayout linear4;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private ImageView imageview1;
	private ImageView ima1;
	private ImageView ima2;
	private ImageView ima3;
	private TextView textview15;
	private ImageView imageview20;
	private RelativeLayout relativelayout2;
	private LinearLayout linear43;
	private ImageView imageview17;
	
	private RequestNetwork Net_Offer;
	private RequestNetwork.RequestListener _Net_Offer_request_listener;
	private Calendar s = Calendar.getInstance();
	private RequestNetwork get;
	private RequestNetwork.RequestListener _get_request_listener;
	private SharedPreferences save;
	private RequestNetwork get_b;
	private RequestNetwork.RequestListener _get_b_request_listener;
	private Intent i = new Intent();
	private AlertDialog.Builder dialogR;
	private RequestNetwork pcj;
	private RequestNetwork.RequestListener _pcj_request_listener;
	private IabHelper mHelper;
	private MediaPlayer ok;
	private SharedPreferences gold;
	private SharedPreferences buy;
	private ProgressDialog pd;
	private TimerTask t;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.buy_esh);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear113 = findViewById(R.id.linear113);
		vscroll1 = findViewById(R.id.vscroll1);
		content = findViewById(R.id.content);
		linear112 = findViewById(R.id.linear112);
		linear114 = findViewById(R.id.linear114);
		back10 = findViewById(R.id.back10);
		back11 = findViewById(R.id.back11);
		back12 = findViewById(R.id.back12);
		linear115 = findViewById(R.id.linear115);
		linear17 = findViewById(R.id.linear17);
		cardview1 = findViewById(R.id.cardview1);
		linear111 = findViewById(R.id.linear111);
		blurView = findViewById(R.id.blurView);
		linear1 = findViewById(R.id.linear1);
		relativelayout1 = findViewById(R.id.relativelayout1);
		linear108 = findViewById(R.id.linear108);
		imageview2 = findViewById(R.id.imageview2);
		linear104 = findViewById(R.id.linear104);
		linear6 = findViewById(R.id.linear6);
		linear105 = findViewById(R.id.linear105);
		linear4 = findViewById(R.id.linear4);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		imageview1 = findViewById(R.id.imageview1);
		ima1 = findViewById(R.id.ima1);
		ima2 = findViewById(R.id.ima2);
		ima3 = findViewById(R.id.ima3);
		textview15 = findViewById(R.id.textview15);
		imageview20 = findViewById(R.id.imageview20);
		relativelayout2 = findViewById(R.id.relativelayout2);
		linear43 = findViewById(R.id.linear43);
		imageview17 = findViewById(R.id.imageview17);
		Net_Offer = new RequestNetwork(this);
		get = new RequestNetwork(this);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		get_b = new RequestNetwork(this);
		dialogR = new AlertDialog.Builder(this);
		pcj = new RequestNetwork(this);
		gold = getSharedPreferences("gold", Activity.MODE_PRIVATE);
		buy = getSharedPreferences("buy", Activity.MODE_PRIVATE);
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://t.me/foxfilm_Support"));
				startActivity(i);
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (ch) {
					type = "1";
					_buy_esh(Eshtrak);
				}
			}
		});
		
		ima1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (ch) {
					type = "3";
					_buy_esh(Eshtrak1);
				}
			}
		});
		
		ima2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (ch) {
					type = "6";
					_buy_esh(Eshtrak2);
				}
			}
		});
		
		ima3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (ch) {
					type = "12";
					_buy_esh(Eshtrak3);
				}
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
				if (save.getString(String.valueOf((long)(dayy)), "").equals("")) {
					save.edit().putString(String.valueOf((long)(dayy)), get_data.get("image").toString()).commit();
					save.edit().putString(String.valueOf((long)(dayy)).concat("_button"), get_data.get("image_button").toString()).commit();
					save.edit().putString(String.valueOf((long)(dayy)).concat("_color_back_text"), get_data.get("color_back_text").toString()).commit();
					save.edit().putString(String.valueOf((long)(dayy)).concat("_color_text"), get_data.get("color_text").toString()).commit();
					Glide.with(getApplicationContext()).load(Uri.parse(get_data.get("image").toString())).into(imageview2);
					Glide.with(getApplicationContext()).load(Uri.parse(get_data.get("image_button").toString())).into(imageview1);
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
					Glide.with(getApplicationContext()).load(Uri.parse(save.getString(String.valueOf((long)(dayy)), ""))).into(imageview2);
					Glide.with(getApplicationContext()).load(Uri.parse(save.getString(String.valueOf((long)(dayy)).concat("_button"), ""))).into(imageview1);
					imageUrl = save.getString(String.valueOf((long)(dayy)), "");
					
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
					_linear_g(linear4, 15, save.getString(String.valueOf((long)(dayy)).concat("_color_back_text"), ""));
					_linear_g(linear105, 15, save.getString(String.valueOf((long)(dayy)).concat("_color_back_text"), ""));
					_linear_g(linear6, 15, save.getString(String.valueOf((long)(dayy)).concat("_color_back_text"), ""));
					_color_text(textview7, save.getString(String.valueOf((long)(dayy)).concat("_color_text"), ""));
					_color_text(textview8, save.getString(String.valueOf((long)(dayy)).concat("_color_text"), ""));
					_color_text(textview9, save.getString(String.valueOf((long)(dayy)).concat("_color_text"), ""));
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
				// Get target view
				View viewTarget = findViewById(R.id.linear108);
				
				// Use post to ensure layout is measured
				viewTarget.post(new Runnable() {
					@Override
					public void run() {
						// Get root content view using MainActivity.this
						ViewGroup rootView = (ViewGroup) BuyEshActivity.this.getWindow()
						.getDecorView()
						.findViewById(android.R.id.content);
						
						// Create overlay
						FrameLayout overlay = new FrameLayout(rootView.getContext());
						overlay.setLayoutParams(new ViewGroup.LayoutParams(
						ViewGroup.LayoutParams.MATCH_PARENT,
						ViewGroup.LayoutParams.MATCH_PARENT));
						overlay.setBackgroundColor(Color.TRANSPARENT);
						rootView.addView(overlay);
						
						// Get target position and size
						int[] location = new int[2];
						viewTarget.getLocationInWindow(location);
						int targetX = location[0];
						int targetY = location[1];
						int targetWidth = viewTarget.getWidth();
						int targetHeight = viewTarget.getHeight();
						
						// Create light beam
						ImageView luz = new ImageView(overlay.getContext());
						luz.setImageResource(R.drawable.light);
						luz.setAlpha(0.3f);
						
						FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
						targetWidth * 2, targetHeight);
						luz.setLayoutParams(params);
						luz.setX(targetX - targetWidth);
						luz.setY(targetY);
						
						overlay.addView(luz);
						luz.bringToFront();
						
						// Animations
						ObjectAnimator moverX = ObjectAnimator.ofFloat(luz, "x",
						targetX - targetWidth, targetX + targetWidth);
						ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(luz, "alpha", 0.3f, 0.6f, 0.3f);
						moverX.setDuration(1500);
						alphaAnim.setDuration(1500);
						moverX.setRepeatCount(ValueAnimator.INFINITE);
						alphaAnim.setRepeatCount(ValueAnimator.INFINITE);
						moverX.setInterpolator(new AccelerateDecelerateInterpolator());
						alphaAnim.setInterpolator(new AccelerateDecelerateInterpolator());
						
						AnimatorSet animSet = new AnimatorSet();
						animSet.playTogether(moverX, alphaAnim);
						animSet.start();
					}
				});
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
				Glide.with(getApplicationContext()).load(Uri.parse(g.get("image_url").toString())).into(imageview1);
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_pcj_request_listener = new RequestNetwork.RequestListener() {
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
				android.widget.Toast.makeText(BuyEshActivity.this, "New day started", Toast.LENGTH_SHORT).show();
				
				
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
						
						android.widget.Toast.makeText(BuyEshActivity.this, "Day " + (dayCounter[0]+1) + " started", Toast.LENGTH_SHORT).show();
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
		_ui();
		linear17.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0xFF18FFFF));
		/*"/////////////////****NEW***///////////"*/
		try {
			_dialog();
isSubscribed = false;
ch = false;
// سه بلوک پایین شناسه محصول مایکت بزار
Eshtrak = "Eshtrak";
Eshtrak1 = "Eshtrak1";
Eshtrak2 = "Eshtrak2";
Eshtrak3 = "Eshtrak3";
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


public void _circle() {
}
public static class ProgressWheel extends View {
  private static final String TAG = ProgressWheel.class.getSimpleName();
  private final int barLength = 16;
  private final int barMaxLength = 270;
  private final long pauseGrowingTime = 200;
  private int circleRadius = 28;
  private int barWidth = 4;
  private int rimWidth = 4;
  private boolean fillRadius = false;
  private boolean indeterminate = false;
  private double timeStartGrowing = 0;
  private double barSpinCycleTime = 460;
  private float barExtraLength = 0;
  private boolean barGrowingFromFront = true;
  private long pausedTimeWithoutGrowing = 0;
  private int barColor = 0xAA000000;
  private int rimColor = 0x00FFFFFF;
  private Paint barPaint = new Paint();
  private Paint rimPaint = new Paint();
  private RectF circleBounds = new RectF();
  private float spinSpeed = 230.0f;
  private long lastTimeAnimated = 0;
  private boolean linearProgress;
  private float mProgress = 0.0f;
  private float mTargetProgress = 0.0f;
  private boolean isSpinning = false;
  private ProgressCallback callback;
  private boolean shouldAnimate;
  public ProgressWheel(Context context, AttributeSet attrs) {
    super(context, attrs);
    parseAttributes();
    setAnimationEnabled();
  }
  public ProgressWheel(Context context) {
    super(context);
    setAnimationEnabled();
  }
  
  @SuppressWarnings("deprecation")
  private void setAnimationEnabled() {
    int currentApiVersion = android.os.Build.VERSION.SDK_INT;
    float animationValue;
    if (currentApiVersion >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
      animationValue = android.provider.Settings.Global.getFloat(getContext().getContentResolver(),
          android.provider.Settings.Global.ANIMATOR_DURATION_SCALE, 1);
    } else {
      animationValue = android.provider.Settings.System.getFloat(getContext().getContentResolver(),
          android.provider.Settings.System.ANIMATOR_DURATION_SCALE, 1);
    }
    shouldAnimate = animationValue != 0;
  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    int viewWidth = circleRadius + this.getPaddingLeft() + this.getPaddingRight();
    int viewHeight = circleRadius + this.getPaddingTop() + this.getPaddingBottom();

    int widthMode = MeasureSpec.getMode(widthMeasureSpec);
    int widthSize = MeasureSpec.getSize(widthMeasureSpec);
    int heightMode = MeasureSpec.getMode(heightMeasureSpec);
    int heightSize = MeasureSpec.getSize(heightMeasureSpec);

    int width;
    int height;
    if (widthMode == MeasureSpec.EXACTLY) {
      width = widthSize;
    } else if (widthMode == MeasureSpec.AT_MOST) {
      width = Math.min(viewWidth, widthSize);
    } else {
      width = viewWidth;
    }
    if (heightMode == MeasureSpec.EXACTLY || widthMode == MeasureSpec.EXACTLY) {
      height = heightSize;
    } else if (heightMode == MeasureSpec.AT_MOST) {
      height = Math.min(viewHeight, heightSize);
    } else {
      height = viewHeight;
    }
    setMeasuredDimension(width, height);
  }

  @Override
  protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    setupBounds(w, h);
    setupPaints();
    invalidate();
  }

  private void setupPaints() {
    barPaint.setColor(barColor);
    barPaint.setAntiAlias(true);
    barPaint.setStyle(android.graphics.Paint.Style.STROKE);
    barPaint.setStrokeWidth(barWidth);
    rimPaint.setColor(rimColor);
    rimPaint.setAntiAlias(true);
    rimPaint.setStyle(android.graphics.Paint.Style.STROKE);
    rimPaint.setStrokeWidth(rimWidth);
  }
  
  private void setupBounds(int layout_width, int layout_height) {
    int paddingTop = getPaddingTop();
    int paddingBottom = getPaddingBottom();
    int paddingLeft = getPaddingLeft();
    int paddingRight = getPaddingRight();

    if (!fillRadius) {
      int minValue = Math.min(layout_width - paddingLeft - paddingRight, layout_height - paddingBottom - paddingTop);
      int circleDiameter = Math.min(minValue, circleRadius * 2 - barWidth * 2);
      int xOffset = (layout_width - paddingLeft - paddingRight - circleDiameter) / 2 + paddingLeft;
      int yOffset = (layout_height - paddingTop - paddingBottom - circleDiameter) / 2 + paddingTop;

      circleBounds =
          new RectF(xOffset + barWidth, yOffset + barWidth, xOffset + circleDiameter - barWidth,
              yOffset + circleDiameter - barWidth);
    } else {
      circleBounds = new RectF(paddingLeft + barWidth, paddingTop + barWidth,
          layout_width - paddingRight - barWidth, layout_height - paddingBottom - barWidth);
    }
  }

  private void parseAttributes() {
    DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
    barWidth = barWidth;
    rimWidth = rimWidth;
    circleRadius = circleRadius;
    circleRadius = circleRadius;
    fillRadius = false;
    barWidth = barWidth; 
    rimWidth = rimWidth; 
    float baseSpinSpeed = spinSpeed / 360.0f;
    spinSpeed = baseSpinSpeed * 360;
    barSpinCycleTime = barSpinCycleTime;
    barColor = barColor;
    rimColor = rimColor;
    linearProgress = false;
    if (indeterminate == false) {
      spin();
    }
  }
  
  public void setIndeterminate(boolean gabriel) {
  	indeterminate = gabriel; 
  }

  public void setCallback(ProgressCallback progressCallback) {
    callback = progressCallback;
    if (!isSpinning) {
      runCallback();
    }
  }

  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    canvas.drawArc(circleBounds, 360, 360, false, rimPaint);
    boolean mustInvalidate = false;
    if (!shouldAnimate) {
      return;
    }
    if (isSpinning) {
      mustInvalidate = true;
      long deltaTime = (SystemClock.uptimeMillis() - lastTimeAnimated);
      float deltaNormalized = deltaTime * spinSpeed / 1000.0f;
      updateBarLength(deltaTime);
      mProgress += deltaNormalized;
      if (mProgress > 360) {
        mProgress -= 360f;
        runCallback(-1.0f);
      }
      lastTimeAnimated = SystemClock.uptimeMillis();
      float from = mProgress - 90;
      float length = barLength + barExtraLength;
      if (isInEditMode()) {
        from = 0;
        length = 135;
      }
      canvas.drawArc(circleBounds, from, length, false, barPaint);
    } else {
      float oldProgress = mProgress;

      if (mProgress != mTargetProgress) {
        mustInvalidate = true;
        float deltaTime = (float) (SystemClock.uptimeMillis() - lastTimeAnimated) / 1000;
        float deltaNormalized = deltaTime * spinSpeed;
        mProgress = Math.min(mProgress + deltaNormalized, mTargetProgress);
        lastTimeAnimated = SystemClock.uptimeMillis();
      }
      if (oldProgress != mProgress) {
        runCallback();
      }
      float offset = 0.0f;
      float progress = mProgress;
      if (!linearProgress) {
        float factor = 2.0f;
        offset = (float) (1.0f - Math.pow(1.0f - mProgress / 360.0f, 2.0f * factor)) * 360.0f;
        progress = (float) (1.0f - Math.pow(1.0f - mProgress / 360.0f, factor)) * 360.0f;
      }
      if (isInEditMode()) {
        progress = 360;
      }
      canvas.drawArc(circleBounds, offset - 90, progress, false, barPaint);
    }
    if (mustInvalidate) {
      invalidate();
    }
  }

  @Override
  protected void onVisibilityChanged(View changedView, int visibility) {
    super.onVisibilityChanged(changedView, visibility);

    if (visibility == VISIBLE) {
      lastTimeAnimated = SystemClock.uptimeMillis();
    }
  }

  private void updateBarLength(long deltaTimeInMilliSeconds) {
    if (pausedTimeWithoutGrowing >= pauseGrowingTime) {
      timeStartGrowing += deltaTimeInMilliSeconds;
      if (timeStartGrowing > barSpinCycleTime) {
        timeStartGrowing -= barSpinCycleTime;
        pausedTimeWithoutGrowing = 0;
        barGrowingFromFront = !barGrowingFromFront;
      }

      float distance =
          (float) Math.cos((timeStartGrowing / barSpinCycleTime + 1) * Math.PI) / 2 + 0.5f;
      float destLength = (barMaxLength - barLength);

      if (barGrowingFromFront) {
        barExtraLength = distance * destLength;
      } else {
        float newLength = destLength * (1 - distance);
        mProgress += (barExtraLength - newLength);
        barExtraLength = newLength;
      }
    } else {
      pausedTimeWithoutGrowing += deltaTimeInMilliSeconds;
    }
  }

  public boolean isSpinning() {
    return isSpinning;
  }

  public void resetCount() {
    mProgress = 0.0f;
    mTargetProgress = 0.0f;
    invalidate();
  }

  public void stopSpinning() {
    isSpinning = false;
    mProgress = 0.0f;
    mTargetProgress = 0.0f;
    invalidate();
  }

  public void spin() {
    lastTimeAnimated = SystemClock.uptimeMillis();
    isSpinning = true;
    invalidate();
  }

  private void runCallback(float value) {
    if (callback != null) {
      callback.onProgressUpdate(value);
    }
  }

  private void runCallback() {
    if (callback != null) {
      float normalizedProgress = (float) Math.round(mProgress * 100 / 360.0f) / 100;
      callback.onProgressUpdate(normalizedProgress);
    }
  }

  public void setInstantProgress(float progress) {
    if (isSpinning) {
      mProgress = 0.0f;
      isSpinning = false;
    }

    if (progress > 1.0f) {
      progress -= 1.0f;
    } else if (progress < 0) {
      progress = 0;
    }

    if (progress == mTargetProgress) {
      return;
    }

    mTargetProgress = Math.min(progress * 360.0f, 360.0f);
    mProgress = mTargetProgress;
    lastTimeAnimated = SystemClock.uptimeMillis();
    invalidate();
  }

  @Override
  public Parcelable onSaveInstanceState() {
    Parcelable superState = super.onSaveInstanceState();
    WheelSavedState ss = new WheelSavedState(superState);
    ss.mProgress = this.mProgress;
    ss.mTargetProgress = this.mTargetProgress;
    ss.isSpinning = this.isSpinning;
    ss.spinSpeed = this.spinSpeed;
    ss.barWidth = this.barWidth;
    ss.barColor = this.barColor;
    ss.rimWidth = this.rimWidth;
    ss.rimColor = this.rimColor;
    ss.circleRadius = this.circleRadius;
    ss.linearProgress = this.linearProgress;
    ss.fillRadius = this.fillRadius;
    return ss;
  }

  @Override 
  public void onRestoreInstanceState(Parcelable state) {
    if (!(state instanceof WheelSavedState)) {
      super.onRestoreInstanceState(state);
      return;
    }

    WheelSavedState ss = (WheelSavedState) state;
    super.onRestoreInstanceState(ss.getSuperState());

    this.mProgress = ss.mProgress;
    this.mTargetProgress = ss.mTargetProgress;
    this.isSpinning = ss.isSpinning;
    this.spinSpeed = ss.spinSpeed;
    this.barWidth = ss.barWidth;
    this.barColor = ss.barColor;
    this.rimWidth = ss.rimWidth;
    this.rimColor = ss.rimColor;
    this.circleRadius = ss.circleRadius;
    this.linearProgress = ss.linearProgress;
    this.fillRadius = ss.fillRadius;

    this.lastTimeAnimated = SystemClock.uptimeMillis();
  }

  public float getProgress() {
    return isSpinning ? -1 : mProgress / 360.0f;
  }

  public void setProgress(float progress) {
    if (isSpinning) {
      mProgress = 0.0f;
      isSpinning = false;

      runCallback();
    }

    if (progress > 1.0f) {
      progress -= 1.0f;
    } else if (progress < 0) {
      progress = 0;
    }

    if (progress == mTargetProgress) {
      return;
    }

    if (mProgress == mTargetProgress) {
      lastTimeAnimated = SystemClock.uptimeMillis();
    }

    mTargetProgress = Math.min(progress * 360.0f, 360.0f);

    invalidate();
  }

  public void setLinearProgress(boolean isLinear) {
    linearProgress = isLinear;
    if (!isSpinning) {
      invalidate();
    }
  }

  public int getCircleRadius() {
    return circleRadius;
  }

  public void setCircleRadius(int circleRadius) {
    this.circleRadius = circleRadius;
    if (!isSpinning) {
      invalidate();
    }
  }

  public int getBarWidth() {
    return barWidth;
  }

  public void setBarWidth(int barWidth) {
    this.barWidth = barWidth;
    if (!isSpinning) {
      invalidate();
    }
  }
  public int getBarColor() {
    return barColor;
  }

  public void setBarColor(int barColor) {
    this.barColor = barColor;
    setupPaints();
    if (!isSpinning) {
      invalidate();
    }
  }
  public int getRimColor() {
    return rimColor;
  }
  public void setRimColor(int rimColor) {
    this.rimColor = rimColor;
    setupPaints();
    if (!isSpinning) {
      invalidate();
    }
  }
  public float getSpinSpeed() {
    return spinSpeed / 360.0f;
  }
  public void setSpinSpeed(float spinSpeed) {
    this.spinSpeed = spinSpeed * 360.0f;
  }
  public int getRimWidth() {
    return rimWidth;
  }
  public void setRimWidth(int rimWidth) {
    this.rimWidth = rimWidth;
    if (!isSpinning) {
      invalidate();
    }
  }

  public interface ProgressCallback {
    public void onProgressUpdate(float progress);
  }

  static class WheelSavedState extends BaseSavedState {
    public static final Parcelable.Creator<WheelSavedState> CREATOR =
        new Parcelable.Creator<WheelSavedState>() {
          public WheelSavedState createFromParcel(Parcel in) {
            return new WheelSavedState(in);
          }

          public WheelSavedState[] newArray(int size) {
            return new WheelSavedState[size];
          }
        };
    float mProgress;
    float mTargetProgress;
    boolean isSpinning;
    float spinSpeed;
    int barWidth;
    int barColor;
    int rimWidth;
    int rimColor;
    int circleRadius;
    boolean linearProgress;
    boolean fillRadius;

    WheelSavedState(Parcelable superState) {
      super(superState);
    }

    private WheelSavedState(Parcel in) {
      super(in);
      this.mProgress = in.readFloat();
      this.mTargetProgress = in.readFloat();
      this.isSpinning = in.readByte() != 0;
      this.spinSpeed = in.readFloat();
      this.barWidth = in.readInt();
      this.barColor = in.readInt();
      this.rimWidth = in.readInt();
      this.rimColor = in.readInt();
      this.circleRadius = in.readInt();
      this.linearProgress = in.readByte() != 0;
      this.fillRadius = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
      super.writeToParcel(out, flags);
      out.writeFloat(this.mProgress);
      out.writeFloat(this.mTargetProgress);
      out.writeByte((byte) (isSpinning ? 1 : 0));
      out.writeFloat(this.spinSpeed);
      out.writeInt(this.barWidth);
      out.writeInt(this.barColor);
      out.writeInt(this.rimWidth);
      out.writeInt(this.rimColor);
      out.writeInt(this.circleRadius);
      out.writeByte((byte) (linearProgress ? 1 : 0));
      out.writeByte((byte) (fillRadius ? 1 : 0));
    }
  }
}
private AlertDialog newDialogWheel;
private ProgressWheel progresswheel;
{
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
Purchase p2 = inventory.getPurchase(Eshtrak2);
            isSubscribed = (p2 != null && verifyDeveloperPayload(p2));
Purchase p3 = inventory.getPurchase(Eshtrak3);
            isSubscribed = (p3 != null && verifyDeveloperPayload(p3));
		
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
_sabteEshterak();
mHelper.consumeAsync(purchase, mConsumeFinishedListener);


		        }
	    };
{
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
save.edit().putString("ad", "1").commit();
save.edit().putString("traffic", "1").commit();
ok = MediaPlayer.create(getApplicationContext(), R.raw.playy);
ok.start();
SketchwareUtil.showMessage(getApplicationContext(), "اشتراک تمدید شد❤️");
_buy_ok_dialog();
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


public void _buy_esh(final String _eshtrak) {
String payload = "";
mHelper.launchPurchaseFlow(this, _eshtrak, RC_REQUEST,
                mPurchaseFinishedListener, payload);
}


public void _ui() {

}


public void _dialog() {
pd = new ProgressDialog(BuyEshActivity.this);
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


public void _buy_ok_dialog() {
final com.google.android.material.bottomsheet.BottomSheetDialog a = new com.google.android.material.bottomsheet.BottomSheetDialog(BuyEshActivity.this);
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
}
});
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