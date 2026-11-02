package zakfilm.ir;

import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.content.*;
import android.content.Context;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.os.Vibrator;
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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
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
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import smartdevelop.ir.eram.showcaseviewlib.*;

public class ErrorActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private LottieAnimationView lottie1;
	private TextView textview1;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private ScrollView vscroll1;
	private TextView textview3;
	private TextView textview2;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout linear5;
	private LinearLayout linear3;
	private TextView textview7;
	private TextView textview4;
	private TextView textview8;
	
	private Vibrator bv;
	private ObjectAnimator an = new ObjectAnimator();
	private ObjectAnimator anx = new ObjectAnimator();
	private ObjectAnimator any = new ObjectAnimator();
	private TimerTask t;
	private Intent a = new Intent();
	private Intent rt = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.error);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		lottie1 = findViewById(R.id.lottie1);
		textview1 = findViewById(R.id.textview1);
		linear2 = findViewById(R.id.linear2);
		linear4 = findViewById(R.id.linear4);
		vscroll1 = findViewById(R.id.vscroll1);
		textview3 = findViewById(R.id.textview3);
		textview2 = findViewById(R.id.textview2);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		linear5 = findViewById(R.id.linear5);
		linear3 = findViewById(R.id.linear3);
		textview7 = findViewById(R.id.textview7);
		textview4 = findViewById(R.id.textview4);
		textview8 = findViewById(R.id.textview8);
		bv = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				bv.vibrate((long)(80));
				anx.setTarget(linear5);
				anx.setPropertyName("scaleX");
				anx.setFloatValues((float)(0.9d));
				anx.setDuration((int)(300));
				anx.start();
				any.setTarget(linear5);
				any.setPropertyName("scaleY");
				any.setFloatValues((float)(0.9d));
				any.setDuration((int)(300));
				any.start();
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								anx.cancel();
								any.cancel();
								anx.setTarget(linear5);
								anx.setPropertyName("scaleX");
								anx.setFloatValues((float)(1.0d));
								anx.setDuration((int)(300));
								anx.start();
								any.setTarget(linear5);
								any.setPropertyName("scaleY");
								any.setFloatValues((float)(1.0d));
								any.setDuration((int)(300));
								any.start();
								t = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												startActivity(a);
												ErrorActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
											}
										});
									}
								};
								_timer.schedule(t, (int)(300));
							}
						});
					}
				};
				_timer.schedule(t, (int)(300));
			}
		});
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				bv.vibrate((long)(80));
				anx.setTarget(linear3);
				anx.setPropertyName("scaleX");
				anx.setFloatValues((float)(0.9d));
				anx.setDuration((int)(300));
				anx.start();
				any.setTarget(linear3);
				any.setPropertyName("scaleY");
				any.setFloatValues((float)(0.9d));
				any.setDuration((int)(300));
				any.start();
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								anx.cancel();
								any.cancel();
								anx.setTarget(linear3);
								anx.setPropertyName("scaleX");
								anx.setFloatValues((float)(1.0d));
								anx.setDuration((int)(300));
								anx.start();
								any.setTarget(linear3);
								any.setPropertyName("scaleY");
								any.setFloatValues((float)(1.0d));
								any.setDuration((int)(300));
								any.start();
								t = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												a.setClass(getApplicationContext(), SplashActivity.class);
												startActivity(a);
												ErrorActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
												finish();
											}
										});
									}
								};
								_timer.schedule(t, (int)(300));
							}
						});
					}
				};
				_timer.schedule(t, (int)(300));
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			final Window window = ErrorActivity.this.getWindow();
			window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			window.setStatusBarColor(0xFF0F1620);
		}
		textview8.setText(getIntent().getStringExtra("error"));
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF0f1620".replace("0xFF" , "#")));
		}
		getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)0, 0xFFFF1744, 0xFF1D2733));
		linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)0, 0xFFFF1744, 0xFF1D2733));
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFF448AFF));
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFFFF1744));
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFFFF1744));
	}
	
	@Override
	public void onBackPressed() {
		finishAffinity();
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