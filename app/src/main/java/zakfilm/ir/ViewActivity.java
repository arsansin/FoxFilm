package zakfilm.ir;

import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
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
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
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
import java.text.DecimalFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import smartdevelop.ir.eram.showcaseviewlib.*;
import zakfilm.ir.ExpandableRecyclerView;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
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
import android.content.pm.PackageManager;
import android.app.DownloadManager;
import android.content.Context;
import android.net.ConnectivityManager;

import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import java.util.stream.Collectors;
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;
import smartdevelop.ir.eram.showcaseviewlib.config.DismissType;
import smartdevelop.ir.eram.showcaseviewlib.listener.GuideListener;

public class ViewActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private String src = "";
	private HashMap<String, Object> mop = new HashMap<>();
	private double uid = 0;
	private String url_video = "";
	private String string20 = "";
	private double moojod = 0;
	private String strings_position = "";
	private boolean check_get = false;
	private double post = 0;
	private String dasteh00oo = "";
	private HashMap<String, Object> pishnhad_my = new HashMap<>();
	private boolean cancable_dialog_loader = false;
	private HashMap<String, Object> mpp = new HashMap<>();
	private double season_duration = 0;
	private HashMap<String, Object> season0 = new HashMap<>();
	private String img = "";
	private String url = "";
	private String filen = "";
	private boolean isAppInstalled = false;
	private String jsn = "";
	private HashMap<String, Object> mnm = new HashMap<>();
	private HashMap<String, Object> mkl = new HashMap<>();
	private String view_set = "";
	private String descriptions = "";
	private String d3s = "";
	private double season = 0;
	private String text = "";
	private String firstCategory = "";
	private String categories = "";
	private String guality = "";
	private double type_dl = 0;
	private double c = 0;
	private double www = 0;
	private String sizem = "";
	private String sizem1 = "";
	private String sizem2 = "";
	private String theme = "";
	private String color = "";
	private HashMap<String, Object> gm = new HashMap<>();
	private String dataJson = "";
	private boolean placementID = false;
	private boolean placementId = false;
	private String l_color = "";
	private HashMap<String, Object> s = new HashMap<>();
	private HashMap<String, Object> headers = new HashMap<>();
	private HashMap<String, Object> map = new HashMap<>();
	private String quality = "";
	private double seek = 0;
	private String link_dl = "";
	private double select_p_Myrecyclerview1_0Adapter = 0;
	private boolean upera = false;
	private boolean download_check = false;
	
	private ArrayList<HashMap<String, Object>> mp = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> add_save = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> get_das = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> dasteh_pish = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap_dasteh00 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap1 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap2 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap3 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap_season = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> seasonList = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> seasonKeysList = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap10 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmapcharacters = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmapwriters = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> com = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> fi_lis = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> amoze = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_qulity = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listQulity = new ArrayList<>();
	
	private RelativeLayout relativelayout4;
	private LinearLayout linear54;
	private RelativeLayout relativelayout1;
	private ScrollView vscroll1;
	private LinearLayout linear83;
	private LinearLayout linear63;
	private LinearLayout linear157;
	private LinearLayout linear60;
	private LinearLayout linear56;
	private TextView textview56;
	private ImageView imageview2;
	private LinearLayout linear24;
	private LinearLayout linear100;
	private RelativeLayout relativelayout2;
	private LinearLayout linear128;
	private LinearLayout linear53;
	private LinearLayout linear97;
	private LinearLayout linear10;
	private ImageView profile;
	private LinearLayout linear43;
	private RelativeLayout linear71;
	private LinearLayout linear226;
	private TextView dasteh;
	private RelativeLayout relativelayout5;
	private LinearLayout linear6;
	private ImageView imageview92;
	private TextView name;
	private LinearLayout linear207;
	private LinearLayout linear159;
	private CardView cardview3;
	private LinearLayout linear206;
	private ImageView imageview91;
	private TextView textview107;
	private ImageView imageview49;
	private TextView textview1;
	private LinearLayout linear72;
	private LinearLayout linear150;
	private LinearLayout linear133;
	private LinearLayout linear134;
	private LinearLayout linear65;
	private LinearLayout linear132;
	private ImageView imageview93;
	private LinearLayout linear140;
	private LinearLayout linear221;
	private LinearLayout linear139;
	private ViewPager viewpager1;
	private LinearLayout linear210;
	private TextView description;
	private ImageView imageview47;
	private LinearLayout l_sen;
	private LinearLayout l_date;
	private LinearLayout l_dooble;
	private LinearLayout l_imdb;
	private LinearLayout linear212;
	private TextView sen;
	private ImageView imageview30;
	private LinearLayout linear209;
	private TextView data;
	private ImageView imageview16;
	private LinearLayout linear220;
	private TextView dooble;
	private ImageView imageview24;
	private LinearLayout linear216;
	private TextView rate;
	private TextView textview115;
	private RecyclerView recyclerview4;
	private TextView textview54;
	private RecyclerView recyclerview5;
	private TextView textview55;
	private RecyclerView recyclerview3;
	private TextView textview53;
	private LinearLayout l_report;
	private LinearLayout l_save;
	private LinearLayout l_download;
	private LinearLayout l_like;
	private LinearLayout l_share;
	private ImageView imageview42;
	private ImageView imageview43;
	private ImageView imageview44;
	private ImageView imageview45;
	private ImageView imageview46;
	private LinearLayout linear222;
	private LinearLayout linear223;
	private LinearLayout linear224;
	private LinearLayout linear225;
	private TextView textview116;
	private TextView textview117;
	private TextView textview118;
	private TextView textview119;
	private TextView massage;
	private LinearLayout linear96;
	private RecyclerView recyclerview1;
	private ExpandableRecyclerView offer;
	private ExpandableRecyclerView gridview_bazigran;
	private ExpandableRecyclerView pishnahadi;
	private RecyclerView recyclerview6;
	private ExpandableRecyclerView qhesmat;
	private Button button1;
	private TextView textview47;
	private LinearLayout linear85;
	private ImageView imageview39;
	private LinearLayout linear75;
	private ProgressBar progressbar1;
	
	private RequestNetwork get;
	private RequestNetwork.RequestListener _get_request_listener;
	private Intent i = new Intent();
	private SharedPreferences saved_video;
	private TimerTask timer;
	private Intent to = new Intent();
	private SharedPreferences dast_pish;
	private ObjectAnimator an_v = new ObjectAnimator();
	private ObjectAnimator an_i = new ObjectAnimator();
	private Intent rt = new Intent();
	private AlertDialog load;
	private RequestNetwork get_com;
	private RequestNetwork.RequestListener _get_com_request_listener;
	private RequestNetwork pishnhad;
	private RequestNetwork.RequestListener _pishnhad_request_listener;
	private Intent pl = new Intent();
	private Intent yu = new Intent();
	private AlertDialog.Builder dialog;
	private Intent go_dl = new Intent();
	private Vibrator vib;
	private SharedPreferences width_img;
	private SharedPreferences height_img;
	private SharedPreferences round_img;
	private SharedPreferences type_videoplayer;
	private ObjectAnimator anx = new ObjectAnimator();
	private ObjectAnimator any = new ObjectAnimator();
	private Vibrator bv;
	private TimerTask t;
	private Intent report = new Intent();
	private SharedPreferences d_video_uid;
	private SharedPreferences save;
	private SharedPreferences gold;
	private RequestNetwork GetMovie;
	private RequestNetwork.RequestListener _GetMovie_request_listener;
	private Intent ii = new Intent();
	private AlertDialog ticket;
	private RequestNetwork GetCastsANDsimilar;
	private RequestNetwork.RequestListener _GetCastsANDsimilar_request_listener;
	private TimerTask timer2;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.view);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		relativelayout4 = findViewById(R.id.relativelayout4);
		linear54 = findViewById(R.id.linear54);
		relativelayout1 = findViewById(R.id.relativelayout1);
		vscroll1 = findViewById(R.id.vscroll1);
		linear83 = findViewById(R.id.linear83);
		linear63 = findViewById(R.id.linear63);
		linear157 = findViewById(R.id.linear157);
		linear60 = findViewById(R.id.linear60);
		linear56 = findViewById(R.id.linear56);
		textview56 = findViewById(R.id.textview56);
		imageview2 = findViewById(R.id.imageview2);
		linear24 = findViewById(R.id.linear24);
		linear100 = findViewById(R.id.linear100);
		relativelayout2 = findViewById(R.id.relativelayout2);
		linear128 = findViewById(R.id.linear128);
		linear53 = findViewById(R.id.linear53);
		linear97 = findViewById(R.id.linear97);
		linear10 = findViewById(R.id.linear10);
		profile = findViewById(R.id.profile);
		linear43 = findViewById(R.id.linear43);
		linear71 = findViewById(R.id.linear71);
		linear226 = findViewById(R.id.linear226);
		dasteh = findViewById(R.id.dasteh);
		relativelayout5 = findViewById(R.id.relativelayout5);
		linear6 = findViewById(R.id.linear6);
		imageview92 = findViewById(R.id.imageview92);
		name = findViewById(R.id.name);
		linear207 = findViewById(R.id.linear207);
		linear159 = findViewById(R.id.linear159);
		cardview3 = findViewById(R.id.cardview3);
		linear206 = findViewById(R.id.linear206);
		imageview91 = findViewById(R.id.imageview91);
		textview107 = findViewById(R.id.textview107);
		imageview49 = findViewById(R.id.imageview49);
		textview1 = findViewById(R.id.textview1);
		linear72 = findViewById(R.id.linear72);
		linear150 = findViewById(R.id.linear150);
		linear133 = findViewById(R.id.linear133);
		linear134 = findViewById(R.id.linear134);
		linear65 = findViewById(R.id.linear65);
		linear132 = findViewById(R.id.linear132);
		imageview93 = findViewById(R.id.imageview93);
		linear140 = findViewById(R.id.linear140);
		linear221 = findViewById(R.id.linear221);
		linear139 = findViewById(R.id.linear139);
		viewpager1 = findViewById(R.id.viewpager1);
		linear210 = findViewById(R.id.linear210);
		description = findViewById(R.id.description);
		imageview47 = findViewById(R.id.imageview47);
		l_sen = findViewById(R.id.l_sen);
		l_date = findViewById(R.id.l_date);
		l_dooble = findViewById(R.id.l_dooble);
		l_imdb = findViewById(R.id.l_imdb);
		linear212 = findViewById(R.id.linear212);
		sen = findViewById(R.id.sen);
		imageview30 = findViewById(R.id.imageview30);
		linear209 = findViewById(R.id.linear209);
		data = findViewById(R.id.data);
		imageview16 = findViewById(R.id.imageview16);
		linear220 = findViewById(R.id.linear220);
		dooble = findViewById(R.id.dooble);
		imageview24 = findViewById(R.id.imageview24);
		linear216 = findViewById(R.id.linear216);
		rate = findViewById(R.id.rate);
		textview115 = findViewById(R.id.textview115);
		recyclerview4 = findViewById(R.id.recyclerview4);
		textview54 = findViewById(R.id.textview54);
		recyclerview5 = findViewById(R.id.recyclerview5);
		textview55 = findViewById(R.id.textview55);
		recyclerview3 = findViewById(R.id.recyclerview3);
		textview53 = findViewById(R.id.textview53);
		l_report = findViewById(R.id.l_report);
		l_save = findViewById(R.id.l_save);
		l_download = findViewById(R.id.l_download);
		l_like = findViewById(R.id.l_like);
		l_share = findViewById(R.id.l_share);
		imageview42 = findViewById(R.id.imageview42);
		imageview43 = findViewById(R.id.imageview43);
		imageview44 = findViewById(R.id.imageview44);
		imageview45 = findViewById(R.id.imageview45);
		imageview46 = findViewById(R.id.imageview46);
		linear222 = findViewById(R.id.linear222);
		linear223 = findViewById(R.id.linear223);
		linear224 = findViewById(R.id.linear224);
		linear225 = findViewById(R.id.linear225);
		textview116 = findViewById(R.id.textview116);
		textview117 = findViewById(R.id.textview117);
		textview118 = findViewById(R.id.textview118);
		textview119 = findViewById(R.id.textview119);
		massage = findViewById(R.id.massage);
		linear96 = findViewById(R.id.linear96);
		recyclerview1 = findViewById(R.id.recyclerview1);
		offer = findViewById(R.id.offer);
		gridview_bazigran = findViewById(R.id.gridview_bazigran);
		pishnahadi = findViewById(R.id.pishnahadi);
		recyclerview6 = findViewById(R.id.recyclerview6);
		qhesmat = findViewById(R.id.qhesmat);
		button1 = findViewById(R.id.button1);
		textview47 = findViewById(R.id.textview47);
		linear85 = findViewById(R.id.linear85);
		imageview39 = findViewById(R.id.imageview39);
		linear75 = findViewById(R.id.linear75);
		progressbar1 = findViewById(R.id.progressbar1);
		get = new RequestNetwork(this);
		saved_video = getSharedPreferences("saved_video", Activity.MODE_PRIVATE);
		dast_pish = getSharedPreferences("dast_pish", Activity.MODE_PRIVATE);
		get_com = new RequestNetwork(this);
		pishnhad = new RequestNetwork(this);
		dialog = new AlertDialog.Builder(this);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		width_img = getSharedPreferences("width_img", Activity.MODE_PRIVATE);
		height_img = getSharedPreferences("height_img", Activity.MODE_PRIVATE);
		round_img = getSharedPreferences("round_img", Activity.MODE_PRIVATE);
		type_videoplayer = getSharedPreferences("type_videoplayer", Activity.MODE_PRIVATE);
		bv = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		d_video_uid = getSharedPreferences("d_video_uid", Activity.MODE_PRIVATE);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		gold = getSharedPreferences("gold", Activity.MODE_PRIVATE);
		GetMovie = new RequestNetwork(this);
		GetCastsANDsimilar = new RequestNetwork(this);
		
		relativelayout5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_playVideo();
			}
		});
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (check_get) {
					if (getIntent().getStringExtra("type").equals("series")) {
						vscroll1.smoothScrollTo(0, 1100);
					} else {
						if (upera) {
							_download(mpp.get("upera").toString(), save.getString("domain", "").concat("575&h=500&q=60&a=c&zc=1&src=https://cdn.upera.shop/s3/backdrops/").concat(mpp.get("backdrop").toString()), "0");
						} else {
							if (mpp.get("backdrop").toString().toString().trim().startsWith("http")) {
								_download("", mpp.get("backdrop").toString(), "0");
							} else {
								_download("", save.getString("domain", "").concat("575&h=500&q=60&a=c&zc=1&src=https://cdn.upera.shop/s3/backdrops/").concat(mpp.get("backdrop").toString()), "0");
							}
						}
					}
				} else {
					
				}
			}
		});
		
		linear150.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (imageview47.getVisibility() == View.VISIBLE) {
					description.setText(d3s);
					_TransitionManager(linear53, 200);
					imageview47.setVisibility(View.GONE);
				} else {
					
				}
			}
		});
		
		imageview93.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), NewBuyEshActivity.class);
				startActivity(i);
			}
		});
		
		recyclerview4.addOnScrollListener(new RecyclerView.OnScrollListener() {
			@Override
			public void onScrollStateChanged(RecyclerView recyclerView, int _scrollState) {
				super.onScrollStateChanged(recyclerView, _scrollState);
				
			}
			
			@Override
			public void onScrolled(RecyclerView recyclerView, int _offsetX, int _offsetY) {
				super.onScrolled(recyclerView, _offsetX, _offsetY);
				
			}
		});
		
		l_report.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					report.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(report);
					ViewActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
				} catch (Exception e) {
					
				}
			}
		});
		
		l_save.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					if (moojod == 0) {
						add_save = new Gson().fromJson(saved_video.getString("saved_video", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
						mop = new HashMap<>();
						mop.put("name", mpp.get("name_fa").toString());
						mop.put("id", mpp.get("id").toString());
						mop.put("image", mpp.get("poster").toString());
						mop.put("type", getIntent().getStringExtra("type"));
						mop.put("dasteh", "");
						if (getIntent().hasExtra("my")) {
							mop.put("my", "");
						}
						add_save.add(mop);
						saved_video.edit().putString("saved_video", new Gson().toJson(add_save)).commit();
						imageview43.setImageResource(R.drawable.tfr_2);
						moojod = 1;
						string20 = mpp.get("id").toString();
						boolean found = false;
						int position = -1; // متغیری برای ذخیره موقعیت آیتم در لیست
						
						for (int i = 0; i < add_save.size(); i++) {
							HashMap<String, Object> item = add_save.get(i);
							if (item.get("id").toString().equals(string20)) {
								found = true;
								position = i; // ذخیره موقعیت آیتم
								break; // وقتی پیدا شد، جستجو متوقف می‌شود
							}
						}
						
						if (found) {
							strings_position = String.valueOf(position); // تنظیم موقعیت به عنوان رشته
							
						} else {
							
						}
					} else {
						add_save.remove((int)(Double.parseDouble(strings_position)));
						saved_video.edit().putString("saved_video", new Gson().toJson(add_save)).commit();
						imageview43.setImageResource(R.drawable.tfr_1);
						moojod = 0;
					}
				} catch (Exception e) {
					
				}
			}
		});
		
		l_download.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear6.performClick();
			}
		});
		
		l_like.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		l_share.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "type=".concat(getIntent().getStringExtra("type").concat("&".concat("id=".concat(getIntent().getStringExtra("id")))))));
				save.edit().putString("recentId", "type=".concat(getIntent().getStringExtra("type").concat("&".concat("id=".concat(getIntent().getStringExtra("id")))))).commit();
				SketchwareUtil.showMessage(getApplicationContext(), "کد با موفقیت کپی گردید.");
			}
		});
		
		linear222.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (pishnahadi.getVisibility() == View.VISIBLE) {
					
				} else {
					offer.setVisibility(View.GONE);
					gridview_bazigran.setVisibility(View.GONE);
					pishnahadi.setVisibility(View.VISIBLE);
					linear96.setVisibility(View.GONE);
					if (dasteh_pish.size() == 0) {
						massage.setVisibility(View.VISIBLE);
					} else {
						massage.setVisibility(View.GONE);
					}
					_setMargin(pishnahadi, 0, 0, 0, 0);
					if (dasteh_pish.size() < 12) {
						_setMargin(pishnahadi, 0, 0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(500)));
					}
					_color_tab();
					_rippleRoundStroke(linear222, l_color, "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0, "#50ffffff");
				}
			}
		});
		
		linear223.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (gridview_bazigran.getVisibility() == View.VISIBLE) {
					
				} else {
					offer.setVisibility(View.GONE);
					gridview_bazigran.setVisibility(View.VISIBLE);
					pishnahadi.setVisibility(View.GONE);
					linear96.setVisibility(View.GONE);
					if (listmap2.size() == 0) {
						massage.setVisibility(View.VISIBLE);
					} else {
						massage.setVisibility(View.GONE);
					}
					_setMargin(gridview_bazigran, 0, 0, 0, 0);
					if (listmap2.size() < 12) {
						_setMargin(gridview_bazigran, 0, 0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(500)));
					}
					_color_tab();
					_rippleRoundStroke(linear223, l_color, "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0, "#50ffffff");
				}
			}
		});
		
		linear224.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (offer.getVisibility() == View.VISIBLE) {
					
				} else {
					offer.setVisibility(View.VISIBLE);
					gridview_bazigran.setVisibility(View.GONE);
					pishnahadi.setVisibility(View.GONE);
					linear96.setVisibility(View.GONE);
					if (listmap1.size() == 0) {
						massage.setVisibility(View.VISIBLE);
					} else {
						massage.setVisibility(View.GONE);
					}
					_setMargin(offer, 0, 0, 0, 0);
					if (listmap1.size() < 12) {
						_setMargin(offer, 0, 0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(500)));
					}
					_color_tab();
					_rippleRoundStroke(linear224, l_color, "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0, "#50ffffff");
				}
			}
		});
		
		linear225.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linear96.getVisibility() == View.VISIBLE) {
					
				} else {
					offer.setVisibility(View.GONE);
					gridview_bazigran.setVisibility(View.GONE);
					pishnahadi.setVisibility(View.GONE);
					linear96.setVisibility(View.VISIBLE);
					if (listmap_season.size() == 0) {
						massage.setVisibility(View.VISIBLE);
					} else {
						massage.setVisibility(View.GONE);
					}
					_setMargin(linear96, 0, 0, 0, 0);
					if (listmap_season.size() < 12) {
						_setMargin(linear96, 0, 0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(500)));
					}
					_color_tab();
					_rippleRoundStroke(linear225, l_color, "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0, "#50ffffff");
				}
			}
		});
		
		recyclerview6.addOnScrollListener(new RecyclerView.OnScrollListener() {
			@Override
			public void onScrollStateChanged(RecyclerView recyclerView, int _scrollState) {
				super.onScrollStateChanged(recyclerView, _scrollState);
				
			}
			
			@Override
			public void onScrolled(RecyclerView recyclerView, int _offsetX, int _offsetY) {
				super.onScrolled(recyclerView, _offsetX, _offsetY);
				
			}
		});
		
		button1.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear85.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
				overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
			}
		});
		
		_get_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try {
					if (_response.contains("{\n  \"message\": \"Server Error\"\n}")) {
						
					} else {
						gridview_bazigran.setVisibility(View.GONE);
						pishnahadi.setVisibility(View.GONE);
						massage.setVisibility(View.GONE);
						offer.setVisibility(View.GONE);
						linear96.setVisibility(View.GONE);
						massage.setText("درحال بارگذاری...");
						if (getIntent().getStringExtra("type").equals("movie")) {
							String jsonString = _response;
							
							try {
								// مرحله 1: ایجاد آبجکت جیسون اصلی
								JSONObject jsonObject = new JSONObject(jsonString);
								
								// بررسی وجود کلید "data"
								if (jsonObject.has("data")) {
									JSONObject dataObject = jsonObject.getJSONObject("data");
									
									// بررسی وجود کلید "movie" در داخل "data"
									if (dataObject.has("movie")) {
										JSONObject movieObject = dataObject.getJSONObject("movie");
										
										// چاپ آبجکت movie برای اطمینان از داده‌ها
										System.out.println("Movie Object: " + movieObject.toString());
										
										// لیست مپ برای ذخیره داده‌ها
										mpp.clear(); // ابتدا مپ را پاک می‌کنیم
										
										// تبدیل آبجکت جیسون به HashMap (مپ)
										Iterator<String> keys = movieObject.keys();
										while (keys.hasNext()) {
											String key = keys.next();
											mpp.put(key, movieObject.get(key));
										}
										
										// چاپ داده‌های ذخیره شده در mpp برای بررسی
										System.out.println("Mapped Data: " + mpp.toString());
									} else {
										System.out.println("کلید 'movie' در 'data' پیدا نشد.");
									}
									
									// بررسی وجود کلید "similar" در data
									if (dataObject.has("similar")) {
										JSONArray similarArray = dataObject.getJSONArray("similar");
										
										// پاک کردن listmap1 قبل از افزودن داده‌ها
										listmap1.clear();
										
										// تبدیل JSONArray به لیست HashMap‌ها
										for (int i = 0; i < similarArray.length(); i++) {
											JSONObject similarObject = similarArray.getJSONObject(i);
											
											// بررسی مقدار کلید "traffic"
											int trafficValue = similarObject.optInt("traffic_oo", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
											if (trafficValue == 1) {
												continue; // از پردازش این آیتم صرف‌نظر کن
											}
											
											// بررسی مقدار کلید "traffic"
											int traffic = similarObject.optInt("traffic", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
											if (traffic == 0) {
												continue; // از پردازش این آیتم صرف‌نظر کن
											}
											
											// تبدیل آبجکت جیسون به HashMap
											HashMap<String, Object> map = new HashMap<>();
											
											Iterator<String> similarKeys = similarObject.keys();
											while (similarKeys.hasNext()) {
												String key = similarKeys.next();
												map.put(key, similarObject.get(key));
											}
											
											listmap1.add(map); // حالا map از نوع HashMap است
										}
										
										// چاپ لیست listmap1 برای بررسی
										System.out.println("Similar Movies: " + listmap1.toString());
									} else {
										System.out.println("کلید 'similar' در 'data' پیدا نشد.");
									}
									// بررسی وجود کلید "directors" در data
									if (dataObject.has("directors")) {
										JSONArray directorsArray = dataObject.getJSONArray("directors");
										
										// پاک کردن listmap1 قبل از افزودن داده‌ها
										listmap10.clear();
										
										// تبدیل JSONArray به لیست HashMap‌ها
										for (int i = 0; i < directorsArray.length(); i++) {
											JSONObject directorsObject = directorsArray.getJSONObject(i);
											HashMap<String, Object> map = new HashMap<>(); // به جای Map از HashMap استفاده کنید
											
											Iterator<String> directorsKeys = directorsObject.keys();
											while (directorsKeys.hasNext()) {
												String key = directorsKeys.next();
												map.put(key, directorsObject.get(key));
											}
											
											listmap10.add(map); // حالا map از نوع HashMap است
										}
										
										// چاپ لیست listmap1 برای بررسی
										System.out.println("directors Movies: " + listmap1.toString());
									} else {
										System.out.println("کلید 'directors' در 'data' پیدا نشد.");
									}
									// مرحله 6: بررسی وجود کلید "casts" (offer) در data
									try {
										if (dataObject.has("casts")) {
											JSONArray offerArray = dataObject.getJSONArray("casts");
											
											// پاک کردن listmap2 قبل از افزودن داده‌ها
											listmap2.clear();
											
											// تبدیل JSONArray به لیست HashMap‌ها
											for (int i = 0; i < offerArray.length(); i++) {
												JSONObject offerObject = offerArray.getJSONObject(i);
												HashMap<String, Object> map = new HashMap<>();
												
												Iterator<String> offerKeys = offerObject.keys();
												while (offerKeys.hasNext()) {
													String key = offerKeys.next();
													map.put(key, offerObject.get(key));
												}
												
												listmap2.add(map); // حالا map از نوع HashMap است
											}
											
											// چاپ لیست listmap2 برای بررسی
											System.out.println("Offer List: " + listmap2.toString());
										} else {
											System.out.println("کلید 'casts' در 'data' پیدا نشد.");
										}
									} catch (JSONException e) {
										e.printStackTrace();
										System.out.println("خطا در پردازش کلید 'casts': " + e.getMessage());
									}
									
								} else {
									System.out.println("کلید 'data' پیدا نشد.");
								}
								
							} catch (JSONException e) {
								e.printStackTrace();
								System.out.println("خطا در پردازش JSON: " + e.getMessage());
							} 
							offer.setVisibility(View.VISIBLE);
						} else {
							if (getIntent().getStringExtra("type").equals("episode")) {
								String jsonString = _response;
								
								try {
									// مرحله 1: ایجاد آبجکت جیسون اصلی
									JSONObject jsonObject = new JSONObject(jsonString);
									
									// بررسی وجود کلید "data"
									if (jsonObject.has("data")) {
										JSONObject dataObject = jsonObject.getJSONObject("data");
										
										// بررسی وجود کلید "movie" در داخل "data"
										if (dataObject.has("episode")) {
											JSONObject movieObject = dataObject.getJSONObject("episode");
											
											// چاپ آبجکت movie برای اطمینان از داده‌ها
											System.out.println("Movie Object: " + movieObject.toString());
											
											// لیست مپ برای ذخیره داده‌ها
											mpp.clear(); // ابتدا مپ را پاک می‌کنیم
											
											// تبدیل آبجکت جیسون به HashMap (مپ)
											Iterator<String> keys = movieObject.keys();
											while (keys.hasNext()) {
												String key = keys.next();
												mpp.put(key, movieObject.get(key));
											}
											
											// چاپ داده‌های ذخیره شده در mpp برای بررسی
											System.out.println("Mapped Data: " + mpp.toString());
										} else {
											System.out.println("کلید 'movie' در 'data' پیدا نشد.");
										}
										// بررسی وجود کلید "similar" در data
										if (dataObject.has("similar")) {
											JSONArray similarArray = dataObject.getJSONArray("similar");
											
											// پاک کردن listmap1 قبل از افزودن داده‌ها
											listmap1.clear();
											
											// تبدیل JSONArray به لیست HashMap‌ها
											for (int i = 0; i < similarArray.length(); i++) {
												JSONObject similarObject = similarArray.getJSONObject(i);
												
												// بررسی مقدار کلید "traffic"
												int trafficValue = similarObject.optInt("traffic_oo", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
												if (trafficValue == 1) {
													continue; // از پردازش این آیتم صرف‌نظر کن
												}
												
												// بررسی مقدار کلید "traffic"
												int traffic = similarObject.optInt("traffic", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
												if (traffic == 0) {
													continue; // از پردازش این آیتم صرف‌نظر کن
												}
												
												// تبدیل آبجکت جیسون به HashMap
												HashMap<String, Object> map = new HashMap<>();
												
												Iterator<String> similarKeys = similarObject.keys();
												while (similarKeys.hasNext()) {
													String key = similarKeys.next();
													map.put(key, similarObject.get(key));
												}
												
												listmap1.add(map); // حالا map از نوع HashMap است
											}
											
											// چاپ لیست listmap1 برای بررسی
											System.out.println("Similar Movies: " + listmap1.toString());
										} else {
											System.out.println("کلید 'similar' در 'data' پیدا نشد.");
										}
										// بررسی وجود کلید "directors" در data
										if (dataObject.has("directors")) {
											JSONArray directorsArray = dataObject.getJSONArray("directors");
											
											// پاک کردن listmap1 قبل از افزودن داده‌ها
											listmap10.clear();
											
											// تبدیل JSONArray به لیست HashMap‌ها
											for (int i = 0; i < directorsArray.length(); i++) {
												JSONObject directorsObject = directorsArray.getJSONObject(i);
												HashMap<String, Object> map = new HashMap<>(); // به جای Map از HashMap استفاده کنید
												
												Iterator<String> directorsKeys = directorsObject.keys();
												while (directorsKeys.hasNext()) {
													String key = directorsKeys.next();
													map.put(key, directorsObject.get(key));
												}
												
												listmap10.add(map); // حالا map از نوع HashMap است
											}
											
											// چاپ لیست listmap1 برای بررسی
											System.out.println("directors Movies: " + listmap1.toString());
										} else {
											System.out.println("کلید 'directors' در 'data' پیدا نشد.");
										}
										// مرحله 6: بررسی وجود کلید "casts" (offer) در data
										try {
											if (dataObject.has("casts")) {
												JSONArray offerArray = dataObject.getJSONArray("casts");
												
												// پاک کردن listmap2 قبل از افزودن داده‌ها
												listmap2.clear();
												
												// تبدیل JSONArray به لیست HashMap‌ها
												for (int i = 0; i < offerArray.length(); i++) {
													JSONObject offerObject = offerArray.getJSONObject(i);
													HashMap<String, Object> map = new HashMap<>();
													
													Iterator<String> offerKeys = offerObject.keys();
													while (offerKeys.hasNext()) {
														String key = offerKeys.next();
														map.put(key, offerObject.get(key));
													}
													
													listmap2.add(map); // حالا map از نوع HashMap است
												}
												
												// چاپ لیست listmap2 برای بررسی
												System.out.println("Offer List: " + listmap2.toString());
											} else {
												System.out.println("کلید 'casts' در 'data' پیدا نشد.");
											}
										} catch (JSONException e) {
											e.printStackTrace();
											System.out.println("خطا در پردازش کلید 'casts': " + e.getMessage());
										}
										
									} else {
										System.out.println("کلید 'data' پیدا نشد.");
									}
									
								} catch (JSONException e) {
									e.printStackTrace();
									System.out.println("خطا در پردازش JSON: " + e.getMessage());
								} 
							} else {
								String jsonString = _response; // فرض می‌کنیم _response داده‌های JSON است
								
								try {
									// مرحله 1: ایجاد آبجکت جیسون اصلی
									JSONObject jsonObject = new JSONObject(jsonString);
									
									// بررسی وجود کلید "data"
									if (jsonObject.has("data")) {
										JSONObject dataObject = jsonObject.getJSONObject("data");  // تعریف متغیر dataObject
										
										// چاپ محتویات dataObject برای اشکال‌زدایی
										System.out.println("Data Object: " + dataObject.toString());
										
										// مرحله 2: بررسی وجود کلید "series" در داخل "data"
										try {
											if (dataObject.has("series")) {
												JSONObject seriesObject = dataObject.getJSONObject("series");
												
												// چاپ آبجکت series برای اطمینان از داده‌ها
												System.out.println("Series Object: " + seriesObject.toString());
												
												// لیست مپ برای ذخیره داده‌ها
												mpp.clear(); // ابتدا مپ را پاک می‌کنیم
												
												// تبدیل آبجکت جیسون به HashMap (مپ)
												Iterator<String> keys = seriesObject.keys();
												while (keys.hasNext()) {
													String key = keys.next();
													mpp.put(key, seriesObject.get(key));
												}
												
												// چاپ داده‌های ذخیره شده در mpp برای بررسی
												System.out.println("Mapped Data: " + mpp.toString());
											} else {
												System.out.println("کلید 'series' در 'data' پیدا نشد.");
											}
										} catch (JSONException e) {
											e.printStackTrace();
											System.out.println("خطا در پردازش کلید 'series': " + e.getMessage());
										}
										
										// مرحله 3: بررسی وجود کلید "season" در data
										try {
											if (dataObject.has("season")) {
												JSONObject seasonObject = dataObject.getJSONObject("season");
												
												// چاپ محتویات seasonObject برای اشکال‌زدایی
												System.out.println("Season Object: " + seasonObject.toString());
												
												// پیمایش تمام کلیدهای موجود در seasonObject
												Iterator<String> seasonKeys = seasonObject.keys();
												while (seasonKeys.hasNext()) {
													String seasonKey = seasonKeys.next();
													System.out.println("Season Key: " + seasonKey); // برای اشکال‌زدایی
													
													JSONArray seasonArray = seasonObject.getJSONArray(seasonKey);
													
													// چاپ آرایه فصل‌ها برای بررسی
													System.out.println("Season Array: " + seasonArray.toString());
													
													// شمارش تعداد فصل‌ها و ذخیره در متغیر season_duration
													int season_duration = seasonArray.length();
													System.out.println("Season Duration: " + season_duration);
													
													// اگر تعداد کوئری‌ها بیشتر از ۳ باشد، به ۳ محدود می‌کنیم
													int maxQueries = Math.min(season_duration, 3); // بیشترین ۳ کوئری یا تعداد کل کوئری‌ها (هر کدام که کمتر باشد)
													
													// بررسی اینکه آیا آرایه فصل‌ها خالی است
													if (season_duration > 0) {
														listmap_season.clear();
														
														// حلقه برای دریافت حداکثر ۳ آیتم از آرایه‌ی فصل‌ها
														for (int i = 0; i < maxQueries; i++) {
															JSONObject seasonItem = seasonArray.getJSONObject(i);
															
															// چاپ آبجکت هر فصل برای بررسی
															System.out.println("Season Object " + i + ": " + seasonItem.toString());
															
															HashMap<String, Object> seasonMap = new HashMap<>();
															
															Iterator<String> seasonItemKeys = seasonItem.keys();
															while (seasonItemKeys.hasNext()) {
																String key = seasonItemKeys.next();
																seasonMap.put(key, seasonItem.get(key));
															}
															
															// اضافه کردن فصل به لیست
															listmap_season.add(seasonMap);
														}
														
														// چاپ داده‌های تمام فصل‌ها برای بررسی
														System.out.println("All Seasons: " + listmap_season.toString());
													} else {
														System.out.println("آرایه 'season' خالی است.");
													}
												}
											} else {
												System.out.println("کلید 'season' در 'data' پیدا نشد.");
											}
										} catch (JSONException e) {
											e.printStackTrace();
											System.out.println("خطا در پردازش کلید 'season': " + e.getMessage());
										}
										
										// مرحله 4: بررسی وجود کلید "movie" در داخل "data"
										try {
											if (dataObject.has("movie")) {
												JSONObject movieObject = dataObject.getJSONObject("movie");
												
												// چاپ آبجکت movie برای اطمینان از داده‌ها
												System.out.println("Movie Object: " + movieObject.toString());
												
												// لیست مپ برای ذخیره داده‌ها
												mpp.clear(); // ابتدا مپ را پاک می‌کنیم
												
												// تبدیل آبجکت جیسون به HashMap (مپ)
												Iterator<String> keys = movieObject.keys();
												while (keys.hasNext()) {
													String key = keys.next();
													mpp.put(key, movieObject.get(key));
												}
												
												// چاپ داده‌های ذخیره شده در mpp برای بررسی
												System.out.println("Mapped Data: " + mpp.toString());
											} else {
												System.out.println("کلید 'movie' در 'data' پیدا نشد.");
											}
										} catch (JSONException e) {
											e.printStackTrace();
											System.out.println("خطا در پردازش کلید 'movie': " + e.getMessage());
										}
										
										
										// بررسی وجود کلید "similar" در data
										if (dataObject.has("similar")) {
											JSONArray similarArray = dataObject.getJSONArray("similar");
											
											// پاک کردن listmap1 قبل از افزودن داده‌ها
											listmap1.clear();
											
											// تبدیل JSONArray به لیست HashMap‌ها
											for (int i = 0; i < similarArray.length(); i++) {
												JSONObject similarObject = similarArray.getJSONObject(i);
												
												// بررسی مقدار کلید "traffic"
												int trafficValue = similarObject.optInt("traffic_oo", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
												if (trafficValue == 1) {
													continue; // از پردازش این آیتم صرف‌نظر کن
												}
												
												// بررسی مقدار کلید "traffic"
												int traffic = similarObject.optInt("traffic", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
												if (traffic == 0) {
													continue; // از پردازش این آیتم صرف‌نظر کن
												}
												
												// تبدیل آبجکت جیسون به HashMap
												HashMap<String, Object> map = new HashMap<>();
												
												Iterator<String> similarKeys = similarObject.keys();
												while (similarKeys.hasNext()) {
													String key = similarKeys.next();
													map.put(key, similarObject.get(key));
												}
												
												listmap1.add(map); // حالا map از نوع HashMap است
											}
											
											// چاپ لیست listmap1 برای بررسی
											System.out.println("Similar Movies: " + listmap1.toString());
										} else {
											System.out.println("کلید 'similar' در 'data' پیدا نشد.");
										}
										// بررسی وجود کلید "directors" در data
										if (dataObject.has("directors")) {
											JSONArray directorsArray = dataObject.getJSONArray("directors");
											
											// پاک کردن listmap1 قبل از افزودن داده‌ها
											listmap10.clear();
											
											// تبدیل JSONArray به لیست HashMap‌ها
											for (int i = 0; i < directorsArray.length(); i++) {
												JSONObject directorsObject = directorsArray.getJSONObject(i);
												HashMap<String, Object> map = new HashMap<>(); // به جای Map از HashMap استفاده کنید
												
												Iterator<String> directorsKeys = directorsObject.keys();
												while (directorsKeys.hasNext()) {
													String key = directorsKeys.next();
													map.put(key, directorsObject.get(key));
												}
												
												listmap10.add(map); // حالا map از نوع HashMap است
											}
											
											// چاپ لیست listmap1 برای بررسی
											System.out.println("directors Movies: " + listmap1.toString());
										} else {
											System.out.println("کلید 'directors' در 'data' پیدا نشد.");
										}
										// مرحله 6: بررسی وجود کلید "casts" (offer) در data
										try {
											if (dataObject.has("casts")) {
												JSONArray offerArray = dataObject.getJSONArray("casts");
												
												// پاک کردن listmap2 قبل از افزودن داده‌ها
												listmap2.clear();
												
												// تبدیل JSONArray به لیست HashMap‌ها
												for (int i = 0; i < offerArray.length(); i++) {
													JSONObject offerObject = offerArray.getJSONObject(i);
													HashMap<String, Object> map = new HashMap<>();
													
													Iterator<String> offerKeys = offerObject.keys();
													while (offerKeys.hasNext()) {
														String key = offerKeys.next();
														map.put(key, offerObject.get(key));
													}
													
													listmap2.add(map); // حالا map از نوع HashMap است
												}
												
												// چاپ لیست listmap2 برای بررسی
												System.out.println("Offer List: " + listmap2.toString());
											} else {
												System.out.println("کلید 'casts' در 'data' پیدا نشد.");
											}
										} catch (JSONException e) {
											e.printStackTrace();
											System.out.println("خطا در پردازش کلید 'casts': " + e.getMessage());
										}
										
									} else {
										System.out.println("کلید 'data' پیدا نشد.");
									}
									
								} catch (JSONException e) {
									e.printStackTrace();
									System.out.println("خطا در پردازش JSON: " + e.getMessage());
								} 
								listmap_season = new Gson().fromJson("[]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
								
								try {
									// مرحله 1: ایجاد آبجکت جیسون اصلی
									JSONObject jsonObject = new JSONObject(jsonString);
									
									// بررسی وجود کلید "data"
									if (jsonObject.has("data")) {
										JSONObject dataObject = jsonObject.getJSONObject("data");  // تعریف متغیر dataObject
										
										// چاپ محتویات dataObject برای اشکال‌زدایی
										System.out.println("Data Object: " + dataObject.toString());
										
										// مرحله 3: بررسی وجود کلید "season" در data
										try {
											if (dataObject.has("season")) {
												JSONObject seasonObject = dataObject.getJSONObject("season");
												
												// چاپ محتویات seasonObject برای اشکال‌زدایی
												System.out.println("Season Object: " + seasonObject.toString());
												
												// پیمایش تمام کلیدهای موجود در seasonObject
												Iterator<String> seasonKeys = seasonObject.keys();
												while (seasonKeys.hasNext()) {
													String seasonKey = seasonKeys.next();
													System.out.println("Season Key: " + seasonKey); // برای اشکال‌زدایی
													
													JSONArray seasonArray = seasonObject.getJSONArray(seasonKey);
													
													// چاپ آرایه فصل‌ها برای بررسی
													System.out.println("Season Array: " + seasonArray.toString());
													
													// شمارش تعداد فصل‌ها و ذخیره در متغیر season_duration
													int season_duration = seasonArray.length();
													System.out.println("Season Duration: " + season_duration);
													
													// بررسی اینکه آیا آرایه فصل‌ها خالی است
													if (season_duration > 0) {
														// حلقه برای دریافت تمام آیتم‌های آرایه‌ی فصل‌ها
														for (int i = 0; i < season_duration; i++) {
															JSONObject seasonItem = seasonArray.getJSONObject(i);
															
															// چاپ آبجکت هر فصل برای بررسی
															System.out.println("Season Object " + i + ": " + seasonItem.toString());
															
															HashMap<String, Object> seasonMap = new HashMap<>();
															
															Iterator<String> seasonItemKeys = seasonItem.keys();
															while (seasonItemKeys.hasNext()) {
																String key = seasonItemKeys.next();
																seasonMap.put(key, seasonItem.get(key));
															}
															
															// اضافه کردن فصل به لیست
															listmap_season.add(seasonMap);
														}
													} else {
														System.out.println("آرایه 'season' خالی است.");
													}
												}
												
												// چاپ داده‌های تمام فصل‌ها برای بررسی
												System.out.println("All Seasons: " + listmap_season.toString());
											} else {
												System.out.println("کلید 'season' در 'data' پیدا نشد.");
											}
										} catch (JSONException e) {
											e.printStackTrace();
											System.out.println("خطا در پردازش کلید 'season': " + e.getMessage());
										}
										
									} else {
										System.out.println("کلید 'data' پیدا نشد.");
									}
									
								} catch (JSONException e) {
									e.printStackTrace();
									System.out.println("خطا در پردازش JSON: " + e.getMessage());
								}
								qhesmat.setAdapter(new QhesmatAdapter(amoze));
								List<JSONObject> seasonList = new ArrayList<>(); // لیستی برای ذخیره آبجکت‌های جیسون فصل‌ها
								
								try {
									// مرحله 1: ایجاد آبجکت جیسون اصلی
									JSONObject jsonObject = new JSONObject(jsonString);
									
									// بررسی وجود کلید "data"
									if (jsonObject.has("data")) {
										JSONObject dataObject = jsonObject.getJSONObject("data");  // تعریف متغیر dataObject
										
										// بررسی وجود کلید "season" در data
										if (dataObject.has("season")) {
											JSONObject seasonObject = dataObject.getJSONObject("season");
											
											// پیمایش تمام کلیدهای موجود در seasonObject
											Iterator<String> seasonKeys = seasonObject.keys();
											while (seasonKeys.hasNext()) {
												String seasonKey = seasonKeys.next();
												
												// ساخت آبجکت جدید برای هر فصل
												JSONObject seasonJson = new JSONObject();
												seasonJson.put("season", seasonKey); // اضافه کردن شماره فصل
												
												// اضافه کردن به لیست
												seasonList.add(seasonJson);
											}
											
											// تبدیل لیست به JSONArray و چاپ آن
											JSONArray seasonArray = new JSONArray(seasonList);
											System.out.println(seasonArray.toString());
										} else {
											System.out.println("کلید 'season' در 'data' پیدا نشد.");
										}
									} else {
										System.out.println("کلید 'data' پیدا نشد.");
									}
									
								} catch (JSONException e) {
									e.printStackTrace();
									System.out.println("خطا در پردازش JSON: " + e.getMessage());
								}
								jsn = new Gson().toJson(seasonList);
								try {
									// پارس کردن رشته JSON ورودی به JSONArray
									JSONArray inputArray = new JSONArray(jsn);
									JSONArray outputArray = new JSONArray();
									
									// پیمایش آبجکت‌ها و اصلاح ساختار
									for (int i = 0; i < inputArray.length(); i++) {
										JSONObject originalObject = inputArray.getJSONObject(i);
										
										// بررسی وجود کلید "nameValuePairs"
										if (originalObject.has("nameValuePairs")) {
											JSONObject nameValuePairs = originalObject.getJSONObject("nameValuePairs");
											
											// ایجاد آبجکت جدید با ساختار دلخواه
											JSONObject newObject = new JSONObject();
											if (nameValuePairs.has("season")) {
												newObject.put("season", nameValuePairs.getString("season"));
											}
											
											// اضافه کردن به خروجی
											outputArray.put(newObject);
										}
									}
									
									// بازنویسی متغیر jsn با داده‌های جدید
									jsn = outputArray.toString();
									
									// چاپ نتیجه نهایی
									System.out.println("Updated JSON: " + jsn);
									
								} catch (JSONException e) {
									e.printStackTrace();
									System.out.println("خطا در پردازش JSON: " + e.getMessage());
								}
								seasonKeysList = new Gson().fromJson(jsn, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
								recyclerview6.setAdapter(new Recyclerview6Adapter(seasonKeysList));
								season = Double.parseDouble(seasonKeysList.get((int)0).get("season").toString());
								_change_text(String.valueOf((long)(Double.parseDouble(seasonKeysList.get((int)0).get("season").toString()))));
							}
							linear96.setVisibility(View.VISIBLE);
							massage.setVisibility(View.GONE);
						}
						try {
							name.setText(mpp.get("name_fa").toString());
							dasteh.setText(mpp.get("genre_fa").toString());
						} catch (Exception e) {
							
						}
						try {
							data.setText(String.valueOf((Integer) mpp.get("year")));
						} catch (Exception e) {
							
						}
						try {
							rate.setText(String.valueOf((double)mpp.get("rate")));
						} catch (Exception e) {
							rate.setText("N/A");
						}
						try {
							d3s = mpp.get("overview_fa").toString();
							descriptions = d3s;
							if (descriptions.length() > 200) {
								descriptions = descriptions.substring(0, 200);
							}
							description.setText(descriptions);
							if (d3s.equals(descriptions)) {
								imageview47.setVisibility(View.GONE);
							}
						} catch (Exception e) {
							
						}
						try {
							if (mpp.get("age").toString().equals("G")) {
								sen.setText("تمامی سنین");
							} else {
								if (mpp.get("age").toString().equals("PG")) {
									sen.setText("همراه والدین");
								} else {
									if (mpp.get("age").toString().equals("PG-13")) {
										sen.setText("+۱۳");
									} else {
										if (mpp.get("age").toString().equals("R")) {
											sen.setText("+۱۸");
										} else {
											if (mpp.get("age").toString().equals("X")) {
												sen.setText("بزرگسالان");
											} else {
												
											}
										}
									}
								}
							}
						} catch (Exception e) {
							
						}
						if (mpp.containsKey("upera")) {
							upera = true;
						} else {
							upera = false;
						}
						try {
							url_video = "";
							Glide.with(getApplicationContext())
							.load(save.getString("domain", "").concat("800&h=800&q=100&a=c&zc=1&src=https://cdn.upera.shop/s3/backdrops/").concat(mpp.get("backdrop").toString()))
							.placeholder(R.drawable.nul)
							.transform(new RoundedCorners(1))
							.transition(DrawableTransitionOptions.withCrossFade(350))
							.into(imageview2);
							Glide.with(getApplicationContext())
							.load(save.getString("domain", "").concat("50&h=50&q=100&a=c&zc=1&src=https://cdn.upera.shop/s3/backdrops/").concat(mpp.get("backdrop").toString()))
							.placeholder(R.drawable.nul)
							.transform(new RoundedCorners(1))
							.transition(DrawableTransitionOptions.withCrossFade(350))
							.into(imageview91);
							dooble.setText(String.valueOf((Integer) mpp.get("persian")));
						} catch (Exception e) {
							
						}
						if (dooble.getText().toString().equals("1")) {
							dooble.setText("دوبله فارسی");
						} else {
							dooble.setText("زیر نویس");
						}
						linear53.setVisibility(View.VISIBLE);
						linear53.setAlpha((float)(0.0d));
						_view_animation_fade();
						linear54.setVisibility(View.GONE);
						if (listmap2.size() == 0) {
							gridview_bazigran.setVisibility(View.GONE);
						} else {
							gridview_bazigran.setAdapter(new Gridview_bazigranAdapter(listmap2));
						}
						if (listmap10.size() == 0) {
							linear132.setVisibility(View.GONE);
						} else {
							recyclerview3.setAdapter(new Recyclerview3Adapter(listmap10));
						}
						if (listmapcharacters.size() == 0) {
							linear133.setVisibility(View.GONE);
						} else {
							recyclerview4.setAdapter(new Recyclerview4Adapter(listmapcharacters));
						}
						if (listmapwriters.size() == 0) {
							linear134.setVisibility(View.GONE);
						} else {
							recyclerview5.setAdapter(new Recyclerview5Adapter(listmapwriters));
						}
						offer.setAdapter(new OfferAdapter(listmap1));
						if (getIntent().getStringExtra("type").equals("movie")) {
							if (listmap1.size() == 0) {
								massage.setVisibility(View.VISIBLE);
							} else {
								massage.setVisibility(View.GONE);
							}
						}
						massage.setText("محتوایی یافت نشد.!");
					}
				} catch (Exception e) {
					SketchwareUtil.showMessage(getApplicationContext(), "خطا غیر منتظره!");
				}
				try {
					if (getIntent().hasExtra("my")) {
						upera = false;
						if (getIntent().getStringExtra("image").toString().trim().startsWith("http")) {
							Glide.with(getApplicationContext())
							.load(getIntent().getStringExtra("image"))
							.placeholder(R.drawable.lino)
							.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
							.transition(DrawableTransitionOptions.withCrossFade(350))
							.into(profile);
							img = getIntent().getStringExtra("backdrop");
							Glide.with(getApplicationContext())
							.load(img)
							.placeholder(R.drawable.lino)
							.transform(new RoundedCorners(1))
							.transition(DrawableTransitionOptions.withCrossFade(350))
							.into(imageview2);
						} else {
							Glide.with(getApplicationContext())
							.load(save.getString("domain", "").concat("800&h=800&q=100&a=c&zc=1&src=https://cdn.upera.shop/s3/posters/").concat(getIntent().getStringExtra("image")))
							.placeholder(R.drawable.lino)
							.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
							.transition(DrawableTransitionOptions.withCrossFade(350))
							.into(profile);
							img = save.getString("domain", "").concat("800&h=800&q=100&a=c&zc=1&src=https://cdn.upera.shop/s3/backdrops/").concat(getIntent().getStringExtra("backdrop"));
							Glide.with(getApplicationContext())
							.load(img)
							.placeholder(R.drawable.lino)
							.transform(new RoundedCorners(1))
							.transition(DrawableTransitionOptions.withCrossFade(350))
							.into(imageview2);
						}
						_vpn();
						if (vpn()) {
							
						} else {
							headers = new HashMap<>();
							headers.put("X-API-Key", "mobile_app_v1_8x7k9Lm2");
							headers.put("Content-Type", "application/json");
							s = new HashMap<>();
							s.put("uid", String.valueOf((long)(Double.parseDouble(getIntent().getStringExtra("id")))));
							GetCastsANDsimilar.setHeaders(headers);
							GetCastsANDsimilar.setParams(s, RequestNetworkController.REQUEST_BODY);
							GetCastsANDsimilar.startRequestNetwork(RequestNetworkController.POST, "https://".concat(save.getString("site", "").concat("/zakfilm.ir/app/GETdata_list_app_castORsimilar.php")), "", _GetCastsANDsimilar_request_listener);
							s = new HashMap<>();
							s.put("id", String.valueOf((long)(Double.parseDouble(getIntent().getStringExtra("id")))));
							GetMovie.setHeaders(headers);
							GetMovie.setParams(s, RequestNetworkController.REQUEST_BODY);
							GetMovie.startRequestNetwork(RequestNetworkController.POST, "https://".concat(save.getString("site", "").concat("/zakfilm.ir/app/getINFOapp.php")), "", _GetMovie_request_listener);
						}
					} else {
						
					}
					check_get = true;
				} catch (Exception e) {
					SketchwareUtil.showMessage(getApplicationContext(), "خطا غیر منتظره۰۰۱۲!");
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				get.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/".concat(getIntent().getStringExtra("type").concat("/".concat(getIntent().getStringExtra("id")))), "", _get_request_listener);
			}
		};
		
		_get_com_request_listener = new RequestNetwork.RequestListener() {
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
					
					// مرحله 3: دریافت آرایه "comments" از داخل "data"
					JSONArray commentsArray = dataObject.getJSONArray("comments");
					
					// لیست مپ برای ذخیره داده‌ها
					com.clear(); // ابتدا لیست را پاک می‌کنیم
					
					// مرحله 4: حلقه روی آرایه جیسون و اضافه کردن به ListMap
					for (int i = 0; i < commentsArray.length(); i++) {
						// دریافت هر آیتم از آرایه به عنوان آبجکت جیسون
						JSONObject item = commentsArray.getJSONObject(i);
						
						// تبدیل آبجکت جیسون به Map (لیست مپ)
						HashMap<String, Object> map = new HashMap<>();
						
						// اضافه کردن هر کلید-مقدار از آبجکت جیسون به Map
						Iterator<String> keys = item.keys();
						while (keys.hasNext()) {
							String key = keys.next();
							map.put(key, item.get(key));
						}
						
						// اضافه کردن Map به listmap1
						com.add(map);
					}
					
				} catch (JSONException e) {
					e.printStackTrace();
				}
				if (com.size() == 0) {
					
				} else {
					
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_pishnhad_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				// فرض می‌شود که _response حاوی JSON باشد
				String jsonString = _response;
				
				try {
					JSONObject jsonObject = new JSONObject(jsonString);
					JSONObject dataObject = jsonObject.getJSONObject("data");
					JSONObject listObject = dataObject.getJSONObject("list");
					JSONArray dataArray = listObject.getJSONArray("data");
					
					dasteh_pish.clear(); // پاک کردن لیست قبلی
					
					// فقط ۱۰ آیتم اضافه شود
					int limit = Math.min(dataArray.length(), 12);
					
					for (int i = 0; i < limit; i++) {
						JSONObject item = dataArray.getJSONObject(i);
						HashMap<String, Object> map = new HashMap<>();
						
						Iterator<String> keys = item.keys();
						while (keys.hasNext()) {
							String key = keys.next();
							map.put(key, item.get(key));
						}
						
						dasteh_pish.add(map);
					}
					
				} catch (JSONException e) {
					e.printStackTrace();
				}
				
				pishnahadi.setAdapter(new PishnahadiAdapter(dasteh_pish));
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				pishnhad.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/hot?country=noIR&sortby=newest", "", _pishnhad_request_listener);
			}
		};
		
		_GetMovie_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try {
					mpp = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
					if (mpp.get("state").toString().equals("true")) {
						mpp = new Gson().fromJson((new Gson()).toJson(mpp.get("data")), new TypeToken<HashMap<String, Object>>(){}.getType());
					}
				} catch (Exception e) {
					SketchwareUtil.showMessage(getApplicationContext(), "خطا!");
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", _response));
				}
				try {
					name.setText(mpp.get("name_fa").toString());
					dasteh.setText(mpp.get("genre").toString());
				} catch (Exception e) {
					
				}
				try {
					data.setText(String.valueOf((Integer) mpp.get("year")));
				} catch (Exception e) {
					
				}
				try {
					rate.setText(String.valueOf(Double.parseDouble(mpp.get("rate").toString())));
				} catch (Exception e) {
					rate.setText("N/A");
				}
				try {
					data.setText(String.valueOf((long)(Double.parseDouble(mpp.get("year").toString()))));
				} catch (Exception e) {
					
				}
				try {
					d3s = mpp.get("overview_fa").toString();
					descriptions = d3s;
					if (descriptions.length() > 200) {
						descriptions = descriptions.substring(0, 200);
					}
					description.setText(descriptions);
					if (d3s.equals(descriptions)) {
						imageview47.setVisibility(View.GONE);
					}
				} catch (Exception e) {
					
				}
				try {
					if (mpp.get("age").toString().equals("G")) {
						sen.setText("تمامی سنین");
					} else {
						if (mpp.get("age").toString().equals("PG")) {
							sen.setText("همراه والدین");
						} else {
							if (mpp.get("age").toString().equals("PG-13")) {
								sen.setText("+۱۳");
							} else {
								if (mpp.get("age").toString().equals("R")) {
									sen.setText("+۱۸");
								} else {
									if (mpp.get("age").toString().equals("X")) {
										sen.setText("بزرگسالان");
									} else {
										sen.setText("+۱۳");
									}
								}
							}
						}
					}
				} catch (Exception e) {
					
				}
				try {
					if (String.valueOf((long)(Double.parseDouble(mpp.get("persian").toString()))).equals("1")) {
						dooble.setText("دوبله فارسی");
					} else {
						dooble.setText("زیر نویس");
					}
				} catch (Exception e) {
					
				}
				try {
					mop = new Gson().fromJson((new Gson()).toJson(mpp.get("files")), new TypeToken<HashMap<String, Object>>(){}.getType());
					list_qulity = new Gson().fromJson((new Gson()).toJson(mop.get("mp4")), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
				} catch (Exception e) {
					
				}
				check_get = true;
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_GetCastsANDsimilar_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				map = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
				if ((boolean)map.get("state")) {
					map = new Gson().fromJson((new Gson()).toJson(map.get("data")), new TypeToken<HashMap<String, Object>>(){}.getType());
					try {
						listmap2 = new Gson().fromJson((new Gson()).toJson(map.get("casts")), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
						gridview_bazigran.setAdapter(new Gridview_bazigranAdapter(listmap2));
					} catch (Exception e) {
						
					}
					try {
						listmap1 = new Gson().fromJson((new Gson()).toJson(map.get("similars")), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
						offer.setAdapter(new OfferAdapter(listmap1));
					} catch (Exception e) {
						
					}
					_offerVisible();
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
		_get_theme_l_color();
		qhesmat.setLayoutManager(new LinearLayoutManager(this));
		qhesmat.setExpanded(true);
		qhesmat.setNestedScrollingEnabled(false);
		offer.setExpanded(true);
		offer.setNestedScrollingEnabled(false);
		gridview_bazigran.setExpanded(true);
		gridview_bazigran.setNestedScrollingEnabled(false);
		pishnahadi.setExpanded(true);
		pishnahadi.setNestedScrollingEnabled(false);
		// تنظیم LayoutManager به صورت گرید با 3 ستون
		GridLayoutManager layoutManager = new GridLayoutManager(ViewActivity.this, 3);
		offer.setLayoutManager(layoutManager);
		// تنظیم LayoutManager به صورت گرید با 3 ستون
		GridLayoutManager layoutManager1 = new GridLayoutManager(ViewActivity.this, 3);
		gridview_bazigran.setLayoutManager(layoutManager1);
		// تنظیم LayoutManager به صورت گرید با 3 ستون
		GridLayoutManager layoutManager3 = new GridLayoutManager(ViewActivity.this, 3);
		pishnahadi.setLayoutManager(layoutManager3);
		if (!getIntent().hasExtra("my")) {
			imageview92.setVisibility(View.GONE);
		}
		Glide.with(getApplicationContext()).load(Uri.parse("https://fox-filme.ir/zakfilm.ir/upload/ad_banner/ad.png")).into(imageview93);
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
		_check();
		_getData();
		_vpn();
		if (vpn()) {
			to.setClass(getApplicationContext(), ErrorActivity.class);
			startActivity(to);
			ViewActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
		} else {
			
		}
		Glide.with(getApplicationContext()).load(Uri.parse("https://fox-filme.ir/zakfilm.ir/upload/ad_banner/ad.png")).into(imageview93);
	}
	
	@Override
	public void onBackPressed() {
		finish();
		overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		_get_theme_l_color();
		if (!save.contains("ss000")) {
			save.edit().putString("ss000", "").commit();
			/*"انیمیشن راهنمایی بخش نشان دهنده، که فیلم را نشان کنن"*/
			timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							new GuideView.Builder(ViewActivity. this)
							.setTitle("فیلم رو نشان بزن ، که گمش نکنی 🦊")
							.setContentText("فیلم را به لیست نشان‌شده‌ها اضافه کنید تا بعداً به‌راحتی آن را پیدا کرده و تماشا کنید. تمامی فیلم‌های نشان‌شده در بخش «نشان شده» در دسترس خواهند بود.")
							.setTargetView(l_save)
							.setContentTextSize(12)//optional
							.setTitleTextSize(16)//optional
							.setDismissType(DismissType.anywhere)
							.setGuideListener(new GuideListener() {
								@Override public void onDismiss(View view) { //TODO ...
									
								} })
							.build()
							.show();
						}
					});
				}
			};
			_timer.schedule(timer, (int)(2000));
		}
		color = save.getString("theme", "");
		for(int _repeat14 = 0; _repeat14 < (int)(4); _repeat14++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("", "");
				fi_lis.add(_item);
			}
		}
		viewpager1.setAdapter(new Viewpager1Adapter(fi_lis));
		try {
			Glide.with(getApplicationContext())
			.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=90&src=https://s35.upera.net/s3/posters/".concat(getIntent().getStringExtra("image")))))))
			.placeholder(R.drawable.lino)
			.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
			.transition(DrawableTransitionOptions.withCrossFade(350))
			.into(profile);
			Glide.with(getApplicationContext())
			.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=90&src=https://s35.upera.net/s3/posters/".concat(getIntent().getStringExtra("image")))))))
			.placeholder(R.drawable.lino)
			.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
			.transition(DrawableTransitionOptions.withCrossFade(350))
			.into(imageview91);
			img = save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=90&src=https://s35.upera.net/s3/posters/".concat(getIntent().getStringExtra("image"))))));
		} catch (Exception e) {
			
		}
		try {
			dasteh.setText(getIntent().getStringExtra("dasteh"));
			name.setText(getIntent().getStringExtra("name"));
			textview47.setText(getIntent().getStringExtra("name"));
		} catch (Exception e) {
			
		}
		linear53.setVisibility(View.GONE);
		// گرفتن SharedPreferences
		SharedPreferences sharedPreferences = getSharedPreferences("save", MODE_PRIVATE);
		
		// گرفتن رشته رنگ با کلید "theme" (مثل "#533010")
		String colorCode = sharedPreferences.getString("theme", "#FF8E2D"); // مقدار پیش‌فرض اگر وجود نداشت
		
		// اعمال رنگ به ProgressBar
		progressbar1.getProgressDrawable().setColorFilter(
		Color.parseColor(colorCode),
		PorterDuff.Mode.SRC_IN
		);
		_ui();
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						try {
							timer.cancel();
						} catch (Exception e) {
							
						}
						string20 = getIntent().getStringExtra("id");
						add_save = new Gson().fromJson(saved_video.getString("saved_video", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
						boolean found = false;
						int position = -1; // متغیری برای ذخیره موقعیت آیتم در لیست
						
						for (int i = 0; i < add_save.size(); i++) {
							HashMap<String, Object> item = add_save.get(i);
							if (item.get("id").toString().equals(string20)) {
								found = true;
								position = i; // ذخیره موقعیت آیتم
								break; // وقتی پیدا شد، جستجو متوقف می‌شود
							}
						}
						
						if (found) {
							strings_position = String.valueOf(position); // تنظیم موقعیت به عنوان رشته
							
							imageview43.setImageResource(R.drawable.tfr_2);
							moojod = 1;
						} else {
							
							imageview43.setImageResource(R.drawable.tfr_1);
							moojod = 0;
						}
						get.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/".concat(getIntent().getStringExtra("type").concat("/".concat(getIntent().getStringExtra("id")))), "", _get_request_listener);
						pishnhad.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/hot?country=noIR&sortby=newest", "", _pishnhad_request_listener);
						//Check if ADM install
						PackageManager packageManager = getApplicationContext().getPackageManager();
						try {
							packageManager.getPackageInfo("com.dv.adm", PackageManager.GET_ACTIVITIES);
							isAppInstalled = true;
						} catch (PackageManager.NameNotFoundException e) {
							isAppInstalled = false;
						}
					}
				});
			}
		};
		_timer.schedule(timer, (int)(200));
		check_get = false;
		int startValue = 300;
		int endValue = 500;
		vscroll1.setOnScrollChangeListener(new View.OnScrollChangeListener() {
			@Override
			public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
				
				int currentValue = scrollY;
				
				if (currentValue < startValue) {
					button1.setAlpha(0f);
					button1.setVisibility(View.GONE);
					
				} else if (currentValue <= endValue) {
					
					float progress = (float)(currentValue - startValue) / (endValue - startValue);
					button1.setAlpha(progress);
					button1.setVisibility(View.VISIBLE);
					
				} else {
					button1.setAlpha(1f);
				}
			}
		});
		
		if (dast_pish.contains("dast_pish")) {
			dasteh_pish = new Gson().fromJson(dast_pish.getString("dast_pish", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		} else {
			dast_pish.edit().putString("dast_pish", "[]").commit();
			dasteh_pish = new Gson().fromJson("[]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		}
		OverScrollDecoratorHelper.setUpOverScroll(vscroll1);
		_check();
		_getData();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		try {
			timer.cancel();
		} catch (Exception e) {
			
		}
		try {
			t.cancel();
		} catch (Exception e) {
			
		}
	}
	public void _ui() {
		_tab();
		name.setShadowLayer(15, 0, 0, Color.BLACK);
		dasteh.setShadowLayer(9, 2, 2, Color.parseColor("#000000"));
		textview1.setShadowLayer(9, 2, 2, Color.parseColor("#000000"));
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
			Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);}
		getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN); if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { getWindow().setStatusBarColor(Color.TRANSPARENT); }
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF0f1620".replace("0xFF" , "#")));
		}
		getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		BlurUtil.applyBlur(getApplicationContext(), linear206, 100f);
		relativelayout5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0x50FFFFFF));
		_rippleRoundStroke(linear6, "#20ffffff", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getApplicationContext(), (int)(1.5d)), "#50ffffff");
		_rippleRoundStroke(button1, "#20ffffff", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getApplicationContext(), (int)(1.5d)), "#50ffffff");
		_rippleRoundStroke(linear85, "#20ffffff", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getApplicationContext(), (int)(1.5d)), "#50ffffff");
		_removeScollBar(vscroll1);
		linear63.setBackgroundColor(0x99000000);
		recyclerview3.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
		recyclerview4.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
		recyclerview5.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
		recyclerview6.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
		_ColourFilter(imageview30, save.getString("theme", ""));
		_ColourFilter(imageview24, save.getString("theme", ""));
		_ColourFilter(imageview16, save.getString("theme", ""));
		_ColourFilter(imageview42, "#ffffff");
		_ColourFilter(imageview43, "#ffffff");
		_ColourFilter(imageview44, "#ffffff");
		_ColourFilter(imageview45, "#ffffff");
		_ColourFilter(imageview46, "#ffffff");
		l_share.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		l_like.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		l_download.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		l_save.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		l_report.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		l_imdb.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(7.5d)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		l_dooble.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(7.5d)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		l_date.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(7.5d)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		l_sen.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(7.5d)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		linear216.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(7.5d)), 0xFFFFC400));
		_GradientDrawable(linear209, SketchwareUtil.getDip(getApplicationContext(), (int)(7.5d)), 0, 0, l_color, "#000000", false, false, 0);
		_GradientDrawable(linear212, SketchwareUtil.getDip(getApplicationContext(), (int)(7.5d)), 0, 0, l_color, "#000000", false, false, 0);
		_GradientDrawable(linear220, SketchwareUtil.getDip(getApplicationContext(), (int)(7.5d)), 0, 0, l_color, "#000000", false, false, 0);
		linear221.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		_setMargin(massage, 0, 0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(999)));
		button1.setAlpha((float)(0.0d));
		cardview3.setCardBackgroundColor(Color.TRANSPARENT);
		cardview3.setRadius((float)SketchwareUtil.getDip(getApplicationContext(), (int)(15)));
		cardview3.setCardElevation((float)0);
		textview116.setTextColor(Color.parseColor(save.getString("theme", "")));
		textview117.setTextColor(Color.parseColor(save.getString("theme", "")));
		textview118.setTextColor(Color.parseColor(save.getString("theme", "")));
		textview119.setTextColor(Color.parseColor(save.getString("theme", "")));
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
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _clickAnimation(final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
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
	
	
	public void _view_animation_fade() {
		an_v.setTarget(linear53);
		an_v.setPropertyName("alpha");
		an_v.setFloatValues((float)(1.0d));
		an_v.setDuration((int)(300));
		an_v.start();
		an_i.setPropertyName("alpha");
		an_i.setFloatValues((float)(1.0d));
		an_i.setDuration((int)(300));
		an_i.start();
	}
	
	
	public void _telegramLoaderDialog(final boolean _visibility) {
		if (_visibility) {
			// در متد ایجاد دیالوگ
			load = new AlertDialog.Builder(ViewActivity.this).create();
			LayoutInflater loadLI = getLayoutInflater();
			View loadCV = loadLI.inflate(R.layout.loading, null);
			load.setView(loadCV);
			final LinearLayout dia = (LinearLayout)
			loadCV.findViewById(R.id.linear3);
			final LinearLayout linear2 = (LinearLayout)
			loadCV.findViewById(R.id.linear2);
			final LinearLayout back = (LinearLayout)
			loadCV.findViewById(R.id.background);
			final TextView cancel = (TextView)
			loadCV.findViewById(R.id.textview4);
			final TextView next = (TextView)
			loadCV.findViewById(R.id.textview3);
			load.setCancelable(true);
			load.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
			load.show();
			dia.setVisibility(View.GONE);
			dia.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF1D2733));
			linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF1D2733));
			back.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					if (dia.getVisibility() == View.VISIBLE) {
						dia.setVisibility(View.GONE);
						linear2.setVisibility(View.VISIBLE);
					} else {
						dia.setVisibility(View.VISIBLE);
						linear2.setVisibility(View.GONE);
					}
				}
			});
			cancel.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					cancable_dialog_loader = true;
					load.dismiss();
				}
			});
			next.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					dia.setVisibility(View.GONE);
					linear2.setVisibility(View.VISIBLE);
				}
			});
			// اضافه کردن listener برای زمانی که کاربر قصد لغو دارد
			load.setOnDismissListener(new DialogInterface.OnDismissListener() {
				@Override
				public void onDismiss(DialogInterface dialogInterface) {
					// انجام فعالیت
					
					if (cancable_dialog_loader) {
						cancable_dialog_loader = false;
						load.dismiss();
					} else {
						if (dia.getVisibility() == View.VISIBLE) {
							dia.setVisibility(View.GONE);
							linear2.setVisibility(View.VISIBLE);
						} else {
							dia.setVisibility(View.VISIBLE);
							linear2.setVisibility(View.GONE);
						}
						load.show();
					}
				}
			});
		} else {
			cancable_dialog_loader = true;
			if (load != null && load.isShowing()) {
				load.dismiss();
			}
		}
	}
	
	
	public void _alpah_click(final View _view) {
		
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
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
	
	
	public void _animation_zero_0(final View _view) {
		anx.cancel();
		any.cancel();
		anx.setTarget(_view);
		anx.setPropertyName("scaleX");
		anx.setFloatValues((float)(1.0d));
		anx.setDuration((int)(300));
		anx.start();
		any.setTarget(_view);
		any.setPropertyName("scaleY");
		any.setFloatValues((float)(1.0d));
		any.setDuration((int)(300));
		any.start();
	}
	
	
	public void _animaltion_click_view(final View _view) {
		bv.vibrate((long)(80));
		anx.setTarget(_view);
		anx.setPropertyName("scaleX");
		anx.setFloatValues((float)(0.9d));
		anx.setDuration((int)(300));
		anx.start();
		any.setTarget(_view);
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
						_animation_zero_0(_view);
					}
				});
			}
		};
		_timer.schedule(t, (int)(300));
	}
	
	
	public void _tab() {
		_color_tab();
		massage.setVisibility(View.GONE);
		linear96.setVisibility(View.GONE);
		linear225.setVisibility(View.GONE);
		if (getIntent().getStringExtra("type").equals("movie")) {
			_rippleRoundStroke(linear224, l_color, "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0, "#50ffffff");
		} else {
			linear225.setVisibility(View.VISIBLE);
			linear96.setVisibility(View.VISIBLE);
			_rippleRoundStroke(linear225, l_color, "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0, "#50ffffff");
		}
	}
	
	
	public void _change_text(final String _text) {
		recyclerview6.getAdapter().notifyDataSetChanged();
		ArrayList<HashMap<String, Object>> amoze = new ArrayList<>(listmap_season.stream()
		.filter(map -> map.containsKey("season_number"))
		.filter(map -> map.get("season_number").toString().equalsIgnoreCase(_text))
		.collect(Collectors.toList()));
		
		
		qhesmat.setAdapter(new QhesmatAdapter(amoze));
	}
	
	
	public void _download(final String _upera, final String _quality, final String _language) {
		guality = "480";
		if (getIntent().hasExtra("my")) {
			if (link_dl.isEmpty()) {
				link_dl = list_qulity.get((int)0).get("url").toString();
			}
		}
		load = new AlertDialog.Builder(ViewActivity.this).create();
		LayoutInflater loadLI = getLayoutInflater();
		View loadCV = (View) loadLI.inflate(R.layout.download, null);
		load.setView(loadCV);
		final androidx.cardview.widget.CardView cardview2 = (androidx.cardview.widget.CardView)
		loadCV.findViewById(R.id.cardview2);
		final androidx.cardview.widget.CardView cardview1 = (androidx.cardview.widget.CardView)
		loadCV.findViewById(R.id.cardview1);
		final ImageView background = (ImageView)
		loadCV.findViewById(R.id.background);
		final ImageView poster = (ImageView)
		loadCV.findViewById(R.id.poster);
		final LinearLayout l1080 = (LinearLayout)
		loadCV.findViewById(R.id.l1080);
		final LinearLayout l720 = (LinearLayout)
		loadCV.findViewById(R.id.l720);
		final LinearLayout l480 = (LinearLayout)
		loadCV.findViewById(R.id.l480);
		final LinearLayout dl_0 = (LinearLayout)
		loadCV.findViewById(R.id.dl_0);
		final LinearLayout dl_1 = (LinearLayout)
		loadCV.findViewById(R.id.dl_1);
		final LinearLayout btn_start = (LinearLayout)
		loadCV.findViewById(R.id.btn_start);
		final TextView title = (TextView)
		loadCV.findViewById(R.id.title);
		final LinearLayout linear6 = (LinearLayout)
		loadCV.findViewById(R.id.linear6);
		final TextView size_1080 = (TextView)
		loadCV.findViewById(R.id.size_1080);
		final TextView size_720 = (TextView)
		loadCV.findViewById(R.id.size_720);
		final TextView size_480 = (TextView)
		loadCV.findViewById(R.id.size_480);
		final LinearLayout linear11 = (LinearLayout)
		loadCV.findViewById(R.id.linear11);
		final LinearLayout linear14 = (LinearLayout)
		loadCV.findViewById(R.id.linear14);
		final LinearLayout linear17 = (LinearLayout)
		loadCV.findViewById(R.id.linear17);
		final LinearLayout linear22 = (LinearLayout)
		loadCV.findViewById(R.id.linear22);
		final androidx.recyclerview.widget.RecyclerView recyclerview1 = (androidx.recyclerview.widget.RecyclerView)
		loadCV.findViewById(R.id.recyclerview1);
		final TextView textview11 = (TextView)
		loadCV.findViewById(R.id.textview11);
		l1080.setVisibility(View.GONE);
		l720.setVisibility(View.GONE);
		l480.setVisibility(View.GONE);
		size_1080.setVisibility(View.GONE);
		size_720.setVisibility(View.GONE);
		size_480.setVisibility(View.GONE);
		Glide.with(getApplicationContext())
		.load(_quality)
		.placeholder(R.drawable.shadertop)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
		.into(background);
		if (getIntent().hasExtra("my")) {
			if (mpp.get("poster").toString().toString().trim().startsWith("http")) {
				Glide.with(getApplicationContext())
				.load(mpp.get("poster").toString())
				.placeholder(R.drawable.nul)
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
				.into(poster);
			} else {
				Glide.with(getApplicationContext())
				.load(save.getString("domain", "").concat("207&h=250&q=40".concat("&src=https://s35.upera.net/s3/posters/".concat(mpp.get("poster").toString()))))
				.placeholder(R.drawable.nul)
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
				.into(poster);
			}
		} else {
			Glide.with(getApplicationContext())
			.load(save.getString("domain", "").concat("207&h=250&q=40".concat("&src=https://s35.upera.net/s3/posters/".concat(getIntent().getStringExtra("image")))))
			.placeholder(R.drawable.nul)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
			.into(poster);
		}
		title.setText(name.getText().toString());
		textview11.setText("بلیط دانلود: ".concat(save.getString("blit", "")));
		l1080.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
		l720.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
		l480.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFF4C4F56));
		dl_0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFF4C4F56));
		dl_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
		_rippleRoundStroke(btn_start, save.getString("theme", ""), "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0, "#000000");
		size_1080.setTextColor(Color.parseColor(save.getString("theme", "")));
		size_720.setTextColor(Color.parseColor(save.getString("theme", "")));
		size_480.setTextColor(Color.parseColor(save.getString("theme", "")));
		linear14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFFFFFFFF));
		linear17.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFFFFFFFF));
		linear22.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFFFFFFFF));
		textview11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0x60FFC107));
		cardview2.setCardBackgroundColor(0xFF0F1620);
		cardview2.setRadius((float)SketchwareUtil.getDip(getApplicationContext(), (int)(13)));
		cardview2.setCardElevation((float)SketchwareUtil.getDip(getApplicationContext(), (int)(30)));
		cardview1.setCardBackgroundColor(0xFF0F1620);
		cardview1.setRadius((float)SketchwareUtil.getDip(getApplicationContext(), (int)(8)));
		cardview1.setCardElevation((float)0);
		linear6.setBackgroundColor(0x99000000);
		load.setCancelable(true);
		load.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		load.show();
		sizem1 = "https://relfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat("1080".concat(".mp4".concat("?ref=tvAd")))));
		new Thread(new Runnable() {
			@Override
			public void run() {
				// دریافت اندازه فایل
				final long size = G.getFileSizeFromURL(sizem1);
				final double sizeGB = size / (1024.0 * 1024 * 1024);
				final long sizeMB = size / (1024 * 1024);
				
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						String sizeText;
						if (sizeGB >= 1) {
							if (sizeGB == (long) sizeGB) {
								sizeText = String.format("%d GB", (long) sizeGB); // عدد رند
							} else {
								sizeText = String.format("%.1f GB", sizeGB); // اعشار یک رقمی
							}
						} else {
							sizeText = sizeMB + " MB";
						}
						size_1080.setText(sizeText);
						if (!size_1080.getText().toString().equals("0 MB")) {
							size_1080.setVisibility(View.VISIBLE);
							l1080.setVisibility(View.VISIBLE);
						}
						_TransitionManager(linear11, 300);
					}
				});
			}
		}).start();
		
		sizem = "https://relfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat("720".concat(".mp4".concat("?ref=tvAd")))));
		new Thread(new Runnable() {
			@Override
			public void run() {
				// دریافت اندازه فایل
				final long size = G.getFileSizeFromURL(sizem);
				final double sizeGB = size / (1024.0 * 1024 * 1024);
				final long sizeMB = size / (1024 * 1024);
				
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						String sizeText;
						if (sizeGB >= 1) {
							if (sizeGB == (long) sizeGB) {
								sizeText = String.format("%d GB", (long) sizeGB); // عدد رند
							} else {
								sizeText = String.format("%.1f GB", sizeGB); // اعشار یک رقمی
							}
						} else {
							sizeText = sizeMB + " MB";
						}
						size_720.setText(sizeText);
						
						if (!size_720.getText().toString().equals("0 MB")) {
							size_720.setVisibility(View.VISIBLE);
							l720.setVisibility(View.VISIBLE);
						}
						_TransitionManager(linear11, 300);
					}
				});
			}
		}).start();
		sizem2 = "https://relfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat("480".concat(".mp4".concat("?ref=tvAd")))));
		new Thread(new Runnable() {
			@Override
			public void run() {
				// دریافت اندازه فایل
				final long size = G.getFileSizeFromURL(sizem2);
				final double sizeGB = size / (1024.0 * 1024 * 1024);
				final long sizeMB = size / (1024 * 1024);
				
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						String sizeText;
						if (sizeGB >= 1) {
							if (sizeGB == (long) sizeGB) {
								sizeText = String.format("%d GB", (long) sizeGB); // عدد رند
							} else {
								sizeText = String.format("%.1f GB", sizeGB); // اعشار یک رقمی
							}
						} else {
							sizeText = sizeMB + " MB";
						}
						size_480.setText(sizeText);
						
						if (!size_480.getText().toString().equals("0 MB")) {
							size_480.setVisibility(View.VISIBLE);
							l480.setVisibility(View.VISIBLE);
						}
						_TransitionManager(linear11, 300);
					}
				});
			}
		}).start();
		if (type_dl == 0) {
			dl_0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFF4C4F56));
			dl_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
		} else {
			dl_0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
			dl_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFF4C4F56));
		}
		l1080.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				l1080.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFF4C4F56));
				l720.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				l480.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				guality = "1080";
			}
		});
		l720.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				l1080.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				l720.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFF4C4F56));
				l480.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				guality = "720";
			}
		});
		l480.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				l1080.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				l720.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				l480.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFF4C4F56));
				guality = "480";
			}
		});
		dl_0.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				dl_0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFF4C4F56));
				dl_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				type_dl = 0;
			}
		});
		dl_1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				dl_0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				dl_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFF4C4F56));
				type_dl = 1;
			}
		});
		btn_start.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				if (gold.getString("gold", "").equals("dghdhegejzy6e728274")) {
					download_check = true;
				} else {
					if ((Double.parseDouble(save.getString("blit", "")) == 0) || (0 > Double.parseDouble(save.getString("blit", "")))) {
						_dialog_esh();
						save.edit().putString("blit", "0").commit();
					} else {
						save.edit().putString("blit", String.valueOf((long)(Double.parseDouble(save.getString("blit", "")) - 1))).commit();
						download_check = true;
					}
				}
				if (download_check) {
					download_check = false;
					load.dismiss();
					if (type_dl == 0) {
						if (getIntent().hasExtra("my")) {
							_download_notificationi(link_dl, "/Download".concat("/"), name.getText().toString().concat(_upera).concat(".".concat("mp4")));
						} else {
							_download_notificationi("https://relfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat(guality.concat(".mp4".concat("?ref=tvAd"))))), "/Download".concat("/"), name.getText().toString().concat(_upera).concat(".".concat("mp4")));
						}
						bv.vibrate((long)(100));
						SketchwareUtil.showMessage(getApplicationContext(), "شروع دانلود...");
					} else {
						if (getIntent().hasExtra("my")) {
							url = link_dl;
							filen = link_dl;
						} else {
							url = "https://relfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat(guality.concat(".mp4".concat("?ref=tvAd"))))).concat("");
							filen = "https://relfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat(guality.concat(".mp4".concat("?ref=tvAd"))))).concat(".".concat("mp4"));
						}
						try {
							Intent intent = new Intent(Intent.ACTION_VIEW);
							intent.setClassName("com.dv.adm", "com.dv.adm.AEditor");
							intent.putExtra("com.android.browser.application_id", getApplicationContext().getPackageName());
							intent.setData(Uri.parse(url));
							intent.putExtra("com.dv.adm.filename", filen);
							startActivity(intent);
						} catch (ActivityNotFoundException e) {
							e.printStackTrace();
							
							SketchwareUtil.showMessage(getApplicationContext(), "لطفا برنامه adm را در گوشی خود نصب کنید");
						}
					}
				}
			}
		});
		linear14.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				if (gold.getString("gold", "").equals("dghdhegejzy6e728274")) {
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", sizem1));
					SketchwareUtil.showMessage(getApplicationContext(), "لینک کیفیت 1080p دانلود مستقیم کپی شد.");
					vib.vibrate((long)(100));
				} else {
					
				}
			}
		});
		linear17.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				if (gold.getString("gold", "").equals("dghdhegejzy6e728274")) {
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", sizem));
					SketchwareUtil.showMessage(getApplicationContext(), "لینک کیفیت 720p دانلود مستقیم کپی شد.");
					vib.vibrate((long)(100));
				} else {
					
				}
			}
		});
		linear22.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				if (gold.getString("gold", "").equals("dghdhegejzy6e728274")) {
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", sizem2));
					SketchwareUtil.showMessage(getApplicationContext(), "لینک کیفیت 480p دانلود مستقیم کپی شد.");
					vib.vibrate((long)(100));
				} else {
					
				}
			}
		});
		Myrecyclerview1_0Adapter adapter = new Myrecyclerview1_0Adapter(list_qulity, load);
		recyclerview1.setAdapter(adapter);
		recyclerview1.setLayoutManager(new LinearLayoutManager(ViewActivity.this));
	}
	
	
	public void _download_notificationi(final String _url, final String _path, final String _name) {
		ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		
		Network network = cm.getActiveNetwork();
		
		if (network == null) {
			showMessage("اتصال اینترنت برقرار نیست.");
			return;
		}
		
		NetworkCapabilities capabilities = cm.getNetworkCapabilities(network);
		
		if (capabilities != null &&
		capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)) {
			
			try {
				
				DownloadManager.Request request = new DownloadManager.Request(Uri.parse(_url));
				
				request.setTitle(_name);
				request.setDescription("در حال دانلود...");
				request.setNotificationVisibility(
				DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				
				request.setAllowedNetworkTypes(
				DownloadManager.Request.NETWORK_WIFI
				| DownloadManager.Request.NETWORK_MOBILE);
				
				request.setAllowedOverMetered(true);
				request.setAllowedOverRoaming(true);
				
				request.setRequiresCharging(false);
				request.setRequiresDeviceIdle(false);
				
				request.setMimeType("video/mp4");
				
				request.addRequestHeader("User-Agent", "Mozilla/5.0");
				
				// ذخیره در پوشه عمومی Downloads
				request.setDestinationInExternalPublicDir(
				Environment.DIRECTORY_DOWNLOADS,
				_name);
				
				final DownloadManager dm =
				(DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				
				final long downloadId = dm.enqueue(request);
				
				new Thread(new Runnable() {
					@Override
					public void run() {
						
						boolean running = true;
						
						while (running) {
							
							DownloadManager.Query query = new DownloadManager.Query();
							query.setFilterById(downloadId);
							
							Cursor cursor = dm.query(query);
							
							if (cursor != null && cursor.moveToFirst()) {
								
								int status = cursor.getInt(
								cursor.getColumnIndexOrThrow(
								DownloadManager.COLUMN_STATUS));
								
								switch (status) {
									
									case DownloadManager.STATUS_SUCCESSFUL:
									
									running = false;
									
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											showMessage("دانلود کامل شد.");
										}
									});
									
									break;
									
									case DownloadManager.STATUS_FAILED:
									
									running = false;
									
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											showMessage("دانلود ناموفق.");
										}
									});
									
									break;
								}
								
								cursor.close();
							}
							
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								running = false;
							}
						}
					}
				}).start();
				
			} catch (Exception e) {
				
				showMessage("خطا در شروع دانلود");
				
			}
			
		} else {
			
			showMessage("اتصال اینترنت برقرار نیست.");
			
		}
	}
	
	
	public void _playVideo() {
		_vpn();
		if (vpn()) {
			vib.vibrate((long)(100));
			SketchwareUtil.showMessage(getApplicationContext(), "برای پخش ویدیو لازم است فلیتر شکن خود را خاموش کنید");
		} else {
			if (check_get) {
				try {
					if (type_videoplayer.getString("type_videoplayer", "").equals("web")) {
						rt.setClass(getApplicationContext(), VideoplayerwebActivity.class);
					} else {
						rt.setClass(getApplicationContext(), VideoplayerActivity.class);
					}
					rt.putExtra("dooble", "ندارد");
					rt.putExtra("zirnevis", "ندارد");
					rt.putExtra("id", getIntent().getStringExtra("id"));
					rt.putExtra("image", mpp.get("backdrop").toString());
					rt.putExtra("type", getIntent().getStringExtra("type"));
					if (getIntent().getStringExtra("type").equals("series")) {
						rt.putExtra("url", listmap_season.get((int)0).get("upera").toString());
						rt.putExtra("name", listmap_season.get((int)0).get("name_fa").toString());
						rt.putExtra("backdrop", listmap_season.get((int)0).get("backdrop").toString());
					} else {
						if (getIntent().hasExtra("my")) {
							rt.putExtra("url", mpp.get("id").toString());
						} else {
							rt.putExtra("url", mpp.get("upera").toString());
						}
						rt.putExtra("name", mpp.get("name_fa").toString());
						rt.putExtra("backdrop", mpp.get("backdrop").toString());
					}
					if (dooble.getText().toString().equals("فارسی")) {
						rt.putExtra("dooble", "دارد");
					}
					if (dooble.getText().toString().equals("اصلی")) {
						rt.putExtra("zirnevis", "دارد");
					}
					rt.putExtra("data", new Gson().toJson(listmap1));
					rt.putExtra("profile", getIntent().getStringExtra("image"));
					if (getIntent().hasExtra("my")) {
						rt.putExtra("my", "");
						rt.putExtra("mp4", new Gson().toJson(list_qulity));
					}
					rt.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(rt);
					ViewActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
				} catch (Exception e) {
					
				}
			} else {
				
			}
		}
	}
	
	
	public void _check() {
		
	}
	
	
	public void _getData() {
		
	}
	
	
	public void _get_theme_l_color() {
		if (save.getString("theme", "").equals("#FF8E2D")) {
			l_color = "#20FF8E2D";
		} else {
			if (save.getString("theme", "").equals("#536DFE")) {
				l_color = "#20536DFE";
			} else {
				if (save.getString("theme", "").equals("#FF5252")) {
					l_color = "#20FF5252";
				} else {
					if (save.getString("theme", "").equals("#FF4081")) {
						l_color = "#20FF4081";
					} else {
						if (save.getString("theme", "").equals("#7C4DFF")) {
							l_color = "#207C4DFF";
						} else {
							l_color = "#2000C853";
						}
					}
				}
			}
		}
	}
	
	
	public void _color_tab() {
		_rippleRoundStroke(linear222, "#00000000", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0, "#50ffffff");
		_rippleRoundStroke(linear223, "#00000000", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0, "#50ffffff");
		_rippleRoundStroke(linear224, "#00000000", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0, "#50ffffff");
		_rippleRoundStroke(linear225, "#00000000", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0, "#50ffffff");
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
	
	
	public void _adapterQulity() {
	}
	public class Myrecyclerview1_0Adapter extends RecyclerView.Adapter<Myrecyclerview1_0Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		AlertDialog dialog;  // <--- این خط رو اضافه کن
		
		// سازنده قبلی رو عوض کن به این شکل:
		public Myrecyclerview1_0Adapter(ArrayList<HashMap<String, Object>> _arr, AlertDialog dialog) {
			_data = _arr;
			this.dialog = dialog;  // <--- این خط رو اضافه کن
		}
		
		// بقیه کدهای adapter به همین شکل بمونه...
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.download_quality, parent, false);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			
			
			
			
			RecyclerView.LayoutParams _lp1 = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp1);
			final TextView textview3 = 
			_view.findViewById(R.id.textview3);
			
			final LinearLayout l = 
			_view.findViewById(R.id.l);
			
			final LinearLayout linear14 = 
			_view.findViewById(R.id.linear14);
			l.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
			linear14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFFFFFFFF));
			textview3.setText("کیفیت ".concat(list_qulity.get((int)_position).get("quality").toString()));
			if (select_p_Myrecyclerview1_0Adapter == _position) {
				l.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFF4C4F56));
			}
			l.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					link_dl = list_qulity.get((int)_position).get("url").toString();
					select_p_Myrecyclerview1_0Adapter = _position;
					if (dialog != null) {
						dialog.dismiss();
					}
					_update_Myrecyclerview1_0Adapter();
				}
			});
			linear14.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					
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
	{
	}
	
	
	public void _update_Myrecyclerview1_0Adapter() {
		try {
			Myrecyclerview1_0Adapter adapter = new Myrecyclerview1_0Adapter(list_qulity, null);
			recyclerview1.setAdapter(adapter);
		} catch (Exception e) {
			SketchwareUtil.showMessage(getApplicationContext(), "خطا!!");
		}
		_download("", mpp.get("backdrop").toString(), "0");
	}
	
	
	public void _lib() {
	}
	static class UiUtil {
		UiUtil() {
		}
		static int dp(Context context, int val) {
			return (int) TypedValue.applyDimension(
			TypedValue.COMPLEX_UNIT_DIP, val, context.getResources().getDisplayMetrics());
		}
		static int sp(Context context, int val) {
			return (int) TypedValue.applyDimension(
			TypedValue.COMPLEX_UNIT_SP, val, context.getResources().getDisplayMetrics());
		}
		static int themeIntAttr(Context context, String attr) {
			final android.content.res.Resources.Theme theme = context.getTheme();
			if (theme == null) {
				return -1;
			}
			final TypedValue value = new TypedValue();
			final int id = context.getResources().getIdentifier(attr, "attr", context.getPackageName());
			
			if (id == 0) {
				// Not found
				return -1;
			}
			theme.resolveAttribute(id, value, true);
			return value.data;
		}
		static int setAlpha(int argb, float alpha) {
			if (alpha > 1.0f) {
				alpha = 1.0f;
			} else if (alpha <= 0.0f) {
				alpha = 0.0f;
			}
			return ((int) ((argb >>> 24) * alpha) << 24) | (argb & 0x00FFFFFF);
		}
	}
	static class FloatValueAnimatorBuilder {
		
		private final ValueAnimator animator;
		
		private EndListener endListener;
		
		interface UpdateListener {
			void onUpdate(float lerpTime);
		}
		interface EndListener {
			void onEnd();
		}
		protected FloatValueAnimatorBuilder() {
			this(false);
		}
		FloatValueAnimatorBuilder(boolean reverse) {
			if (reverse) {
				this.animator = ValueAnimator.ofFloat(1.0f, 0.0f);
			} else {
				this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
			}
		}
		public FloatValueAnimatorBuilder delayBy(long millis) {
			animator.setStartDelay(millis);
			return this;
		}
		public FloatValueAnimatorBuilder duration(long millis) {
			animator.setDuration(millis);
			return this;
		}
		public FloatValueAnimatorBuilder interpolator(TimeInterpolator lerper) {
			animator.setInterpolator(lerper);
			return this;
		}
		public FloatValueAnimatorBuilder repeat(int times) {
			animator.setRepeatCount(times);
			return this;
		}
		public FloatValueAnimatorBuilder onUpdate(final UpdateListener listener) {
			animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				@Override
				public void onAnimationUpdate(ValueAnimator animation) {
					listener.onUpdate((float) animation.getAnimatedValue());
				}
			});
			return this;
		}
		public FloatValueAnimatorBuilder onEnd(final EndListener listener) {
			this.endListener = listener;
			return this;
		}
		public ValueAnimator build() {
			if (endListener != null) {
				animator.addListener(new AnimatorListenerAdapter() {
					@Override
					public void onAnimationEnd(Animator animation) {
						endListener.onEnd();
					}
				});
			}
			return animator;
		}
	}
	
	static class ReflectUtil {
		ReflectUtil() {
		}
		static Object getPrivateField(Object source, String fieldName)
		throws NoSuchFieldException, IllegalAccessException {
			final java.lang.reflect.Field objectField = source.getClass().getDeclaredField(fieldName);
			objectField.setAccessible(true);
			return objectField.get(source);
		}
	}
	static class TapTarget extends Activity {
		final CharSequence title;
		final CharSequence description;
		float outerCircleAlpha = 0.96f;
		int targetRadius = 44;
		Rect bounds;
		android.graphics.drawable.Drawable icon;
		Typeface titleTypeface;
		Typeface descriptionTypeface;
		
		
		private int outerCircleColorRes = -1;
		private int targetCircleColorRes = -1;
		private int dimColorRes = -1;
		private int titleTextColorRes = -1;
		private int descriptionTextColorRes = -1;
		
		private Integer outerCircleColor = null;
		private Integer targetCircleColor = null;
		private Integer dimColor = null;
		private Integer titleTextColor = null;
		private Integer descriptionTextColor = null;
		
		private int titleTextDimen = -1;
		private int descriptionTextDimen = -1;
		private int titleTextSize = 20;
		private int descriptionTextSize = 18;
		int id = -1;
		boolean drawShadow = false;
		boolean cancelable = true;
		boolean tintTarget = true;
		boolean transparentTarget = false;
		float titleTextAlpha = 1f;
		float descriptionTextAlpha = 0.54f;
		public static TapTarget forView(View view, CharSequence title) {
			return forView(view, title, null);
		}
		public static TapTarget forView(View view, CharSequence title, CharSequence description) {
			return new ViewTapTarget(view, title, description);
		}
		public static TapTarget forBounds(Rect bounds, CharSequence title) {
			return forBounds(bounds, title, null);
		}
		public static TapTarget forBounds(Rect bounds, CharSequence title,  CharSequence description) {
			return new TapTarget(bounds, title, description);
		}
		protected TapTarget(Rect bounds, CharSequence title,  CharSequence description) {
			this(title, description);
			if (bounds == null) {
				throw new IllegalArgumentException("Cannot pass null bounds or title");
			}
			this.bounds = bounds;
		}
		protected TapTarget(CharSequence title,  CharSequence description) {
			if (title == null) {
				throw new IllegalArgumentException("Cannot pass null title");
			}
			this.title = title;
			this.description = description;
		}
		public TapTarget transparentTarget(boolean transparent) {
			this.transparentTarget = transparent;
			return this;
		}
		public TapTarget outerCircleColor( int color) {
			this.outerCircleColorRes = color;
			return this;
		}
		public TapTarget outerCircleColorInt( int color) {
			this.outerCircleColor = color;
			return this;
		}
		public TapTarget outerCircleAlpha(float alpha) {
			if (alpha < 0.0f || alpha > 1.0f) {
				throw new IllegalArgumentException("Given an invalid alpha value: " + alpha);
			}
			this.outerCircleAlpha = alpha;
			return this;
		}
		public TapTarget targetCircleColor( int color) {
			this.targetCircleColorRes = color;
			return this;
		}
		public TapTarget targetCircleColorInt( int color) {
			this.targetCircleColor = color;
			return this;
		}
		public TapTarget textColor( int color) {
			this.titleTextColorRes = color;
			this.descriptionTextColorRes = color;
			return this;
		}
		public TapTarget textColorInt( int color) {
			this.titleTextColor = color;
			this.descriptionTextColor = color;
			return this;
		}
		public TapTarget titleTextColor( int color) {
			this.titleTextColorRes = color;
			return this;
		}
		public TapTarget titleTextColorInt( int color) {
			this.titleTextColor = color;
			return this;
		}
		public TapTarget descriptionTextColor( int color) {
			this.descriptionTextColorRes = color;
			return this;
		}
		public TapTarget descriptionTextColorInt( int color) {
			this.descriptionTextColor = color;
			return this;
		}
		public TapTarget textTypeface(Typeface typeface) {
			if (typeface == null) throw new IllegalArgumentException("Cannot use a null typeface");
			titleTypeface = typeface;
			descriptionTypeface = typeface;
			return this;
		}
		public TapTarget titleTypeface(Typeface titleTypeface) {
			if (titleTypeface == null) throw new IllegalArgumentException("Cannot use a null typeface");
			this.titleTypeface = titleTypeface;
			return this;
		}
		public TapTarget descriptionTypeface(Typeface descriptionTypeface) {
			if (descriptionTypeface == null) throw new IllegalArgumentException("Cannot use a null typeface");
			this.descriptionTypeface = descriptionTypeface;
			return this;
		}
		public TapTarget textSize(int sp) {
			if (sp < 0) throw new IllegalArgumentException("Given negative text size");
			this.titleTextSize = sp;
			this.descriptionTextSize = sp;
			return this;
		}
		public TapTarget titleTextSize(int sp) {
			if (sp < 0) throw new IllegalArgumentException("Given negative text size");
			this.titleTextSize = sp;
			return this;
		}
		public TapTarget descriptionTextSize(int sp) {
			if (sp < 0) throw new IllegalArgumentException("Given negative text size");
			this.descriptionTextSize = sp;
			return this;
		}
		public TapTarget titleTextDimen( int dimen) {
			this.titleTextDimen = dimen;
			return this;
		}
		public TapTarget textAlpha(float alpha) {
			if (alpha < 0 || alpha > 1f) {
				throw new IllegalArgumentException("Given an invalid alpha value: " + alpha);
			}
			this.titleTextAlpha = alpha;
			this.descriptionTextAlpha = alpha;
			return this;
		}
		public TapTarget titleTextAlpha(float alpha) {
			if (alpha < 0 || alpha > 1f) {
				throw new IllegalArgumentException("Given an invalid alpha value: " + alpha);
			}
			this.titleTextAlpha = alpha;
			return this;
		}
		public TapTarget descriptionTextAlpha(float alpha) {
			if (alpha < 0 || alpha > 1f) {
				throw new IllegalArgumentException("Given an invalid alpha value: " + alpha);
			}
			this.descriptionTextAlpha = alpha;
			return this;
		}
		public TapTarget descriptionTextDimen( int dimen) {
			this.descriptionTextDimen = dimen;
			return this;
		}
		public TapTarget dimColor( int color) {
			this.dimColorRes = color;
			return this;
		}
		public TapTarget dimColorInt( int color) {
			this.dimColor = color;
			return this;
		}
		public TapTarget drawShadow(boolean draw) {
			this.drawShadow = draw;
			return this;
		}
		public TapTarget cancelable(boolean status) {
			this.cancelable = status;
			return this;
		}
		public TapTarget tintTarget(boolean tint) {
			this.tintTarget = tint;
			return this;
		}
		public TapTarget icon(android.graphics.drawable.Drawable icon) {
			return icon(icon, false);
		}
		public TapTarget icon(android.graphics.drawable.Drawable icon, boolean hasSetBounds) {
			if (icon == null) throw new IllegalArgumentException("Cannot use null drawable");
			this.icon = icon;
			if (!hasSetBounds) {
				this.icon.setBounds(new Rect(0, 0, this.icon.getIntrinsicWidth(), this.icon.getIntrinsicHeight()));
			}
			return this;
		}
		public TapTarget id(int id) {
			this.id = id;
			return this;
		}
		public TapTarget targetRadius(int targetRadius) {
			this.targetRadius = targetRadius;
			return this;
		}
		public int id() {
			return id;
		}
		public void onReady(Runnable runnable) {
			runnable.run();
		}
		public Rect bounds() {
			if (bounds == null) {
				throw new IllegalStateException("Requesting bounds that are not set! Make sure your target is ready");
			}
			return bounds;
		}
		Integer outerCircleColorInt(Context context) {
			return colorResOrInt(context, outerCircleColor, outerCircleColorRes);
		}
		Integer targetCircleColorInt(Context context) {
			return colorResOrInt(context, targetCircleColor, targetCircleColorRes);
		}
		Integer dimColorInt(Context context) {
			return colorResOrInt(context, dimColor, dimColorRes);
		}
		Integer titleTextColorInt(Context context) {
			return colorResOrInt(context, titleTextColor, titleTextColorRes);
		}
		
		Integer descriptionTextColorInt(Context context) {
			return colorResOrInt(context, descriptionTextColor, descriptionTextColorRes);
		}
		int titleTextSizePx(Context context) {
			return dimenOrSize(context, titleTextSize, titleTextDimen);
		}
		int descriptionTextSizePx(Context context) {
			return dimenOrSize(context, descriptionTextSize, descriptionTextDimen);
		}
		
		private Integer colorResOrInt(Context context, Integer value,  int resource) {
			if (resource != -1) {
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
					return context.getColor(resource);
				}
			}
			return value;
		}
		private int dimenOrSize(Context context, int size,  int dimen) {
			if (dimen != -1) {
				return context.getResources().getDimensionPixelSize(dimen);
			}
			return UiUtil.sp(context, size);
		}
	}
	static class TapTargetView extends View {
		private boolean isDismissed = false;
		private boolean isDismissing = false;
		private boolean isInteractable = true;
		
		final int TARGET_PADDING;
		final int TARGET_RADIUS;
		final int TARGET_PULSE_RADIUS;
		final int TEXT_PADDING;
		final int TEXT_SPACING;
		final int TEXT_MAX_WIDTH;
		final int TEXT_POSITIONING_BIAS;
		final int CIRCLE_PADDING;
		final int GUTTER_DIM;
		final int SHADOW_DIM;
		final int SHADOW_JITTER_DIM;
		
		
		final ViewGroup boundingParent;
		final ViewManager parent;
		final TapTarget target;
		final Rect targetBounds;
		
		final TextPaint titlePaint;
		final TextPaint descriptionPaint;
		final Paint outerCirclePaint;
		final Paint outerCircleShadowPaint;
		final Paint targetCirclePaint;
		final Paint targetCirclePulsePaint;
		
		CharSequence title;
		
		StaticLayout titleLayout;
		
		CharSequence description;
		
		StaticLayout descriptionLayout;
		boolean isDark;
		boolean debug;
		boolean shouldTintTarget;
		boolean shouldDrawShadow;
		boolean cancelable;
		boolean visible;
		
		// Debug related variables
		
		SpannableStringBuilder debugStringBuilder;
		
		DynamicLayout debugLayout;
		
		TextPaint debugTextPaint;
		
		Paint debugPaint;
		
		// Drawing properties
		Rect drawingBounds;
		Rect textBounds;
		
		Path outerCirclePath;
		float outerCircleRadius;
		int calculatedOuterCircleRadius;
		int[] outerCircleCenter;
		int outerCircleAlpha;
		
		float targetCirclePulseRadius;
		int targetCirclePulseAlpha;
		
		float targetCircleRadius;
		int targetCircleAlpha;
		
		int textAlpha;
		int dimColor;
		
		float lastTouchX;
		float lastTouchY;
		
		int topBoundary;
		int bottomBoundary;
		
		Bitmap tintedTarget;
		
		Listener listener;
		
		
		ViewOutlineProvider outlineProvider;
		
		public static TapTargetView showFor(Activity activity, TapTarget target) {
			return showFor(activity, target, null);
		}
		
		public static TapTargetView showFor(Activity activity, TapTarget target, Listener listener) {
			if (activity == null) throw new IllegalArgumentException("Activity is null");
			
			final ViewGroup decor = (ViewGroup) activity.getWindow().getDecorView();
			final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
			ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
			final ViewGroup content = (ViewGroup) decor.findViewById(android.R.id.content);
			final TapTargetView tapTargetView = new TapTargetView(activity, decor, content, target, listener);
			decor.addView(tapTargetView, layoutParams);
			
			return tapTargetView;
		}
		
		public static TapTargetView showFor(Dialog dialog, TapTarget target) {
			return showFor(dialog, target, null);
		}
		
		public static TapTargetView showFor(Dialog dialog, TapTarget target, Listener listener) {
			if (dialog == null) throw new IllegalArgumentException("Dialog is null");
			
			final Context context = dialog.getContext();
			final WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
			final WindowManager.LayoutParams params = new WindowManager.LayoutParams();
			params.type = WindowManager.LayoutParams.TYPE_APPLICATION;
			params.format = PixelFormat.RGBA_8888;
			params.flags = 0;
			params.gravity = Gravity.START | Gravity.TOP;
			params.x = 0;
			params.y = 0;
			params.width = WindowManager.LayoutParams.MATCH_PARENT;
			params.height = WindowManager.LayoutParams.MATCH_PARENT;
			
			final TapTargetView tapTargetView = new TapTargetView(context, windowManager, null, target, listener);
			windowManager.addView(tapTargetView, params);
			
			return tapTargetView;
		}
		public static class Listener {
			/** Signals that the user has clicked inside of the target **/
			public void onTargetClick(TapTargetView view) {
				view.dismiss(true);
			}
			
			/** Signals that the user has long clicked inside of the target **/
			public void onTargetLongClick(TapTargetView view) {
				onTargetClick(view);
			}
			
			/** If cancelable, signals that the user has clicked outside of the outer circle **/
			public void onTargetCancel(TapTargetView view) {
				view.dismiss(false);
			}
			
			/** Signals that the user clicked on the outer circle portion of the tap target **/
			public void onOuterCircleClick(TapTargetView view) {
				// no-op as default
			}
			
			/**
         * Signals that the tap target has been dismissed
         * @param userInitiated Whether the user caused this action
         *
         *
         */
			public void onTargetDismissed(TapTargetView view, boolean userInitiated) {
			}
		}
		
		final FloatValueAnimatorBuilder.UpdateListener expandContractUpdateListener = new FloatValueAnimatorBuilder.UpdateListener() {
			@Override
			public void onUpdate(float lerpTime) {
				final float newOuterCircleRadius = calculatedOuterCircleRadius * lerpTime;
				final boolean expanding = newOuterCircleRadius > outerCircleRadius;
				if (!expanding) {
					// When contracting we need to invalidate the old drawing bounds. Otherwise
					// you will see artifacts as the circle gets smaller
					calculateDrawingBounds();
				}
				
				final float targetAlpha = target.outerCircleAlpha * 255;
				outerCircleRadius = newOuterCircleRadius;
				outerCircleAlpha = (int) Math.min(targetAlpha, (lerpTime * 1.5f * targetAlpha));
				outerCirclePath.reset();
				outerCirclePath.addCircle(outerCircleCenter[0], outerCircleCenter[1], outerCircleRadius, Path.Direction.CW);
				
				targetCircleAlpha = (int) Math.min(255.0f, (lerpTime * 1.5f * 255.0f));
				
				if (expanding) {
					targetCircleRadius = TARGET_RADIUS * Math.min(1.0f, lerpTime * 1.5f);
				} else {
					targetCircleRadius = TARGET_RADIUS * lerpTime;
					targetCirclePulseRadius *= lerpTime;
				}
				
				textAlpha = (int) (delayedLerp(lerpTime, 0.7f) * 255);
				
				if (expanding) {
					calculateDrawingBounds();
				}
				
				invalidateViewAndOutline(drawingBounds);
			}
		};
		
		final ValueAnimator expandAnimation = new FloatValueAnimatorBuilder()
		.duration(250)
		.delayBy(250)
		.interpolator(new AccelerateDecelerateInterpolator())
		.onUpdate(new FloatValueAnimatorBuilder.UpdateListener() {
			@Override
			public void onUpdate(float lerpTime) {
				expandContractUpdateListener.onUpdate(lerpTime);
			}
		})
		.onEnd(new FloatValueAnimatorBuilder.EndListener() {
			@Override
			public void onEnd() {
				pulseAnimation.start();
				isInteractable = true;
			}
		})
		.build();
		
		final ValueAnimator pulseAnimation = new FloatValueAnimatorBuilder()
		.duration(1000)
		.repeat(ValueAnimator.INFINITE)
		.interpolator(new AccelerateDecelerateInterpolator())
		.onUpdate(new FloatValueAnimatorBuilder.UpdateListener() {
			@Override
			public void onUpdate(float lerpTime) {
				final float pulseLerp = delayedLerp(lerpTime, 0.5f);
				targetCirclePulseRadius = (1.0f + pulseLerp) * TARGET_RADIUS;
				targetCirclePulseAlpha = (int) ((1.0f - pulseLerp) * 255);
				targetCircleRadius = TARGET_RADIUS + halfwayLerp(lerpTime) * TARGET_PULSE_RADIUS;
				
				if (outerCircleRadius != calculatedOuterCircleRadius) {
					outerCircleRadius = calculatedOuterCircleRadius;
				}
				
				calculateDrawingBounds();
				invalidateViewAndOutline(drawingBounds);
			}
		})
		.build();
		
		final ValueAnimator dismissAnimation = new FloatValueAnimatorBuilder(true)
		.duration(250)
		.interpolator(new AccelerateDecelerateInterpolator())
		.onUpdate(new FloatValueAnimatorBuilder.UpdateListener() {
			@Override
			public void onUpdate(float lerpTime) {
				expandContractUpdateListener.onUpdate(lerpTime);
			}
		})
		.onEnd(new FloatValueAnimatorBuilder.EndListener() {
			@Override
			public void onEnd() {
				onDismiss(true);
				ViewUtil.removeView(parent, TapTargetView.this);
			}
		})
		.build();
		
		private final ValueAnimator dismissConfirmAnimation = new FloatValueAnimatorBuilder()
		.duration(250)
		.interpolator(new AccelerateDecelerateInterpolator())
		.onUpdate(new FloatValueAnimatorBuilder.UpdateListener() {
			@Override
			public void onUpdate(float lerpTime) {
				final float spedUpLerp = Math.min(1.0f, lerpTime * 2.0f);
				outerCircleRadius = calculatedOuterCircleRadius * (1.0f + (spedUpLerp * 0.2f));
				outerCircleAlpha = (int) ((1.0f - spedUpLerp) * target.outerCircleAlpha * 255.0f);
				outerCirclePath.reset();
				outerCirclePath.addCircle(outerCircleCenter[0], outerCircleCenter[1], outerCircleRadius, Path.Direction.CW);
				targetCircleRadius = (1.0f - lerpTime) * TARGET_RADIUS;
				targetCircleAlpha = (int) ((1.0f - lerpTime) * 255.0f);
				targetCirclePulseRadius = (1.0f + lerpTime) * TARGET_RADIUS;
				targetCirclePulseAlpha = (int) ((1.0f - lerpTime) * targetCirclePulseAlpha);
				textAlpha = (int) ((1.0f - spedUpLerp) * 255.0f);
				calculateDrawingBounds();
				invalidateViewAndOutline(drawingBounds);
			}
		})
		.onEnd(new FloatValueAnimatorBuilder.EndListener() {
			@Override
			public void onEnd() {
				onDismiss(true);
				ViewUtil.removeView(parent, TapTargetView.this);
			}
		})
		.build();
		
		private ValueAnimator[] animators = new ValueAnimator[]
		{expandAnimation, pulseAnimation, dismissConfirmAnimation, dismissAnimation};
		
		private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
		public TapTargetView(final Context context,
		final ViewManager parent,
		final ViewGroup boundingParent,
		final TapTarget target,
		final Listener userListener) {
			super(context);
			if (target == null) throw new IllegalArgumentException("Target cannot be null");
			
			this.target = target;
			this.parent = parent;
			this.boundingParent = boundingParent;
			this.listener = userListener != null ? userListener : new Listener();
			this.title = target.title;
			this.description = target.description;
			
			TARGET_PADDING = UiUtil.dp(context, 20);
			CIRCLE_PADDING = UiUtil.dp(context, 40);
			TARGET_RADIUS = UiUtil.dp(context, target.targetRadius);
			TEXT_PADDING = UiUtil.dp(context, 40);
			TEXT_SPACING = UiUtil.dp(context, 8);
			TEXT_MAX_WIDTH = UiUtil.dp(context, 360);
			TEXT_POSITIONING_BIAS = UiUtil.dp(context, 20);
			GUTTER_DIM = UiUtil.dp(context, 88);
			SHADOW_DIM = UiUtil.dp(context, 8);
			SHADOW_JITTER_DIM = UiUtil.dp(context, 1);
			TARGET_PULSE_RADIUS = (int) (0.1f * TARGET_RADIUS);
			
			outerCirclePath = new Path();
			targetBounds = new Rect();
			drawingBounds = new Rect();
			
			titlePaint = new TextPaint();
			titlePaint.setTextSize(target.titleTextSizePx(context));
			titlePaint.setTypeface(Typeface.create("sans-serif-medium", Typeface.NORMAL));
			titlePaint.setAntiAlias(true);
			
			descriptionPaint = new TextPaint();
			descriptionPaint.setTextSize(target.descriptionTextSizePx(context));
			descriptionPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL));
			descriptionPaint.setAntiAlias(true);
			descriptionPaint.setAlpha((int) (0.54f * 255.0f));
			
			outerCirclePaint = new Paint();
			outerCirclePaint.setAntiAlias(true);
			outerCirclePaint.setAlpha((int) (target.outerCircleAlpha * 255.0f));
			
			outerCircleShadowPaint = new Paint();
			outerCircleShadowPaint.setAntiAlias(true);
			outerCircleShadowPaint.setAlpha(50);
			outerCircleShadowPaint.setStyle(Paint.Style.STROKE);
			outerCircleShadowPaint.setStrokeWidth(SHADOW_JITTER_DIM);
			outerCircleShadowPaint.setColor(Color.BLACK);
			
			targetCirclePaint = new Paint();
			targetCirclePaint.setAntiAlias(true);
			
			targetCirclePulsePaint = new Paint();
			targetCirclePulsePaint.setAntiAlias(true);
			
			applyTargetOptions(context);
			
			globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
				@Override
				public void onGlobalLayout() {
					if (isDismissing) {
						return;
					}
					updateTextLayouts();
					target.onReady(new Runnable() {
						@Override
						public void run() {
							final int[] offset = new int[2];
							
							targetBounds.set(target.bounds());
							
							getLocationOnScreen(offset);
							targetBounds.offset(-offset[0], -offset[1]);
							
							if (boundingParent != null) {
								final WindowManager windowManager
								= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
								final DisplayMetrics displayMetrics = new DisplayMetrics();
								windowManager.getDefaultDisplay().getMetrics(displayMetrics);
								
								final Rect rect = new Rect();
								boundingParent.getWindowVisibleDisplayFrame(rect);
								
								// We bound the boundaries to be within the screen's coordinates to
								// handle the case where the layout bounds do not match
								// (like when FLAG_LAYOUT_NO_LIMITS is specified)
								topBoundary = Math.max(0, rect.top);
								bottomBoundary = Math.min(rect.bottom, displayMetrics.heightPixels);
							}
							
							drawTintedTarget();
							requestFocus();
							calculateDimensions();
							
							startExpandAnimation();
						}
					});
				}
			};
			
			getViewTreeObserver().addOnGlobalLayoutListener(globalLayoutListener);
			
			setFocusableInTouchMode(true);
			setClickable(true);
			setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					if (listener == null || outerCircleCenter == null || !isInteractable) return;
					
					final boolean clickedInTarget =
					distance(targetBounds.centerX(), targetBounds.centerY(), (int) lastTouchX, (int) lastTouchY) <= targetCircleRadius;
					final double distanceToOuterCircleCenter = distance(outerCircleCenter[0], outerCircleCenter[1],
					(int) lastTouchX, (int) lastTouchY);
					final boolean clickedInsideOfOuterCircle = distanceToOuterCircleCenter <= outerCircleRadius;
					
					if (clickedInTarget) {
						isInteractable = false;
						listener.onTargetClick(TapTargetView.this);
					} else if (clickedInsideOfOuterCircle) {
						listener.onOuterCircleClick(TapTargetView.this);
					} else if (cancelable) {
						isInteractable = false;
						listener.onTargetCancel(TapTargetView.this);
					}
				}
			});
			
			setOnLongClickListener(new OnLongClickListener() {
				@Override
				public boolean onLongClick(View v) {
					if (listener == null) return false;
					
					if (targetBounds.contains((int) lastTouchX, (int) lastTouchY)) {
						listener.onTargetLongClick(TapTargetView.this);
						return true;
					}
					
					return false;
				}
			});
		}
		
		private void startExpandAnimation() {
			if (!visible) {
				isInteractable = false;
				expandAnimation.start();
				visible = true;
			}
		}
		
		protected void applyTargetOptions(Context context) {
			shouldTintTarget = target.tintTarget;
			shouldDrawShadow = target.drawShadow;
			cancelable = target.cancelable;
			
			// We can't clip out portions of a view outline, so if the user specified a transparent
			// target, we need to fallback to drawing a jittered shadow approximation
			if (shouldDrawShadow && Build.VERSION.SDK_INT >= 21 && !target.transparentTarget) {
				outlineProvider = new ViewOutlineProvider() {
					@Override
					public void getOutline(View view, Outline outline) {
						if (outerCircleCenter == null) return;
						outline.setOval(
						(int) (outerCircleCenter[0] - outerCircleRadius), (int) (outerCircleCenter[1] - outerCircleRadius),
						(int) (outerCircleCenter[0] + outerCircleRadius), (int) (outerCircleCenter[1] + outerCircleRadius));
						outline.setAlpha(outerCircleAlpha / 255.0f);
						if (Build.VERSION.SDK_INT >= 22) {
							outline.offset(0, SHADOW_DIM);
						}
					}
				};
				
				setOutlineProvider(outlineProvider);
				setElevation(SHADOW_DIM);
			}
			
			if (shouldDrawShadow && outlineProvider == null && Build.VERSION.SDK_INT < 18) {
				setLayerType(LAYER_TYPE_SOFTWARE, null);
			} else {
				setLayerType(LAYER_TYPE_HARDWARE, null);
			}
			
			final android.content.res.Resources.Theme theme = context.getTheme();
			isDark = UiUtil.themeIntAttr(context, "isLightTheme") == 0;
			
			final Integer outerCircleColor = target.outerCircleColorInt(context);
			if (outerCircleColor != null) {
				outerCirclePaint.setColor(outerCircleColor);
			} else if (theme != null) {
				outerCirclePaint.setColor(UiUtil.themeIntAttr(context, "colorPrimary"));
			} else {
				outerCirclePaint.setColor(Color.WHITE);
			}
			
			final Integer targetCircleColor = target.targetCircleColorInt(context);
			if (targetCircleColor != null) {
				targetCirclePaint.setColor(targetCircleColor);
			} else {
				targetCirclePaint.setColor(isDark ? Color.BLACK : Color.WHITE);
			}
			
			if (target.transparentTarget) {
				targetCirclePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
			}
			
			targetCirclePulsePaint.setColor(targetCirclePaint.getColor());
			
			final Integer targetDimColor = target.dimColorInt(context);
			if (targetDimColor != null) {
				dimColor = UiUtil.setAlpha(targetDimColor, 0.3f);
			} else {
				dimColor = -1;
			}
			
			final Integer titleTextColor = target.titleTextColorInt(context);
			if (titleTextColor != null) {
				titlePaint.setColor(titleTextColor);
			} else {
				titlePaint.setColor(isDark ? Color.BLACK : Color.WHITE);
			}
			
			final Integer descriptionTextColor = target.descriptionTextColorInt(context);
			if (descriptionTextColor != null) {
				descriptionPaint.setColor(descriptionTextColor);
			} else {
				descriptionPaint.setColor(titlePaint.getColor());
			}
			
			if (target.titleTypeface != null) {
				titlePaint.setTypeface(target.titleTypeface);
			}
			
			if (target.descriptionTypeface != null) {
				descriptionPaint.setTypeface(target.descriptionTypeface);
			}
		}
		
		@Override
		protected void onDetachedFromWindow() {
			super.onDetachedFromWindow();
			onDismiss(false);
		}
		
		void onDismiss(boolean userInitiated) {
			if (isDismissed) return;
			
			isDismissing = false;
			isDismissed = true;
			
			for (final ValueAnimator animator : animators) {
				animator.cancel();
				animator.removeAllUpdateListeners();
			}
			ViewUtil.removeOnGlobalLayoutListener(getViewTreeObserver(), globalLayoutListener);
			visible = false;
			
			if (listener != null) {
				listener.onTargetDismissed(this, userInitiated);
			}
		}
		
		@Override
		protected void onDraw(Canvas c) {
			if (isDismissed || outerCircleCenter == null) return;
			
			if (topBoundary > 0 && bottomBoundary > 0) {
				c.clipRect(0, topBoundary, getWidth(), bottomBoundary);
			}
			
			if (dimColor != -1) {
				c.drawColor(dimColor);
			}
			
			int saveCount;
			outerCirclePaint.setAlpha(outerCircleAlpha);
			if (shouldDrawShadow && outlineProvider == null) {
				saveCount = c.save();
				{
					c.clipPath(outerCirclePath, Region.Op.DIFFERENCE);
					drawJitteredShadow(c);
				}
				c.restoreToCount(saveCount);
			}
			c.drawCircle(outerCircleCenter[0], outerCircleCenter[1], outerCircleRadius, outerCirclePaint);
			
			targetCirclePaint.setAlpha(targetCircleAlpha);
			if (targetCirclePulseAlpha > 0) {
				targetCirclePulsePaint.setAlpha(targetCirclePulseAlpha);
				c.drawCircle(targetBounds.centerX(), targetBounds.centerY(),
				targetCirclePulseRadius, targetCirclePulsePaint);
			}
			c.drawCircle(targetBounds.centerX(), targetBounds.centerY(),
			targetCircleRadius, targetCirclePaint);
			
			saveCount = c.save();
			{
				c.translate(textBounds.left, textBounds.top);
				titlePaint.setAlpha(textAlpha);
				if (titleLayout != null) {
					titleLayout.draw(c);
				}
				
				if (descriptionLayout != null && titleLayout != null) {
					c.translate(0, titleLayout.getHeight() + TEXT_SPACING);
					descriptionPaint.setAlpha((int) (target.descriptionTextAlpha * textAlpha));
					descriptionLayout.draw(c);
				}
			}
			c.restoreToCount(saveCount);
			
			saveCount = c.save();
			{
				if (tintedTarget != null) {
					c.translate(targetBounds.centerX() - tintedTarget.getWidth() / 2,
					targetBounds.centerY() - tintedTarget.getHeight() / 2);
					c.drawBitmap(tintedTarget, 0, 0, targetCirclePaint);
				} else if (target.icon != null) {
					c.translate(targetBounds.centerX() - target.icon.getBounds().width() / 2,
					targetBounds.centerY() - target.icon.getBounds().height() / 2);
					target.icon.setAlpha(targetCirclePaint.getAlpha());
					target.icon.draw(c);
				}
			}
			c.restoreToCount(saveCount);
			
			if (debug) {
				drawDebugInformation(c);
			}
		}
		
		@Override
		public boolean onTouchEvent(MotionEvent e) {
			lastTouchX = e.getX();
			lastTouchY = e.getY();
			return super.onTouchEvent(e);
		}
		
		@Override
		public boolean onKeyDown(int keyCode, KeyEvent event) {
			if (isVisible() && cancelable && keyCode == KeyEvent.KEYCODE_BACK) {
				event.startTracking();
				return true;
			}
			
			return false;
		}
		
		@Override
		public boolean onKeyUp(int keyCode, KeyEvent event) {
			if (isVisible() && isInteractable && cancelable
			&& keyCode == KeyEvent.KEYCODE_BACK && event.isTracking() && !event.isCanceled()) {
				isInteractable = false;
				
				if (listener != null) {
					listener.onTargetCancel(this);
				} else {
					new Listener().onTargetCancel(this);
				}
				
				return true;
			}
			
			return false;
		}
		
		/**
     * Dismiss this view
     * @param tappedTarget If the user tapped the target or not
     *                     (results in different dismiss animations)
     */
		public void dismiss(boolean tappedTarget) {
			isDismissing = true;
			pulseAnimation.cancel();
			expandAnimation.cancel();
			if (tappedTarget) {
				dismissConfirmAnimation.start();
			} else {
				dismissAnimation.start();
			}
		}
		
		/** Specify whether to draw a wireframe around the view, useful for debugging **/
		public void setDrawDebug(boolean status) {
			if (debug != status) {
				debug = status;
				postInvalidate();
			}
		}
		
		/** Returns whether this view is visible or not **/
		public boolean isVisible() {
			return !isDismissed && visible;
		}
		
		void drawJitteredShadow(Canvas c) {
			final float baseAlpha = 0.20f * outerCircleAlpha;
			outerCircleShadowPaint.setStyle(Paint.Style.FILL_AND_STROKE);
			outerCircleShadowPaint.setAlpha((int) baseAlpha);
			c.drawCircle(outerCircleCenter[0], outerCircleCenter[1] + SHADOW_DIM, outerCircleRadius, outerCircleShadowPaint);
			outerCircleShadowPaint.setStyle(Paint.Style.STROKE);
			final int numJitters = 7;
			for (int i = numJitters - 1; i > 0; --i) {
				outerCircleShadowPaint.setAlpha((int) ((i / (float) numJitters) * baseAlpha));
				c.drawCircle(outerCircleCenter[0], outerCircleCenter[1] + SHADOW_DIM ,
				outerCircleRadius + (numJitters - i) * SHADOW_JITTER_DIM , outerCircleShadowPaint);
			}
		}
		
		void drawDebugInformation(Canvas c) {
			if (debugPaint == null) {
				debugPaint = new Paint();
				debugPaint.setARGB(255, 255, 0, 0);
				debugPaint.setStyle(Paint.Style.STROKE);
				debugPaint.setStrokeWidth(UiUtil.dp(getContext(), 1));
			}
			
			if (debugTextPaint == null) {
				debugTextPaint = new TextPaint();
				debugTextPaint.setColor(0xFFFF0000);
				debugTextPaint.setTextSize(UiUtil.sp(getContext(), 16));
			}
			
			// Draw wireframe
			debugPaint.setStyle(Paint.Style.STROKE);
			c.drawRect(textBounds, debugPaint);
			c.drawRect(targetBounds, debugPaint);
			c.drawCircle(outerCircleCenter[0], outerCircleCenter[1], 10, debugPaint);
			c.drawCircle(outerCircleCenter[0], outerCircleCenter[1], calculatedOuterCircleRadius - CIRCLE_PADDING, debugPaint);
			c.drawCircle(targetBounds.centerX(), targetBounds.centerY(), TARGET_RADIUS + TARGET_PADDING, debugPaint);
			
			// Draw positions and dimensions
			debugPaint.setStyle(Paint.Style.FILL);
			final String debugText =
			"Text bounds: " + textBounds.toShortString() + "\n" + "Target bounds: " + targetBounds.toShortString() + "\n" + "Center: " + outerCircleCenter[0] + " " + outerCircleCenter[1] + "\n" + "View size: " + getWidth() + " " + getHeight() + "\n" + "Target bounds: " + targetBounds.toShortString();
			
			if (debugStringBuilder == null) {
				debugStringBuilder = new SpannableStringBuilder(debugText);
			} else {
				debugStringBuilder.clear();
				debugStringBuilder.append(debugText);
			}
			
			if (debugLayout == null) {
				debugLayout = new DynamicLayout(debugText, debugTextPaint, getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
			}
			
			final int saveCount = c.save();
			{
				debugPaint.setARGB(220, 0, 0, 0);
				c.translate(0.0f, topBoundary);
				c.drawRect(0.0f, 0.0f, debugLayout.getWidth(), debugLayout.getHeight(), debugPaint);
				debugPaint.setARGB(255, 255, 0, 0);
				debugLayout.draw(c);
			}
			c.restoreToCount(saveCount);
		}
		
		void drawTintedTarget() {
			final android.graphics.drawable.Drawable icon = target.icon;
			if (!shouldTintTarget || icon == null) {
				tintedTarget = null;
				return;
			}
			
			if (tintedTarget != null) return;
			
			tintedTarget = Bitmap.createBitmap(icon.getIntrinsicWidth(), icon.getIntrinsicHeight(),
			Bitmap.Config.ARGB_8888);
			final Canvas canvas = new Canvas(tintedTarget);
			icon.setColorFilter(new PorterDuffColorFilter(
			outerCirclePaint.getColor(), PorterDuff.Mode.SRC_ATOP));
			icon.draw(canvas);
			icon.setColorFilter(null);
		}
		
		void updateTextLayouts() {
			final int textWidth = Math.min(getWidth(), TEXT_MAX_WIDTH) - TEXT_PADDING * 2;
			if (textWidth <= 0) {
				return;
			}
			
			titleLayout = new StaticLayout(title, titlePaint, textWidth,
			Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
			
			if (description != null) {
				descriptionLayout = new StaticLayout(description, descriptionPaint, textWidth,
				Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
			} else {
				descriptionLayout = null;
			}
		}
		
		float halfwayLerp(float lerp) {
			if (lerp < 0.5f) {
				return lerp / 0.5f;
			}
			
			return (1.0f - lerp) / 0.5f;
		}
		
		float delayedLerp(float lerp, float threshold) {
			if (lerp < threshold) {
				return 0.0f;
			}
			
			return (lerp - threshold) / (1.0f - threshold);
		}
		
		void calculateDimensions() {
			textBounds = getTextBounds();
			outerCircleCenter = getOuterCircleCenterPoint();
			calculatedOuterCircleRadius = getOuterCircleRadius(outerCircleCenter[0], outerCircleCenter[1], textBounds, targetBounds);
		}
		
		void calculateDrawingBounds() {
			if (outerCircleCenter == null) {
				// Called dismiss before we got a chance to display the tap target
				// So we have no center -> cant determine the drawing bounds
				return;
			}
			drawingBounds.left = (int) Math.max(0, outerCircleCenter[0] - outerCircleRadius);
			drawingBounds.top = (int) Math.min(0, outerCircleCenter[1] - outerCircleRadius);
			drawingBounds.right = (int) Math.min(getWidth(),
			outerCircleCenter[0] + outerCircleRadius + CIRCLE_PADDING);
			drawingBounds.bottom = (int) Math.min(getHeight(),
			outerCircleCenter[1] + outerCircleRadius + CIRCLE_PADDING);
		}
		
		int getOuterCircleRadius(int centerX, int centerY, Rect textBounds, Rect targetBounds) {
			final int targetCenterX = targetBounds.centerX();
			final int targetCenterY = targetBounds.centerY();
			final int expandedRadius = (int) (1.1f * TARGET_RADIUS);
			final Rect expandedBounds = new Rect(targetCenterX, targetCenterY, targetCenterX, targetCenterY);
			expandedBounds.inset(-expandedRadius, -expandedRadius);
			
			final int textRadius = maxDistanceToPoints(centerX, centerY, textBounds);
			final int targetRadius = maxDistanceToPoints(centerX, centerY, expandedBounds);
			return Math.max(textRadius, targetRadius) + CIRCLE_PADDING;
		}
		
		Rect getTextBounds() {
			final int totalTextHeight = getTotalTextHeight();
			final int totalTextWidth = getTotalTextWidth();
			
			final int possibleTop = targetBounds.centerY() - TARGET_RADIUS - TARGET_PADDING - totalTextHeight;
			final int top;
			if (possibleTop > topBoundary) {
				top = possibleTop;
			} else {
				top = targetBounds.centerY() + TARGET_RADIUS + TARGET_PADDING;
			}
			
			final int relativeCenterDistance = (getWidth() / 2) - targetBounds.centerX();
			final int bias = relativeCenterDistance < 0 ? -TEXT_POSITIONING_BIAS : TEXT_POSITIONING_BIAS;
			final int left = Math.max(TEXT_PADDING, targetBounds.centerX() - bias - totalTextWidth);
			final int right = Math.min(getWidth() - TEXT_PADDING, left + totalTextWidth);
			return new Rect(left, top, right, top + totalTextHeight);
		}
		
		int[] getOuterCircleCenterPoint() {
			if (inGutter(targetBounds.centerY())) {
				return new int[]{targetBounds.centerX(), targetBounds.centerY()};
			}
			
			final int targetRadius = Math.max(targetBounds.width(), targetBounds.height()) / 2 + TARGET_PADDING;
			final int totalTextHeight = getTotalTextHeight();
			
			final boolean onTop = targetBounds.centerY() - TARGET_RADIUS - TARGET_PADDING - totalTextHeight > 0;
			
			final int left = Math.min(textBounds.left, targetBounds.left - targetRadius);
			final int right = Math.max(textBounds.right, targetBounds.right + targetRadius);
			final int titleHeight = titleLayout == null ? 0 : titleLayout.getHeight();
			final int centerY = onTop ?
			targetBounds.centerY() - TARGET_RADIUS - TARGET_PADDING - totalTextHeight + titleHeight
			:
			targetBounds.centerY() + TARGET_RADIUS + TARGET_PADDING + titleHeight;
			
			return new int[] { (left + right) / 2, centerY };
		}
		
		int getTotalTextHeight() {
			if (titleLayout == null) {
				return 0;
			}
			
			if (descriptionLayout == null) {
				return titleLayout.getHeight() + TEXT_SPACING;
			}
			
			return titleLayout.getHeight() + descriptionLayout.getHeight() + TEXT_SPACING;
		}
		
		int getTotalTextWidth() {
			if (titleLayout == null) {
				return 0;
			}
			
			if (descriptionLayout == null) {
				return titleLayout.getWidth();
			}
			
			return Math.max(titleLayout.getWidth(), descriptionLayout.getWidth());
		}
		boolean inGutter(int y) {
			if (bottomBoundary > 0) {
				return y < GUTTER_DIM || y > bottomBoundary - GUTTER_DIM;
			} else {
				return y < GUTTER_DIM || y > getHeight() - GUTTER_DIM;
			}
		}
		int maxDistanceToPoints(int x1, int y1, Rect bounds) {
			final double tl = distance(x1, y1, bounds.left, bounds.top);
			final double tr = distance(x1, y1, bounds.right, bounds.top);
			final double bl = distance(x1, y1, bounds.left, bounds.bottom);
			final double br = distance(x1, y1, bounds.right, bounds.bottom);
			return (int) Math.max(tl, Math.max(tr, Math.max(bl, br)));
		}
		double distance(int x1, int y1, int x2, int y2) {
			return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		}
		void invalidateViewAndOutline(Rect bounds) {
			invalidate(bounds);
			if (outlineProvider != null && Build.VERSION.SDK_INT >= 21) {
				invalidateOutline();
			}
		}
	}
	
	static class ViewUtil {
		
		ViewUtil() {}
		
		private static boolean isLaidOut(View view) {
			return true;
		}
		static void onLaidOut(final View view, final Runnable runnable) {
			if (isLaidOut(view)) {
				runnable.run();
				return;
			}
			final ViewTreeObserver observer = view.getViewTreeObserver();
			observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
				@Override
				public void onGlobalLayout() {
					final ViewTreeObserver trueObserver;
					if (observer.isAlive()) {
						trueObserver = observer;
					} else {
						trueObserver = view.getViewTreeObserver();
					}
					removeOnGlobalLayoutListener(trueObserver, this);
					runnable.run();
				}
			});
		}
		@SuppressWarnings("deprecation")
		static void removeOnGlobalLayoutListener(ViewTreeObserver observer,
		ViewTreeObserver.OnGlobalLayoutListener listener) {
			if (Build.VERSION.SDK_INT >= 16) {
				observer.removeOnGlobalLayoutListener(listener);
			} else {
				observer.removeGlobalOnLayoutListener(listener);
			}
		}
		static void removeView(ViewManager parent, View child) {
			if (parent == null || child == null) {
				return;
			}
			try {
				parent.removeView(child);
			} catch (Exception ignored) {
			}
		}
	}
	
	static class ViewTapTarget extends TapTarget {
		final View view;
		
		ViewTapTarget(View view, CharSequence title,  CharSequence description) {
			super(title, description);
			if (view == null) {
				throw new IllegalArgumentException("Given null view to target");
			}
			this.view = view;
		}
		
		@Override
		public void onReady(final Runnable runnable) {
			ViewUtil.onLaidOut(view, new Runnable() {
				@Override
				public void run() {
					// Cache bounds
					final int[] location = new int[2];
					view.getLocationOnScreen(location);
					bounds = new Rect(location[0], location[1],
					location[0] + view.getWidth(), location[1] + view.getHeight());
					
					if (icon == null && view.getWidth() > 0 && view.getHeight() > 0) {
						final Bitmap viewBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
						final Canvas canvas = new Canvas(viewBitmap);
						view.draw(canvas);
						icon = new android.graphics.drawable.BitmapDrawable(view.getContext().getResources(), viewBitmap);
						icon.setBounds(0, 0, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
					}
					
					runnable.run();
				}
			});
		}
	}
	
	
	public void _dialog_esh() {
		final com.google.android.material.bottomsheet.BottomSheetDialog a = new com.google.android.material.bottomsheet.BottomSheetDialog(ViewActivity.this);
		View lay = getLayoutInflater().inflate(R.layout.esh, null);
		a.setContentView(lay);
		a.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
		final LinearLayout linear6  = (LinearLayout)lay.findViewById(R.id.linear6);
		final ImageView imageview3  = (ImageView)lay.findViewById(R.id.imageview3);
		a.setCancelable(true);
		a.show();
		linear6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0xFF000000));
		imageview3.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				i.setClass(getApplicationContext(), NewBuyEshActivity.class);
				startActivity(i);
				a.dismiss();
			}
		});
	}
	
	
	public void _offerVisible() {
		offer.setVisibility(View.VISIBLE);
		gridview_bazigran.setVisibility(View.GONE);
		pishnahadi.setVisibility(View.GONE);
		linear96.setVisibility(View.GONE);
		if (listmap1.size() == 0) {
			massage.setVisibility(View.VISIBLE);
		} else {
			massage.setVisibility(View.GONE);
		}
		_setMargin(offer, 0, 0, 0, 0);
		if (listmap1.size() < 12) {
			_setMargin(offer, 0, 0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(500)));
		}
		_color_tab();
		_rippleRoundStroke(linear224, l_color, "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0, "#50ffffff");
	}
	
	public class Viewpager1Adapter extends PagerAdapter {
		
		Context _context;
		ArrayList<HashMap<String, Object>> _data;
		
		public Viewpager1Adapter(Context _ctx, ArrayList<HashMap<String, Object>> _arr) {
			_context = _ctx;
			_data = _arr;
		}
		
		public Viewpager1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_context = getApplicationContext();
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public boolean isViewFromObject(View _view, Object _object) {
			return _view == _object;
		}
		
		@Override
		public void destroyItem(ViewGroup _container, int _position, Object _object) {
			_container.removeView((View) _object);
		}
		
		@Override
		public int getItemPosition(Object _object) {
			return super.getItemPosition(_object);
		}
		
		@Override
		public CharSequence getPageTitle(int pos) {
			// Use the Activity Event (onTabLayoutNewTabAdded) in order to use this method
			return "page " + String.valueOf(pos);
		}
		
		@Override
		public Object instantiateItem(ViewGroup _container,  final int _position) {
			View _view = LayoutInflater.from(_context).inflate(R.layout.save, _container, false);
			
			final RelativeLayout relativelayout1 = _view.findViewById(R.id.relativelayout1);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear72 = _view.findViewById(R.id.linear72);
			final TextView name = _view.findViewById(R.id.name);
			
			_container.addView(_view);
			return _view;
		}
	}
	
	public class Recyclerview4Adapter extends RecyclerView.Adapter<Recyclerview4Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview4Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.cus_name, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			textview1.setText(_data.get((int)_position).get("name_fa").toString().concat(" - ".concat(_data.get((int)_position).get("name").toString())));
			textview1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					textview2.setText(String.valueOf((Integer) _data.get((int)_position).get("id")));
					to.setClass(getApplicationContext(), MoreActivity.class);
					to.putExtra("type", "casts");
					to.putExtra("sortby", textview2.getText().toString());
					to.putExtra("name_cas", textview1.getText().toString());
					to.putExtra("profile_cas", _data.get((int)_position).get("image").toString());
					to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(to);
					ViewActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
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
			View _v = _inflater.inflate(R.layout.cus_name, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			textview1.setText(_data.get((int)_position).get("name_fa").toString().concat(" - ".concat(_data.get((int)_position).get("name").toString())));
			textview1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					textview2.setText(String.valueOf((Integer) _data.get((int)_position).get("id")));
					to.setClass(getApplicationContext(), MoreActivity.class);
					to.putExtra("type", "casts");
					to.putExtra("sortby", textview2.getText().toString());
					to.putExtra("name_cas", textview1.getText().toString());
					to.putExtra("profile_cas", _data.get((int)_position).get("image").toString());
					to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(to);
					ViewActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
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
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.cus_name, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			textview1.setText(_data.get((int)_position).get("name_fa").toString().concat(" - ".concat(_data.get((int)_position).get("name").toString())));
			textview1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					textview2.setText(String.valueOf((Integer) _data.get((int)_position).get("id")));
					to.setClass(getApplicationContext(), MoreActivity.class);
					to.putExtra("type", "casts");
					to.putExtra("sortby", textview2.getText().toString());
					to.putExtra("name_cas", textview1.getText().toString());
					to.putExtra("profile_cas", _data.get((int)_position).get("image").toString());
					to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(to);
					ViewActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
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
	
	public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public OfferAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
						startActivity(to);
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
	
	public class Gridview_bazigranAdapter extends RecyclerView.Adapter<Gridview_bazigranAdapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Gridview_bazigranAdapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.casts, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final TextView textview2 = _view.findViewById(R.id.textview2);
			final LinearLayout linear8 = _view.findViewById(R.id.linear8);
			final LinearLayout linear7 = _view.findViewById(R.id.linear7);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView name = _view.findViewById(R.id.name);
			
			name.setText(_data.get((int)_position).get("name_fa").toString());
			Glide.with(imageview1.getContext())
			.clear(imageview1);
			
			Glide.with(imageview1.getContext())
			.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=90&src=https://s35.upera.net/s3/casts/".concat(_data.get((int)_position).get("image").toString()))))))
			.placeholder(R.drawable.lino)
			.error(R.drawable.lino)
			.centerCrop()
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
			.into(imageview1);
			linear7.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					textview2.setText(String.valueOf((Integer) _data.get((int)_position).get("id")));
					to.setClass(getApplicationContext(), MoreActivity.class);
					to.putExtra("type", "casts");
					to.putExtra("sortby", textview2.getText().toString());
					to.putExtra("name_cas", name.getText().toString());
					to.putExtra("profile_cas", _data.get((int)_position).get("image").toString());
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
	
	public class PishnahadiAdapter extends RecyclerView.Adapter<PishnahadiAdapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public PishnahadiAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
						startActivity(to);
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
	
	public class Recyclerview6Adapter extends RecyclerView.Adapter<Recyclerview6Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview6Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.season_item, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView season_number = _view.findViewById(R.id.season_number);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			_setMargin(linear1, 8, 0, 0, 5);
			if (_position == 0) {
				_setMargin(linear1, 8, 8, 0, 5);
			}
			_rippleRoundStroke(linear1, "#1d2733", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getApplicationContext(), (int)(1)), "#37474f");
			season_number.setTextColor(0xFFFFFFFF);
			season_number.setText("فصل ".concat(_data.get((int)_position).get("season").toString()));
			if (String.valueOf((long)(season)).equals(_data.get((int)_position).get("season").toString())) {
				_rippleRoundStroke(linear1, "#ffffff", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getApplicationContext(), (int)(1)), "#37474f");
				season_number.setTextColor(0xFF000000);
			} else {
				
			}
			linear1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					if (!(season == Double.parseDouble(_data.get((int)_position).get("season").toString()))) {
						season = Double.parseDouble(_data.get((int)_position).get("season").toString());
						_change_text(_data.get((int)_position).get("season").toString());
					}
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
	
	public class QhesmatAdapter extends RecyclerView.Adapter<QhesmatAdapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public QhesmatAdapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.custome_season, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final TextView textview2 = _view.findViewById(R.id.textview2);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final LinearLayout linear11 = _view.findViewById(R.id.linear11);
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final ProgressBar progressbar1 = _view.findViewById(R.id.progressbar1);
			final TextView num = _view.findViewById(R.id.num);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final RelativeLayout relativelayout1 = _view.findViewById(R.id.relativelayout1);
			final LinearLayout linear9 = _view.findViewById(R.id.linear9);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final ImageView imageview2 = _view.findViewById(R.id.imageview2);
			final LinearLayout linear7 = _view.findViewById(R.id.linear7);
			final LinearLayout linear10 = _view.findViewById(R.id.linear10);
			final LinearLayout linear6 = _view.findViewById(R.id.linear6);
			final ImageView imageview3 = _view.findViewById(R.id.imageview3);
			final LinearLayout linear_dooble = _view.findViewById(R.id.linear_dooble);
			final ImageView imageview_dooble = _view.findViewById(R.id.imageview_dooble);
			
			linear_dooble.setVisibility(View.GONE);
			progressbar1.setVisibility(View.VISIBLE);
			if (d_video_uid.contains("max".concat(_data.get((int)_position).get("upera").toString()))) {
				new android.os.Handler().postDelayed(new Runnable() {
					@Override
					public void run() {
						String upera = _data.get((int)_position).get("upera").toString();
						String maxKey = "max" + upera;
						String posKey = "position" + upera;
						
						if (d_video_uid.contains(maxKey)) {
							String maxStr = d_video_uid.getString(maxKey, "");
							String posStr = d_video_uid.getString(posKey, "");
							
							if (!maxStr.equals("") && !posStr.equals("")) {
								double maxValue = Double.parseDouble(maxStr);
								double currentPos = Double.parseDouble(posStr);
								
								progressbar1.setMax((int) maxValue);
								progressbar1.setProgress((int) currentPos);
							}
						}
					}
				}, 100); // تأخیر 100 میلی‌ثانیه‌ای
			} else {
				progressbar1.setVisibility(View.GONE);
			}
			linear_dooble.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0x99000000));
			linear10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0x50000000));
			_ColourFilter(imageview_dooble, "#ffffff");
			_ColourFilter(imageview1, "#000000");
			_shape(SketchwareUtil.getDip(getApplicationContext(), (int)(15)), 0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(15)), "#ffffff", "#ffffff", 0, linear3);
			num.setText("قسمت ".concat(String.valueOf((long)(Double.parseDouble(_data.get((int)_position).get("episode_number").toString())))));
			textview1.setText(_data.get((int)_position).get("name_fa").toString());
			if (textview1.getText().toString().equals("قسمت ".concat(_data.get((int)_position).get("episode_number").toString()))) {
				textview1.setText(_data.get((int)_position).get("overview").toString());
			} else {
				textview1.setText(_data.get((int)_position).get("name_fa").toString());
			}
			Glide.with(imageview2.getContext())
			.clear(imageview2);
			
			Glide.with(imageview2.getContext())
			.load(save.getString("domain", "").concat("1080".concat("&h=".concat("1300".concat("&q=90&src=https://s35.upera.net/s3/backdrops/".concat(_data.get((int)_position).get("backdrop").toString()))))))
			.placeholder(R.drawable.nul)
			.error(R.drawable.nul)
			.centerCrop()
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
			.into(imageview2);
			cardview1.setCardBackgroundColor(Color.TRANSPARENT);
			cardview1.setRadius((float)SketchwareUtil.getDip(getApplicationContext(), (int)(15)));
			cardview1.setCardElevation((float)0);
			linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(17)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
			linear2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (check_get) {
						if (type_videoplayer.getString("type_videoplayer", "").equals("web")) {
							rt.setClass(getApplicationContext(), VideoplayerwebActivity.class);
						} else {
							rt.setClass(getApplicationContext(), VideoplayerActivity.class);
						}
						rt.putExtra("url", _data.get((int)_position).get("upera").toString());
						rt.putExtra("name", getIntent().getStringExtra("name").concat(" ".concat("فصل".concat(String.valueOf((long)(Double.parseDouble(_data.get((int)_position).get("season_number").toString())))).concat(" ".concat(num.getText().toString())))));
						rt.putExtra("dooble", "ندارد");
						rt.putExtra("zirnevis", "ندارد");
						rt.putExtra("id", getIntent().getStringExtra("id"));
						rt.putExtra("image", _data.get((int)_position).get("backdrop").toString());
						rt.putExtra("type", getIntent().getStringExtra("type"));
						rt.putExtra("backdrop", _data.get((int)_position).get("backdrop").toString());
						rt.putExtra("profile", getIntent().getStringExtra("image"));
						if (_data.get((int)_position).get("persian").toString().equals("1")) {
							rt.putExtra("dooble", "دارد");
						}
						if (_data.get((int)_position).get("persian").toString().equals("0")) {
							rt.putExtra("zirnevis", "دارد");
						}
						rt.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
						startActivity(rt);
					} else {
						
					}
				}
			});
			if (_data.get((int)_position).get("persian").toString().equals("1")) {
				linear_dooble.setVisibility(View.VISIBLE);
			}
			linear3.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					_download(_data.get((int)_position).get("upera").toString(), save.getString("domain", "").concat("382&h=200&q=").concat("100".concat("&src=https://thumb.upera.shop/s3/backdrops/".concat(_data.get((int)_position).get("backdrop").toString()))), "0");
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