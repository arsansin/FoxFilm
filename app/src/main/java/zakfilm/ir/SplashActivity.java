package zakfilm.ir;

import android.animation.*;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
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
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import androidx.annotation.Nullable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public class SplashActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private HashMap<String, Object> mop = new HashMap<>();
	
	private LinearLayout linear1;
	private LinearLayout linear21;
	private ImageView imageview1;
	private ImageView imageview2;
	private LinearLayout linear10;
	private LinearLayout linear25;
	private LinearLayout linear23;
	private TextView massage;
	private TextView textview2;
	
	private TimerTask tani;
	private ObjectAnimator iup = new ObjectAnimator();
	private RequestNetwork check;
	private RequestNetwork.RequestListener _check_request_listener;
	private ObjectAnimator iop = new ObjectAnimator();
	private Intent i = new Intent();
	private TimerTask t;
	private SharedPreferences height_img;
	private SharedPreferences width_img;
	private SharedPreferences round_img;
	private SharedPreferences type_videoplayer;
	private Intent intent = new Intent();
	private SharedPreferences save;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.splash);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear21 = findViewById(R.id.linear21);
		imageview1 = findViewById(R.id.imageview1);
		imageview2 = findViewById(R.id.imageview2);
		linear10 = findViewById(R.id.linear10);
		linear25 = findViewById(R.id.linear25);
		linear23 = findViewById(R.id.linear23);
		massage = findViewById(R.id.massage);
		textview2 = findViewById(R.id.textview2);
		check = new RequestNetwork(this);
		height_img = getSharedPreferences("height_img", Activity.MODE_PRIVATE);
		width_img = getSharedPreferences("width_img", Activity.MODE_PRIVATE);
		round_img = getSharedPreferences("round_img", Activity.MODE_PRIVATE);
		type_videoplayer = getSharedPreferences("type_videoplayer", Activity.MODE_PRIVATE);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		
		imageview1.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		iup.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				_vpn();
				if (vpn()) {
					i.setClass(getApplicationContext(), ErrorActivity.class);
					startActivity(i);
					SplashActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
				} else {
					mop = new HashMap<>();
					mop.put("action", "update");
					mop.put("version", "1.0");
					check.setParams(mop, RequestNetworkController.REQUEST_BODY);
					check.startRequestNetwork(RequestNetworkController.POST, "https://".concat(save.getString("site", "").concat("/zakfilm.ir/GetPanel.php")), "", _check_request_listener);
				}
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		_check_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try {
					mop = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
					if (mop.get("state").toString().equals("true")) {
						save.edit().putString("domain", mop.get("domain").toString()).commit();
					} else {
						save.edit().putString("domain", "https://thumb.upera.tv/thumb?w=").commit();
					}
					_vpn();
					if (vpn()) {
						i.setClass(getApplicationContext(), ErrorActivity.class);
						startActivity(i);
						SplashActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
					} else {
						iop.setTarget(massage);
						iop.setPropertyName("translationY");
						iop.setFloatValues((float)(0));
						iop.setDuration((int)(700));
						iop.start();
					}
				} catch (Exception e) {
					SketchwareUtil.showMessage(getApplicationContext(), "خطای غیر منتظره!");
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				_vpn();
				if (vpn()) {
					i.setClass(getApplicationContext(), ErrorActivity.class);
					startActivity(i);
					SplashActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
					SketchwareUtil.showMessage(getApplicationContext(), "فلیتر شکن خود را خاموش کنید");
				} else {
					com.google.android.material.snackbar.Snackbar.make(linear1, "اتصال به اینترنت برقرار نشد!", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("بررسی دوباره", new View.OnClickListener(){
						@Override
						public void onClick(View _view) {
							mop = new HashMap<>();
							mop.put("action", "update");
							mop.put("version", "1.0");
							check.setParams(mop, RequestNetworkController.REQUEST_BODY);
							check.startRequestNetwork(RequestNetworkController.POST, "https://".concat(save.getString("site", "").concat("/zakfilm.ir/GetPanel.php")), "", _check_request_listener);
						}
					}).show();
				}
			}
		};
		
		iop.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								i.setClass(getApplicationContext(), MainActivity.class);
								startActivity(i);
								_fade_translate();
								finish();
							}
						});
					}
				};
				_timer.schedule(t, (int)(700));
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
			
			Window w = getWindow();
			
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
			
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
			w.setStatusBarColor(Color.TRANSPARENT);
			w.setNavigationBarColor(Color.TRANSPARENT);
			
			w.getDecorView().setSystemUiVisibility(
			View.SYSTEM_UI_FLAG_LAYOUT_STABLE
			| View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
			| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
			| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
			);
		}
		if (!height_img.contains("height_img")) {
			height_img.edit().putString("height_img", "740").commit();
			width_img.edit().putString("width_img", "400").commit();
		}
		if (!round_img.contains("round_img")) {
			round_img.edit().putString("round_img", "10").commit();
		}
		if (!type_videoplayer.contains("type_videoplayer")) {
			type_videoplayer.edit().putString("type_videoplayer", "orginal").commit();
		}
		if (!save.contains("visible_title")) {
			save.edit().putString("visible_title", "1").commit();
		}
		if (!save.contains("theme")) {
			save.edit().putString("theme", "#FF8E2D").commit();
		}
		if (!save.contains("site")) {
			save.edit().putString("site", "fox-filme.ir").commit();
		}
		if (save.contains("blit")) {
			if (save.getString("blit", "").isEmpty()) {
				save.edit().putString("blit", "0").commit();
			}
		} else {
			save.edit().putString("blit", "0").commit();
		}
		_ColourFilter(imageview2, "#FF8E2D");
		linear1.setVisibility(View.VISIBLE);
		massage.setTranslationY((float)(-100));
		linear10.setScaleX((float)(0));
		linear10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)999, 0xFFFFFFFF));
		tani = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						linear10.setScaleX((float)(0));
						iup.setTarget(linear10);
						iup.setPropertyName("scaleX");
						iup.setFloatValues((float)(1));
						iup.setDuration((int)(700));
						iup.start();
					}
				});
			}
		};
		_timer.schedule(tani, (int)(1000));
		// ========================================
		// گرادیان اصلی
		// ========================================
		
		GradientDrawable baseGradient = new GradientDrawable(
		GradientDrawable.Orientation.TL_BR,
		new int[]{
			0xFF311B00,
			0xFF000000
		}
		);
		
		
		// ========================================
		// نور نارنجی
		// ========================================
		
		final GradientDrawable orangeSpot = new GradientDrawable();
		
		orangeSpot.setGradientType(
		GradientDrawable.RADIAL_GRADIENT
		);
		
		orangeSpot.setGradientRadius(700f);
		
		orangeSpot.setColors(
		new int[]{
			0xDDFF9800,
			0x00000000
		}
		);
		
		
		// ========================================
		// نور زرد
		// ========================================
		
		final GradientDrawable yellowSpot = new GradientDrawable();
		
		yellowSpot.setGradientType(
		GradientDrawable.RADIAL_GRADIENT
		);
		
		yellowSpot.setGradientRadius(600f);
		
		yellowSpot.setColors(
		new int[]{
			0xB3FFC107,
			0x00000000
		}
		);
		
		
		// ========================================
		// نور قرمز
		// ========================================
		
		final GradientDrawable redSpot = new GradientDrawable();
		
		redSpot.setGradientType(
		GradientDrawable.RADIAL_GRADIENT
		);
		
		redSpot.setGradientRadius(400f);
		
		redSpot.setColors(
		new int[]{
			0x99FF5722,
			0x00000000
		}
		);
		
		
		// ========================================
		// ساخت LayerDrawable
		// ========================================
		
		LayerDrawable layerDrawable = new LayerDrawable(
		new Drawable[]{
			baseGradient,
			orangeSpot,
			yellowSpot,
			redSpot
		}
		);
		
		
		// ========================================
		// موقعیت لایه‌ها
		// ========================================
		
		layerDrawable.setLayerInset(
		1,
		-250,
		-250,
		-250,
		-250
		);
		
		layerDrawable.setLayerInset(
		2,
		-200,
		-200,
		-200,
		-200
		);
		
		layerDrawable.setLayerInset(
		3,
		-150,
		-150,
		-150,
		-150
		);
		
		
		// ========================================
		// قرار دادن پس‌زمینه
		// ========================================
		
		linear1.setBackground(layerDrawable);
		
		
		// ========================================
		// حرکت نرم و بی‌نهایت نورها
		// ========================================
		
		ValueAnimator animator = ValueAnimator.ofFloat(
		0f,
		(float) (Math.PI * 2)
		);
		
		animator.setDuration(18000);
		
		animator.setRepeatCount(
		ValueAnimator.INFINITE
		);
		
		animator.setInterpolator(
		new LinearInterpolator()
		);
		
		
		animator.addUpdateListener(
		new ValueAnimator.AnimatorUpdateListener() {
			
			@Override
			public void onAnimationUpdate(
			ValueAnimator animation
			) {
				
				float angle =
				(float) animation.getAnimatedValue();
				
				
				// ========================================
				// نور نارنجی
				// ========================================
				
				float orangeX =
				0.5f +
				0.32f *
				(float) Math.cos(angle);
				
				float orangeY =
				0.5f +
				0.30f *
				(float) Math.sin(angle);
				
				
				// ========================================
				// نور زرد
				// ========================================
				
				float yellowX =
				0.5f +
				0.38f *
				(float) Math.cos(
				angle + 2.1f
				);
				
				float yellowY =
				0.5f +
				0.32f *
				(float) Math.sin(
				angle + 2.1f
				);
				
				
				// ========================================
				// نور قرمز
				// ========================================
				
				float redX =
				0.5f +
				0.42f *
				(float) Math.cos(
				angle + 4.2f
				);
				
				float redY =
				0.5f +
				0.35f *
				(float) Math.sin(
				angle + 4.2f
				);
				
				
				// ========================================
				// اعمال موقعیت نورها
				// ========================================
				
				orangeSpot.setGradientCenter(
				orangeX,
				orangeY
				);
				
				yellowSpot.setGradientCenter(
				yellowX,
				yellowY
				);
				
				redSpot.setGradientCenter(
				redX,
				redY
				);
				
				
				linear1.invalidate();
			}
		}
		);
		
		
		// ========================================
		// پالس نرم شعاع نور
		// ========================================
		
		ValueAnimator pulseAnimator =
		ValueAnimator.ofFloat(
		0.7f,
		1.3f
		);
		
		pulseAnimator.setDuration(3000);
		
		pulseAnimator.setRepeatCount(
		ValueAnimator.INFINITE
		);
		
		pulseAnimator.setRepeatMode(
		ValueAnimator.REVERSE
		);
		
		
		pulseAnimator.addUpdateListener(
		new ValueAnimator.AnimatorUpdateListener() {
			
			@Override
			public void onAnimationUpdate(
			ValueAnimator animation
			) {
				
				float pulse =
				(float) animation.getAnimatedValue();
				
				
				orangeSpot.setGradientRadius(
				700f * pulse
				);
				
				
				yellowSpot.setGradientRadius(
				600f *
				(pulse * 0.8f + 0.2f)
				);
				
				
				redSpot.setGradientRadius(
				400f *
				(pulse * 0.6f + 0.4f)
				);
				
				
				linear1.invalidate();
			}
		}
		);
		
		
		// ========================================
		// شروع حرکت و پالس
		// ========================================
		
		animator.start();
		
		pulseAnimator.start();
		
		
		// ========================================
		// تغییر نرم شدت نور
		// ========================================
		
		ValueAnimator colorIntensityAnimator =
		ValueAnimator.ofFloat(
		0f,
		1f
		);
		
		colorIntensityAnimator.setDuration(
		15000
		);
		
		colorIntensityAnimator.setRepeatCount(
		ValueAnimator.INFINITE
		);
		
		colorIntensityAnimator.setRepeatMode(
		ValueAnimator.REVERSE
		);
		
		
		colorIntensityAnimator.addUpdateListener(
		new ValueAnimator.AnimatorUpdateListener() {
			
			@Override
			public void onAnimationUpdate(
			ValueAnimator animation
			) {
				
				float intensity =
				(float) animation.getAnimatedValue();
				
				
				// ========================================
				// شدت نور نارنجی
				// ========================================
				
				int alphaOrange =
				(int) (
				0xDD *
				(
				0.7f +
				0.3f * intensity
				)
				);
				
				
				// ========================================
				// شدت نور زرد
				// ========================================
				
				int alphaYellow =
				(int) (
				0xB3 *
				(
				0.8f +
				0.2f *
				(float) Math.sin(
				intensity * Math.PI
				)
				)
				);
				
				
				// ========================================
				// اعمال رنگ نارنجی
				// ========================================
				
				orangeSpot.setColors(
				new int[]{
					(alphaOrange << 24) |
					0xFF9800,
					
					0x00000000
				}
				);
				
				
				// ========================================
				// اعمال رنگ زرد
				// ========================================
				
				yellowSpot.setColors(
				new int[]{
					(alphaYellow << 24) |
					0xFFC107,
					
					0x00000000
				}
				);
				
				
				linear1.invalidate();
			}
		}
		);
		
		
		// ========================================
		// شروع تغییر شدت نور
		// ========================================
		
		colorIntensityAnimator.start();
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
	
	
	public void _ColourFilter(final ImageView _imageview, final String _color) {
		_imageview.clearColorFilter(); 
		_imageview.setColorFilter(Color.parseColor(_color.toString()));
	}
	
	
	public void _getVersion() {
		
	}
	
	
	public void _fade_translate() {
		overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
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