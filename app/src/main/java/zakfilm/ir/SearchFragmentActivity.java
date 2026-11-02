package zakfilm.ir;

import android.animation.*;
import android.animation.ObjectAnimator;
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
import android.text.Editable;
import android.text.TextWatcher;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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

public class SearchFragmentActivity extends Fragment {
	
	private HashMap<String, Object> mop = new HashMap<>();
	private HashMap<String, Object> s = new HashMap<>();
	private boolean isFirstResource = false;
	private String string20 = "";
	private String strings_position = "";
	private boolean isRequesting = false;
	private double num = 0;
	private double currentHeight = 0;
	private double scrollY = 0;
	private boolean persian = false;
	private String url = "";
	private String lang = "";
	private String dooble = "";
	private double height = 0;
	GradientDrawable searchBg;
	ValueAnimator searchAnimator;
	private String country = "";
	private String year = "";
	private String persiann = "";
	private String genre = "";
	private String age = "";
	private String rate = "";
	
	private ArrayList<HashMap<String, Object>> p = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> pov = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap3 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap00 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> libe = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_new = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> off = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> seta = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private LinearLayout linear91;
	private LinearLayout linear94;
	private LinearLayout linear96;
	private LinearLayout linear97;
	private EditText edittext1;
	private LinearLayout linear98;
	private ImageView imageview6;
	private ImageView imageview9;
	private LinearLayout linear6;
	private LinearLayout linear95;
	private LinearLayout l1;
	private ImageView imageview7;
	private TextView textview4;
	private TextView textview1;
	private LinearLayout linear93;
	private ImageView imageview2;
	private RecyclerView recyclerview1;
	private LinearLayout linear92;
	private RecyclerView recyclerview3;
	private ImageView imageview8;
	private TextView textview3;
	
