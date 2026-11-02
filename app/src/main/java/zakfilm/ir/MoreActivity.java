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

public class MoreActivity extends AppCompatActivity {
	
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
	
	private ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> off = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_new = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> casts = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list0 = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear92;
	private LinearLayout linear94;
	private RelativeLayout relativelayout3;
	private ProgressBar progressbar1;
	private LinearLayout linear89;
	private TextView textview1;
	private LinearLayout linear90;
	private ImageView setting;
	private ImageView imageview6;
	private TextView textview2;
	private RecyclerView recyclerView1;
	private RelativeLayout relativelayout2;
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
	private RequestNetwork get_casts;
	private RequestNetwork.RequestListener _get_casts_request_listener;
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
		setContentView(R.layout.more);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear92 = findViewById(R.id.linear92);
		linear94 = findViewById(R.id.linear94);
		relativelayout3 = findViewById(R.id.relativelayout3);
		progressbar1 = findViewById(R.id.progressbar1);
		linear89 = findViewById(R.id.linear89);
		textview1 = findViewById(R.id.textview1);
		linear90 = findViewById(R.id.linear90);
		setting = findViewById(R.id.setting);
		imageview6 = findViewById(R.id.imageview6);
		textview2 = findViewById(R.id.textview2);
		recyclerView1 = findViewById(R.id.recyclerView1);
		relativelayout2 = findViewById(R.id.relativelayout2);
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
		get_casts = new RequestNetwork(this);
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
						to.putExtra("name", list0.get((int)0).get("name_fa").toString());
						to.putExtra("image", list0.get((int)0).get("poster").toString());
						to.putExtra("dasteh", "");
						if (list0.get((int)0).get("type").toString().equals("episode")) {
							to.putExtra("id", list0.get((int)0).get("series_id").toString());
							to.putExtra("type", "series");
						} else {
							to.putExtra("id", list0.get((int)0).get("id").toString());
							to.putExtra("type", list0.get((int)0).get("type").toString());
						}
						to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
						startActivity(to);
						MoreActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
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
				String jsonString = _response;
				try {
					// مرحله 1: ایجاد آبجکت جیسون اصلی
					JSONObject jsonObject = new JSONObject(jsonString);
					
					// مرحله 2: به سراغ کلید "data" بروید
					JSONObject dataObject = jsonObject.getJSONObject("data");
					
					// مرحله 3: به کلید "list" بروید
					JSONObject listObject = dataObject.getJSONObject("list");
					
					// مرحله 4: دریافت آرایه "data" از داخل "list"
					JSONArray dataArray = listObject.getJSONArray("data");
					
					// بررسی اینکه آیا لیست off خالی است یا نه
					if (off == null) {
						// اگر خالی است، آن را ایجاد کنید
						off = new ArrayList<>();
					}
					
					// بررسی اینکه آیا لیست list_new خالی است یا نه
					if (list_new == null) {
						// اگر خالی است، آن را ایجاد کنید
						list_new = new ArrayList<>();
					} else {
						// اگر از قبل داده دارد، آن را پاک کن
						list_new.clear();
					}
					
					// مرحله 5: فقط کلیدهای مورد نیاز را از هر آیتم استخراج کنید
					for (int i = 0; i < dataArray.length(); i++) {
						JSONObject item = dataArray.getJSONObject(i);
						
						
						if (getIntent().getStringExtra("type").equals("irani")) {
							// بررسی مقدار کلید "traffic"
							int trafficValue = item.optInt("free", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
							if (trafficValue == 0) {
								continue; // از پردازش این آیتم صرف‌نظر کن
							}
							
						} else {
							// بررسی مقدار کلید "traffic"
							int trafficValue = item.optInt("traffic_oo", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
							if (trafficValue == 1) {
								continue; // از پردازش این آیتم صرف‌نظر کن
							}
							
							// بررسی مقدار کلید "traffic"
							int traffic = item.optInt("traffic", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
							if (traffic == 0) {
								continue; // از پردازش این آیتم صرف‌نظر کن
							}
							
						}
						
						
						// تبدیل آبجکت جیسون به Map (لیست مپ) با کلیدهای مورد نیاز
						HashMap<String, Object> map = new HashMap<>();
						map.put("name_fa", item.get("name_fa"));
						map.put("poster", item.get("poster"));
						map.put("backdrop", item.get("backdrop"));
						
						map.put("persian", item.get("persian"));
						map.put("type", item.get("type"));
						map.put("id", item.get("id"));
						map.put("series_id", item.has("series_id") ? item.get("series_id") : null);
						
						// اضافه کردن map به لیست اصلی
						off.add(map);
						
						// اضافه کردن map به لیست داده‌های تازه
						list_new.add(map);
					}
					
					// در اینجا list_new فقط شامل داده‌های تازه دریافت شده است
					
				} catch (JSONException e) {
					e.printStackTrace();
				}
				
				
				if (off.size() == 0) {
					linear94.setVisibility(View.VISIBLE);
					recyclerView1.setVisibility(View.GONE);
					progressbar1.setVisibility(View.GONE);
				} else {
					// ابتدا بررسی کنید که آداپتر به RecyclerView متصل است
					if (recyclerView1.getAdapter() == null) {
						// اگر آداپتر هنوز به RecyclerView متصل نشده است، آن را تنظیم کنید
						recyclerView1.setAdapter(new RecyclerView1Adapter(off));
						recyclerView1.setAdapter(new RecyclerView1Adapter(off));
						
						try {
							if (off.get((int)0).get("free").toString().equals("1")) {
								cardview1.setVisibility(View.GONE);
							}
						} catch (Exception e) {
							
						}
						try {
							if (off.get((int)0).get("persian").toString().equals("1")) {
								linear4.setVisibility(View.VISIBLE);
								imageview3.setImageResource(R.drawable.age_group_5);
							} else {
								linear4.setVisibility(View.GONE);
							}
						} catch (Exception e) {
							
						}
						try {
							m.put("name_fa", off.get((int)0).get("name_fa").toString());
						} catch (Exception e) {
							
						}
						try {
							m.put("poster", off.get((int)0).get("poster").toString());
						} catch (Exception e) {
							
						}
						try {
							m.put("id", off.get((int)0).get("id").toString());
						} catch (Exception e) {
							m.put("id", "");
						}
						m.put("type", off.get((int)0).get("type").toString());
						try {
							m.put("series_id", off.get((int)0).get("series_id").toString());
						} catch (Exception e) {
							m.put("series_id", "");
						}
						list0.add(m);
						try {
							Glide.with(getApplicationContext())
							.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=100&a=c&src=https://cdn.upera.shop/s3/posters/".concat(off.get((int)0).get("poster").toString()))))))
							.placeholder(R.drawable.nul)
							.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
							.into(imageview2);
						} catch (Exception e) {
							
						}
						try {
							name.setText(off.get((int)0).get("name_fa").toString());
						} catch (Exception e) {
							
						}
						off.remove((int)(0));
						
					} else {
						
						recyclerView1.getAdapter().notifyDataSetChanged();
						
					}
					
					isRequesting = false;
					progressbar1.setVisibility(View.GONE);
					recyclerView1.addOnScrollListener(new RecyclerView.OnScrollListener() {
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
										progressbar1.setVisibility(View.VISIBLE);
										isRequesting = true;
										if (getIntent().getStringExtra("type").equals("irani")) {
											gener = "free";
											all.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/".concat(gener.concat("?country=".concat(ir).concat("&page=".concat(String.valueOf((long)(num + 1)).concat("&f_type=".concat(getIntent().getStringExtra("f_type").concat("&age=".concat(getIntent().getStringExtra("age"))))))))), "", _all_request_listener);
										} else {
											if (getIntent().hasExtra("gener")) {
												gener = getIntent().getStringExtra("gener");
												textview1.setText("دسته بندی: ".concat(getIntent().getStringExtra("title")));
												all.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/".concat(gener.concat("?country=".concat(ir).concat("&page=".concat(String.valueOf((long)(num + 1)).concat("&f_type=".concat(getIntent().getStringExtra("f_type").concat("&age=".concat(getIntent().getStringExtra("age"))))))))), "", _all_request_listener);
											} else {
												gener = getIntent().getStringExtra("type");
												all.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/".concat(gener.concat("?country=".concat(ir).concat("&sortby=").concat(getIntent().getStringExtra("sortby").concat("&page=".concat(String.valueOf((long)(num + 1)).concat("&f_type=".concat(getIntent().getStringExtra("f_type").concat("&age=".concat(getIntent().getStringExtra("age")))))))))), "", _all_request_listener);
											}
										}
										num = num + 1;
									}
								}
								
							}
						}
					});
				}
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
		
		_get_casts_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				String jsonString = _response;
				
				try {
					// مرحله 1: ایجاد آبجکت جیسون اصلی
					JSONObject jsonObject = new JSONObject(jsonString);
					
					// مرحله 2: به سراغ کلید "data" بروید
					JSONObject dataObject = jsonObject.getJSONObject("data");
					
					// مرحله 3: به کلید "filmography" بروید
					JSONArray filmographyArray = dataObject.getJSONArray("filmography");
					
					// بررسی اینکه آیا لیست casts خالی است یا نه
					if (casts == null) {
						casts = new ArrayList<>();
					} else {
						casts.clear();
					}
					
					// مرحله 4: حلقه روی آرایه جیسون و اضافه کردن به ListMap
					for (int i = 0; i < filmographyArray.length(); i++) {
						// دریافت هر آیتم از آرایه به عنوان آبجکت جیسون
						JSONObject item = filmographyArray.getJSONObject(i);
						
						// بررسی مقدار کلید "traffic"
						int trafficValue1 = item.optInt("traffic_oo", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
						if (trafficValue1 == 1) {
							continue; // از پردازش این آیتم صرف‌نظر کن
						}
						
						// بررسی مقدار کلید "traffic"
						int traffic1 = item.optInt("traffic", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
						if (traffic1 == 0) {
							continue; // از پردازش این آیتم صرف‌نظر کن
						}
						
						
						// تبدیل آبجکت جیسون به Map (لیست مپ)
						HashMap<String, Object> map = new HashMap<>();
						
						// اضافه کردن هر کلید-مقدار از آبجکت جیسون به Map
						Iterator<String> keys = item.keys();
						while (keys.hasNext()) {
							String key = keys.next();
							map.put(key, item.get(key));
						}
						
						// اضافه کردن Map به casts
						casts.add(map);
					}
					
				} catch (JSONException e) {
					e.printStackTrace();
				}
				if (casts.size() == 0) {
					linear94.setVisibility(View.VISIBLE);
					progressbar1.setVisibility(View.GONE);
				} else {
					recyclerView1.setAdapter(new RecyclerView1Adapter(casts));
					progressbar1.setVisibility(View.GONE);
					linear94.setVisibility(View.GONE);
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
		num = 1;
		_type();
		if (getIntent().hasExtra("title")) {
			textview1.setText(getIntent().getStringExtra("title"));
		}
		if (getIntent().hasExtra("ir")) {
			ir = getIntent().getStringExtra("ir");
		} else {
			ir = "noIR";
		}
		textview1.setShadowLayer(9, 2, 2, Color.parseColor("#000000"));
		// تنظیم LayoutManager به صورت گرید با 3 ستون
		GridLayoutManager layoutManager = new GridLayoutManager(MoreActivity.this, 3);
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
		if (getIntent().getStringExtra("type").equals("casts")) {
			get_casts.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/cast/".concat(getIntent().getStringExtra("sortby")), "", _get_casts_request_listener);
		} else {
			if (getIntent().getStringExtra("type").equals("irani")) {
				gener = "free";
				textview1.setText("ایرانی رایگان");
				all.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/".concat(gener.concat("?country=".concat(ir).concat("&page=".concat(String.valueOf((long)(num)).concat("&f_type=".concat(getIntent().getStringExtra("f_type").concat("&age=".concat(getIntent().getStringExtra("age"))))))))), "", _all_request_listener);
			} else {
				if (getIntent().hasExtra("gener")) {
					gener = getIntent().getStringExtra("gener");
					textview1.setText("دسته بندی: ".concat(getIntent().getStringExtra("title")));
					all.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/".concat(gener.concat("?country=".concat(ir).concat("&page=".concat(String.valueOf((long)(num)).concat("&f_type=".concat(getIntent().getStringExtra("f_type").concat("&age=".concat(getIntent().getStringExtra("age"))))))))), "", _all_request_listener);
				} else {
					gener = getIntent().getStringExtra("type");
					all.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/".concat(gener.concat("?country=".concat(ir).concat("&sortby=").concat(getIntent().getStringExtra("sortby").concat("&page=".concat(String.valueOf((long)(num)).concat("&f_type=".concat(getIntent().getStringExtra("f_type").concat("&age=".concat(getIntent().getStringExtra("age")))))))))), "", _all_request_listener);
				}
			}
		}
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
		if (getIntent().hasExtra("name_cas")) {
			name.setVisibility(View.INVISIBLE);
			textview1.setText(getIntent().getStringExtra("name_cas"));
			Glide.with(getApplicationContext())
			.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=90&src=https://s35.upera.net/s3/casts/".concat(getIntent().getStringExtra("profile_cas")))))))
			.placeholder(R.drawable.lino)
			.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
			.transition(DrawableTransitionOptions.withCrossFade(350))
			.into(imageview2);
		}
		_ui();
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
			MoreActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
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
		_ColourFilter(imageview6, "#ffffff");
		linear94.setVisibility(View.GONE);
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
				Glide.with(imageview1.getContext())
				.clear(imageview1);
				
				Glide.with(imageview1.getContext())
				.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=100&a=c&src=https://cdn.upera.shop/s3/posters/".concat(_data.get((int)_position).get("poster").toString()))))))
				.placeholder(R.drawable.nul)
				.error(R.drawable.nul)
				.centerCrop()
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
				.into(imageview1);
				if (!_data.get((int)_position).get("type").toString().equals("movie")) {
					Glide.with(imag_sma0.getContext())
					.clear(imag_sma0);
					
					Glide.with(imag_sma0.getContext())
					.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=100&a=c&src=https://cdn.upera.shop/s3/posters/".concat(_data.get((int)_position).get("poster").toString()))))))
					.placeholder(R.drawable.nul)
					.error(R.drawable.nul)
					.centerCrop()
					.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
					.into(imag_sma0);
					Glide.with(imag_sma1.getContext())
					.clear(imag_sma1);
					
					Glide.with(imag_sma1.getContext())
					.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=100&a=c&src=https://cdn.upera.shop/s3/posters/".concat(_data.get((int)_position).get("poster").toString()))))))
					.placeholder(R.drawable.nul)
					.error(R.drawable.nul)
					.centerCrop()
					.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
					.into(imag_sma1);
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
						if (_data.get((int)_position).get("type").toString().equals("episode")) {
							to.putExtra("id", _data.get((int)_position).get("series_id").toString());
							to.putExtra("type", "series");
						} else {
							to.putExtra("id", _data.get((int)_position).get("id").toString());
							to.putExtra("type", _data.get((int)_position).get("type").toString());
						}
						to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
						startActivity(to);
						MoreActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
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