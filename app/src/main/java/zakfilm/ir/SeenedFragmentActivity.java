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
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
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
import androidx.recyclerview.widget.GridLayoutManager;

public class SeenedFragmentActivity extends Fragment {
	
	private HashMap<String, Object> mp = new HashMap<>();
	private String url = "";
	private String fileName = "";
	private double round = 0;
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap00 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> nui = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_imag = new ArrayList<>();
	
	private LinearLayout linear1;
	private RecyclerView recyclerview1;
	
	private RequestNetwork get_gener;
	private RequestNetwork.RequestListener _get_gener_request_listener;
	private SharedPreferences list_gener;
	private Intent to = new Intent();
	private SharedPreferences save;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.seened_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		FirebaseApp.initializeApp(getContext());
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		linear1 = _view.findViewById(R.id.linear1);
		recyclerview1 = _view.findViewById(R.id.recyclerview1);
		get_gener = new RequestNetwork((Activity) getContext());
		list_gener = getContext().getSharedPreferences("l", Activity.MODE_PRIVATE);
		save = getContext().getSharedPreferences("save", Activity.MODE_PRIVATE);
		
		_get_gener_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				String jsonString = _response;
				
				try {
					// مرحله 1: ایجاد آبجکت جیسون اصلی
					JSONObject jsonObject = new JSONObject(jsonString);
					
					// مرحله 2: به سراغ کلید "genres" بروید
					JSONArray genresArray = jsonObject.getJSONArray("genres");
					
					// لیست مپ برای ذخیره داده‌ها
					listmap00.clear(); // ابتدا لیست را پاک می‌کنیم
					
					// مرحله 3: حلقه روی آرایه جیسون و اضافه کردن به ListMap (محدود به ۲۳ مورد)
					int limit = Math.min(genresArray.length(), 24); // تعیین حداکثر تعداد رکوردها
					
					for (int i = 0; i < limit; i++) {
						// دریافت هر آیتم از آرایه به عنوان آبجکت جیسون
						JSONObject item = genresArray.getJSONObject(i);
						
						// تبدیل آبجکت جیسون به Map (لیست مپ)
						HashMap<String, Object> map = new HashMap<>();
						
						// اضافه کردن هر کلید-مقدار از آبجکت جیسون به Map
						Iterator<String> keys = item.keys();
						while (keys.hasNext()) {
							String key = keys.next();
							map.put(key, item.get(key));
						}
						
						// اضافه کردن Map به listmap00
						listmap00.add(map);
					}
					
				} catch (JSONException e) {
					e.printStackTrace();
				}
				if (list_gener.getString("list_gener", "").equals(new Gson().toJson(listmap00))) {
					
				} else {
					if (recyclerview1.getAdapter() == null) {
						recyclerview1.setAdapter(new Recyclerview1Adapter(listmap00));
					} else {
						recyclerview1.getAdapter().notifyDataSetChanged();
					}
					
					list_gener.edit().putString("list_gener", new Gson().toJson(listmap00)).commit();
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				if (list_gener.contains("list_gener")) {
					listmap00 = new Gson().fromJson(list_gener.getString("list_gener", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
					
				}
			}
		};
	}
	
