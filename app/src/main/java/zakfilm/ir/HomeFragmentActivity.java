package zakfilm.ir;

import android.animation.*;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import smartdevelop.ir.eram.showcaseviewlib.*;
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
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

public class HomeFragmentActivity extends Fragment {
	
	private Timer _timer = new Timer();
	
	private double position = 0;
	private HashMap<String, Object> mop = new HashMap<>();
	private String type = "";
	private String age = "";
	private String theme = "";
	private String Address_photo = "";
	private String u = "";
	private String domain = "";
	private String width = "";
	private String height = "";
	private String round = "";
	private boolean req1 = false;
	private boolean req2 = false;
	private double num_cha = 0;
	private double num_select = 0;
	private String strings_position = "";
	private boolean req3 = false;
	private boolean req4 = false;
	private boolean req5 = false;
	private boolean req7 = false;
	private boolean req6 = false;
	private boolean req8 = false;
	private boolean req9 = false;
	private boolean req10 = false;
	private boolean req11 = false;
	private boolean req12 = false;
	private boolean req13 = false;
	private boolean req14 = false;
	private boolean req15 = false;
	private boolean req16 = false;
	private boolean req17 = false;
	private boolean req18 = false;
	private boolean req19 = false;
	private boolean req20 = false;
	private HashMap<String, Object> childAdapters = new HashMap<>();
	private double random = 0;
	private double posSlider = 0;
	private boolean request = false;
	private boolean request1 = false;
	private boolean request2 = false;
	private String jsonString = "";
	private boolean PovCheck = false;
	private HashMap<String, Object> headers = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> mp = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> pov = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> s_ani = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listMap = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_hin = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_vis = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> add_save = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> fan = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> sport = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> koota = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_posters = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> imdb = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> seta = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> setta = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> cha = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> ser = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> iranii = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> nul = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> famil = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> slider = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> data = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> adventur = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> bio = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> comd = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> crim = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> doc = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> tars = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> roma = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> sci = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> thri = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_items = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> apk = new ArrayList<>();
	private ArrayList<String> item_gride = new ArrayList<>();
	private ArrayList<String> newA = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> new_list_items = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> hist = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> jang = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> music = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> shortt = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> slider_vishe = new ArrayList<>();
	
	private RelativeLayout relativelayout1;
	private LinearLayout linear9;
	private LinearLayout linear87;
	private LinearLayout linear173;
	private RecyclerView recyclerview1;
	private ViewPager viewpager1;
	private ProgressBar progressbar1;
	private LinearLayout linear3;
	private LinearLayout linear76;
	private LinearLayout null1;
	private LinearLayout null2;
	private LinearLayout hashtag_new;
	private LinearLayout linear179;
	private LinearLayout null3;
	private LinearLayout nul7;
	private LinearLayout nul6;
	private LinearLayout nul5;
	private LinearLayout nul4;
	private ViewPager slider1;
	private LinearLayout linear172;
	private LinearLayout lin_kids;
	private LinearLayout lin_series;
	private LinearLayout lin_movie;
	private TextView textview47;
	private LinearLayout linear88;
	private ImageView imageview58;
	private TextView textview94;
	private ImageView imageview59;
	private TextView textview95;
	private ImageView imageview60;
	private TextView textview96;
	private ImageView imageview61;
	private ImageView imageview39;
	