	private SharedPreferences h_search;
	private Intent to = new Intent();
	private RequestNetwork search;
	private RequestNetwork.RequestListener _search_request_listener;
	private ObjectAnimator iup = new ObjectAnimator();
	private ObjectAnimator alpah = new ObjectAnimator();
	private SharedPreferences list_gener;
	private Vibrator vi;
	private SharedPreferences height_img;
	private SharedPreferences width_img;
	private SharedPreferences round_img;
	private Intent i = new Intent();
	private Intent ca = new Intent();
	private SharedPreferences save;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.search_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		FirebaseApp.initializeApp(getContext());
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		linear1 = _view.findViewById(R.id.linear1);
		linear2 = _view.findViewById(R.id.linear2);
		vscroll1 = _view.findViewById(R.id.vscroll1);
		linear91 = _view.findViewById(R.id.linear91);
		linear94 = _view.findViewById(R.id.linear94);
		linear96 = _view.findViewById(R.id.linear96);
		linear97 = _view.findViewById(R.id.linear97);
		edittext1 = _view.findViewById(R.id.edittext1);
		linear98 = _view.findViewById(R.id.linear98);
		imageview6 = _view.findViewById(R.id.imageview6);
		imageview9 = _view.findViewById(R.id.imageview9);
		linear6 = _view.findViewById(R.id.linear6);
		linear95 = _view.findViewById(R.id.linear95);
		l1 = _view.findViewById(R.id.l1);
		imageview7 = _view.findViewById(R.id.imageview7);
		textview4 = _view.findViewById(R.id.textview4);
		textview1 = _view.findViewById(R.id.textview1);
		linear93 = _view.findViewById(R.id.linear93);
		imageview2 = _view.findViewById(R.id.imageview2);
		recyclerview1 = _view.findViewById(R.id.recyclerview1);
		linear92 = _view.findViewById(R.id.linear92);
		recyclerview3 = _view.findViewById(R.id.recyclerview3);
		imageview8 = _view.findViewById(R.id.imageview8);
		textview3 = _view.findViewById(R.id.textview3);
		h_search = getContext().getSharedPreferences("h_search", Activity.MODE_PRIVATE);
		search = new RequestNetwork((Activity) getContext());
		list_gener = getContext().getSharedPreferences("l", Activity.MODE_PRIVATE);
		vi = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
		height_img = getContext().getSharedPreferences("height_img", Activity.MODE_PRIVATE);
		width_img = getContext().getSharedPreferences("width_img", Activity.MODE_PRIVATE);
		round_img = getContext().getSharedPreferences("round_img", Activity.MODE_PRIVATE);
		save = getContext().getSharedPreferences("save", Activity.MODE_PRIVATE);
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.isEmpty()) {
					if (vscroll1.getVisibility() == View.VISIBLE) {
						
					} else {
						recyclerview3.setVisibility(View.GONE);
						linear92.setVisibility(View.GONE);
						vscroll1.setVisibility(View.VISIBLE);
						_an(vscroll1);
						try {
							off.clear();
						} catch (Exception e) {
							
						}
					}
					imageview9.setImageResource(R.drawable.jhfftg6);
				} else {
					if (off.size() == 0) {
						
					} else {
						imageview9.setImageResource(R.drawable.icon_close_round);
					}
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		linear98.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (off.size() == 0) {
					_search_text(edittext1.getText().toString(), country, year, persiann, genre, age, rate);
				} else {
					edittext1.setText("");
					vi.vibrate((long)(50));
				}
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				h_search.edit().putString("h_search", "[]").commit();
				vi.vibrate((long)(100));
				linear93.setVisibility(View.GONE);
				textview1.setVisibility(View.GONE);
				_TransitionManager(l1, 500);
			}
		});
		
		_search_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					if (searchAnimator != null) {
						searchAnimator.cancel();
					}
					
					if (searchBg != null) {
						
						searchBg.setStroke(
						(int) SketchwareUtil.getDip(
						getContext().getApplicationContext(),
						2
						),
						Color.parseColor("#37474F")
						);
						
						linear94.setBackground(searchBg);
					}
					String jsonString = _response;
					
					try {
						JSONObject jsonObject = new JSONObject(jsonString);
						
						JSONObject dataObject = jsonObject.getJSONObject("data");
						JSONArray dataArray = dataObject.getJSONArray("data");
						
						if (off == null) {
							off = new ArrayList<>();
						}
						
						if (list_new == null) {
							list_new = new ArrayList<>();
						} else {
							list_new.clear();
						}
						
						// دریافت تمام کلیدهای هر آیتم
						for (int i = 0; i < dataArray.length(); i++) {
							
							JSONObject item = dataArray.getJSONObject(i);
							
							HashMap<String, Object> map = new HashMap<>();
							
							Iterator<String> keys = item.keys();
							
							while (keys.hasNext()) {
								String key = keys.next();
								map.put(key, item.get(key));
							}
							
							off.add(map);
							list_new.add(map);
						}
						
					} catch (JSONException e) {
						e.printStackTrace();
					}
					// به‌روزرسانی آداپتر RecyclerView
					if (recyclerview3.getAdapter() == null) {
						recyclerview3.setAdapter(new Recyclerview3Adapter(list_new));
					} else {
						recyclerview3.getAdapter().notifyDataSetChanged();
					}
					imageview9.setImageResource(R.drawable.icon_close_round);
					_an(recyclerview3);
					recyclerview3.smoothScrollToPosition((int)0);
					linear91.setVisibility(View.VISIBLE);
					isRequesting = false;
					//برای مور از مور بلوک more استفاده کن
					if (!h_search.contains("h_search")) {
						h_search.edit().putString("h_search", "[]").commit();
					}
					p = new Gson().fromJson(h_search.getString("h_search", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
					boolean notFound = true;
					String searchText = edittext1.getText().toString(); // دریافت مقدار از EditText
					
					for (int i = 0; i < p.size(); i++) {
						HashMap<String, Object> item = p.get(i);
						if (item.get("text").toString().equals(searchText)) {
							notFound = false; // اگر آیتم پیدا شد، مقدار false می‌شود
							break; // جستجو متوقف می‌شود
						}
					}
					
					if (notFound) {
						
						if (edittext1.getText().toString().isEmpty()) {
							
						} else {
							if ((2 > edittext1.getText().toString().length()) || (2 == edittext1.getText().toString().length())) {
								
							} else {
								mop = new HashMap<>();
								mop.put("text", edittext1.getText().toString());
								p.add(mop);
								h_search.edit().putString("h_search", new Gson().toJson(p)).commit();
								recyclerview1.setAdapter(new Recyclerview1Adapter(p));
								height = vscroll1.getScaleY();
								textview1.setVisibility(View.VISIBLE);
								linear93.setVisibility(View.VISIBLE);
							}
						}
					} else {
						
					}
					if (off.size() == 0) {
						linear92.setVisibility(View.VISIBLE);
						recyclerview3.setVisibility(View.GONE);
					} else {
						linear92.setVisibility(View.GONE);
						recyclerview3.setVisibility(View.VISIBLE);
					}
				} else {
					// اگر صفحه یا Activity null بود، کاری انجام نمی‌شود
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
		_search_text("", "", "", "", "", "", "");
		num = 1;
		dooble = "0";
		if (h_search.contains("h_search")) {
			if (h_search.getString("h_search", "").equals("[]")) {
				textview1.setVisibility(View.GONE);
				linear93.setVisibility(View.GONE);
			} else {
				p = new Gson().fromJson(h_search.getString("h_search", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			}
		} else {
			p = new Gson().fromJson("[]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			textview1.setVisibility(View.GONE);
			linear93.setVisibility(View.GONE);
		}
		recyclerview1.setAdapter(new Recyclerview1Adapter(p));
		edittext1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
			@Override public boolean onEditorAction(TextView v, int actionId, KeyEvent event) { 
				if(actionId == 3){
					_search_text(edittext1.getText().toString(), country, year, persiann, genre, age, rate);
				} 
				return false;
			}
		});
		_ui();
		recyclerview3.setOnScrollListener(new RecyclerView.OnScrollListener() {
			
			// ارتفاع اصلی LinearLayout را ذخیره می‌کنیم
			int originalHeight;
			int minHeight = 130; // مقدار دلخواه حداقل ارتفاع
			
			
			@Override
			public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
				super.onScrolled(recyclerView, dx, dy);
				
				if (originalHeight == 0) {
					// اگر هنوز ارتفاع اصلی ذخیره نشده است، آن را ذخیره می‌کنیم
					originalHeight = linear91.getHeight();
				}
				
				// بدست آوردن اولین آیتم visible در لیست
				int firstVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
				
				// چک کردن اینکه اسکرول نزدیک به ابتدای لیست است (مثلاً 200 پیکسل یا کمتر)
				if (firstVisibleItemPosition == 0) {
					// طول فعلی linear91
					int currentHeight = linear91.getHeight();
					
					int newHeight;
					
					// کاهش طول LinearLayout بر اساس مقدار اسکرول به سمت پایین
					if (dy > 0) {
						newHeight = currentHeight - dy / 2;
						// محدودیت حداقل ارتفاع برای جلوگیری از کمتر شدن از minHeight
						newHeight = Math.max(minHeight, newHeight); // اعمال minHeight
					} 
					// افزایش طول LinearLayout بر اساس مقدار اسکرول به سمت بالا
					else {
						newHeight = currentHeight + (-dy / 2);
						// محدودیت برای جلوگیری از بیشتر شدن از ارتفاع اصلی
						newHeight = Math.min(originalHeight, newHeight); // اعمال محدودیت حداکثر به ارتفاع اصلی
					}
					
					// فقط ارتفاع linear91 را تغییر می‌دهیم
					linear91.getLayoutParams().height = newHeight;
					// عرض linear91 بدون تغییر باقی می‌ماند
					linear91.getLayoutParams().width = linear91.getLayoutParams().width;
					linear91.requestLayout();
				}
			}
			
			@Override
			public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
				super.onScrollStateChanged(recyclerView, newState);
				
				// تشخیص اسکرول به ابتدای لیست
				if (!recyclerView.canScrollVertically(-1)) {
					// بازگرداندن ارتفاع LinearLayout به اندازه اصلی
					linear91.getLayoutParams().height = originalHeight;
					linear91.requestLayout();
				}
			}
		});
		recyclerview3.setLayoutManager(new LinearLayoutManager(getContext()));
	}
	
	public void _ColourFilter(final ImageView _imageview, final String _color) {
		_imageview.clearColorFilter(); 
		_imageview.setColorFilter(Color.parseColor(_color.toString()));
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
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
	
	
	public void _an(final View _id) {
		_id.setTranslationY((float)(200));
		iup.setTarget(_id);
		iup.setPropertyName("translationY");
		iup.setFloatValues((float)(0));
		iup.setDuration((int)(300));
		iup.start();
		_id.setAlpha((float)(0.0d));
		alpah.setTarget(_id);
		alpah.setPropertyName("alpha");
		alpah.setFloatValues((float)(1.0d));
		alpah.setDuration((int)(250));
		alpah.start();
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
	
	
	public void _sea(final String _text) {
		edittext1.setText(_text);
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
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
	
	
	public void _refresh() {
		recyclerview1.getAdapter().notifyDataSetChanged();
		h_search.edit().putString("h_search", new Gson().toJson(p)).commit();
		if (p.size() == 0) {
			textview1.setVisibility(View.GONE);
			linear93.setVisibility(View.GONE);
		}
	}
	
	
	public void _ui() {
		linear94.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(999)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFF37474F, 0xFF1D2733));
		linear98.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(999)), 0xFF37474F));
		_ColourFilter(imageview2, "#ffffff");
		_ColourFilter(imageview6, "#ffffff");
		_removeScollBar(vscroll1);
		_removeScollBar(recyclerview1);
		_removeScollBar(recyclerview3);
		num = 1;
		recyclerview1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false));
		linear91.setVisibility(View.VISIBLE);
		SharedPreferences sp = getContext().getSharedPreferences("save", Context.MODE_PRIVATE);
		
		String colorCode = sp.getString("theme", "#FF8E2D");
		linear92.setVisibility(View.GONE);
		edittext1.requestFocus();
		edittext1.selectAll();
		linear2.setElevation((float)30);
	}
	
	
	public void _more() {
		recyclerview3.addOnScrollListener(new RecyclerView.OnScrollListener() {
			@Override
			public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
				super.onScrolled(recyclerView, dx, dy);
				
				// برای بدست آوردن تعداد آیتم‌های موجود و موقعیت فعلی
				RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
				int visibleItemCount = layoutManager.getChildCount();
				int totalItemCount = layoutManager.getItemCount();
				
				// برای بدست آوردن موقعیت اولین آیتم visible
				int firstVisibleItemPosition;
				if (layoutManager instanceof LinearLayoutManager) {
					firstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
				} else {
					// اگر از نوع دیگری از LayoutManager استفاده می‌کنید
					return;
				}
				
				// بررسی اینکه آیا به انتهای لیست رسیده‌ایم
				if ((visibleItemCount + firstVisibleItemPosition) >= totalItemCount) {
					// نمایش پیغام
					
					if (!new Gson().toJson(list_new).equals("[]")) {
						if (!isRequesting) {
							isRequesting = true;
							s = new Gson().fromJson("{\"ir\":0,\"payment_method\":0,\"sale_method\":3,\"page\":".concat(String.valueOf((long)(num + 1)).concat(",\"query\":\"".concat(edittext1.getText().toString().concat("\",\"nodata\":1}")))), new TypeToken<HashMap<String, Object>>(){}.getType());
							search.setParams(s, RequestNetworkController.REQUEST_PARAM);
							search.startRequestNetwork(RequestNetworkController.POST, url, "", _search_request_listener);
							num = num + 1;
						}
					}
					
				}
			}
		});
	}
	
	
	public void _search_text(final String _text, final String _country, final String _year, final String _persian, final String _gener, final String _sen, final String _rite) {
		if (_text.isEmpty() || (_text.length() == 1)) {
			
		} else {
			if (!isRequesting) {
				num = 1;
				isRequesting = true;
				linear92.setVisibility(View.GONE);
				vscroll1.setVisibility(View.GONE);
				linear91.setVisibility(View.VISIBLE);
				try {
					off.clear();
				} catch (Exception e) {
					
				}
				url = "https://provider.upera.tv/api/v1/ghost/get/search?country=noIR";
				s = new HashMap<>();
				s.put("query", _text);
				search.setParams(s, RequestNetworkController.REQUEST_PARAM);
				search.startRequestNetwork(RequestNetworkController.POST, url, "", _search_request_listener);
				final android.content.Context ctx = getContext().getApplicationContext();
				
				if (searchAnimator != null && searchAnimator.isRunning()) {
					return;
				}
				
				searchBg = new GradientDrawable();
				
				searchBg.setCornerRadius(
				(float) SketchwareUtil.getDip(ctx, 999)
				);
				
				searchBg.setColor(Color.parseColor("#1D2733"));
				
				searchBg.setStroke(
				(int) SketchwareUtil.getDip(ctx, 2),
				Color.parseColor("#37474F")
				);
				
				linear94.setBackground(searchBg);
				
				
				searchAnimator = android.animation.ValueAnimator.ofFloat(0f, 1f);
				
				searchAnimator.setDuration(900);
				
				searchAnimator.setRepeatCount(
				android.animation.ValueAnimator.INFINITE
				);
				
				searchAnimator.setRepeatMode(
				android.animation.ValueAnimator.REVERSE
				);
				
				searchAnimator.setInterpolator(
				new android.view.animation.LinearInterpolator()
				);
				
				
				searchAnimator.addUpdateListener(
				new android.animation.ValueAnimator.AnimatorUpdateListener() {
					
					@Override
					public void onAnimationUpdate(
					android.animation.ValueAnimator animation) {
						
						float f = (Float) animation.getAnimatedValue();
						
						int r;
						int g;
						int b;
						
						// رنگ شروع
						int startR = 55;
						int startG = 71;
						int startB = 79;
						
						// نارنجی کم‌رنگ
						int lightR = 255;
						int lightG = 204;
						int lightB = 128;
						
						// نارنجی اصلی
						int orangeR = 255;
						int orangeG = 171;
						int orangeB = 64;
						
						// نارنجی پررنگ
						int darkR = 230;
						int darkG = 120;
						int darkB = 30;
						
						
						if (f < 0.25f) {
							
							// #37474F → #FFCC80
							
							float p = f / 0.25f;
							
							r = (int)(startR + ((lightR - startR) * p));
							g = (int)(startG + ((lightG - startG) * p));
							b = (int)(startB + ((lightB - startB) * p));
							
						} else if (f < 0.50f) {
							
							// #FFCC80 → #FFAB40
							
							float p = (f - 0.25f) / 0.25f;
							
							r = (int)(lightR + ((orangeR - lightR) * p));
							g = (int)(lightG + ((orangeG - lightG) * p));
							b = (int)(lightB + ((orangeB - lightB) * p));
							
						} else if (f < 0.75f) {
							
							// #FFAB40 → #E6781E
							
							float p = (f - 0.50f) / 0.25f;
							
							r = (int)(orangeR + ((darkR - orangeR) * p));
							g = (int)(orangeG + ((darkG - orangeG) * p));
							b = (int)(orangeB + ((darkB - orangeB) * p));
							
						} else {
							
							// #E6781E → #37474F
							
							float p = (f - 0.75f) / 0.25f;
							
							r = (int)(darkR + ((startR - darkR) * p));
							g = (int)(darkG + ((startG - darkG) * p));
							b = (int)(darkB + ((startB - darkB) * p));
						}
						
						
						searchBg.setStroke(
						(int) SketchwareUtil.getDip(ctx, 2),
						Color.rgb(r, g, b)
						);
						
						linear94.invalidate();
					}
				}
				);
				
				searchAnimator.start();
			}
		}
	}
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getActivity().getLayoutInflater();
			View _v = _inflater.inflate(R.layout.history_search, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			textview1.setText(_data.get((int)_position).get("text").toString());
			linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)999, (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFF1D2733, Color.TRANSPARENT));
			_ColourFilter(imageview1, "#607d8b");
			_rippleRoundStroke(imageview1, "#1d2733", "#00000000", 999, 0, "#000000");
			linear2.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					_sea(_data.get((int)_position).get("text").toString());
					_search_text(_data.get((int)_position).get("text").toString(), country, year, persiann, genre, age, rate);
				}
			});
			imageview1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					vi.vibrate((long)(80));
					_data.remove((int)(_position));
					_refresh();
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
	
	public class Recyclerview3Adapter extends RecyclerView.Adapter<Recyclerview3Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview3Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getActivity().getLayoutInflater();
			View _v = _inflater.inflate(R.layout.custom_ser, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView num = _view.findViewById(R.id.num);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final RelativeLayout relativelayout1 = _view.findViewById(R.id.relativelayout1);
			final TextView name_fa = _view.findViewById(R.id.name_fa);
			final TextView name_en = _view.findViewById(R.id.name_en);
			final LinearLayout r = _view.findViewById(R.id.r);
			final TextView geners = _view.findViewById(R.id.geners);
			final LinearLayout linear9 = _view.findViewById(R.id.linear9);
			final TextView year = _view.findViewById(R.id.year);
			final LinearLayout linear8 = _view.findViewById(R.id.linear8);
			final TextView textview4 = _view.findViewById(R.id.textview4);
			final TextView textview5 = _view.findViewById(R.id.textview5);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear7 = _view.findViewById(R.id.linear7);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final ImageView imageview3 = _view.findViewById(R.id.imageview3);
			
			linear1.setVisibility(View.VISIBLE);
			linear4.setVisibility(View.GONE);
			_ColourFilter(imageview2, "#ffffff");
			num.setText(_data.get((int)_position).get("persian").toString());
			if (num.getText().toString().equals("1")) {
				linear4.setVisibility(View.VISIBLE);
			} else {
				
			}
			if (_data.get((int)_position).get("free").toString().equals("1")) {
				linear1.setVisibility(View.GONE);
			}
			_ColourFilter(imageview3, "#ffffff");
			Glide.with(imageview1.getContext())
			.clear(imageview1);
			
			Glide.with(imageview1.getContext())
			.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=100&a=c&src=https://cdn.upera.shop/s3/posters/".concat(_data.get((int)_position).get("poster").toString()))))))
			.placeholder(R.drawable.nul)
			.error(R.drawable.nul)
			.centerCrop()
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
			.into(imageview1);
			name_fa.setText(_data.get((int)_position).get("name_fa").toString());
			name_en.setText(_data.get((int)_position).get("name").toString());
			geners.setText(_data.get((int)_position).get("genre").toString());
			year.setText(_data.get((int)_position).get("year").toString());
			Object rateValue = _data.get((int) _position).get("rate");
			
			if (rateValue != null) {
				textview4.setText(String.valueOf(rateValue));
			} else {
				textview4.setText("N/A"); // مقدار پیش‌فرض برای مقدار نامعتبر
			}
			textview5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(3)), 0xFFFFAB40));
			linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), 0x50000000));
			linear1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					to.setClass(getContext().getApplicationContext(), ViewActivity.class);
					to.putExtra("name", _data.get((int)_position).get("name_fa").toString());
					to.putExtra("image", _data.get((int)_position).get("poster").toString());
					to.putExtra("type", _data.get((int)_position).get("type").toString());
					to.putExtra("dasteh", "");
					if (_data.get((int)_position).get("type").toString().equals("episode")) {
						to.putExtra("id", _data.get((int)_position).get("series_id").toString());
						to.putExtra("type", "series");
					} else {
						to.putExtra("id", _data.get((int)_position).get("id").toString());
						to.putExtra("type", _data.get((int)_position).get("type").toString());
					}
					to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(to);
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