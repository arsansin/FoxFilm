package zakfilm.ir;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Context;
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
import android.os.Vibrator;
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
import ir.amirsina.mykey.util.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
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
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class PlayListActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private boolean delete = false;
	private String value = "";
	private double taqsim = 0;
	private double zarb = 0;
	private String color = "";
	
	private ArrayList<HashMap<String, Object>> a = new ArrayList<>();
	
	private LinearLayout linear10;
	private LinearLayout linear65;
	private LinearLayout linear0;
	private TextView love;
	private TextView cuple;
	private LinearLayout linear89;
	private TextView textview1;
	private LinearLayout linear90;
	private ImageView imageview2;
	private ImageView setting;
	private LinearLayout linear91;
	private LinearLayout linear92;
	private GridView gridview1;
	private ImageView imageview1;
	private TextView textview2;
	
	private Intent intent = new Intent();
	private SharedPreferences play_list;
	private SharedPreferences duration_video;
	private TimerTask tm;
	private Vibrator vib;
	private SharedPreferences round_img;
	private SharedPreferences height_img;
	private SharedPreferences width_img;
	private SharedPreferences save;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.play_list);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear10 = findViewById(R.id.linear10);
		linear65 = findViewById(R.id.linear65);
		linear0 = findViewById(R.id.linear0);
		love = findViewById(R.id.love);
		cuple = findViewById(R.id.cuple);
		linear89 = findViewById(R.id.linear89);
		textview1 = findViewById(R.id.textview1);
		linear90 = findViewById(R.id.linear90);
		imageview2 = findViewById(R.id.imageview2);
		setting = findViewById(R.id.setting);
		linear91 = findViewById(R.id.linear91);
		linear92 = findViewById(R.id.linear92);
		gridview1 = findViewById(R.id.gridview1);
		imageview1 = findViewById(R.id.imageview1);
		textview2 = findViewById(R.id.textview2);
		play_list = getSharedPreferences("play_list", Activity.MODE_PRIVATE);
		duration_video = getSharedPreferences("duration_video", Activity.MODE_PRIVATE);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		round_img = getSharedPreferences("round_img", Activity.MODE_PRIVATE);
		height_img = getSharedPreferences("height_img", Activity.MODE_PRIVATE);
		width_img = getSharedPreferences("width_img", Activity.MODE_PRIVATE);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		
		linear89.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linear92.getVisibility() == View.VISIBLE) {
					
				} else {
					delete = true;
					vib.vibrate((long)(100));
					gridview1.setVisibility(View.GONE);
					linear92.setVisibility(View.VISIBLE);
					tm = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									play_list.edit().putString("play_list", "[]").commit();
								}
							});
						}
					};
					_timer.schedule(tm, (int)(3500));
					com.google.android.material.snackbar.Snackbar.make(linear89, "داده ها با موفقیت پاک شدند", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("لغو", new View.OnClickListener(){
						@Override
						public void onClick(View _view) {
							delete = false;
							tm.cancel();
							linear92.setVisibility(View.GONE);
							gridview1.setVisibility(View.VISIBLE);
						}
					}).show();
				}
			}
		});
		
		linear90.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
				overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
			}
		});
		
		gridview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
		});
		
		textview2.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF0f1620".replace("0xFF" , "#")));
		}
		getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		color = save.getString("theme", "");
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			final Window window = PlayListActivity.this.getWindow();
			window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			window.setStatusBarColor(0xFF000000);
		}
		_ui();
		if (play_list.contains("play_list")) {
			linear92.setVisibility(View.GONE);
			gridview1.setVisibility(View.VISIBLE);
			a = new Gson().fromJson(play_list.getString("play_list", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			gridview1.setAdapter(new Gridview1Adapter(a));
			if (new Gson().toJson(a).equals("[]")) {
				linear92.setVisibility(View.VISIBLE);
				gridview1.setVisibility(View.GONE);
			}
		} else {
			linear92.setVisibility(View.VISIBLE);
			gridview1.setVisibility(View.GONE);
		}
		OverScrollDecoratorHelper.setUpOverScroll(gridview1);
		_ColourFilter(imageview2, "#ffffff");
	}
	
	
	@Override
	public void onBackPressed() {
		if (delete) {
			play_list.edit().putString("play_list", "[]").commit();
		}
		finish();
		overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
	}
	public void _ui() {
		_shape(SketchwareUtil.getDip(getApplicationContext(), (int)(13)), SketchwareUtil.getDip(getApplicationContext(), (int)(13)), 0, 0, "#0f1620", "#0f1620", 0, linear0);
		_removeScollBar(gridview1);
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _GradientDrawable(final View _view, final double _radius, final double _stroke, final double _shadow, final String _color, final String _borderColor, final boolean _ripple, final boolean _clickAnim, final double _animDuration) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			gd.setStroke((int)_stroke,Color.parseColor(_borderColor));
			if (Build.VERSION.SDK_INT >= 21){
				_view.setElevation((int)_shadow);}
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9E9E9E")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		} else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			gd.setStroke((int)_stroke,Color.parseColor(_borderColor));
			_view.setBackground(gd);
			if (Build.VERSION.SDK_INT >= 21){
				_view.setElevation((int)_shadow);}
		}
		if (_clickAnim) {
			_view.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()){
						case MotionEvent.ACTION_DOWN:{
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues(0.9f);
							scaleX.setDuration((int)_animDuration);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues(0.9f);
							scaleY.setDuration((int)_animDuration);
							scaleY.start();
							break;
						}
						case MotionEvent.ACTION_UP:{
							
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues((float)1);
							scaleX.setDuration((int)_animDuration);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues((float)1);
							scaleY.setDuration((int)_animDuration);
							scaleY.start();
							
							break;
						}
					}
					return false;
				}
			});
		}
	}
	
	
	public void _ColourFilter(final ImageView _imageview, final String _color) {
		_imageview.clearColorFilter(); 
		_imageview.setColorFilter(Color.parseColor(_color.toString()));
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
	
	public class Gridview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Gridview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.play, null);
			}
			
			final RelativeLayout relativelayout1 = _view.findViewById(R.id.relativelayout1);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final RelativeLayout relativelayout2 = _view.findViewById(R.id.relativelayout2);
			final ProgressBar progressbar1 = _view.findViewById(R.id.progressbar1);
			final LinearLayout linear73 = _view.findViewById(R.id.linear73);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView name = _view.findViewById(R.id.name);
			
			name.setText(_data.get((int)_position).get("name").toString());
			linear5.setVisibility(View.GONE);
			if (save.getString("visible_title", "").equals("1")) {
				linear5.setVisibility(View.VISIBLE);
			}
			Glide.with(imageview1.getContext())
			.clear(imageview1);
			
			Glide.with(imageview1.getContext())
			.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=90&src=https://s35.upera.net/s3/posters/".concat(_data.get((int)_position).get("image").toString()))))))
			.placeholder(R.drawable.nul)
			.error(R.drawable.nul)
			.centerCrop()
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
			.into(imageview1);
			relativelayout1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					intent.setClass(getApplicationContext(), ViewActivity.class);
					intent.putExtra("id", _data.get((int)_position).get("id").toString());
					intent.putExtra("name", _data.get((int)_position).get("name").toString());
					intent.putExtra("image", _data.get((int)_position).get("image").toString());
					intent.putExtra("type", _data.get((int)_position).get("type").toString());
					intent.putExtra("dasteh", "");
					intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(intent);
					PlayListActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
				}
			});
			
			
			// تنظیم drawable سفارشی
			progressbar1.setProgressDrawable(getDrawable(R.drawable.imageprogress));
			
			// تغییر رنگ بخش progress
			LayerDrawable layerDrawable = (LayerDrawable) progressbar1.getProgressDrawable();
			Drawable progressDrawable = layerDrawable.findDrawableByLayerId(android.R.id.progress);
			progressDrawable.setColorFilter(Color.parseColor(color), android.graphics.PorterDuff.Mode.SRC_IN);
			progressbar1.setMax((int)100);
			progressbar1.setProgress((int)0);
			if (!_data.get((int)_position).get("max").toString().equals("0")) {
				progressbar1.setMax((int)Double.parseDouble(_data.get((int)_position).get("max").toString()));
				progressbar1.setProgress((int)Double.parseDouble(_data.get((int)_position).get("position").toString()));
				double position = Double.parseDouble(_data.get((int)_position).get("position").toString());
				double max = Double.parseDouble(_data.get((int)_position).get("max").toString());
				
				if (max > 0) {
					double percent = (position / max) * 100;
					String value = String.format("%.0f%%", percent); // بدون اعشار (مثل 89%)
					
					// تبدیل اعداد انگلیسی به فارسی
					value = value
					.replace("0", "۰")
					.replace("1", "۱")
					.replace("2", "۲")
					.replace("3", "۳")
					.replace("4", "۴")
					.replace("5", "۵")
					.replace("6", "۶")
					.replace("7", "۷")
					.replace("8", "۸")
					.replace("9", "۹");
					
					textview1.setText(value);
				} else {
					textview1.setText("۰%");
				}
			}
			progressbar1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0x90000000));
			
			return _view;
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