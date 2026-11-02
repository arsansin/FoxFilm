package zakfilm.ir;

import android.animation.*;
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
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
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
import java.util.regex.*;
import org.json.*;
import smartdevelop.ir.eram.showcaseviewlib.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
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
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class More1Activity extends AppCompatActivity {
	
	private double num = 0;
	private double contentHeight = 0;
	private double scrollHeight = 0;
	private double scrollY = 0;
	private boolean cancable_dialog_loader = false;
	private boolean isRequesting = false;
	private String data = "";
	private String f_type = "";
	private String gener = "";
	private HashMap<String, Object> m = new HashMap<>();
	private String ir = "";
	private HashMap<String, Object> mop = new HashMap<>();
	private HashMap<String, Object> headers = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> off = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_new = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> casts = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list0 = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear92;
	private RelativeLayout relativelayout2;
	private ProgressBar progressbar1;
	private LinearLayout linear89;
	private TextView textview1;
	private LinearLayout linear90;
	private ImageView setting;
	private RecyclerView recyclerView1;
	private LinearLayout linear65;
	private TextView love;
	private TextView cuple;
	private CardView cardview1;
	private LinearLayout linear5;
	private RelativeLayout relativelayout1;
	private ImageView imageview2;
	private LinearLayout linear3;
	private LinearLayout linear6;
	private LinearLayout linear4;
	private ImageView imageview3;
	private TextView name;
	
	private RequestNetwork all;
	private RequestNetwork.RequestListener _all_request_listener;
	private Intent to = new Intent();
	private Intent yu = new Intent();
	private SharedPreferences round_img;
	private SharedPreferences width_img;
	private SharedPreferences height_img;
	private Intent i = new Intent();
	private Intent pl = new Intent();
	private SharedPreferences save;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.more1);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear92 = findViewById(R.id.linear92);
		relativelayout2 = findViewById(R.id.relativelayout2);
		progressbar1 = findViewById(R.id.progressbar1);
		linear89 = findViewById(R.id.linear89);
		textview1 = findViewById(R.id.textview1);
		linear90 = findViewById(R.id.linear90);
		setting = findViewById(R.id.setting);
		recyclerView1 = findViewById(R.id.recyclerView1);
		linear65 = findViewById(R.id.linear65);
		love = findViewById(R.id.love);
		cuple = findViewById(R.id.cuple);
		cardview1 = findViewById(R.id.cardview1);
		linear5 = findViewById(R.id.linear5);
		relativelayout1 = findViewById(R.id.relativelayout1);
		imageview2 = findViewById(R.id.imageview2);
		linear3 = findViewById(R.id.linear3);
		linear6 = findViewById(R.id.linear6);
		linear4 = findViewById(R.id.linear4);
		imageview3 = findViewById(R.id.imageview3);
		name = findViewById(R.id.name);
		all = new RequestNetwork(this);
		round_img = getSharedPreferences("round_img", Activity.MODE_PRIVATE);
		width_img = getSharedPreferences("width_img", Activity.MODE_PRIVATE);
		height_img = getSharedPreferences("height_img", Activity.MODE_PRIVATE);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear90.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
				overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
			}
		});
		
		recyclerView1.addOnScrollListener(new RecyclerView.OnScrollListener() {
			@Override
			public void onScrollStateChanged(RecyclerView recyclerView, int _scrollState) {
				super.onScrollStateChanged(recyclerView, _scrollState);
				
			}
			
			@Override
			public void onScrolled(RecyclerView recyclerView, int _offsetX, int _offsetY) {
				super.onScrolled(recyclerView, _offsetX, _offsetY);
				
			}
		});
		
		cardview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					if (getIntent().getStringExtra("type").equals("casts")) {
						
					} else {
						to.setClass(getApplicationContext(), ViewActivity.class);
						to.putExtra("name", list_new.get((int)0).get("name_fa").toString());
						to.putExtra("image", list_new.get((int)0).get("poster").toString());
						to.putExtra("dasteh", "");
						to.putExtra("my", "");
						to.putExtra("id", list_new.get((int)0).get("id").toString());
						to.putExtra("backdrop", list_new.get((int)0).get("backdrop").toString());
						to.putExtra("type", "movie");
						to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
						startActivity(to);
						More1Activity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
					}
				} catch (Exception e) {
					
				}
			}
		});
		
		_all_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try {
					mop = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
					if ((boolean)mop.get("state")) {
						list_new = new Gson().fromJson((new Gson()).toJson(mop.get("data")), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
						recyclerView1.setAdapter(new RecyclerView1Adapter(list_new));
					}
				} catch (Exception e) {
					SketchwareUtil.showMessage(getApplicationContext(), "خطا در دریافت لیست!!!");
				}
				isRequesting = false;
				progressbar1.setVisibility(View.GONE);
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				isRequesting = false;
				to.setClass(getApplicationContext(), ErrorActivity.class);
				startActivity(to);
			}
		};
	}
	
	private void initializeLogic() {
		num = 1;
		_type();
		if (getIntent().hasExtra("title")) {
			textview1.setText(getIntent().getStringExtra("title"));
		}
		textview1.setShadowLayer(9, 2, 2, Color.parseColor("#000000"));
		// تنظیم LayoutManager به صورت گرید با 3 ستون
		GridLayoutManager layoutManager = new GridLayoutManager(More1Activity.this, 3);
		recyclerView1.setLayoutManager(layoutManager);
		
		// تنظیم فاصله بین آیتم‌ها (اختیاری)
		int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.recycler_spacing);
		recyclerView1.addItemDecoration(new GridSpacingItemDecoration(3, spacingInPixels, true));
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF0f1620".replace("0xFF" , "#")));
		}
		
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
			Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);}
		getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN); if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { getWindow().setStatusBarColor(Color.TRANSPARENT); }
		getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		linear90.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0x50000000));
		linear4.setVisibility(View.GONE);
		off = new Gson().fromJson("[]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		_req2();
		// گرفتن SharedPreferences
		SharedPreferences sharedPreferences = getSharedPreferences("save", MODE_PRIVATE);
		
		// گرفتن رشته رنگ با کلید "theme" (مثل "#533010")
		String colorCode = sharedPreferences.getString("theme", "#FF8E2D"); // مقدار پیش‌فرض اگر وجود نداشت
		
		// اعمال رنگ به ProgressBar
		progressbar1.getProgressDrawable().setColorFilter(
		Color.parseColor(colorCode),
		PorterDuff.Mode.SRC_IN
		);
		linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)999, 0x50000000));
		_ColourFilter(imageview3, "#ffffff");
		OverScrollDecoratorHelper.setUpOverScroll(recyclerView1, OverScrollDecoratorHelper.ORIENTATION_VERTICAL);
		_ui();
		name.setText(getIntent().getStringExtra("name"));
		Glide.with(getApplicationContext())
		.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=100&a=c&src=https://cdn.upera.shop/s3/posters/".concat(getIntent().getStringExtra("poster")))))))
		.placeholder(R.drawable.nul)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
		.into(imageview2);
		if (getIntent().getStringExtra("persian").equals("1.0")) {
			linear4.setVisibility(View.VISIBLE);
		}
	}
	
	
	@Override
	public void onBackPressed() {
		finish();
		overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
	}
	
	@Override
	public void onResume() {
		super.onResume();
		_vpn();
		if (vpn()) {
			i.setClass(getApplicationContext(), ErrorActivity.class);
			startActivity(i);
			More1Activity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
		} else {
			
		}
	}
	public void _ColourFilter(final ImageView _imageview, final String _color) {
		_imageview.clearColorFilter(); 
		_imageview.setColorFilter(Color.parseColor(_color.toString()));
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _alpah_click(final View _view) {
		
	}
	
	
	public void _type() {
		
	}
	
	
	public void _ui() {
		cardview1.setCardBackgroundColor(0xFF0F1620);
		cardview1.setRadius((float)Integer.parseInt(round_img.getString("round_img", "")));
		linear65.setAlpha((float)(0.95d));
		linear65.setBackgroundColor(0xFF0F1620);
		recyclerView1.setOnScrollListener(new RecyclerView.OnScrollListener() {
			
			float currentOffset = 0f;   // میزان مخفی شدن
			int originalHeight = 0;
			
			@Override
			public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
				super.onScrolled(recyclerView, dx, dy);
				
				if (originalHeight == 0) {
					originalHeight = relativelayout2.getHeight();
				}
				
				// افزایش / کاهش مقدار مخفی شدن
				currentOffset += dy;
				
				// محدود کردن بین 0 و ارتفاع کامل
				if (currentOffset < 0) currentOffset = 0;
				if (currentOffset > originalHeight) currentOffset = originalHeight;
				
				// جابه‌جایی به بالا (مخفی شدن)
				relativelayout2.setTranslationY(-currentOffset);
			}
		});
		
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
	
	
	public void _setMargin(final View _view, final double _r, final double _l, final double _t, final double _b) {
		
		//coded by someone on StackOverFlow, with some modifications
		
		
		float dpRatio = new c(this).getContext().getResources().getDisplayMetrics().density;
		int right = (int)(_r * dpRatio);
		int left = (int)(_l * dpRatio);
		int top = (int)(_t * dpRatio);
		int bottom = (int)(_b * dpRatio);
		
		boolean _default = false;
		
		ViewGroup.LayoutParams p = _view.getLayoutParams();
		if (p instanceof LinearLayout.LayoutParams) {
			LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams)p;
			lp.setMargins(left, top, right, bottom);
			_view.setLayoutParams(lp);
		}
		else if (p instanceof RelativeLayout.LayoutParams) {
			RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams)p;
			lp.setMargins(left, top, right, bottom);
			_view.setLayoutParams(lp);
		}
		else if (p instanceof TableRow.LayoutParams) {
			TableRow.LayoutParams lp = (TableRow.LayoutParams)p;
			lp.setMargins(left, top, right, bottom);
			_view.setLayoutParams(lp);
		}
		
		
	}
	
	//coded arabware , it helps to get context of activity , fragment and dialog fragment
	
	class c {
		Context co;
		public <T extends Activity> c(T a) {
			co = a;
		}
		public <T extends Fragment> c(T a) {
			co = a.getActivity();
		}
		public <T extends DialogFragment> c(T a) {
			co = a.getActivity();
		}
		
		public Context getContext() {
			return co;
		}
		
	}
	
	
	{
		
	}
	
	
	public void _req() {
		
	}
	
	
	public void _req2() {
		_vpn();
		if (vpn()) {
			
		} else {
			headers = new HashMap<>();
			headers.put("X-API-Key", "mobile_app_v1_8x7k9Lm2");
			headers.put("Content-Type", "application/json");
			all.setHeaders(headers);
			all.startRequestNetwork(RequestNetworkController.GET, "https://".concat(save.getString("site", "").concat("/zakfilm.ir/app/get_list_app.php?limit=".concat("10"))), "", _all_request_listener);
		}
	}
	
	public class RecyclerView1Adapter extends RecyclerView.Adapter<RecyclerView1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public RecyclerView1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.sus, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final TextView textview2 = _view.findViewById(R.id.textview2);
			final TextView num = _view.findViewById(R.id.num);
			final RelativeLayout linear2 = _view.findViewById(R.id.linear2);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final LinearLayout null_1 = _view.findViewById(R.id.null_1);
			final RelativeLayout relativelayout1 = _view.findViewById(R.id.relativelayout1);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final LinearLayout linear8 = _view.findViewById(R.id.linear8);
			final LinearLayout linear13 = _view.findViewById(R.id.linear13);
			final LinearLayout linear14 = _view.findViewById(R.id.linear14);
			final ImageView imag_sma0 = _view.findViewById(R.id.imag_sma0);
			final ImageView imag_sma1 = _view.findViewById(R.id.imag_sma1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final LinearLayout linear6 = _view.findViewById(R.id.linear6);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final ImageView imageview2 = _view.findViewById(R.id.imageview2);
			final TextView name = _view.findViewById(R.id.name);
			final LinearLayout linear7 = _view.findViewById(R.id.linear7);
			
			_setMargin(linear2, 5, 5, 0, 0);
			if ((_position == 0) || ((_position == 1) || (_position == 2))) {
				_setMargin(linear2, 5, 5, 285, 0);
			}
			textview1.setVisibility(View.GONE);
			linear4.setVisibility(View.GONE);
			null_1.setVisibility(View.GONE);
			linear5.setVisibility(View.VISIBLE);
			linear2.setVisibility(View.VISIBLE);
			imag_sma0.setVisibility(View.GONE);
			imag_sma1.setVisibility(View.GONE);
			linear5.setVisibility(View.GONE);
			if (save.getString("visible_title", "").equals("1")) {
				linear5.setVisibility(View.VISIBLE);
			}
			if (_data.get((int)_position).containsKey("null")) {
				linear7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFF1D2733));
				null_1.setVisibility(View.VISIBLE);
				linear5.setVisibility(View.GONE);
				linear2.setVisibility(View.GONE);
			} else {
				num.setText(_data.get((int)_position).get("persian").toString());
				if (num.getText().toString().equals("1")) {
					linear4.setVisibility(View.VISIBLE);
				}
				if (_data.get((int)_position).get("poster").toString().toString().trim().startsWith("http")) {
					Glide.with(getApplicationContext())
					.load(_data.get((int)_position).get("poster").toString())
					.placeholder(R.drawable.nul)
					.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
					.transition(DrawableTransitionOptions.withCrossFade(300))
					.into(imageview1);
				} else {
					Glide.with(getApplicationContext())
					.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=100&a=c&src=https://cdn.upera.shop/s3/posters/".concat(_data.get((int)_position).get("poster").toString()))))))
					.placeholder(R.drawable.nul)
					.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
					.transition(DrawableTransitionOptions.withCrossFade(300))
					.into(imageview1);
				}
				if (!_data.get((int)_position).get("type").toString().equals("movie")) {
					if (_data.get((int)_position).get("poster").toString().toString().trim().startsWith("http")) {
						Glide.with(getApplicationContext())
						.load(_data.get((int)_position).get("poster").toString())
						.placeholder(R.drawable.nul)
						.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
						.transition(DrawableTransitionOptions.withCrossFade(300))
						.into(imag_sma0);
						Glide.with(getApplicationContext())
						.load(_data.get((int)_position).get("poster").toString())
						.placeholder(R.drawable.nul)
						.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
						.transition(DrawableTransitionOptions.withCrossFade(300))
						.into(imag_sma1);
					} else {
						Glide.with(getApplicationContext())
						.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=100&a=c&src=https://cdn.upera.shop/s3/posters/".concat(_data.get((int)_position).get("poster").toString()))))))
						.placeholder(R.drawable.nul)
						.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
						.transition(DrawableTransitionOptions.withCrossFade(300))
						.into(imag_sma0);
						Glide.with(getApplicationContext())
						.load(_data.get((int)_position).get("poster").toString())
						.placeholder(R.drawable.nul)
						.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
						.transition(DrawableTransitionOptions.withCrossFade(300))
						.into(imag_sma1);
					}
					imag_sma0.setVisibility(View.VISIBLE);
					imag_sma1.setVisibility(View.VISIBLE);
				}
				name.setText(_data.get((int)_position).get("name_fa").toString());
				linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0x50000000));
				_ColourFilter(imageview2, "#ffffff");
				linear2.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						to.setClass(getApplicationContext(), ViewActivity.class);
						to.putExtra("name", _data.get((int)_position).get("name_fa").toString());
						to.putExtra("image", _data.get((int)_position).get("poster").toString());
						to.putExtra("dasteh", "");
						to.putExtra("my", "");
						to.putExtra("id", _data.get((int)_position).get("id").toString());
						to.putExtra("backdrop", _data.get((int)_position).get("backdrop").toString());
						to.putExtra("type", "movie");
						to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
						startActivity(to);
						More1Activity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
					}
				});
			}
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
			}
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