	private Vibrator vibrate;
	private ObjectAnimator ser_v = new ObjectAnimator();
	private ObjectAnimator ser_un = new ObjectAnimator();
	private TimerTask tim;
	private Intent to = new Intent();
	private RequestNetwork get_fov;
	private RequestNetwork.RequestListener _get_fov_request_listener;
	private RequestNetwork get_new;
	private RequestNetwork.RequestListener _get_new_request_listener;
	private RequestNetwork get;
	private RequestNetwork.RequestListener _get_request_listener;
	private SharedPreferences list_pov;
	private SharedPreferences get_data;
	private RequestNetwork get_hindi;
	private RequestNetwork.RequestListener _get_hindi_request_listener;
	private Vibrator vibrate1;
	private RequestNetwork get_vishe;
	private RequestNetwork.RequestListener _get_vishe_request_listener;
	private SharedPreferences saved_video;
	private SharedPreferences dast_pish;
	private RequestNetwork sports;
	private RequestNetwork.RequestListener _sports_request_listener;
	private RequestNetwork fantasy;
	private RequestNetwork.RequestListener _fantasy_request_listener;
	private RequestNetwork kootah;
	private RequestNetwork.RequestListener _kootah_request_listener;
	private RequestNetwork oldest;
	private RequestNetwork.RequestListener _oldest_request_listener;
	private RequestNetwork setaregan;
	private RequestNetwork.RequestListener _setaregan_request_listener;
	private RequestNetwork getcats;
	private RequestNetwork.RequestListener _getcats_request_listener;
	private RequestNetwork character;
	private RequestNetwork.RequestListener _character_request_listener;
	private RequestNetwork getcha;
	private RequestNetwork.RequestListener _getcha_request_listener;
	private Intent intent = new Intent();
	private SharedPreferences height_img;
	private SharedPreferences width_img;
	private SharedPreferences round_img;
	private Intent imdbb = new Intent();
	private Intent an = new Intent();
	private Intent cas = new Intent();
	private RequestNetwork irani;
	private RequestNetwork.RequestListener _irani_request_listener;
	private Intent ir = new Intent();
	private RequestNetwork history;
	private RequestNetwork.RequestListener _history_request_listener;
	private RequestNetwork sires;
	private RequestNetwork.RequestListener _sires_request_listener;
	private Intent seris = new Intent();
	private Intent vb = new Intent();
	private RequestNetwork family;
	private RequestNetwork.RequestListener _family_request_listener;
	private SharedPreferences save;
	private RequestNetwork get_slider;
	private RequestNetwork.RequestListener _get_slider_request_listener;
	private AlertDialog cus;
	private RequestNetwork action;
	private RequestNetwork.RequestListener _action_request_listener;
	private RequestNetwork adventure;
	private RequestNetwork.RequestListener _adventure_request_listener;
	private RequestNetwork biography;
	private RequestNetwork.RequestListener _biography_request_listener;
	private RequestNetwork comedy;
	private RequestNetwork.RequestListener _comedy_request_listener;
	private RequestNetwork crime;
	private RequestNetwork.RequestListener _crime_request_listener;
	private RequestNetwork documentary;
	private RequestNetwork.RequestListener _documentary_request_listener;
	private Intent montakheb = new Intent();
	private RequestNetwork tarsnak;
	private RequestNetwork.RequestListener _tarsnak_request_listener;
	private RequestNetwork asheghane;
	private RequestNetwork.RequestListener _asheghane_request_listener;
	private RequestNetwork sci_fi;
	private RequestNetwork.RequestListener _sci_fi_request_listener;
	private RequestNetwork thriller;
	private RequestNetwork.RequestListener _thriller_request_listener;
	private RequestNetwork war;
	private RequestNetwork.RequestListener _war_request_listener;
	private RequestNetwork musical;
	private RequestNetwork.RequestListener _musical_request_listener;
	private RequestNetwork shorts;
	private RequestNetwork.RequestListener _shorts_request_listener;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.home_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		FirebaseApp.initializeApp(getContext());
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		relativelayout1 = _view.findViewById(R.id.relativelayout1);
		linear9 = _view.findViewById(R.id.linear9);
		linear87 = _view.findViewById(R.id.linear87);
		linear173 = _view.findViewById(R.id.linear173);
		recyclerview1 = _view.findViewById(R.id.recyclerview1);
		viewpager1 = _view.findViewById(R.id.viewpager1);
		progressbar1 = _view.findViewById(R.id.progressbar1);
		linear3 = _view.findViewById(R.id.linear3);
		linear76 = _view.findViewById(R.id.linear76);
		null1 = _view.findViewById(R.id.null1);
		null2 = _view.findViewById(R.id.null2);
		hashtag_new = _view.findViewById(R.id.hashtag_new);
		linear179 = _view.findViewById(R.id.linear179);
		null3 = _view.findViewById(R.id.null3);
		nul7 = _view.findViewById(R.id.nul7);
		nul6 = _view.findViewById(R.id.nul6);
		nul5 = _view.findViewById(R.id.nul5);
		nul4 = _view.findViewById(R.id.nul4);
		slider1 = _view.findViewById(R.id.slider1);
		linear172 = _view.findViewById(R.id.linear172);
		lin_kids = _view.findViewById(R.id.lin_kids);
		lin_series = _view.findViewById(R.id.lin_series);
		lin_movie = _view.findViewById(R.id.lin_movie);
		textview47 = _view.findViewById(R.id.textview47);
		linear88 = _view.findViewById(R.id.linear88);
		imageview58 = _view.findViewById(R.id.imageview58);
		textview94 = _view.findViewById(R.id.textview94);
		imageview59 = _view.findViewById(R.id.imageview59);
		textview95 = _view.findViewById(R.id.textview95);
		imageview60 = _view.findViewById(R.id.imageview60);
		textview96 = _view.findViewById(R.id.textview96);
		imageview61 = _view.findViewById(R.id.imageview61);
		imageview39 = _view.findViewById(R.id.imageview39);
		vibrate = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
		get_fov = new RequestNetwork((Activity) getContext());
		get_new = new RequestNetwork((Activity) getContext());
		get = new RequestNetwork((Activity) getContext());
		list_pov = getContext().getSharedPreferences("list_pov", Activity.MODE_PRIVATE);
		get_data = getContext().getSharedPreferences("get_data", Activity.MODE_PRIVATE);
		get_hindi = new RequestNetwork((Activity) getContext());
		vibrate1 = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
		get_vishe = new RequestNetwork((Activity) getContext());
		saved_video = getContext().getSharedPreferences("saved_video", Activity.MODE_PRIVATE);
		dast_pish = getContext().getSharedPreferences("dast_pish", Activity.MODE_PRIVATE);
		sports = new RequestNetwork((Activity) getContext());
		fantasy = new RequestNetwork((Activity) getContext());
		kootah = new RequestNetwork((Activity) getContext());
		oldest = new RequestNetwork((Activity) getContext());
		setaregan = new RequestNetwork((Activity) getContext());
		getcats = new RequestNetwork((Activity) getContext());
		character = new RequestNetwork((Activity) getContext());
		getcha = new RequestNetwork((Activity) getContext());
		height_img = getContext().getSharedPreferences("height_img", Activity.MODE_PRIVATE);
		width_img = getContext().getSharedPreferences("width_img", Activity.MODE_PRIVATE);
		round_img = getContext().getSharedPreferences("round_img", Activity.MODE_PRIVATE);
		irani = new RequestNetwork((Activity) getContext());
		history = new RequestNetwork((Activity) getContext());
		sires = new RequestNetwork((Activity) getContext());
		family = new RequestNetwork((Activity) getContext());
		save = getContext().getSharedPreferences("save", Activity.MODE_PRIVATE);
		get_slider = new RequestNetwork((Activity) getContext());
		action = new RequestNetwork((Activity) getContext());
		adventure = new RequestNetwork((Activity) getContext());
		biography = new RequestNetwork((Activity) getContext());
		comedy = new RequestNetwork((Activity) getContext());
		crime = new RequestNetwork((Activity) getContext());
		documentary = new RequestNetwork((Activity) getContext());
		tarsnak = new RequestNetwork((Activity) getContext());
		asheghane = new RequestNetwork((Activity) getContext());
		sci_fi = new RequestNetwork((Activity) getContext());
		thriller = new RequestNetwork((Activity) getContext());
		war = new RequestNetwork((Activity) getContext());
		musical = new RequestNetwork((Activity) getContext());
		shorts = new RequestNetwork((Activity) getContext());
		
