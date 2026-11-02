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
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
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

public class CommentsActivity extends AppCompatActivity {
	
	private HashMap<String, Object> map = new HashMap<>();
	private String data = "";
	private String token = "";
	
	private ArrayList<HashMap<String, Object>> mp = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> sert = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> sett = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear5;
	private TextView textview1;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private LinearLayout nul;
	private RecyclerView recyclerview1;
	private TextView textview2;
	
	private RequestNetwork get;
	private RequestNetwork.RequestListener _get_request_listener;
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.comments);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear5 = findViewById(R.id.linear5);
		textview1 = findViewById(R.id.textview1);
		linear4 = findViewById(R.id.linear4);
		linear6 = findViewById(R.id.linear6);
		nul = findViewById(R.id.nul);
		recyclerview1 = findViewById(R.id.recyclerview1);
		textview2 = findViewById(R.id.textview2);
		get = new RequestNetwork(this);
		
		_get_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				// فرض می‌شود که _response حاوی JSON باشد
				String jsonString = _response;
				
				try {
					// مرحله 1: ایجاد آبجکت JSON اصلی
					JSONObject jsonObject = new JSONObject(jsonString);
					
					// مرحله 2: به سراغ کلید "data" بروید
					JSONObject dataObject = jsonObject.getJSONObject("data");
					
					// مرحله 3: دریافت آرایه "posts" از داخل "data"
					JSONArray postsArray = dataObject.getJSONArray("comments");
					
					// لیست مپ برای ذخیره داده‌ها
					sett.clear(); // ابتدا لیست را پاک می‌کنیم
					
					// مرحله 4: حلقه روی آرایه JSON و اضافه کردن به ListMap
					for (int i = 0; i < postsArray.length(); i++) {
						// دریافت هر آیتم از آرایه به عنوان آبجکت JSON
						JSONObject item = postsArray.getJSONObject(i);
						
						// تبدیل آبجکت JSON به Map (لیست مپ)
						HashMap<String, Object> map = new HashMap<>();
						
						// اضافه کردن هر کلید-مقدار از آبجکت JSON به Map
						Iterator<String> keys = item.keys();
						while (keys.hasNext()) {
							String key = keys.next();
							map.put(key, item.get(key));
						}
						
						// اضافه کردن Map به لیست mp
						sett.add(map);
					}
					
				} catch (JSONException e) {
					e.printStackTrace();
				}
				recyclerview1.setAdapter(new Recyclerview1Adapter(sett));
				if (sett.size() == 0) {
					nul.setVisibility(View.VISIBLE);
				}
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
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF0f1620".replace("0xFF" , "#")));
		}
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			final Window window = CommentsActivity.this.getWindow();
			window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			window.setStatusBarColor(0xFF000000);
		}
		_shape(30, 30, 0, 0, "#0f1620", "#0f1620", 0, linear5);
		linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)999, 0xFF9E9E9E));
		_vpn();
		if (vpn()) {
			i.setClass(getApplicationContext(), ErrorActivity.class);
			startActivity(i);
			CommentsActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
		} else {
			map = new Gson().fromJson("{\"auth\":\"ojrxycygkhvkjvcgveggyumdovenshfq\",\"api_version\":\"0\",\"client\":{\"app_name\":\"Main\",\"app_version\":\"2.4.3\",\"package\":\"m.rubika.ir\",\"platform\":\"PWA\"},\"data\":{\"profile_id\":\"68015a703b775058f8e38c5f\",\"post_id\":\"".concat(getIntent().getStringExtra("post_id").concat("\",\"post_profile_id\":\"".concat(getIntent().getStringExtra("post_profile_id").concat("\",\"limit\":2000,\"sort\":\"FromMin\",\"min_id\":null},\"method\":\"getComments\"}")))), new TypeToken<HashMap<String, Object>>(){}.getType());
			get.setParams(map, RequestNetworkController.REQUEST_BODY);
			get.startRequestNetwork(RequestNetworkController.POST, "https://rubino2.iranlms.ir/", "post", _get_request_listener);
		}
		recyclerview1.setLayoutManager(new LinearLayoutManager(this));
		nul.setVisibility(View.GONE);
		OverScrollDecoratorHelper.setUpOverScroll(recyclerview1, OverScrollDecoratorHelper.ORIENTATION_VERTICAL);
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
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.costume_comment, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final TextView text = _view.findViewById(R.id.text);
			final TextView data = _view.findViewById(R.id.data);
			final LinearLayout linear90 = _view.findViewById(R.id.linear90);
			final de.hdodenhof.circleimageview.CircleImageView circleimageview1 = _view.findViewById(R.id.circleimageview1);
			final TextView name = _view.findViewById(R.id.name);
			
			linear1.setBackgroundColor(0xFF0F1620);
			text.setText(_data.get((int)_position).get("content").toString());
			name.setText(_data.get((int)_position).get("profile_username").toString());
			Glide.with(getApplicationContext())
			.load(_data.get((int)_position).get("full_profile_thumbnail_url").toString())
			.placeholder(R.drawable.profile)
			.transform(new RoundedCorners(999))
			.transition(DrawableTransitionOptions.withCrossFade(300))
			.into(circleimageview1);
			if (_position % 2 == 0) {} else {
				linear1.setBackgroundColor(0xFF1D2733);
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