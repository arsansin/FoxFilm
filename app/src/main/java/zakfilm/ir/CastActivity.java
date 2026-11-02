package zakfilm.ir;

import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
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
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
import android.widget.ImageView;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class CastActivity extends AppCompatActivity {
	
	private HashMap<String, Object> s = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> q = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> setta = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> seta = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> off = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_new = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> n = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> man_ir = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear95;
	private LinearLayout linear96;
	private ScrollView vscroll1;
	private LinearLayout linear4;
	private RelativeLayout relativelayout1;
	private LinearLayout linear2;
	private LinearLayout linear5;
	private LinearLayout linear102;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private ImageView imageview1;
	private TextView textview3;
	private TextView textview4;
	private LinearLayout linear10;
	private RecyclerView recyclerview1;
	private LinearLayout linear15;
	private LinearLayout linear3;
	private LinearLayout linear11;
	private TextView textview1;
	private TextView textview6;
	private ImageView imageview4;
	private LinearLayout linear12;
	private LinearLayout linear6;
	private LinearLayout linear13;
	private TextView textview5;
	private RecyclerView recyclerview2;
	private LinearLayout linear103;
	private LinearLayout linear104;
	private TextView textview7;
	private RecyclerView recyclerview7;
	private LinearLayout linear99;
	private RecyclerView recyclerview5;
	private LinearLayout linear100;
	private LinearLayout linear94;
	private LinearLayout linear101;
	private ImageView imageview5;
	private EditText edittext1;
	private ImageView imageview7;
	private ImageView imageview8;
	
	private RequestNetwork cast1;
	private RequestNetwork.RequestListener _cast1_request_listener;
	private Intent to = new Intent();
	private RequestNetwork s3arch;
	private RequestNetwork.RequestListener _s3arch_request_listener;
	private SharedPreferences ss;
	private Intent ser = new Intent();
	private ObjectAnimator a = new ObjectAnimator();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.cast);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear95 = findViewById(R.id.linear95);
		linear96 = findViewById(R.id.linear96);
		vscroll1 = findViewById(R.id.vscroll1);
		linear4 = findViewById(R.id.linear4);
		relativelayout1 = findViewById(R.id.relativelayout1);
		linear2 = findViewById(R.id.linear2);
		linear5 = findViewById(R.id.linear5);
		linear102 = findViewById(R.id.linear102);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		imageview1 = findViewById(R.id.imageview1);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		linear10 = findViewById(R.id.linear10);
		recyclerview1 = findViewById(R.id.recyclerview1);
		linear15 = findViewById(R.id.linear15);
		linear3 = findViewById(R.id.linear3);
		linear11 = findViewById(R.id.linear11);
		textview1 = findViewById(R.id.textview1);
		textview6 = findViewById(R.id.textview6);
		imageview4 = findViewById(R.id.imageview4);
		linear12 = findViewById(R.id.linear12);
		linear6 = findViewById(R.id.linear6);
		linear13 = findViewById(R.id.linear13);
		textview5 = findViewById(R.id.textview5);
		recyclerview2 = findViewById(R.id.recyclerview2);
		linear103 = findViewById(R.id.linear103);
		linear104 = findViewById(R.id.linear104);
		textview7 = findViewById(R.id.textview7);
		recyclerview7 = findViewById(R.id.recyclerview7);
		linear99 = findViewById(R.id.linear99);
		recyclerview5 = findViewById(R.id.recyclerview5);
		linear100 = findViewById(R.id.linear100);
		linear94 = findViewById(R.id.linear94);
		linear101 = findViewById(R.id.linear101);
		imageview5 = findViewById(R.id.imageview5);
		edittext1 = findViewById(R.id.edittext1);
		imageview7 = findViewById(R.id.imageview7);
		imageview8 = findViewById(R.id.imageview8);
		cast1 = new RequestNetwork(this);
		s3arch = new RequestNetwork(this);
		ss = getSharedPreferences("ss", Activity.MODE_PRIVATE);
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear95.setVisibility(View.GONE);
				linear96.setVisibility(View.VISIBLE);
				_visible_animation(linear96);
				edittext1.requestFocus();
				edittext1.selectAll();
			}
		});
		
		linear101.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear95.setVisibility(View.VISIBLE);
				linear96.setVisibility(View.GONE);
				_visible_animation(linear95);
			}
		});
		
		_cast1_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				// فرض می‌شود که _response حاوی JSON باشد
				String jsonString = _response;
				
				try {
					// مرحله 1: ایجاد آبجکت جیسون اصلی
					JSONObject jsonObject = new JSONObject(jsonString);
					
					// مرحله 2: به سراغ کلید "data" بروید
					JSONObject dataObject = jsonObject.getJSONObject("data");
					
					// مرحله 3: به جای "list"، آرایه "casts" را بگیرید
					JSONArray castsArray = dataObject.getJSONArray("casts");
					
					// لیست مپ برای ذخیره داده‌ها
					seta.clear(); // ابتدا لیست را پاک می‌کنیم
					
					// مرحله 4: حلقه روی آرایه جیسون و اضافه کردن به ListMap
					for (int i = 0; i < castsArray.length(); i++) {
						// دریافت هر آیتم از آرایه به عنوان آبجکت جیسون
						JSONObject item = castsArray.getJSONObject(i);
						
						// تبدیل آبجکت جیسون به Map (لیست مپ)
						HashMap<String, Object> map = new HashMap<>();
						
						// اضافه کردن هر کلید-مقدار از آبجکت جیسون به Map
						Iterator<String> keys = item.keys();
						while (keys.hasNext()) {
							String key = keys.next();
							map.put(key, item.get(key));
						}
						
						// اضافه کردن Map به listmap1
						seta.add(map);
					}
					
				} catch (JSONException e) {
					e.printStackTrace();
				}
				recyclerview1.setAdapter(new Recyclerview1Adapter(seta));
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", new Gson().toJson(seta)));
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_s3arch_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				String jsonString = _response;
				
				try {
					// مرحله 1: ایجاد آبجکت اصلی JSON
					JSONObject jsonObject = new JSONObject(jsonString);
					
					// مرحله 2: دسترسی به آبجکت "data"
					JSONObject dataObject = jsonObject.getJSONObject("data");
					
					// مرحله 3: دریافت آرایه "data" مستقیماً از آبجکت "data"
					JSONArray dataArray = dataObject.getJSONArray("cast");
					
					// بررسی و آماده‌سازی لیست‌ها
					if (off == null) {
						off = new ArrayList<>();
					}
					if (list_new == null) {
						list_new = new ArrayList<>();
					} else {
						off.clear();
					}
					
					// مرحله 4: استخراج داده‌های مورد نیاز از هر آیتم در آرایه
					for (int i = 0; i < dataArray.length(); i++) {
						JSONObject item = dataArray.getJSONObject(i);
						
						HashMap<String, Object> map = new HashMap<>();
						
						// دریافت تمام کلیدهای موجود در JSONObject و افزودن آنها به map
						Iterator<String> keys = item.keys();
						while (keys.hasNext()) {
							String key = keys.next();
							map.put(key, item.get(key));
						}
						
						// افزودن داده‌ها به لیست‌ها
						off.add(map);
					}
					
				} catch (JSONException e) {
					e.printStackTrace();
				}
				recyclerview5.setAdapter(new Recyclerview5Adapter(off));
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
			final Window window = CastActivity.this.getWindow();
			window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			window.setStatusBarColor(0xFF0F1620);
		}
		_ui();
		recyclerview2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
		recyclerview1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
		recyclerview7.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
		linear96.setVisibility(View.GONE);
		seta = new Gson().fromJson("[\n  {\"cloud\":\"aws\",\"image\":\"new/HoANXhvk9oT6Tq8mA2qr.jpg\",\"credit_id\":\"JKdCqWeeBzoYKqNi8i6z\",\"name\":\"Bruce Willis\",\"ir\":0,\"id\":\"1316\",\"name_fa\":\"بروس ویلیس\",\"birth_date\":\"۲۹ اسفند ۱۳۳۳\"},\n  {\"cloud\":\"aws\",\"image\":\"new/BjlPo744403aRxRYsd4E.jpg\",\"credit_id\":\"ba6LbcvkyYgGgNWOLsFu\",\"name\":\"Liam Neeson\",\"ir\":0,\"id\":\"1693\",\"name_fa\":\"لیام نیسون\",\"birth_date\":\"۱۷ خرداد ۱۳۳۱\"},\n  {\"cloud\":\"aws\",\"image\":\"new/U0nGQtBv1DtwLx66gk85.jpg\",\"credit_id\":\"5tVwF9pT6ZLbih4XHMOF\",\"name\":\"Nicolas Cage\",\"ir\":0,\"id\":\"897\",\"name_fa\":\"نیکلاس کیج\",\"birth_date\":\"۱۷ دی ۱۳۴۲\"},\n  {\"cloud\":\"aws\",\"image\":\"new/fNAd5Dk2sol1ZQpoZect.jpg\",\"credit_id\":\"pZITCxxiQToAyQQAaxns\",\"name\":\"Jason Statham\",\"ir\":0,\"id\":\"1045\",\"name_fa\":\"جیسون استاتهام\",\"birth_date\":\"۴ مرداد ۱۳۴۶\"},\n  {\"cloud\":\"aws\",\"image\":\"new/digi5IJVrB5Y1zW5qIUF.jpg\",\"credit_id\":\"LfuFfBL74xpBnT0eWMFn\",\"name\":\"Robert De Niro\",\"ir\":0,\"id\":\"1125\",\"name_fa\":\"رابرت دنیرو\",\"birth_date\":\"۲۶ مرداد ۱۳۲۲\"},\n  {\"cloud\":\"aws\",\"image\":\"new/70tYc6EtTFM5sOp1DZGw.jpg\",\"credit_id\":\"ihwGVRnTgiUVh4s2RueS\",\"name\":\"Morgan Freeman\",\"ir\":0,\"id\":\"1242\",\"name_fa\":\"مورگان فریمن\",\"birth_date\":\"۱۱ خرداد ۱۳۱۶\"},\n  {\"cloud\":\"aws\",\"image\":\"new/dX2f7XXMjnmZox5Kcdou.jpg\",\"credit_id\":\"YMUFkkNBiTyPqysbQVEz\",\"name\":\"Mel Gibson\",\"ir\":0,\"id\":\"1321\",\"name_fa\":\"مل گیبسون\",\"birth_date\":\"۱۳ دی ۱۳۳۴\"},\n  {\"cloud\":\"aws\",\"image\":\"new/ZqNsuSAM4JQVBnuL8T83.jpg\",\"credit_id\":\"jH1LPb2L3VIosk0uWLz4\",\"name\":\"Ralph Fiennes\",\"ir\":0,\"id\":\"1696\",\"name_fa\":\"ریف فاینز\",\"birth_date\":\"۱ دی ۱۳۴۱\"},\n  {\"cloud\":\"aws\",\"image\":\"new/2MFB05OYroR5lGtpNOCV.jpg\",\"credit_id\":\"17jb5hMvg5Lr3ERIPjDP\",\"name\":\"Frank Grillo\",\"ir\":0,\"id\":\"2215\",\"name_fa\":\"فرانک گریلو\",\"birth_date\":\"۱۸ خرداد ۱۳۴۴\"},\n  {\"cloud\":\"aws\",\"image\":\"new/9h9wKulZBNy3mvwPA6VE.jpg\",\"credit_id\":\"A58kXFtHJMds6eyyMSxo\",\"name\":\"Adam Driver\",\"ir\":0,\"id\":\"934\",\"name_fa\":\"آدام درایور\",\"birth_date\":\"۲۸ آبان ۱۳۶۲\"},\n  {\"cloud\":\"aws\",\"image\":\"new/fnU9OrSBYRnzclUO0baD.jpg\",\"credit_id\":\"XYH6x3T1QLvWvcuAWNHy\",\"name\":\"Brad Pitt\",\"ir\":0,\"id\":\"1162\",\"name_fa\":\"برد پیت\",\"birth_date\":\"۲۷ آذر ۱۳۴۲\"},\n  {\"cloud\":\"aws\",\"image\":\"new/P3EThdXumiRSrLv8ND7z.jpg\",\"credit_id\":\"mPvSbmvR5BX2Tmxs6v5H\",\"name\":\"Dwayne Johnson\",\"ir\":0,\"id\":\"896\",\"name_fa\":\"دواین جانسون\",\"birth_date\":\"۱۲ اردیبهشت ۱۳۵۱\"},\n  {\"cloud\":\"aws\",\"image\":\"new/yaIhAxdUWQi5nWVf0GZr.jpg\",\"credit_id\":\"Q8etnlip4mYUA3wisTyR\",\"name\":\"Tom Hanks\",\"ir\":0,\"id\":\"875\",\"name_fa\":\"تام هنکس\",\"birth_date\":\"۱۹ تیر ۱۳۳۵\"},\n  {\"cloud\":\"aws\",\"image\":\"new/6TdpjUYyipVWc4i5Ikit.jpg\",\"credit_id\":\"kOVSRZ0j3oe8MSc2hJOo\",\"name\":\"Dee Bradley Baker\",\"ir\":0,\"id\":\"1860\",\"name_fa\":\"دی بردلی بیکر\",\"birth_date\":\"۹ شهریور ۱۳۴۱\"},\n  {\"cloud\":\"aws\",\"image\":\"new/Z8VXYL7kmN9PrJQoUWIB.jpg\",\"credit_id\":\"Hs3egHIuQw5RD27KLord\",\"name\":\"Jamie Foxx\",\"ir\":0,\"id\":\"1133\",\"name_fa\":\"جیمی فاکس\",\"birth_date\":\"۲۲ آذر ۱۳۴۶\"},\n  {\"cloud\":\"aws\",\"image\":\"new/YUICmMwxG0c0BP7yi7nj.jpg\",\"credit_id\":\"P8rb0g6ITkYX9mN7o6dw\",\"name\":\"Samuel L. Jackson\",\"ir\":0,\"id\":\"2264\",\"name_fa\":\"ساموئل ال. جکسون\",\"birth_date\":\"۳۰ آذر ۱۳۲۷\"},\n  {\"cloud\":\"aws\",\"image\":\"new/3PwuCdZsLSYgbmFNvkyP.jpg\",\"credit_id\":\"a5WKUs1HazLhleWlIosD\",\"name\":\"Dolph Lundgren\",\"ir\":0,\"id\":\"1107\",\"name_fa\":\"دولف لاندگرن\",\"birth_date\":\"۱۲ آبان ۱۳۳۶\"},\n  {\"cloud\":\"aws\",\"image\":\"new/tdEVVamSIKh22ep326zu.jpg\",\"credit_id\":\"Iz9Ogkgqy5N7RM65Kxnh\",\"name\":\"Grey Griffin\",\"ir\":0,\"id\":\"2078\",\"name_fa\":\"گری دلیسل\",\"birth_date\":\"۲ شهریور ۱۳۵۲\"},\n  {\"cloud\":\"aws\",\"image\":\"new/cuOd8uKDQeiVI4qzmaVA.jpg\",\"credit_id\":\"crIEdMbmHiLzdxZ8nk5O\",\"name\":\"Willem Dafoe\",\"ir\":0,\"id\":\"1062\",\"name_fa\":\"ویلم دفو\",\"birth_date\":\"۳۱ تیر ۱۳۳۴\"},\n  {\"cloud\":\"aws\",\"image\":\"new/nJovyT3iN7FBZbvJuZx1.png\",\"credit_id\":\"S5M7AOsoTOSmwzJrn12I\",\"name\":\"Zoe Saldana\",\"ir\":0,\"id\":\"3804\",\"name_fa\":\"زوئی سالدانیا\",\"birth_date\":\"۲۹ خرداد ۱۳۵۷\"},\n  {\"cloud\":\"aws\",\"image\":\"new/lvlsnbb667656WaG3FC8.jpg\",\"credit_id\":\"RlSBXEYd8bEjeYp0R7sb\",\"name\":\"Russell Crowe\",\"ir\":0,\"id\":\"2099\",\"name_fa\":\"راسل کرو\",\"birth_date\":\"۱۸ فروردین ۱۳۴۳\"},\n  {\"cloud\":\"aws\",\"image\":\"new/vbxxVQKyTPlWzLAMl0Y7.jpg\",\"credit_id\":\"fChUS1GxWC3xfTHMlFGQ\",\"name\":\"Tara Strong\",\"ir\":0,\"id\":\"2025\",\"name_fa\":\"تارا استرانگ\",\"birth_date\":\"۲۳ بهمن ۱۳۵۱\"},\n  {\"cloud\":\"aws\",\"image\":\"new/16PejULgKq77mCbBs9ug.jpg\",\"credit_id\":\"ufEgnqvWevfNFfSGYQfL\",\"name\":\"Owen Wilson\",\"ir\":0,\"id\":\"1814\",\"name_fa\":\"اوون ویلسون\",\"birth_date\":\"۲۷ آبان ۱۳۴۷\"},\n  {\"cloud\":\"aws\",\"image\":\"new/K0fYC4avm9LdIN1lHCS7.jpg\",\"credit_id\":\"DGuSR9vlXB89Fe3XEcFR\",\"name\":\"Michelle Yeoh\",\"ir\":0,\"id\":\"2343\",\"name_fa\":\"میشل یئو\",\"birth_date\":\"۱۵ مرداد ۱۳۴۱\"},\n  {\"cloud\":\"aws\",\"image\":\"new/Raj0CyEdQ09bh978v2CB.jpg\",\"credit_id\":\"BIocInh1vHFQlezkSsK1\",\"name\":\"Tyrese Gibson\",\"ir\":0,\"id\":\"3148\",\"name_fa\":\"تایریس گیبسون\",\"birth_date\":\"۸ دی ۱۳۵۷\"},\n  {\"cloud\":\"aws\",\"image\":\"new/KOkrTXC0rfvyiVkvwDpD.jpg\",\"credit_id\":\"MQMBoprErOf40Vhqxbro\",\"name\":\"Scarlett Johansson\",\"ir\":0,\"id\":\"1669\",\"name_fa\":\"اسکارلت جوهانسون\",\"birth_date\":\"۱ آذر ۱۳۶۳\"},\n  {\"cloud\":\"aws\",\"image\":\"new/x5eEurM9kvj9yTbnLHa4.jpg\",\"credit_id\":\"Z8W4AMLtb4tVXUVQk7hb\",\"name\":\"Gerard Butler\",\"ir\":0,\"id\":\"810\",\"name_fa\":\"جرارد باتلر\",\"birth_date\":\"۲۲ آبان ۱۳۴۸\"},\n  {\"cloud\":\"aws\",\"image\":\"new/q6D6DXkoEnKdtvzROCHR.jpg\",\"credit_id\":\"2SVNJ6pxXapV15HXkR4a\",\"name\":\"Antonio Banderas\",\"ir\":0,\"id\":\"1081\",\"name_fa\":\"آنتونیو باندراس\",\"birth_date\":\"۱۹ مرداد ۱۳۳۹\"},\n  {\"cloud\":\"aws\",\"image\":\"new/eDcHN1SQ4CxkdBjrClYN.jpg\",\"credit_id\":\"8muHuqU6jCNgL46ZFc1k\",\"name\":\"Vin Diesel\",\"ir\":0,\"id\":\"4426\",\"name_fa\":\"وین دیزل\",\"birth_date\":\"۲۷ تیر ۱۳۴۶\"},\n  {\"cloud\":\"aws\",\"image\":\"new/cHUHHc47okdGR14iDw2e.jpg\",\"credit_id\":\"nPlQASSpB8VxTKafPz9G\",\"name\":\"Chris Evans\",\"ir\":0,\"id\":\"1111\",\"name_fa\":\"کریس ایوانز\",\"birth_date\":\"۲۳ خرداد ۱۳۶۰\"},\n  {\"cloud\":\"aws\",\"image\":\"new/CvbCXvBzgZIk3emd9xsz.jpg\",\"credit_id\":\"Q3CQ4v8q4bFT97K9RF1M\",\"name\":\"Matt Damon\",\"ir\":0,\"id\":\"1144\",\"name_fa\":\"مت دیمون\",\"birth_date\":\"۱۶ مهر ۱۳۴۹\"},\n  {\"cloud\":\"aws\",\"image\":\"new/jyUst4GWSIvqZsfBr5l4.jpg\",\"credit_id\":\"HvkjxgVgzEhwiVSYWeuh\",\"name\":\"Clancy Brown\",\"ir\":0,\"id\":\"1844\",\"name_fa\":\"کلنسی براون\",\"birth_date\":\"۱۵ دی ۱۳۳۷\"},\n  {\"cloud\":\"aws\",\"image\":\"new/gZMrRKdCi2c7Y6k8lajB.jpg\",\"credit_id\":\"Rg6a5S4mPfhGRB4snPf1\",\"name\":\"Daniel Radcliffe\",\"ir\":0,\"id\":\"1138\",\"name_fa\":\"دنیل ردکلیف\",\"birth_date\":\"۱ مرداد ۱۳۶۸\"},\n  {\"cloud\":\"aws\",\"image\":\"new/MnLSZgMg9745EAIfN0Vq.jpg\",\"credit_id\":\"HjXhkriVkpf1BbIURWGO\",\"name\":\"Ruby Rose\",\"ir\":0,\"id\":\"1756\",\"name_fa\":\"روبی رز\",\"birth_date\":\"۳۰ اسفند ۱۳۶۴\"},\n  {\"cloud\":\"aws\",\"image\":\"new/x49RuYzgsB2LnrhfWtKo.jpg\",\"credit_id\":\"aqylV5l56uDZ4J365LHf\",\"name\":\"Idris Elba\",\"ir\":0,\"id\":\"893\",\"name_fa\":\"ادریس البا\",\"birth_date\":\"۱۵ شهریور ۱۳۵۱\"},\n  {\"cloud\":\"aws\",\"image\":\"new/Rb9FOkhVaK2iej57gtnE.jpg\",\"credit_id\":\"VcPE0m4IHHV2Ietvyzkd\",\"name\":\"Sigourney Weaver\",\"ir\":0,\"id\":\"4102\",\"name_fa\":\"سیگورنی ویور\",\"birth_date\":\"۱۶ مهر ۱۳۲۸\"}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		Collections.shuffle(seta);
		recyclerview1.setAdapter(new Recyclerview1Adapter(seta));
		setta = new Gson().fromJson("[\n    {\"image\":\"new/Po1U5LfRRVRzmKr5qrYL.jpg\",\"birth_date\":\"۱۱ آبان ۱۳۴۴\",\"name\":\"Shah Rukh Khan\",\"id\":\"1092\",\"name_fa\":\"شاهرخ خان\"},\n    {\"image\":\"new/9Xn8sU23jhpl4xCNpXCZ.jpg\",\"birth_date\":\"۶ دی ۱۳۴۴\",\"name\":\"Salman Khan\",\"id\":\"1956\",\"name_fa\":\"سلمان خان\"},\n    {\"image\":\"new/hXDRFV2S7gzX8h1LhExr.jpg\",\"birth_date\":\"۲۴ اسفند ۱۳۴۳\",\"name\":\"Aamir Khan\",\"id\":\"1994\",\"name_fa\":\"عامر خان\"},\n    {\"image\":\"new/rT3yTsbNhJquG8OWKwqH.jpg\",\"birth_date\":\"۱۹ مهر ۱۳۲۱\",\"name\":\"Amitabh Bachchan\",\"id\":\"1704\",\"name_fa\":\"آمیتاب باچان\"},\n    {\"image\":\"new/ObWbRAzjQ3c5XTt1rzFB.jpg\",\"birth_date\":\"۲۷ تیر ۱۳۶۱\",\"name\":\"Priyanka Chopra\",\"id\":\"3253\",\"name_fa\":\"پریانکا چوپرا\"},\n    {\"image\":\"new/f10lqbVV8S5tPELMhkNh.jpg\",\"birth_date\":\"۱۸ شهریور ۱۳۴۶\",\"name\":\"Akshay Kumar\",\"id\":\"1148\",\"name_fa\":\"آکشی کومار\"},\n    {\"image\":\"new/aYPnoDdkwDfhMMqZ7C6M.jpg\",\"birth_date\":\"۱۵ دی ۱۳۶۴\",\"name\":\"Deepika Padukone\",\"id\":\"2468\",\"name_fa\":\"دیپیکا پادوکونه\"},\n    {\"image\":\"new/ueySgPae7CNuk4qMsrx2.jpg\",\"birth_date\":\"۱۴ مرداد ۱۳۵۳\",\"name\":\"Kajol\",\"id\":\"1093\",\"name_fa\":\"کاجول\"},\n    {\"image\":\"new/Yb2qajDE3YaUNpDTLnnM.jpg\",\"birth_date\":\"۲۵ مرداد ۱۳۴۹\",\"name\":\"Saif Ali Khan\",\"id\":\"2896\",\"name_fa\":\"سیف علی خان\"},\n    {\"image\":\"new/pAtlrrtBKq3iJaIFcO7r.jpg\",\"birth_date\":\"۷ مرداد ۱۳۳۸\",\"name\":\"Sanjay Dutt\",\"id\":\"2677\",\"name_fa\":\"سانجی دات\"},\n    {\"image\":\"new/3G6H7t2MaQ36Bu0zjozD.jpg\",\"birth_date\":\"۲۰ دی ۱۳۵۲\",\"name\":\"Hrithik Roshan\",\"id\":\"2416\",\"name_fa\":\"ریتیک روشن\"},\n    {\"image\":\"new/Wpnh065QXHPdAs7QMd6V.jpg\",\"birth_date\":\"۳۰ شهریور ۱۳۵۹\",\"name\":\"Kareena Kapoor\",\"id\":\"2897\",\"name_fa\":\"کارینا کاپور\"},\n    {\"image\":\"new/jahyhvzsXeQTkCVS2KOm.jpg\",\"birth_date\":\"۲۵ تیر ۱۳۶۲\",\"name\":\"Katrina Kaif\",\"id\":\"1150\",\"name_fa\":\"کاترینا کایف\"},\n    {\"image\":\"new/1gUMXOHBupm9WLbN9ra7.jpg\",\"birth_date\":\"۱۵ تیر ۱۳۶۴\",\"name\":\"Ranveer Singh\",\"id\":\"2469\",\"name_fa\":\"رانویر سینگ\"},\n    {\"image\":\"new/seVDpretGtxhLsY3PmJQ.jpg\",\"birth_date\":\"۶ مهر ۱۳۶۱\",\"name\":\"Ranbir Kapoor\",\"id\":\"5116\",\"name_fa\":\"رانبیر کاپور\"},\n    {\"image\":\"new/vVzGmuW1sbvuGUBYgNVY.jpg\",\"birth_date\":\"۱۳ فروردین ۱۳۴۸\",\"name\":\"Ajay Devgn\",\"id\":\"4497\",\"name_fa\":\"اجی دیوگن\"},\n    {\"image\":\"new/ALVNnDvNjgOhSJcqZlWw.jpg\",\"birth_date\":\"۱ آبان ۱۳۵۸\",\"name\":\"Prabhas\",\"id\":\"5084\",\"name_fa\":\"پرابهاس\"},\n    {\"image\":\"new/Cu8eOyiVjLZFKpAsufdj.png\",\"birth_date\":\"۱ تیر ۱۳۵۳\",\"name\":\"Joseph Vijay\",\"id\":\"3235\",\"name_fa\":\"ویجای\"},\n    {\"image\":\"new/RlRdDnTealrJWQl3pV7d.png\",\"birth_date\":\"۱۹ فروردین ۱۳۶۲\",\"name\":\"Allu Arjun\",\"id\":\"9110\",\"name_fa\":\"آلو آرجون\"},\n    {\"image\":\"new/V8Q8EEbZDQqSqjKWGU9m.png\",\"birth_date\":\"۷ فروردین ۱۳۶۴\",\"name\":\"Ram Charan\",\"id\":\"9581\",\"name_fa\":\"رام چاران\"},\n    {\"image\":\"new/TaTQW3qLi6waKQRoGSlh.jpg\",\"birth_date\":\"۱ بهمن ۱۳۶۴\",\"name\":\"Sushant Singh Rajput\",\"id\":\"1757\",\"name_fa\":\"سوشانت سینگ راجپوت\"},\n    {\"image\":\"new/euwfXskWsbqneoiwOeMt.png\",\"birth_date\":\"۴ اردیبهشت ۱۳۶۶\",\"name\":\"Varun Dhawan\",\"id\":\"8592\",\"name_fa\":\"وارون دهاوان\"},\n    {\"image\":\"new/vxwf6At5rzqaJxgmTVuR.png\",\"birth_date\":\"۲۶ دی ۱۳۶۳\",\"name\":\"Sidharth Malhotra\",\"id\":\"5497\",\"name_fa\":\"سیدارت مالهوترا\"},\n    {\"image\":\"new/0jkiaoQ0UQ6Oc9ciA9Mr.jpg\",\"birth_date\":\"۲۶ دی ۱۳۵۶\",\"name\":\"Vijay Sethupathi\",\"id\":\"3236\",\"name_fa\":\"ویجایستوپاتی\"},\n    {\"image\":\"new/SUNxt09elJDuIb6KnB4M.jpg\",\"birth_date\":\"۸ بهمن ۱۳۶۴\",\"name\":\"Shruti Haasan\",\"id\":\"3273\",\"name_fa\":\"شروتی حسن\"},\n    {\"image\":\"new/Mw0JG7ywUAmCmuEn3Qpr.jpg\",\"birth_date\":\"۱۲ اسفند ۱۳۶۸\",\"name\":\"Tiger Shroff\",\"id\":\"2769\",\"name_fa\":\"تایگر شروف\"},\n    {\"image\":\"new/qE5EbSEEZTMZEsrFbmFO.jpg\",\"birth_date\":\"۲۵ آبان ۱۳۶۴\",\"name\":\"Aditya Roy Kapur\",\"id\":\"5440\",\"name_fa\":\"آدیتیا روی کاپور\"},\n    {\"image\":\"new/dn5eDY4LR7HMkCodtwhA.png\",\"birth_date\":\"۹ مرداد ۱۳۷۱\",\"name\":\"Kiara Advani\",\"id\":\"9582\",\"name_fa\":\"کیارا ادوانی\"},\n    {\"image\":\"new/VaPBfj2aqpq8jYcbrfEj.png\",\"birth_date\":\"۵ اسفند ۱۳۶۲\",\"name\":\"Nani\",\"id\":\"6470\",\"name_fa\":\"نانی\"},\n    {\"image\":\"new/KnARFE2knClAn6SFRsW6.png\",\"birth_date\":\"۱۲ تیر ۱۳۳۷\",\"name\":\"Pawan Malhotra\",\"id\":\"7874\",\"name_fa\":\"پاوان مالهورات\"}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		Collections.shuffle(setta);
		recyclerview2.setAdapter(new Recyclerview2Adapter(setta));
		man_ir = new Gson().fromJson("[\n    {\"image\":\"new/T4WA1FSKol90OoZsNonQ.png\",\"name\":\"Shahab Hosseini\",\"id\":\"56\",\"name_fa\":\"شهاب حسینی\",\"birth_date\":\"۱۴ بهمن ۱۳۵۲\"},\n    {\"image\":\"new/HijhQUr5PCklgU1Bnfn7.jpg\",\"name\":\"Parviz Parastui\",\"id\":\"97\",\"name_fa\":\"پرویز پرستویی\",\"birth_date\":\"۲ تیر ۱۳۳۴\"},\n    {\"image\":\"new/iuaTiwzyAzmuGY7JNPR7.jpg\",\"name\":\"Payman Maadi\",\"id\":\"55\",\"name_fa\":\"پیمان معادی\",\"birth_date\":\"۹ تیر ۱۳۴۹\"},\n    {\"image\":\"9c6dbed0-3f05-11e8-8ef5-a340b7e5bd6c/TYNAEa4Z1dTqC1wDdW3B.jpg\",\"name\":\"Mehran Modiri\",\"id\":\"66\",\"name_fa\":\"مهران مدیری\",\"birth_date\":\"۱۸ فروردین ۱۳۴۶\"},\n    {\"image\":\"09070160-3a34-11e8-976b-cbc7d564706f/yrUARTVSX2dvG2DXt3g6.jpg\",\"name\":\"Ali Nassirian\",\"id\":\"10\",\"name_fa\":\"علی نصیریان\",\"birth_date\":\"۱۵ بهمن ۱۳۱۳\"},\n    {\"image\":\"new/HIMB1tEWJvBDS9oSim9D.jpg\",\"name\":\"Navid Mohammadzadeh\",\"id\":\"50\",\"name_fa\":\"نوید محمدزاده\",\"birth_date\":\"۱۷ فروردین ۱۳۶۵\"},\n    {\"image\":\"4c5fd670-3989-11e8-89fc-137e921b9347/NTHN6DldlNraE0JhTLv3.jpg\",\"name\":\"Reza Attaran\",\"id\":\"6\",\"name_fa\":\"رضا عطاران\",\"birth_date\":\"۲۰ اردیبهشت ۱۳۴۷\"},\n    {\"image\":\"new/d6OowWEhndV32EcLe9wH.jpg\",\"name\":\"Akbar Abdi\",\"id\":\"117\",\"name_fa\":\"اکبر عبدی\",\"birth_date\":\"۴ شهریور ۱۳۳۹\"},\n    {\"image\":\"new/h9sOeqNduATnPA2PLL6O.jpg\",\"name\":\"Khosrow Shakibai\",\"id\":\"266\",\"name_fa\":\"خسرو شکیبایی\",\"birth_date\":\"۷ فروردین ۱۳۲۳\"},\n    {\"image\":\"new/FZt1coworgiZfjKpHEAu.jpg\",\"name\":\"Hamid Farrokhnezhad\",\"id\":\"89\",\"name_fa\":\"حمید فرخ نژاد\",\"birth_date\":\"۲۸ فروردین ۱۳۴۸\"},\n    {\"image\":\"new/Nqu5WJP9hc3CjH3SujqC.png\",\"name\":\"Hamed Behdad\",\"id\":\"206\",\"name_fa\":\"حامد بهداد\",\"birth_date\":\"۲۶ آبان ۱۳۵۲\"},\n    {\"image\":\"new/UykXkFq1B4mGRTNc8AwE.jpg\",\"name\":\"Mohammad Reza Golzar\",\"id\":\"92\",\"name_fa\":\"محمد رضا گلزار\",\"birth_date\":\"۱ فروردین ۱۳۵۶\"},\n    {\"image\":\"new/SGmxAQfngOkgyYGPHosf.jpg\",\"name\":\"Reza Kianian\",\"id\":\"127\",\"name_fa\":\"رضا کیانیان\",\"birth_date\":\"۲۹ خرداد ۱۳۳۰\"},\n    {\"image\":\"new/Afi3hOswO8xmugKtG4oQ.jpg\",\"name\":\"Pejman Jamshidi\",\"id\":\"90\",\"name_fa\":\"پژمان جمشیدی\",\"birth_date\":\"۲۰ شهریور ۱۳۵۶\"},\n    {\"image\":\"new/Jf9HrGH1jkdME0qzhDDP.jpg\",\"name\":\"Jamshid Hashempour\",\"id\":\"296\",\"name_fa\":\"جمشید هاشم پور\",\"birth_date\":\"۳ فروردین ۱۳۲۳\"},\n    {\"image\":\"a7fdad50-8417-11e8-91ec-ab46f230d30c/6yrwDHTPjYAu5t2D3CXQ.jpg\",\"name\":\"Bahram Radan\",\"id\":\"135\",\"name_fa\":\"بهرام رادان\",\"birth_date\":\"۸ اردیبهشت ۱۳۵۸\"},\n    {\"image\":\"new/P2KOhRuwlZgbCIeCpDzO.jpg\",\"name\":\"Dariush Arjmand\",\"id\":\"236\",\"name_fa\":\"داریوش ارجمند\",\"birth_date\":\"۷ مرداد ۱۳۲۳\"},\n    {\"image\":\"new/NJPGgRl5adL2utqRGZus.jpg\",\"name\":\"Amir Jafari\",\"id\":\"70\",\"name_fa\":\"امیر جعفری\",\"birth_date\":\"۱ شهریور ۱۳۵۳\"},\n    {\"image\":\"new/ZdW1B8LWqgrctoKcm5GZ.jpg\",\"name\":\"Amin Hayai\",\"id\":\"116\",\"name_fa\":\"امین حیایی\",\"birth_date\":\"۱۹ خرداد ۱۳۴۹\"},\n    {\"image\":\"new/NA9VH4iK7HnZVKJmy0el.jpg\",\"name\":\"Farhad Aslani\",\"id\":\"67\",\"name_fa\":\"فرهاد اصلانی\",\"birth_date\":\"۱۸ خرداد ۱۳۴۵\"},\n    {\"image\":\"new/Fs1N5XgFuewQWeNWLPsh.jpg\",\"name\":\"Hossein Yari\",\"id\":\"181\",\"name_fa\":\"حسین یاری\",\"birth_date\":\"۱۶ دی ۱۳۴۶\"},\n    {\"image\":\"new/sOaWTyi2MSFdqBZQZlhf.png\",\"name\":\"Ali Mosaffa\",\"id\":\"27\",\"name_fa\":\"علی مصفا\",\"birth_date\":\"۱۱ آذر ۱۳۴۵\"},\n    {\"image\":\"254ad710-3f05-11e8-b031-3716344a4a0b/MLdbVO00gEe7yybdnTR2.jpg\",\"name\":\"Mahdi Pakdel\",\"id\":\"64\",\"name_fa\":\"مهدی پاکدل\",\"birth_date\":\"۱۰ تیر ۱۳۵۹\"},\n    {\"image\":\"new/aXuQW0mX5PdykueQwJke.jpg\",\"name\":\"Sam Derakhshani\",\"id\":\"81\",\"name_fa\":\"سام درخشانی\",\"birth_date\":\"۳۱ تیر ۱۳۵۴\"},\n    {\"image\":\"new/CsS8M7mu6u0cjfdJFLqU.jpg\",\"name\":\"Ahmad Mehranfar\",\"id\":\"218\",\"name_fa\":\"احمد مهرانفر\",\"birth_date\":\"۳ خرداد ۱۳۵۴\"},\n    {\"image\":\"new/kdBYtiq7XDw2GJYSa5EP.jpg\",\"name\":\"Pejman Bazeghi\",\"id\":\"120\",\"name_fa\":\"پژمان بازغی\",\"birth_date\":\"۱۹ مرداد ۱۳۵۳\"},\n    {\"image\":\"new/mpveWbcmvYcOnPiN198h.jpg\",\"name\":\"Hamed Komeili\",\"id\":\"210\",\"name_fa\":\"حامد کمیلی\",\"birth_date\":\"۱۴ تیر ۱۳۶۱\"},\n    {\"image\":\"new/yc2tfVCPMdDEPadS1ePX.jpg\",\"name\":\"Reza Shafiei Jam\",\"id\":\"332\",\"name_fa\":\"رضا شفیعی‌جم\",\"birth_date\":\"۸ تیر ۱۳۵۰\"},\n    {\"image\":\"new/fhZj91cZWZYAxk8QEPIS.jpg\",\"name\":\"Soroush Sehhat\",\"id\":\"343\",\"name_fa\":\"سروش صحت\",\"birth_date\":\"۸ آذر ۱۳۴۴\"},\n    {\"image\":\"new/OqeBCgNDVCoBQOwHlq81.jpg\",\"name\":\"Majid Salehi\",\"id\":\"129\",\"name_fa\":\"مجید صالحی\",\"birth_date\":\"۲۶ شهریور ۱۳۵۴\"},\n    {\"image\":\"new/NzvCh410pDf2BaP2WsuL.jpg\",\"name\":\"Saeed Aghakhani\",\"id\":\"88\",\"name_fa\":\"سعید آقاخانی\",\"birth_date\":\"۴ اسفند ۱۳۵۰\"},\n    {\"image\":\"new/Trk3D3UsZMj4oCvRhf98.jpg\",\"name\":\"Peyman Ghasem Khani\",\"id\":\"440\",\"name_fa\":\"پیمان قاسم‌خانی\",\"birth_date\":\"۳۰ دی ۱۳۴۴\"},\n    {\"image\":\"new/ErM3XrPFV7G8Q38QtXhj.jpg\",\"name\":\"Alireza Khamseh\",\"id\":\"219\",\"name_fa\":\"علیرضا خمسه\",\"birth_date\":\"۹ بهمن ۱۳۳۱\"},\n    {\"image\":\"new/lcJLzx6RZFvfSZ5zREsy.jpg\",\"name\":\"Amir Hossein Arman\",\"id\":\"695\",\"name_fa\":\"امیرحسین آرمان\",\"birth_date\":\"۱۴ آبان ۱۳۶۱\"},\n    {\"image\":\"new/1dob1IVwUJ3ctj80ufL2.jpg\",\"name\":\"Mehran Rajabi\",\"id\":\"144\",\"name_fa\":\"مهران رجبی\",\"birth_date\":\"۱۲ دی ۱۳۴۰\"},\n    {\"image\":\"new/Fo5SIjylEd4NSUOhjss2.jpg\",\"name\":\"Hamid Goudarzi\",\"id\":\"972\",\"name_fa\":\"حمید گودرزی\",\"birth_date\":\"۲ آذر ۱۳۵۶\"},\n    {\"image\":\"new/pSjp7f0meTOZLHVkWww4.jpg\",\"name\":\"Farhad Aeesh\",\"id\":\"203\",\"name_fa\":\"فرهاد آئیش\",\"birth_date\":\"۲۷ شهریور ۱۳۳۱\"},\n    {\"image\":\"new/z69ZRmWewUuJOGUTVM1x.jpg\",\"name\":\"Iraj Tahmasb\",\"id\":\"269\",\"name_fa\":\"ایرج طهماسب\",\"birth_date\":\"۳۰ اردیبهشت ۱۳۳۸\"},\n    {\"image\":\"new/fc86JjBXNvbj3Xzpc1WF.jpg\",\"name\":\"Iraj Ghaderi\",\"id\":\"448\",\"name_fa\":\"ایرج قادری\",\"birth_date\":\"۱۷ دی ۱۳۱۳\"},\n    {\"image\":\"new/ss8z9LWBd7yOF2HyEYz9.jpg\",\"name\":\"Saeed Rad\",\"id\":\"473\",\"name_fa\":\"سعید راد\",\"birth_date\":\"۴ آبان ۱۳۲۳\"},\n    {\"image\":\"new/JV9579bOnFcWWFg04UCT.jpg\",\"name\":\"Behrouz Afkhami\",\"id\":\"711\",\"name_fa\":\"بهروز افخمی\",\"birth_date\":\"۳ آبان ۱۳۳۵\"},\n    {\"image\":\"new/44p9XCPIWoZEgoNHhOM1.jpg\",\"name\":\"Nader Soleimani\",\"id\":\"333\",\"name_fa\":\"نادر سلیمانی\",\"birth_date\":\"۱۴ اسفند ۱۳۴۵\"},\n    {\"image\":\"new/vyAJWCcdCzyjjMMAZH8U.jpg\",\"name\":\"Mohammad Naderi\",\"id\":\"665\",\"name_fa\":\"محمد نادری\",\"birth_date\":\"۱۰ شهریور ۱۳۵۷\"},\n    {\"image\":\"new/DSkwGE5x6oHbVEk6bHQw.jpg\",\"name\":\"Alireza Ostadi\",\"id\":\"3121\",\"name_fa\":\"علیرضا استادی\",\"birth_date\":\"۱ خرداد ۱۳۵۲\"},\n    {\"image\":\"new/3o4S5V1UcXEUJbQUW2wZ.jpg\",\"name\":\"Jafar Dehghan\",\"id\":\"278\",\"name_fa\":\"جعفر دهقان\",\"birth_date\":\"۲۱ فروردین ۱۳۳۹\"},\n    {\"image\":\"3b755050-3e78-11e8-ab7c-abb68ee910e4/plXQgHZ2lAA6NMWODmwr.jpg\",\"name\":\"Mehran Ahmadi\",\"id\":\"61\",\"name_fa\":\"مهران احمدی\",\"birth_date\":\"۹ اسفند ۱۳۵۲\"},\n    {\"image\":\"new/lYD0fL1rXtaWYXGbk2Iu.jpg\",\"name\":\"Mehdi Khosravi\",\"id\":\"371\",\"name_fa\":\"مهدی خسروی\",\"birth_date\":\"۱۵ تیر ۱۳۵۵\"},\n    {\"image\":\"new/qYtlamqTC59EIJYfoKa8.jpg\",\"name\":\"Mohsen Ghazi Moradi\",\"id\":\"254\",\"name_fa\":\"محسن قاضی مرادی\",\"birth_date\":\"۱۱ شهریور ۱۳۲۰\"},\n    {\"image\":\"new/8hMsx17Ht3m31MgDl658.jpg\",\"name\":\"Mohammad-Reza Sharifinia\",\"id\":\"74\",\"name_fa\":\"محمد رضا شریفی نیا\",\"birth_date\":\"۲۵ خرداد ۱۳۳۴\"}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		Collections.shuffle(man_ir);
		recyclerview7.setAdapter(new Recyclerview7Adapter(man_ir));
		edittext1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
			@Override public boolean onEditorAction(TextView v, int actionId, KeyEvent event) { 
				if(actionId == 3){
					s = new HashMap<>();
					s.put("query", edittext1.getText().toString());
					s.put("imdb", false);
					s3arch.setParams(s, RequestNetworkController.REQUEST_PARAM);
					s3arch.startRequestNetwork(RequestNetworkController.POST, "https://api.upera.tv/api/v1/ghost/get/search?country=noIR&f_type=0&sortby=newest".concat("&page=2"), "", _s3arch_request_listener);
				} 
				return false;
			}
		});
	}
	
	
	@Override
	public void onBackPressed() {
		if (linear96.getVisibility() == View.VISIBLE) {
			linear101.performClick();
		} else {
			finish();
			overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
		}
	}
	public void _ui() {
		_removeScollBar(vscroll1);
		OverScrollDecoratorHelper.setUpOverScroll(vscroll1);
		linear94.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFF1D2733));
		linear94.setElevation((float)SketchwareUtil.getDip(getApplicationContext(), (int)(13)));
		_ColourFilter(imageview8, "#ffffff");
		_ColourFilter(imageview5, "#ffffff");
		// تنظیم LayoutManager به صورت گرید با 3 ستون
		GridLayoutManager layoutManager = new GridLayoutManager(CastActivity.this, 3);
		recyclerview5.setLayoutManager(layoutManager);
		
		// تنظیم فاصله بین آیتم‌ها (اختیاری)
		int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.recycler_spacing);
		recyclerview5.addItemDecoration(new GridSpacingItemDecoration(3, spacingInPixels, true));
	}
	
	
	public void _re() {
		
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _ColourFilter(final ImageView _imageview, final String _color) {
		_imageview.clearColorFilter(); 
		_imageview.setColorFilter(Color.parseColor(_color.toString()));
	}
	
	
	public void _visible_animation(final View _id) {
		_id.setAlpha((float)(0));
		a.setTarget(_id);
		a.setPropertyName("alpha");
		a.setFloatValues((float)(1.0d));
		a.setDuration((int)(500));
		a.start();
	}
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.castsa, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview4 = _view.findViewById(R.id.textview4);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview3 = _view.findViewById(R.id.textview3);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0x99263238));
			Glide.with(getApplicationContext())
			.load("https://s35.upera.net/thumb?w=400&h=400&q=100&a=t&src=https://s35.upera.net/s3/casts/".concat(_data.get((int)_position).get("image").toString()))
			.placeholder(R.drawable.nul)
			.transform(new RoundedCorners(1))
			.transition(DrawableTransitionOptions.withCrossFade(300))
			.into(imageview1);
			textview1.setText(_data.get((int)_position).get("name_fa").toString());
			textview3.setText(_data.get((int)_position).get("name").toString());
			textview2.setText("متولد ".concat(_data.get((int)_position).get("birth_date").toString()));
			// ایجاد شیء GradientDrawable برای تنظیم شکل
			GradientDrawable drawable = new GradientDrawable();
			drawable.setShape(GradientDrawable.RECTANGLE); // استفاده از شکل مستطیل
			
			// تبدیل dip به پیکسل
			float radius = SketchwareUtil.getDip(getApplicationContext(), 8);
			
			// تنظیم انحنای گوشه‌ها با radius تبدیل شده
			drawable.setCornerRadii(new float[]{
				radius, radius,  // بالا چپ
				radius, radius,  // بالا راست
				radius, radius,  // پایین راست
				radius, radius   // پایین چپ
			});
			
			// رنگ پس‌زمینه
			drawable.setColor(0xFF000000); // رنگ مشکی به صورت hex
			
			// تنظیم پس‌زمینه ImageView
			imageview1.setBackground(drawable);
			
			// فعال کردن برش گوشه‌ها
			imageview1.setClipToOutline(true);
			linear1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					to.setClass(getApplicationContext(), MoreActivity.class);
					to.putExtra("type", "casts");
					to.putExtra("sortby", _data.get((int)_position).get("id").toString());
					to.putExtra("name_cas", textview1.getText().toString());
					to.putExtra("profile_cas", _data.get((int)_position).get("image").toString());
					to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(to);
					CastActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
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
	
	public class Recyclerview2Adapter extends RecyclerView.Adapter<Recyclerview2Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.castsa, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview4 = _view.findViewById(R.id.textview4);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview3 = _view.findViewById(R.id.textview3);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0x99263238));
			Glide.with(getApplicationContext())
			.load("https://s35.upera.net/thumb?w=400&h=400&q=100&a=t&src=https://s35.upera.net/s3/casts/".concat(_data.get((int)_position).get("image").toString()))
			.placeholder(R.drawable.nul)
			.transform(new RoundedCorners(1))
			.transition(DrawableTransitionOptions.withCrossFade(300))
			.into(imageview1);
			textview1.setText(_data.get((int)_position).get("name_fa").toString());
			textview3.setText(_data.get((int)_position).get("name").toString());
			textview2.setText("متولد ".concat(_data.get((int)_position).get("birth_date").toString()));
			// ایجاد شیء GradientDrawable برای تنظیم شکل
			GradientDrawable drawable = new GradientDrawable();
			drawable.setShape(GradientDrawable.RECTANGLE); // استفاده از شکل مستطیل
			
			// تبدیل dip به پیکسل
			float radius = SketchwareUtil.getDip(getApplicationContext(), 8);
			
			// تنظیم انحنای گوشه‌ها با radius تبدیل شده
			drawable.setCornerRadii(new float[]{
				radius, radius,  // بالا چپ
				radius, radius,  // بالا راست
				radius, radius,  // پایین راست
				radius, radius   // پایین چپ
			});
			
			// رنگ پس‌زمینه
			drawable.setColor(0xFF000000); // رنگ مشکی به صورت hex
			
			// تنظیم پس‌زمینه ImageView
			imageview1.setBackground(drawable);
			
			// فعال کردن برش گوشه‌ها
			imageview1.setClipToOutline(true);
			linear1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					to.setClass(getApplicationContext(), MoreActivity.class);
					to.putExtra("type", "casts");
					to.putExtra("sortby", _data.get((int)_position).get("id").toString());
					to.putExtra("name_cas", textview1.getText().toString());
					to.putExtra("profile_cas", _data.get((int)_position).get("image").toString());
					to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(to);
					CastActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
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
	
	public class Recyclerview7Adapter extends RecyclerView.Adapter<Recyclerview7Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview7Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.castsa, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview4 = _view.findViewById(R.id.textview4);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview3 = _view.findViewById(R.id.textview3);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0x99263238));
			Glide.with(getApplicationContext())
			.load("https://s35.upera.net/thumb?w=400&h=400&q=100&a=t&src=https://s35.upera.net/s3/casts/".concat(_data.get((int)_position).get("image").toString()))
			.placeholder(R.drawable.nul)
			.transform(new RoundedCorners(1))
			.transition(DrawableTransitionOptions.withCrossFade(300))
			.into(imageview1);
			textview1.setText(_data.get((int)_position).get("name_fa").toString());
			textview3.setText(_data.get((int)_position).get("name").toString());
			textview2.setText("متولد ".concat(_data.get((int)_position).get("birth_date").toString()));
			// ایجاد شیء GradientDrawable برای تنظیم شکل
			GradientDrawable drawable = new GradientDrawable();
			drawable.setShape(GradientDrawable.RECTANGLE); // استفاده از شکل مستطیل
			
			// تبدیل dip به پیکسل
			float radius = SketchwareUtil.getDip(getApplicationContext(), 8);
			
			// تنظیم انحنای گوشه‌ها با radius تبدیل شده
			drawable.setCornerRadii(new float[]{
				radius, radius,  // بالا چپ
				radius, radius,  // بالا راست
				radius, radius,  // پایین راست
				radius, radius   // پایین چپ
			});
			
			// رنگ پس‌زمینه
			drawable.setColor(0xFF000000); // رنگ مشکی به صورت hex
			
			// تنظیم پس‌زمینه ImageView
			imageview1.setBackground(drawable);
			
			// فعال کردن برش گوشه‌ها
			imageview1.setClipToOutline(true);
			linear1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					to.setClass(getApplicationContext(), MoreActivity.class);
					to.putExtra("type", "casts");
					to.putExtra("sortby", _data.get((int)_position).get("id").toString());
					to.putExtra("name_cas", textview1.getText().toString());
					to.putExtra("profile_cas", _data.get((int)_position).get("image").toString());
					to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(to);
					CastActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
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
	
	public class Recyclerview5Adapter extends RecyclerView.Adapter<Recyclerview5Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview5Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.casser, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview4 = _view.findViewById(R.id.textview4);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview3 = _view.findViewById(R.id.textview3);
			
			Glide.with(getApplicationContext())
			.load("https://s35.upera.net/thumb?w=400&h=400&q=100&a=t&src=https://s35.upera.net/s3/casts/".concat(_data.get((int)_position).get("image").toString()))
			.placeholder(R.drawable.nul)
			.transform(new RoundedCorners(1))
			.transition(DrawableTransitionOptions.withCrossFade(300))
			.into(imageview1);
			textview1.setText(_data.get((int)_position).get("name_fa").toString());
			textview3.setText(_data.get((int)_position).get("name").toString());
			
			
			// ایجاد شیء GradientDrawable برای تنظیم شکل
			GradientDrawable drawable = new GradientDrawable();
			drawable.setShape(GradientDrawable.RECTANGLE); // استفاده از شکل مستطیل
			drawable.setCornerRadii(new float[]{50, 50, 50, 50, 50, 50, 50, 50}); // انحنای گوشه‌ها
			drawable.setColor(Color.BLACK); // رنگ پس‌زمینه (می‌تونی رنگ دلخواه خودت رو بذاری)
			
			// تنظیم پس‌زمینه ImageView
			imageview1.setBackground(drawable);
			
			// فعال کردن برش گوشه‌ها
			imageview1.setClipToOutline(true);
			linear1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					textview4.setText(String.valueOf((Integer) _data.get((int)_position).get("id")));
					to.setClass(getApplicationContext(), MoreActivity.class);
					to.putExtra("type", "casts");
					to.putExtra("sortby", textview4.getText().toString());
					to.putExtra("name_cas", textview1.getText().toString());
					to.putExtra("profile_cas", _data.get((int)_position).get("image").toString());
					to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(to);
					CastActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
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