		linear87.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear172.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		lin_kids.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (age.equals("PG-13")) {
					vibrate1.vibrate((long)(100));
					imageview59.setVisibility(View.GONE);
					age = "0";
					lin_kids.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), (int)0, 0xFFFF1744, 0x501D2733));
				} else {
					imageview59.setVisibility(View.VISIBLE);
					age = "PG-13";
					lin_kids.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFFFF1744, 0x501D2733));
				}
				_load_data_offline();
			}
		});
		
		lin_series.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (type.equals("series")) {
					vibrate1.vibrate((long)(100));
					imageview60.setVisibility(View.GONE);
					imageview61.setVisibility(View.GONE);
					type = "0";
					_rippleRoundStroke(lin_series, "#501d2734", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0, save.getString("theme", ""));
				} else {
					imageview60.setVisibility(View.VISIBLE);
					type = "series";
					_rippleRoundStroke(lin_series, "#501d2734", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), save.getString("theme", ""));
				}
				imageview61.setVisibility(View.GONE);
				_rippleRoundStroke(lin_movie, "#501d2734", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0, save.getString("theme", ""));
				_load_data_offline();
			}
		});
		
		lin_movie.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (type.equals("movie")) {
					vibrate1.vibrate((long)(100));
					imageview61.setVisibility(View.GONE);
					imageview60.setVisibility(View.GONE);
					type = "0";
					_rippleRoundStroke(lin_movie, "#501d2733", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0, save.getString("theme", ""));
				} else {
					imageview61.setVisibility(View.VISIBLE);
					type = "movie";
					_rippleRoundStroke(lin_movie, "#501d2733", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), save.getString("theme", ""));
				}
				imageview60.setVisibility(View.GONE);
				_rippleRoundStroke(lin_series, "#501d2733", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0, save.getString("theme", ""));
				_load_data_offline();
			}
		});
		
		imageview39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				recyclerview1.getLayoutManager().scrollToPosition(0);
				
			}
		});
		
		ser_v.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		ser_un.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		_get_fov_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try {
					mop = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
					if ((boolean)mop.get("state")) {
						pov = new Gson().fromJson((new Gson()).toJson(mop.get("data")), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
					}
				} catch (Exception e) {
					
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_get_new_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (_response.equals("{\"message\":\"No records found\"}")) {
					
				} else {
					if (getActivity() != null) {
						
						mp = JsonParser.parseList(_response);
					} else {
						// اگر صفحه یا Activity null بود، کاری انجام نمی‌شود
					}
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_get_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					if (_tag.equals("war")) {
						s_ani = JsonParser.parseList(_response);
					} else {
						if (_tag.equals("comedi")) {
							listMap = JsonParser.parseList(_response);
						} else {
							
						}
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
		
		_get_hindi_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					list_hin = JsonParser.parseList(_response);
					_refreshRec();
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
		
		_get_vishe_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					if (_response.equals("{\"message\":\"No records found\"}")) {
						
					} else {
						String jsonString = _response;
						
						try {
							JSONObject jsonObject = new JSONObject(jsonString);
							JSONObject dataObject = jsonObject.getJSONObject("data");
							JSONObject listObject = dataObject.getJSONObject("list");
							JSONArray dataArray = listObject.getJSONArray("data");
							
							list_posters.clear();
							
							// ✅ بدون محدودیت تعداد
							for (int i = 0; i < dataArray.length(); i++) {
								
								JSONObject item = dataArray.getJSONObject(i);
								
								HashMap<String, Object> map = new HashMap<>();
								
								Iterator<String> keys = item.keys();
								while (keys.hasNext()) {
									String key = keys.next();
									map.put(key, item.get(key));
								}
								
								list_posters.add(map);
							}
							
						} catch (JSONException e) {
							e.printStackTrace();
						}
						
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
		
		_sports_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					sport = JsonParser.parseList(_response);
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
		
		_fantasy_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					fan = JsonParser.parseList(_response);
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
		
		_kootah_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					koota = JsonParser.parseList(_response);
					recyclerview1.getLayoutManager().scrollToPosition(0);
					
					recyclerview1.setVisibility(View.VISIBLE);
					linear173.setVisibility(View.GONE);
					_refreshRec();
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
		
		_oldest_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					imdb = JsonParser.parseList(_response);
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
		
		_setaregan_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
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
		
		_getcats_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					// فرض می‌شود که _response حاوی JSON باشد
					String jsonString = _response;
					
					try {
						// مرحله 1: ایجاد آبجکت جیسون اصلی
						JSONObject jsonObject = new JSONObject(jsonString);
						
						// مرحله 2: به سراغ کلید "data" بروید
						JSONObject dataObject = jsonObject.getJSONObject("data");
						
						// مرحله 3: به جای "list"، آرایه "casts" را بگیرید
						JSONArray filmographyArray = dataObject.getJSONArray("filmography");
						
						// لیست مپ برای ذخیره داده‌ها
						setta.clear(); // ابتدا لیست را پاک می‌کنیم
						
						// مرحله 4: حلقه روی آرایه جیسون و اضافه کردن به ListMap
						for (int i = 0; i < filmographyArray.length(); i++) {
							// دریافت هر آیتم از آرایه به عنوان آبجکت جیسون
							JSONObject item = filmographyArray.getJSONObject(i);
							
							// تبدیل آبجکت جیسون به Map (لیست مپ)
							HashMap<String, Object> map = new HashMap<>();
							
							// اضافه کردن هر کلید-مقدار از آبجکت جیسون به Map
							Iterator<String> keys = item.keys();
							while (keys.hasNext()) {
								String key = keys.next();
								map.put(key, item.get(key));
							}
							
							// اضافه کردن Map به listmap1
							setta.add(map);
						}
						
					} catch (JSONException e) {
						e.printStackTrace();
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
		
		_character_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
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
						cha.clear(); // ابتدا لیست را پاک می‌کنیم
						
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
							cha.add(map);
						}
						
					} catch (JSONException e) {
						e.printStackTrace();
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
		
		_getcha_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					// فرض می‌شود که _response حاوی JSON باشد
					String jsonString = _response;
					
					try {
						// مرحله 1: ایجاد آبجکت جیسون اصلی
						JSONObject jsonObject = new JSONObject(jsonString);
						
						// مرحله 2: به سراغ کلید "data" بروید
						JSONObject dataObject = jsonObject.getJSONObject("data");
						
						// مرحله 3: به جای "list"، آرایه "casts" را بگیرید
						JSONArray filmographyArray = dataObject.getJSONArray("filmography");
						
						// لیست مپ برای ذخیره داده‌ها
						ser.clear(); // ابتدا لیست را پاک می‌کنیم
						
						// مرحله 4: حلقه روی آرایه جیسون و اضافه کردن به ListMap
						for (int i = 0; i < filmographyArray.length(); i++) {
							// دریافت هر آیتم از آرایه به عنوان آبجکت جیسون
							JSONObject item = filmographyArray.getJSONObject(i);
							
							// تبدیل آبجکت جیسون به Map (لیست مپ)
							HashMap<String, Object> map = new HashMap<>();
							
							// اضافه کردن هر کلید-مقدار از آبجکت جیسون به Map
							Iterator<String> keys = item.keys();
							while (keys.hasNext()) {
								String key = keys.next();
								map.put(key, item.get(key));
							}
							
							// اضافه کردن Map به listmap1
							ser.add(map);
						}
						
					} catch (JSONException e) {
						e.printStackTrace();
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
		
		_irani_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					// فرض می‌شود که _response حاوی JSON باشد
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
						
						// لیست مپ برای ذخیره داده‌ها
						iranii.clear(); // ابتدا لیست را پاک می‌کنیم
						
						// مرحله 5: حلقه روی آرایه جیسون و اضافه کردن به ListMap
						for (int i = 0; i < dataArray.length(); i++) {
							// دریافت هر آیتم از آرایه به عنوان آبجکت جیسون
							JSONObject item = dataArray.getJSONObject(i);
							
							// بررسی مقدار کلید "traffic"
							int trafficValue = item.optInt("free", 0); // مقدار پیش‌فرض 0 در نظر گرفته شده است
							if (trafficValue == 0) {
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
							
							// اضافه کردن Map به listmap1
							iranii.add(map);
						}
						
					} catch (JSONException e) {
						e.printStackTrace();
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
		
		_history_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					hist = JsonParser.parseList(_response);
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
		
		_sires_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_family_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					famil = JsonParser.parseList(_response);
					request = false;
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
		
		_get_slider_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					if (_response.equals("{\"message\":\"No records found\"}")) {
						
					} else {
						position = 0;
						try {
							String jsonString = _response;
							
							try {
								JSONObject jsonObject = new JSONObject(jsonString);
								JSONObject dataObject = jsonObject.getJSONObject("data");
								JSONArray slidersArray = dataObject.getJSONArray("sliders");
								
								slider.clear();
								
								// تعیین محدودیت 15 آیتم
								int limit = Math.min(slidersArray.length(), 10);
								
								for (int i = 0; i < limit; i++) {
									JSONObject item = slidersArray.getJSONObject(i);
									
									HashMap<String, Object> map = new HashMap<>();
									
									Iterator<String> keys = item.keys();
									while (keys.hasNext()) {
										String key = keys.next();
										map.put(key, item.get(key));
									}
									
									slider.add(map);
								}
								
							} catch (JSONException e) {
								e.printStackTrace();
							}
							
						} catch (Exception e) {
							
						}
						save.edit().putString("poster", slider.get((int)0).get("image_src").toString()).commit();
						_refreshRec();
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
		
		_action_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					data = JsonParser.parseList(_response);
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
		
		_adventure_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					adventur = JsonParser.parseList(_response);
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
		
		_biography_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					bio = JsonParser.parseList(_response);
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
		
		_comedy_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					comd = JsonParser.parseList(_response);
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
		
		_crime_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					crim = JsonParser.parseList(_response);
					request1 = false;
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
		
		_documentary_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					doc = JsonParser.parseList(_response);
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
		
		_tarsnak_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					tars = JsonParser.parseList(_response);
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
		
		_asheghane_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					roma = JsonParser.parseList(_response);
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
		
		_sci_fi_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					sci = JsonParser.parseList(_response);
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
		
		_thriller_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					thri = JsonParser.parseList(_response);
					request2 = false;
					_refreshRec();
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
		
		_war_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					jang = JsonParser.parseList(_response);
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
		
		_musical_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					music = JsonParser.parseList(_response);
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
		
		_shorts_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (getActivity() != null) {
					
					shortt = JsonParser.parseList(_response);
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
		if (getActivity() != null) {
			
			progressbar1.setVisibility(View.GONE);
			linear87.setVisibility(View.GONE);
			domain = save.getString("domain", "");
			width = width_img.getString("width_img", "");
			height = height_img.getString("height_img", "");
			theme = save.getString("theme", "");
			round = round_img.getString("round_img", "");
			request = true;
			request1 = true;
			request2 = true;
			type = "0";
			age = "0";
			_more();
			_ui();
			textview47.setTypeface(Typeface.createFromAsset(getContext().getAssets(),"fonts/dana.ttf"), 1);
			int startValue = 300;
			int endValue = 500;
			
			recyclerview1.addOnScrollListener(new RecyclerView.OnScrollListener() {
				@Override
				public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
					super.onScrolled(recyclerView, dx, dy);
					
					int currentValue = recyclerView.computeVerticalScrollOffset();
					
					if (currentValue < startValue) {
						linear87.setAlpha(0f);
						linear87.setVisibility(View.GONE);
						
					} else if (currentValue <= endValue) {
						
						float progress = (float)(currentValue - startValue) / (endValue - startValue);
						linear87.setAlpha(progress);
						linear87.setVisibility(View.VISIBLE);
						
					} else {
						linear87.setAlpha(1f);
					}
				}
			});
			
		} else {
			// اگر صفحه یا Activity null بود، کاری انجام نمی‌شود
		}
	}
	
	
	@Override
	public void onStart() {
		super.onStart();
		if (getActivity() != null) {
			
			posSlider = 0;
			num_select = 0;
			num_cha = 0;
			_request_slider_imqges();
		} else {
			// اگر صفحه یا Activity null بود، کاری انجام نمی‌شود
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (getActivity() != null) {
			
			_ColourFilter(imageview59, "#ff1744");
			_ColourFilter(imageview60, save.getString("theme", ""));
			_ColourFilter(imageview61, save.getString("theme", ""));
		} else {
			// اگر صفحه یا Activity null بود، کاری انجام نمی‌شود
		}
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
	
	
	public void _ColourFilter(final ImageView _imageview, final String _color) {
		_imageview.clearColorFilter(); 
		_imageview.setColorFilter(Color.parseColor(_color.toString()));
	}
	
	
	public void _ui() {
		if (getActivity() != null) {
			
			recyclerview1.setHasFixedSize(true);
			BlurUtil.applyBlur(getContext().getApplicationContext(), linear76, 15f);
			BlurUtil.applyBlur(getContext().getApplicationContext(), linear3, 15f);
			recyclerview1.setVisibility(View.GONE);
			linear173.setVisibility(View.VISIBLE);
			list_items = new Gson().fromJson("[\n  {\n    \"type\": \"page\",\n    \"list\": \"new_titles\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"new_titles\",\n    \"title\": \"عناوین جدید\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"hot\",\n    \"title\": \"داغ‌ترین‌ها\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"top\",\n    \"title\": \"منتخب ها\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"animation\",\n    \"title\": \"انیمیشن\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"superhero\",\n    \"title\": \"ابر قهرمانی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"sport\",\n    \"title\": \"ورزشی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"fantasy\",\n    \"title\": \"فانتزی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"western\",\n    \"title\": \"وسترن\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"free\",\n    \"title\": \"ایرانی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"history\",\n    \"title\": \"تاریخی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"family\",\n    \"title\": \"خانوادگی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"action\",\n    \"title\": \"اکشن\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"adventure\",\n    \"title\": \"ماجراجویی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"biography\",\n    \"title\": \"زندگی‌نامه\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"comedy\",\n    \"title\": \"کمدی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"crime\",\n    \"title\": \"جنایی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"documentary\",\n    \"title\": \"مستند\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"horror\",\n    \"title\": \"ترسناک\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"romance\",\n    \"title\": \"عاشقانه\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"sci_fi\",\n    \"title\": \"علمی‌تخیلی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"thriller\",\n    \"title\": \"هیجانی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"war\",\n    \"title\": \"جنگی\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"musical\",\n    \"title\": \"موزیکال\"\n  },\n  {\n    \"type\": \"img\"\n  },\n  {\n    \"type\": \"rec\",\n    \"list\": \"short\",\n    \"title\": \"کوتاه\"\n  },\n  {\n    \"type\": \"img\"\n  }\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			recyclerview1.setAdapter(new Recyclerview1Adapter(list_items));
			recyclerview1.setLayoutManager(new LinearLayoutManager(getContext()));
			recyclerview1.smoothScrollToPosition((int)list_items.size());
			getActivity().getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
			textview47.setShadowLayer(9, 2, 2, Color.parseColor("#000000"));
			linear87.setElevation((float)10);
			imageview59.setVisibility(View.GONE);
			imageview60.setVisibility(View.GONE);
			imageview61.setVisibility(View.GONE);
			_ColourFilter(imageview58, "#ff1744");
			lin_movie.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0x991D2733));
			lin_series.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0x991D2733));
			lin_kids.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0x991D2733));
			null1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), 0xFF1D2733));
			null2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), 0xFF1D2733));
			null3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), 0xFF1D2733));
			nul4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), 0xFF1D2733));
			nul5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), 0xFF1D2733));
			nul6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), 0xFF1D2733));
			nul7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), 0xFF1D2733));
		} else {
			// اگر صفحه یا Activity null بود، کاری انجام نمی‌شود
		}
	}
	
	
	public void _load_data_offline() {
		if (getActivity() != null) {
			
			recyclerview1.smoothScrollToPosition((int)0);
			recyclerview1.setVisibility(View.GONE);
			linear173.setVisibility(View.VISIBLE);
			_request_slider_imqges();
			get_new.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/new_titles?country=noIR&sortby=created".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _get_new_request_listener);
			get_vishe.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/hot?country=noIR&sortby=created".concat("&f_type=".concat(type).concat("&age=".concat(age))), "view_pager", _get_vishe_request_listener);
			_req2();
			get.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/animation?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "war", _get_request_listener);
			get_hindi.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/superhero?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "hindi", _get_hindi_request_listener);
			kootah.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/western?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _kootah_request_listener);
			irani.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/free?country=IR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _irani_request_listener);
			history.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/history?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _history_request_listener);
			family.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/family?country=noIR&sortby=newest".concat("&f_type=".concat(type.concat("&age=".concat(age)))), "", _family_request_listener);
			sports.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/sport?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _sports_request_listener);
			fantasy.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/fantasy?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _fantasy_request_listener);
			action.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/action?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _action_request_listener);
			adventure.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/adventure?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _adventure_request_listener);
			biography.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/biography?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _biography_request_listener);
			comedy.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/comedy?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _comedy_request_listener);
			crime.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/crime?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _crime_request_listener);
			documentary.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/documentary?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _documentary_request_listener);
			tarsnak.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/horror?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _tarsnak_request_listener);
			asheghane.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/romance?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _asheghane_request_listener);
			sci_fi.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/sci_fi?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _sci_fi_request_listener);
			thriller.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/thriller?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _thriller_request_listener);
			war.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/war?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _war_request_listener);
			musical.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/musical?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _musical_request_listener);
			shorts.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/short?country=noIR&sortby=newest".concat("&f_type=".concat(type).concat("&age=".concat(age))), "", _shorts_request_listener);
			progressbar1.setVisibility(View.VISIBLE);
		} else {
			// اگر صفحه یا Activity null بود، کاری انجام نمی‌شود
		}
	}
	
	
	public void _clickAnimation(final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
	}
	
	
	public void _animation_position_view(final double _position, final View _view) {
		
	}
	
	
	public void _more() {
		if (getActivity() != null) {
			
			_gone();
			_load_data_offline();
			_request_slider_imqges();
		} else {
			// اگر صفحه یا Activity null بود، کاری انجام نمی‌شود
		}
	}
	
	
	public void _gone() {
		
	}
	
	
	public void _request_slider_imqges() {
		get_slider.startRequestNetwork(RequestNetworkController.GET, "https://web.upera.tv/api/v1/get/slider?country=noIR".concat("&f_type=".concat(type).concat("&age=".concat("0"))), "", _get_slider_request_listener);
		get_vishe.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/get_listV2/hot?country=noIR&sortby=created".concat("&f_type=".concat(type).concat("&age=".concat(age))), "view_pager", _get_vishe_request_listener);
	}
	
	
	public void _adapter() {
	}
	public class Myrecyclerview2_0Adapter extends RecyclerView.Adapter<Myrecyclerview2_0Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Myrecyclerview2_0Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		public void updateData(ArrayList<HashMap<String, Object>> newData) {
			_data.clear();
			_data.addAll(newData);
			notifyDataSetChanged();
		}
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getActivity().getLayoutInflater();
			View _v = _inflater.inflate(R.layout.cus, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			
			
			
			
			// LinearLayouts
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final LinearLayout linear8 = _view.findViewById(R.id.linear8);
			final LinearLayout linear13 = _view.findViewById(R.id.linear13);
			final LinearLayout linear14 = _view.findViewById(R.id.linear14);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final LinearLayout linear6 = _view.findViewById(R.id.linear6);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final LinearLayout null_1 = _view.findViewById(R.id.null_1);
			final LinearLayout linear7 = _view.findViewById(R.id.linear7);
			
			// RelativeLayouts
			final RelativeLayout linear2 = _view.findViewById(R.id.linear2);
			final RelativeLayout relativelayout1 = _view.findViewById(R.id.relativelayout1);
			
			// TextViews
			final TextView name = _view.findViewById(R.id.name);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView num = _view.findViewById(R.id.num);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			// ImageViews
			final ImageView imag_sma0 = _view.findViewById(R.id.imag_sma0);
			final ImageView imag_sma1 = _view.findViewById(R.id.imag_sma1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final ImageView imageview2 = _view.findViewById(R.id.imageview2);
			
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
				linear7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), 0xFF1D2733));
				null_1.setVisibility(View.VISIBLE);
				linear5.setVisibility(View.GONE);
				linear2.setVisibility(View.GONE);
			} else {
				name.setText(_data.get((int)_position).get("name_fa").toString());
				num.setText(_data.get((int)_position).get("persian").toString());
				if (num.getText().toString().equals("1")) {
					linear4.setVisibility(View.VISIBLE);
				} else {
					
				}
				if (_data.get((int)0).get("poster").toString().equals(pov.get((int)0).get("poster").toString())) {
					if (_data.get((int)_position).get("poster").toString().toString().trim().startsWith("http")) {
						u = _data.get((int)_position).get("poster").toString();
					} else {
						u = domain.concat(width.concat("&h=".concat(height.concat("&q=90&src=https://s35.upera.net/s3/posters/".concat(_data.get((int)_position).get("poster").toString())))));
					}
					PovCheck = true;
				} else {
					u = domain.concat(width.concat("&h=".concat(height.concat("&q=90&src=https://s35.upera.net/s3/posters/".concat(_data.get((int)_position).get("poster").toString())))));
				}
				Glide.with(imageview1.getContext())
				.clear(imageview1);
				
				Glide.with(imageview1.getContext())
				.load(u)
				.placeholder(R.drawable.nul)
				.error(R.drawable.nul)
				.centerCrop()
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round)))
				.into(imageview1);
				if (!_data.get((int)_position).get("type").toString().equals("movie")) {
					Glide.with(imag_sma0.getContext())
					.clear(imag_sma0);
					
					Glide.with(imag_sma0.getContext())
					.load(u)
					.placeholder(R.drawable.nul)
					.error(R.drawable.nul)
					.centerCrop()
					.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round)))
					.into(imag_sma0);
					Glide.with(imag_sma1.getContext())
					.clear(imag_sma1);
					
					Glide.with(imag_sma1.getContext())
					.load(u)
					.placeholder(R.drawable.nul)
					.error(R.drawable.nul)
					.centerCrop()
					.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(Integer.parseInt(round)))
					.into(imag_sma1);
					imag_sma0.setVisibility(View.VISIBLE);
					imag_sma1.setVisibility(View.VISIBLE);
				}
				if (_data.get((int)_position).get("type").toString().equals("episode")) {
					name.setText(_data.get((int)_position).get("series_name_fa").toString());
					textview1.setVisibility(View.VISIBLE);
					textview1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(4)), 0xFFFF1744));
					textview1.setTextSize((int)6);
					textview1.setText("قسمت ".concat(_data.get((int)_position).get("episode_number").toString().concat(" جدید")));
				} else {
					name.setText(_data.get((int)_position).get("name_fa").toString());
				}
				linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), 0x50000000));
				_ColourFilter(imageview2, "#ffffff");
				linear2.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						if (_data.get((int)0).get("poster").toString().equals(pov.get((int)0).get("poster").toString())) {
							montakheb.setClass(getContext().getApplicationContext(), ViewActivity.class);
							montakheb.putExtra("name", _data.get((int)_position).get("name_fa").toString());
							montakheb.putExtra("image", _data.get((int)_position).get("poster").toString());
							montakheb.putExtra("dasteh", "");
							montakheb.putExtra("my", "");
							montakheb.putExtra("id", _data.get((int)_position).get("id").toString());
							montakheb.putExtra("backdrop", _data.get((int)_position).get("backdrop").toString());
							montakheb.putExtra("type", "movie");
							montakheb.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
							startActivity(montakheb);
						} else {
							to.setClass(getContext().getApplicationContext(), ViewActivity.class);
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
						}
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
	{
	}
	public class Myviewpager1_0Adapter extends PagerAdapter {
		
		Context _context;
		ArrayList<HashMap<String, Object>> _data;
		
		public Myviewpager1_0Adapter(Context _ctx, ArrayList<HashMap<String, Object>> _arr) {
			_context = _ctx;
			_data = _arr;
		}
		
		public Myviewpager1_0Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_context = getContext().getApplicationContext();
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
			View _view = LayoutInflater.from(_context).inflate(R.layout.sddf, _container, false);
			
			final ImageView poster = _view.findViewById(R.id.poster);
			final ImageView banner = _view.findViewById(R.id.banner);
			final ImageView logo = _view.findViewById(R.id.logo);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linear8 = _view.findViewById(R.id.linear8);
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			Glide.with(poster.getContext())
			.clear(poster);
			
			Glide.with(poster.getContext())
			.load(_data.get((int)_position).get("image_src").toString())
			.placeholder(R.drawable.nul)
			.error(R.drawable.nul)
			.centerCrop()
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
			.into(poster);
			Glide.with(getContext().getApplicationContext())
			.load(_data.get((int)_position).get("image_src").toString())
			.placeholder(R.drawable.nul)
			.transform(new RoundedCorners(1))
			.transition(DrawableTransitionOptions.withCrossFade(300))
			.into(banner);
			Glide.with(getContext().getApplicationContext())
			.load(_data.get((int)_position).get("logo").toString())
			.placeholder(R.drawable.nul)
			.transform(new RoundedCorners(1))
			.transition(DrawableTransitionOptions.withCrossFade(300))
			.into(logo);
			BlurUtil.applyBlur(getContext().getApplicationContext(), linear1, 50f);
			cardview1.setCardBackgroundColor(Color.TRANSPARENT);
			cardview1.setRadius((float)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)));
			cardview1.setCardElevation((float)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)));
			null1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), 0x50FFFFFF));
			
			_container.addView(_view);
			return _view;
		}
	}
	{
	}
	public class Myrec_positions_0Adapter extends RecyclerView.Adapter<Myrec_positions_0Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Myrec_positions_0Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		public void updateData(ArrayList<HashMap<String, Object>> newData) {
			_data.clear();
			_data.addAll(newData);
			notifyDataSetChanged();
		}
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getActivity().getLayoutInflater();
			View _v = _inflater.inflate(R.layout.position, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			
			
			
			
			// LinearLayouts
			final LinearLayout potion1 = _view.findViewById(R.id.potion1);
			RecyclerView.LayoutParams _lp1 = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp1);
			potion1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(999)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(1)), Color.TRANSPARENT, 0xFF1D2733));
			if (posSlider == _position) {
				potion1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(999)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(1)), 0xFFF5F5F5, 0xFFE0E0E0));
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
	{
	}
	public class Myslider1_2Adapter extends PagerAdapter {
		
		Context _context;
		ArrayList<HashMap<String, Object>> _data;
		
		public Myslider1_2Adapter(Context _ctx, ArrayList<HashMap<String, Object>> _arr) {
			_context = _ctx;
			_data = _arr;
		}
		
		public Myslider1_2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_context = getContext().getApplicationContext();
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
			View _view = LayoutInflater.from(_context).inflate(R.layout.sddf, _container, false);
			
			final ImageView poster = _view.findViewById(R.id.poster);
			final ImageView banner = _view.findViewById(R.id.banner);
			final ImageView logo = _view.findViewById(R.id.logo);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linear8 = _view.findViewById(R.id.linear8);
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			Glide.with(poster.getContext())
			.clear(poster);
			
			Glide.with(poster.getContext())
			.load(_data.get((int)_position).get("image_src").toString())
			.placeholder(R.drawable.nul)
			.error(R.drawable.nul)
			.centerCrop()
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
			.into(poster);
			Glide.with(getContext().getApplicationContext())
			.load(_data.get((int)_position).get("image_src").toString())
			.placeholder(R.drawable.nul)
			.transform(new RoundedCorners(1))
			.transition(DrawableTransitionOptions.withCrossFade(300))
			.into(banner);
			Glide.with(getContext().getApplicationContext())
			.load(_data.get((int)_position).get("logo").toString())
			.placeholder(R.drawable.nul)
			.transform(new RoundedCorners(1))
			.transition(DrawableTransitionOptions.withCrossFade(300))
			.into(logo);
			BlurUtil.applyBlur(getContext().getApplicationContext(), linear1, 50f);
			cardview1.setCardBackgroundColor(Color.TRANSPARENT);
			cardview1.setRadius((float)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)));
			cardview1.setCardElevation((float)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)));
			null1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), 0x50FFFFFF));
			
			_container.addView(_view);
			return _view;
		}
	}
	{
	}
	
	
	public void _refreshRec() {
		progressbar1.setVisibility(View.GONE);
		if (recyclerview1.getAdapter() == null) {
			recyclerview1.setAdapter(new Recyclerview1Adapter(list_items));
		} else {
			recyclerview1.getAdapter().notifyDataSetChanged();
		}
		
	}
	
	
	public void _req2() {
		_vpn();
		if (vpn()) {
			
		} else {
			headers = new HashMap<>();
			headers.put("X-API-Key", "mobile_app_v1_8x7k9Lm2");
			headers.put("Content-Type", "application/json");
			get_fov.setHeaders(headers);
			get_fov.startRequestNetwork(RequestNetworkController.GET, "https://".concat(save.getString("site", "").concat("/zakfilm.ir/app/get_list_app.php?limit=".concat("10"))), "", _get_fov_request_listener);
		}
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
			LayoutInflater _inflater = getActivity().getLayoutInflater();
			View _v = _inflater.inflate(R.layout.main_lists, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear76 = _view.findViewById(R.id.linear76);
			final RelativeLayout relativelayout7 = _view.findViewById(R.id.relativelayout7);
			final RelativeLayout relativelayout5 = _view.findViewById(R.id.relativelayout5);
			final RelativeLayout relativelayout2 = _view.findViewById(R.id.relativelayout2);
			final LinearLayout hashtag_new = _view.findViewById(R.id.hashtag_new);
			final androidx.recyclerview.widget.RecyclerView recyclerview2 = _view.findViewById(R.id.recyclerview2);
			final ImageView imageview63 = _view.findViewById(R.id.imageview63);
			final TextView textview15 = _view.findViewById(R.id.textview15);
			final LinearLayout linear214 = _view.findViewById(R.id.linear214);
			final LinearLayout linear216 = _view.findViewById(R.id.linear216);
			final androidx.cardview.widget.CardView cardview4 = _view.findViewById(R.id.cardview4);
			final LinearLayout linear215 = _view.findViewById(R.id.linear215);
			final androidx.viewpager.widget.ViewPager slider1 = _view.findViewById(R.id.slider1);
			final LinearLayout linear217 = _view.findViewById(R.id.linear217);
			final LinearLayout linear218 = _view.findViewById(R.id.linear218);
			final LinearLayout linear219 = _view.findViewById(R.id.linear219);
			final ImageView imageview92 = _view.findViewById(R.id.imageview92);
			final ImageView imageview93 = _view.findViewById(R.id.imageview93);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear213 = _view.findViewById(R.id.linear213);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final ImageView imageview2 = _view.findViewById(R.id.imageview2);
			final androidx.viewpager.widget.ViewPager viewpager1 = _view.findViewById(R.id.viewpager1);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final LinearLayout linear12 = _view.findViewById(R.id.linear12);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final LinearLayout linear10 = _view.findViewById(R.id.linear10);
			final LinearLayout linear92 = _view.findViewById(R.id.linear92);
			final LinearLayout lin_kids = _view.findViewById(R.id.lin_kids);
			final LinearLayout lin_series = _view.findViewById(R.id.lin_series);
			final LinearLayout lin_movie = _view.findViewById(R.id.lin_movie);
			final TextView textview37 = _view.findViewById(R.id.textview37);
			final ImageView imageview43 = _view.findViewById(R.id.imageview43);
			final TextView text_kids = _view.findViewById(R.id.text_kids);
			final ImageView imageview59 = _view.findViewById(R.id.imageview59);
			final TextView text_sieres = _view.findViewById(R.id.text_sieres);
			final ImageView imageview60 = _view.findViewById(R.id.imageview60);
			final TextView text_movies = _view.findViewById(R.id.text_movies);
			final ImageView imageview61 = _view.findViewById(R.id.imageview61);
			final LinearLayout linear182 = _view.findViewById(R.id.linear182);
			final RelativeLayout relativelayout4 = _view.findViewById(R.id.relativelayout4);
			final androidx.recyclerview.widget.RecyclerView rec_positions = _view.findViewById(R.id.rec_positions);
			final LinearLayout linear207 = _view.findViewById(R.id.linear207);
			final LinearLayout linear6 = _view.findViewById(R.id.linear6);
			final androidx.cardview.widget.CardView cardview3 = _view.findViewById(R.id.cardview3);
			final LinearLayout linear206 = _view.findViewById(R.id.linear206);
			final ImageView imageview91 = _view.findViewById(R.id.imageview91);
			final TextView textview107 = _view.findViewById(R.id.textview107);
			final ImageView imageview64 = _view.findViewById(R.id.imageview64);
			
			recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(mp));
			rec_positions.setAdapter(new Myrec_positions_0Adapter(slider));
			linear76.setVisibility(View.GONE);
			relativelayout7.setVisibility(View.GONE);
			relativelayout5.setVisibility(View.GONE);
			relativelayout2.setVisibility(View.GONE);
			linear4.setVisibility(View.GONE);
			textview15.setText("");
			imageview1.setImageResource(R.drawable.shade);
			recyclerview2.setLayoutManager( new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
			rec_positions.setLayoutManager( new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
			recyclerview2.setHasFixedSize(true);
			recyclerview2.setNestedScrollingEnabled(false);
			
			if (_data.get((int)_position).get("type").toString().equals("page")) {
				imageview59.setVisibility(View.GONE);
				imageview60.setVisibility(View.GONE);
				imageview61.setVisibility(View.GONE);
				_ColourFilter(imageview59, "#ff1744");
				_ColourFilter(imageview60, save.getString("theme", ""));
				_ColourFilter(imageview61, save.getString("theme", ""));
				BlurUtil.applyBlur(getContext().getApplicationContext(), linear206, 100f);
				textview37.setShadowLayer(9, 2, 2, Color.parseColor("#000000"));
				viewpager1.setPageTransformer(true, new ViewPager.PageTransformer() {
					@Override
					public void transformPage(View page, float position) {
						int pageWidth = page.getWidth();
						if (position < -1) { // صفحه در سمت چپ کاملاً ناپدید شده است
							page.setAlpha(0);
						} else if (position <= 1) { // انیمیشن اسلاید
							page.setAlpha(1 - Math.abs(position));
							page.setTranslationX(-position * pageWidth);
						} else { // صفحه در سمت راست کاملاً ناپدید شده است
							page.setAlpha(0);
						}
					}
				});
				lin_movie.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0x501D2733));
				lin_series.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0x501D2733));
				lin_kids.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0x501D2733));
				cardview3.setRadius((float)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)));
				cardview3.setCardElevation((float)0);
				cardview3.setCardBackgroundColor(Color.TRANSPARENT);
				relativelayout4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(15)), 0x50FFFFFF));
				relativelayout2.setVisibility(View.VISIBLE);
				viewpager1.setAdapter(new Myviewpager1_0Adapter(slider));
				((PagerAdapter)viewpager1.getAdapter()).notifyDataSetChanged();
				((PagerAdapter)viewpager1.getAdapter()).notifyDataSetChanged();
				try {
					Glide.with(getContext().getApplicationContext())
					.load(slider.get((int)0).get("image_src").toString())
					.placeholder(R.drawable.nul)
					.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
					.into(imageview91);
				} catch (Exception e) {
					
				}
				viewpager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
					@Override
					public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
						
					}
					
					@Override
					public void onPageSelected(int position) {
						// وقتی صفحه عوض شد
						
						if (!(slider.size() == 0)) {
							position = viewpager1.getCurrentItem();
							posSlider = viewpager1.getCurrentItem();
							strings_position = String.valueOf((long)(position));
							Glide.with(getContext().getApplicationContext())
							.load(slider.get((int)position).get("image_src").toString())
							.placeholder(R.drawable.nul)
							.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
							.into(imageview91);
							try {
								rec_positions.getAdapter().notifyDataSetChanged();
							} catch (Exception e) {
								if (recyclerview2.getAdapter() == null) {
									rec_positions.setAdapter(new Myrec_positions_0Adapter(slider));
								} else {
									((Myrec_positions_0Adapter) rec_positions.getAdapter()).updateData(slider);
								}
								
							}
						}
					}
					
					@Override
					public void onPageScrollStateChanged(int state) {
						
					}
				});
				
				relativelayout4.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						try {
							_clickAnimation(relativelayout4);
							Address_photo = slider.get((int)posSlider).get("poster").toString();
							if (Address_photo.contains("/")) {
								String lastPart = Address_photo.substring(Address_photo.lastIndexOf("/") + 1);
								Address_photo = lastPart;
							}
							vb.setClass(getContext().getApplicationContext(), ViewActivity.class);
							vb.putExtra("id", slider.get((int)posSlider).get("id").toString());
							vb.putExtra("name", slider.get((int)posSlider).get("name_fa").toString());
							vb.putExtra("image", Address_photo);
							vb.putExtra("type", slider.get((int)posSlider).get("type").toString());
							vb.putExtra("dasteh", "");
							vb.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
							startActivity(vb);
						} catch (Exception e) {
							
						}
					}
				});
				lin_movie.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						if (type.equals("movie")) {
							vibrate1.vibrate((long)(100));
							imageview61.setVisibility(View.GONE);
							imageview60.setVisibility(View.GONE);
							type = "0";
							_rippleRoundStroke(lin_movie, "#501d2733", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0, save.getString("theme", ""));
						} else {
							imageview61.setVisibility(View.VISIBLE);
							type = "movie";
							_rippleRoundStroke(lin_movie, "#501d2733", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), save.getString("theme", ""));
						}
						imageview60.setVisibility(View.GONE);
						_rippleRoundStroke(lin_series, "#501d2733", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0, save.getString("theme", ""));
						_load_data_offline();
					}
				});
				lin_series.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						if (type.equals("series")) {
							vibrate1.vibrate((long)(100));
							imageview60.setVisibility(View.GONE);
							imageview61.setVisibility(View.GONE);
							type = "0";
							_rippleRoundStroke(lin_series, "#501d2734", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0, save.getString("theme", ""));
						} else {
							imageview60.setVisibility(View.VISIBLE);
							type = "series";
							_rippleRoundStroke(lin_series, "#501d2734", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), save.getString("theme", ""));
						}
						imageview61.setVisibility(View.GONE);
						_rippleRoundStroke(lin_movie, "#501d2734", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0, save.getString("theme", ""));
						_load_data_offline();
					}
				});
				lin_kids.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						if (age.equals("PG-13")) {
							vibrate1.vibrate((long)(100));
							imageview59.setVisibility(View.GONE);
							age = "0";
							lin_kids.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), (int)0, 0xFFFF1744, 0x501D2733));
						} else {
							imageview59.setVisibility(View.VISIBLE);
							age = "PG-13";
							lin_kids.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFFFF1744, 0x501D2733));
						}
						_load_data_offline();
					}
				});
				if (type.equals("movie")) {
					imageview61.setVisibility(View.VISIBLE);
					_rippleRoundStroke(lin_movie, "#501d2733", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), save.getString("theme", ""));
					imageview60.setVisibility(View.GONE);
					_rippleRoundStroke(lin_series, "#501d2733", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0, save.getString("theme", ""));
				} else {
					if (type.equals("series")) {
						imageview60.setVisibility(View.VISIBLE);
						_rippleRoundStroke(lin_series, "#501d2734", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), save.getString("theme", ""));
						imageview61.setVisibility(View.GONE);
						_rippleRoundStroke(lin_movie, "#501d2734", "#ffffff", SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), 0, save.getString("theme", ""));
					} else {
						
					}
				}
				if (age.equals("PG-13")) {
					imageview59.setVisibility(View.VISIBLE);
					lin_kids.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(5)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFFFF1744, 0x501D2733));
				} else {
					
				}
			} else {
				if (_data.get((int)_position).get("type").toString().equals("rec")) {
					linear76.setVisibility(View.VISIBLE);
					textview15.setText(_data.get((int)_position).get("title").toString());
					if (_position == 1) {
						recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(mp));
					} else {
						if (_position == 3) {
							recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(list_posters));
						} else {
							if (_position == 5) {
								
							} else {
								if (_position == 7) {
									recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(s_ani));
								} else {
									if (_position == 9) {
										recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(list_hin));
									} else {
										if (_position == 11) {
											recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(sport));
										} else {
											if (_position == 13) {
												recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(fan));
											} else {
												if (_position == 15) {
													recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(koota));
												} else {
													if (_position == 17) {
														recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(iranii));
													} else {
														if (_position == 19) {
															recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(hist));
														} else {
															if (_position == 21) {
																recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(famil));
															} else {
																if (_position == 23) {
																	recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(data));
																} else {
																	if (_position == 25) {
																		recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(adventur));
																	} else {
																		if (_position == 27) {
																			recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(bio));
																		} else {
																			if (_position == 29) {
																				recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(comd));
																			} else {
																				if (_position == 31) {
																					recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(crim));
																				} else {
																					if (_position == 33) {
																						recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(doc));
																					} else {
																						if (_position == 35) {
																							recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(tars));
																						} else {
																							if (_position == 37) {
																								recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(roma));
																							} else {
																								if (_position == 39) {
																									recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(sci));
																								} else {
																									if (_position == 41) {
																										recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(thri));
																									} else {
																										if (_position == 43) {
																											recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(jang));
																										} else {
																											if (_position == 45) {
																												recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(music));
																											} else {
																												if (_position == 47) {
																													recyclerview2.setAdapter(new Myrecyclerview2_0Adapter(shortt));
																												} else {
																													linear76.setVisibility(View.GONE);
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					hashtag_new.setOnClickListener(new View.OnClickListener(){
						@Override
						public void onClick(View _view){
							to.putExtra("age", age);
							if (_data.get((int)_position).get("list").toString().equals("top")) {
								to.setClass(getContext().getApplicationContext(), More1Activity.class);
								to.putExtra("name", list_posters.get((int)0).get("name_fa").toString());
								to.putExtra("poster", list_posters.get((int)0).get("poster").toString());
								to.putExtra("persian", list_posters.get((int)0).get("persian").toString());
								to.putExtra("my", "123");
							} else {
								to.setClass(getContext().getApplicationContext(), MoreActivity.class);
								to.putExtra("type", _data.get((int)_position).get("list").toString());
								if (_data.get((int)_position).get("list").toString().equals("hot") || _data.get((int)_position).get("list").toString().equals("new_titles")) {
									to.putExtra("sortby", "created");
								} else {
									to.putExtra("sortby", "newest");
								}
								to.putExtra("title", _data.get((int)_position).get("title").toString());
								to.putExtra("f_type", type);
							}
							to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
							startActivity(to);
							getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
						}
					});
				} else {
					if (_data.get((int)_position).get("type").toString().equals("img")) {
						try {
							if (list_posters.get((int)_position).containsKey("backdrop")) {
								relativelayout5.setVisibility(View.VISIBLE);
								Glide.with(imageview1.getContext())
								.clear(imageview1);
								
								Glide.with(imageview1.getContext())
								.load(save.getString("domain", "").concat("575&h=500&q=60&a=c&zc=1&src=https://cdn.upera.shop/s3/backdrops/".concat(list_posters.get((int)_position).get("backdrop").toString())))
								.placeholder(R.drawable.shade)
								.error(R.drawable.shade)
								.centerCrop()
								.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
								.into(imageview1);
								linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), 0x50000000));
								_ColourFilter(imageview2, "#ffffff");
								if (list_posters.get((int)_position).get("persian").toString().equals("1")) {
									linear4.setVisibility(View.VISIBLE);
								} else {
									
								}
							} else {
								imageview1.setImageResource(R.drawable.shade);
								relativelayout5.setVisibility(View.GONE);
							}
						} catch (Exception e) {
							relativelayout5.setVisibility(View.GONE);
						}
						imageview1.setOnClickListener(new View.OnClickListener(){
							@Override
							public void onClick(View _view){
								try {
									to.setClass(getContext().getApplicationContext(), ViewActivity.class);
									to.putExtra("id", list_posters.get((int)_position).get("id").toString());
									to.putExtra("name", list_posters.get((int)_position).get("name_fa").toString());
									to.putExtra("image", list_posters.get((int)_position).get("poster").toString());
									to.putExtra("type", list_posters.get((int)_position).get("type").toString());
									to.putExtra("dasteh", "");
									to.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
									startActivity(to);
								} catch (Exception e) {
									
								}
							}
						});
					} else {
						if (_data.get((int)_position).get("type").toString().equals("slider")) {
							slider1.setAdapter(new Myslider1_2Adapter(slider_vishe));
							((PagerAdapter)viewpager1.getAdapter()).notifyDataSetChanged();
							((PagerAdapter)slider1.getAdapter()).notifyDataSetChanged();
						}
					}
				}
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
}