	private void initializeLogic() {
		GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
		recyclerview1.setLayoutManager(layoutManager);
		get_gener.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/new_genres", "", _get_gener_request_listener);
		if (list_gener.contains("list_gener")) {
			listmap00 = new Gson().fromJson(list_gener.getString("list_gener", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			recyclerview1.setAdapter(new Recyclerview1Adapter(listmap00));
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
	
	
	public void _alpah_click(final View _view) {
		
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
	
	
	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getActivity().getLayoutInflater();
			View _v = _inflater.inflate(R.layout.gener_pish, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear27 = _view.findViewById(R.id.linear27);
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear31 = _view.findViewById(R.id.linear31);
			final LinearLayout linear32 = _view.findViewById(R.id.linear32);
			final LinearLayout line1 = _view.findViewById(R.id.line1);
			final LinearLayout linear30 = _view.findViewById(R.id.linear30);
			final ImageView img0 = _view.findViewById(R.id.img0);
			final ImageView img1 = _view.findViewById(R.id.img1);
			final ImageView img2 = _view.findViewById(R.id.img2);
			final ImageView img3 = _view.findViewById(R.id.img3);
			final ImageView imageview20 = _view.findViewById(R.id.imageview20);
			final TextView title_per = _view.findViewById(R.id.title_per);
			
			img0.setScaleType(ImageView.ScaleType.FIT_XY);
			img1.setScaleType(ImageView.ScaleType.FIT_XY);
			img2.setScaleType(ImageView.ScaleType.FIT_XY);
			img3.setScaleType(ImageView.ScaleType.FIT_XY);
			
			linear32.post(new Runnable() {
				@Override
				public void run() {
					
					int totalWidth = linear32.getWidth();
					
					if (totalWidth <= 0) {
						return;
					}
					
					// فاصله بین دو عکس
					int gap = (int) (4 * getResources().getDisplayMetrics().density);
					
					// عرض هر عکس
					int imageSize = (totalWidth - gap) / 2;
					
					// عکس اول
					LinearLayout.LayoutParams p0 =
					new LinearLayout.LayoutParams(0, imageSize, 1);
					
					p0.setMargins(0, 0, gap / 2, 0);
					img0.setLayoutParams(p0);
					
					// عکس دوم
					LinearLayout.LayoutParams p1 =
					new LinearLayout.LayoutParams(0, imageSize, 1);
					
					p1.setMargins(gap / 2, 0, 0, 0);
					img1.setLayoutParams(p1);
					
					// عکس سوم
					LinearLayout.LayoutParams p2 =
					new LinearLayout.LayoutParams(0, imageSize, 1);
					
					p2.setMargins(0, 0, gap / 2, 0);
					img2.setLayoutParams(p2);
					
					// عکس چهارم
					LinearLayout.LayoutParams p3 =
					new LinearLayout.LayoutParams(0, imageSize, 1);
					
					p3.setMargins(gap / 2, 0, 0, 0);
					img3.setLayoutParams(p3);
				}
			});
			cardview1.setCardBackgroundColor(Color.TRANSPARENT);
			cardview1.setRadius((float)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)));
			cardview1.setCardElevation((float)0);
			_rippleRoundStroke(linear27, "#00000000", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), "#37474f");
			title_per.setText(_data.get((int)_position).get("fa").toString());
			try {
				
				String itemsJson = new Gson().toJson(
				_data.get(_position).get("items")
				);
				
				JSONArray itemsArray;
				
				if (itemsJson.trim().startsWith("{")) {
					
					JSONObject root = new JSONObject(itemsJson);
					
					if (root.has("values")) {
						itemsArray = root.getJSONArray("values");
					} else {
						return;
					}
					
				} else {
					itemsArray = new JSONArray(itemsJson);
				}
				
				for (int i = 0; i < itemsArray.length() && i < 4; i++) {
					
					JSONObject itemObject = itemsArray.getJSONObject(i);
					
					if (itemObject.has("nameValuePairs")) {
						itemObject = itemObject.getJSONObject("nameValuePairs");
					}
					
					String backdrop = itemObject.getString("backdrop");
					
					String imageUrl = save.getString("domain", "")
					.concat("500&h=500&q=100&a=c&zc=1&src=https://cdn.upera.shop/s3/backdrops/")
					.concat(backdrop);
					
					if (i == 0) {
						
						Glide.with(getContext().getApplicationContext())
						.load(imageUrl)
						.placeholder(R.drawable.nul)
						.transform(new RoundedCorners(2))
						.transition(DrawableTransitionOptions.withCrossFade(300))
						.into(img0);
						
					} else if (i == 1) {
						
						Glide.with(getContext().getApplicationContext())
						.load(imageUrl)
						.placeholder(R.drawable.nul)
						.transform(new RoundedCorners(2))
						.transition(DrawableTransitionOptions.withCrossFade(300))
						.into(img1);
						
					} else if (i == 2) {
						
						Glide.with(getContext().getApplicationContext())
						.load(imageUrl)
						.placeholder(R.drawable.nul)
						.transform(new RoundedCorners(2))
						.transition(DrawableTransitionOptions.withCrossFade(300))
						.into(img2);
						
					} else if (i == 3) {
						
						Glide.with(getContext().getApplicationContext())
						.load(imageUrl)
						.placeholder(R.drawable.nul)
						.transform(new RoundedCorners(2))
						.transition(DrawableTransitionOptions.withCrossFade(300))
						.into(img3);
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			linear27.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					to.setClass(getContext().getApplicationContext(), MoreActivity.class);
					to.putExtra("type", _data.get((int)_position).get("en").toString().toLowerCase());
					to.putExtra("sortby", "created");
					to.putExtra("title", _data.get((int)_position).get("fa").toString());
					to.putExtra("age", "0");
					to.putExtra("f_type", "0");
					to.putExtra("gener", _data.get((int)_position).get("en").toString().toLowerCase());
					to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(to);
					getActivity().overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
				}
			});
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
}