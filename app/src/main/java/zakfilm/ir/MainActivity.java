package zakfilm.ir;

import zakfilm.ir.SplashActivity;
import android.animation.*;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
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
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.adivery.sdk.*;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.ui.*;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import de.hdodenhof.circleimageview.*;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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

import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import java.util.stream.Collectors;
import android.content.pm.PackageManager;
import androidx.appcompat.app.AppCompatActivity;
import android.provider.Settings;
import android.Manifest;
import android.net.Uri;
// امپورت های پایین مربوط به نوتیفیکشین فایبربیس
import android.content.pm.PackageManager;
import android.Manifest;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.security.PrivateKey;
import java.security.KeyFactory;
import javax.crypto.Mac;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Signature;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private double color_character = 0;
	private String select_number = "";
	private double duration_main = 0;
	private String decrypted = "";
	private String dasteh = "";
	private HashMap<String, Object> pishnhad_my = new HashMap<>();
	private double n = 0;
	private String videoUri = "";
	private String Token = "";
	private HashMap<String, Object> mpp = new HashMap<>();
	private String l_color = "";
	private String act = "";
	private String idOPEN = "";
	private String typeOPEN = "";
	private HashMap<String, Object> create = new HashMap<>();
	private String copied_text = "";
	private String recentId = "";
	private String guality = "";
	private double type_dl = 0;
	private String sizem1 = "";
	private String sizem = "";
	private String sizem2 = "";
	private String url = "";
	private String filen = "";
	Object clipboard_listener;
	private double s = 0;
	private HashMap<String, Object> headers = new HashMap<>();
	private HashMap<String, Object> response_AccessToken = new HashMap<>();
	private String ACCESS_TOKEN = "";
	private String PrivateKey = "";
	private String ClientEmail = "";
	private String JTW_Generated = "";
	private String endPoint = "";
	private String FCM_ProjectURL = "";
	private HashMap<String, Object> body = new HashMap<>();
	private HashMap<String, Object> Header = new HashMap<>();
	private HashMap<String, Object> message = new HashMap<>();
	private HashMap<String, Object> notification_Body = new HashMap<>();
	private String pageName = "";
	
	private ArrayList<HashMap<String, Object>> mp = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> s_ani = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> pov = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> mop = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> dasteh_pish = new ArrayList<>();
	
	private LinearLayout linear43;
	private RelativeLayout relativelayout1;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private LinearLayout main0;
	private LinearLayout linear3;
	private EditText edittext1;
	private LinearLayout linear4;
	private LinearLayout linear25;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout lActivity4;
	private TextView setting_txt;
	private CircleImageView circleimageview1;
	private LinearLayout lActivity3;
	private TextView download_txt;
	private ImageView download_img;
	private LinearLayout lActivity2;
	private TextView seen_text;
	private ImageView seen_img;
	private LinearLayout lActivity1;
	private TextView home_txt;
	private ImageView home_img;
	private LinearLayout linear28;
	private LinearLayout linear39;
	private LinearLayout linear42;
	private LinearLayout linear37;
	private LinearLayout linear41;
	private LinearLayout linear40;
	private TextView textview2;
	private ImageView imageview7;
	private TextView textview1;
	private ImageView imageview6;
	private ImageView imageview5;
	
	private Vibrator vibrate01;
	private Intent i = new Intent();
	private SharedPreferences saved_video;
	private SharedPreferences profile_pr;
	private Intent to = new Intent();
	private SharedPreferences em;
	private SharedPreferences id_pr;
	private SharedPreferences name_pr;
	private SharedPreferences dast_pish;
	private ObjectAnimator a = new ObjectAnimator();
	private ObjectAnimator b = new ObjectAnimator();
	private ObjectAnimator al = new ObjectAnimator();
	private ObjectAnimator uo = new ObjectAnimator();
	private Intent intent = new Intent();
	private Intent erroe = new Intent();
	private AlertDialog cus;
	private OnCompleteListener noti_onCompleteListener;
	private RequestNetwork network;
	private RequestNetwork.RequestListener _network_request_listener;
	private Intent vb = new Intent();
	private Intent open_link = new Intent();
	private RequestNetwork seen_new;
	private RequestNetwork.RequestListener _seen_new_request_listener;
	private SharedPreferences save;
	private SharedPreferences gold;
	private ProgressDialog prd;
	private RequestNetwork ch;
	private RequestNetwork.RequestListener _ch_request_listener;
	private AlertDialog load;
	private Vibrator vib;
	private Vibrator bv;
	private TimerTask t;
	private ObjectAnimator alpah = new ObjectAnimator();
	private OnCompleteListener cloudMessaging_onCompleteListener;
	private RequestNetwork accessToken;
	private RequestNetwork.RequestListener _accessToken_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear43 = findViewById(R.id.linear43);
		relativelayout1 = findViewById(R.id.relativelayout1);
		linear26 = findViewById(R.id.linear26);
		linear27 = findViewById(R.id.linear27);
		main0 = findViewById(R.id.main0);
		linear3 = findViewById(R.id.linear3);
		edittext1 = findViewById(R.id.edittext1);
		linear4 = findViewById(R.id.linear4);
		linear25 = findViewById(R.id.linear25);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		lActivity4 = findViewById(R.id.lActivity4);
		setting_txt = findViewById(R.id.setting_txt);
		circleimageview1 = findViewById(R.id.circleimageview1);
		lActivity3 = findViewById(R.id.lActivity3);
		download_txt = findViewById(R.id.download_txt);
		download_img = findViewById(R.id.download_img);
		lActivity2 = findViewById(R.id.lActivity2);
		seen_text = findViewById(R.id.seen_text);
		seen_img = findViewById(R.id.seen_img);
		lActivity1 = findViewById(R.id.lActivity1);
		home_txt = findViewById(R.id.home_txt);
		home_img = findViewById(R.id.home_img);
		linear28 = findViewById(R.id.linear28);
		linear39 = findViewById(R.id.linear39);
		linear42 = findViewById(R.id.linear42);
		linear37 = findViewById(R.id.linear37);
		linear41 = findViewById(R.id.linear41);
		linear40 = findViewById(R.id.linear40);
		textview2 = findViewById(R.id.textview2);
		imageview7 = findViewById(R.id.imageview7);
		textview1 = findViewById(R.id.textview1);
		imageview6 = findViewById(R.id.imageview6);
		imageview5 = findViewById(R.id.imageview5);
		vibrate01 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		saved_video = getSharedPreferences("saved_video", Activity.MODE_PRIVATE);
		profile_pr = getSharedPreferences("profile_pr", Activity.MODE_PRIVATE);
		em = getSharedPreferences("em", Activity.MODE_PRIVATE);
		id_pr = getSharedPreferences("id_pr", Activity.MODE_PRIVATE);
		name_pr = getSharedPreferences("name_pr", Activity.MODE_PRIVATE);
		dast_pish = getSharedPreferences("dast_pish", Activity.MODE_PRIVATE);
		network = new RequestNetwork(this);
		seen_new = new RequestNetwork(this);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		gold = getSharedPreferences("gold", Activity.MODE_PRIVATE);
		ch = new RequestNetwork(this);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		bv = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		accessToken = new RequestNetwork(this);
		
		linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_l4();
			}
		});
		
		linear25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_l25();
			}
		});
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_l6();
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_l7();
			}
		});
		
		linear39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linear42.getVisibility() == View.VISIBLE) {
					linear42.setVisibility(View.GONE);
					imageview5.setImageResource(R.drawable.search_24);
					_rippleRoundStroke(linear39, "#00000000", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), SketchwareUtil.getDip(getApplicationContext(), (int)(2)), "#85ffffff");
				} else {
					linear42.setVisibility(View.VISIBLE);
					imageview5.setImageResource(R.drawable.icon_close_round);
					_rippleRoundStroke(linear39, "#50ffffff", "#000000", SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(2)), "#85ffffff");
				}
			}
		});
		
		linear41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cus = new AlertDialog.Builder(MainActivity.this).create();
				LayoutInflater cusLI = getLayoutInflater();
				View cusCV = (View) cusLI.inflate(R.layout.search_code, null);
				cus.setView(cusCV);
				final LinearLayout linear1 = (LinearLayout)
				cusCV.findViewById(R.id.linear1);
				final LinearLayout linear2 = (LinearLayout)
				cusCV.findViewById(R.id.linear2);
				final Button button1 = (Button)
				cusCV.findViewById(R.id.button1);
				final ImageView imageview1 = (ImageView)
				cusCV.findViewById(R.id.imageview1);
				final EditText edittext1 = (EditText)
				cusCV.findViewById(R.id.edittext1);
				cus.setCancelable(true);
				cus.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
				cus.show();
				linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(18)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0xFF1D2733, 0xFF0F1620));
				linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(18)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF1D2733, Color.TRANSPARENT));
				_GradientDrawable(button1, SketchwareUtil.getDip(getApplicationContext(), (int)(18)), 0, 0, save.getString("theme", ""), "#eeeeee", true, false, 5);
				_ColourFilter(imageview1, "#ffffff");
				button1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						
						String input = edittext1.getText().toString().trim();
						
						if (!input.isEmpty()) {
							// مثال: type=book&id=12
							Uri data = Uri.parse("?" + input);
							
							String type = data.getQueryParameter("type");
							String id   = data.getQueryParameter("id");
							
							if (type != null && !type.isEmpty()) {
								typeOPEN = type;
							}
							
							if (id != null && !id.isEmpty()) {
								idOPEN = id;
							}
						}
						cus.dismiss();
						prd = new ProgressDialog(MainActivity.this);
						prd.setMessage("در حال جستجو بر اساس آیدی مورد نظر...");
						prd.setCancelable(true);
						prd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
						headers = new HashMap<>();
						headers.put("X-API-Key", "mobile_app_v1_8x7k9Lm2");
						headers.put("Content-Type", "application/json");
						create = new HashMap<>();
						create.put("id", idOPEN);
						ch.setHeaders(headers);
						ch.setParams(create, RequestNetworkController.REQUEST_BODY);
						ch.startRequestNetwork(RequestNetworkController.POST, "https://".concat(save.getString("site", "").concat("/zakfilm.ir/app/getINFOapp.php")), "", _ch_request_listener);
						prd.show();
					}
				});
				android.content.ClipboardManager clipboard = 
				(android.content.ClipboardManager) getSystemService(android.content.Context.CLIPBOARD_SERVICE);
				
				if (clipboard != null && clipboard.hasPrimaryClip()) {
					
					android.content.ClipData clipData = clipboard.getPrimaryClip();
					
					if (clipData != null && clipData.getItemCount() > 0) {
						
						CharSequence cs = clipData.getItemAt(0).coerceToText(MainActivity.this);
						
						if (cs != null) {
							
							String clipboardText = cs.toString().trim();
							
							
							
							if (clipboardText.startsWith("type=")) {
								copied_text = clipboardText;
								
								edittext1.setText(copied_text);
							} else {
								
							}
						}}}
			}
		});
		
		linear40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linear39.getAlpha() == 0) {
					
				} else {
					i.setClass(getApplicationContext(), SearchFragmentActivity.class);
					i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(i);
					MainActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
				}
			}
		});
		
		a.addListener(new Animator.AnimatorListener() {
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
		
		b.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				linear39.setVisibility(View.GONE);
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		uo.addListener(new Animator.AnimatorListener() {
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
		
		noti_onCompleteListener = new OnCompleteListener<InstanceIdResult>() {
			@Override
			public void onComplete(Task<InstanceIdResult> task) {
				final boolean _success = task.isSuccessful();
				final String _token = task.getResult().getToken();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_network_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try {
					if (_tag.contains("movie")) {
						try {
							JSONObject jsonObject = new JSONObject(_response);
							
							if (jsonObject.has("data")) {
								JSONObject dataObject = jsonObject.getJSONObject("data");
								
								if (dataObject.has("movie")) {
									JSONObject movieObject = dataObject.getJSONObject("movie");
									
									mpp.clear();
									
									Iterator<String> keys = movieObject.keys();
									while (keys.hasNext()) {
										String key = keys.next();
										Object value = movieObject.get(key);
										mpp.put(key, String.valueOf(value));
									}
								}
							}
						} catch (JSONException e) {
							e.printStackTrace();
						}
						to.putExtra("type", "movie");
						to.putExtra("id", mpp.get("id").toString());
					} else {
						if (_tag.contains("episode")) {
							try {
								JSONObject jsonObject = new JSONObject(_response);
								
								if (jsonObject.has("data")) {
									JSONObject dataObject = jsonObject.getJSONObject("data");
									
									if (dataObject.has("episode")) {
										JSONObject movieObject = dataObject.getJSONObject("episode");
										
										mpp.clear();
										
										Iterator<String> keys = movieObject.keys();
										while (keys.hasNext()) {
											String key = keys.next();
											Object value = movieObject.get(key);
											mpp.put(key, String.valueOf(value));
										}
									}
								}
							} catch (JSONException e) {
								e.printStackTrace();
							}
							to.putExtra("id", mpp.get("series_id").toString());
							to.putExtra("type", "series");
						} else {
							try {
								JSONObject jsonObject = new JSONObject(_response);
								
								if (jsonObject.has("data")) {
									JSONObject dataObject = jsonObject.getJSONObject("data");
									
									if (dataObject.has("series")) {
										JSONObject movieObject = dataObject.getJSONObject("series");
										
										mpp.clear();
										
										Iterator<String> keys = movieObject.keys();
										while (keys.hasNext()) {
											String key = keys.next();
											Object value = movieObject.get(key);
											mpp.put(key, String.valueOf(value));
										}
									}
								}
							} catch (JSONException e) {
								e.printStackTrace();
							}
							to.putExtra("id", mpp.get("id").toString());
							to.putExtra("type", "series");
						}
					}
					s = 0;
					_more_information();
				} catch (Exception e) {
					SketchwareUtil.showMessage(getApplicationContext(), "یافت نشد!");
				}
				try {
					prd.dismiss();
				} catch (Exception e) {
					
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_seen_new_request_listener = new RequestNetwork.RequestListener() {
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
		
		_ch_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				mpp = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
				try {
					if (mpp.get("state").toString().equals("true")) {
						mpp = new Gson().fromJson((new Gson()).toJson(mpp.get("data")), new TypeToken<HashMap<String, Object>>(){}.getType());
						s = 1;
						_more_information();
						try {
							prd.dismiss();
						} catch (Exception e) {
							
						}
					} else {
						network.startRequestNetwork(RequestNetworkController.GET, "https://api.upera.tv/api/v1/ghost/get/".concat(typeOPEN.concat("/".concat(idOPEN))), typeOPEN, _network_request_listener);
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
		
		cloudMessaging_onCompleteListener = new OnCompleteListener<InstanceIdResult>() {
			@Override
			public void onComplete(Task<InstanceIdResult> task) {
				final boolean _success = task.isSuccessful();
				final String _token = task.getResult().getToken();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_accessToken_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				response_AccessToken = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
				if (response_AccessToken.containsKey("access_token")) {
					ACCESS_TOKEN = response_AccessToken.get("access_token").toString();
					
				}
				else {
					try {
						String privateKeyPem = PrivateKey;
						String 	clientEmail = ClientEmail;
						String header = "{\"alg\":\"RS256\",\"typ\":\"JWT\"}";
						long now = System.currentTimeMillis();
						long exp = now + 3600 * 1000; // 1 hour expiration
						String payload = String.format(
						"{\"iss\":\"%s\",\"aud\":\"https://oauth2.googleapis.com/token\",\"exp\":%d,\"iat\":%d,\"scope\":\"https://www.googleapis.com/auth/cloud-platform\"}",
						clientEmail, exp / 1000, now / 1000
						);
						
						String encodedHeader = Base64.getUrlEncoder().withoutPadding().encodeToString(header.getBytes(StandardCharsets.UTF_8));
						String encodedPayload = Base64.getUrlEncoder().withoutPadding().encodeToString(payload.getBytes(StandardCharsets.UTF_8));
						String unsignedJwt = encodedHeader + "." + encodedPayload;
						String signature = signWithPrivateKey(unsignedJwt, privateKeyPem);
						JTW_Generated = unsignedJwt + "." + signature;
						String endPoint = "https://oauth2.googleapis.com/token";
						body = new HashMap<>();
						body.put("grant_type", "urn:ietf:params:oauth:grant-type:jwt-bearer");
						body.put("assertion", JTW_Generated);
						SketchwareUtil.showMessage(getApplicationContext(), save.getString("page", ""));
						accessToken.setParams(body, RequestNetworkController.REQUEST_BODY);
						accessToken.startRequestNetwork(RequestNetworkController.POST, endPoint, "", _accessToken_request_listener);
					} catch (Exception e) {
						
					}
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
		_animation_alpah_main0_linear();
		Intent intent = getIntent();
		Uri data = intent.getData();
		
		if (data != null) {
			
			String id = data.getQueryParameter("id");
			String type = data.getQueryParameter("type");
			
			if (id != null && !id.isEmpty()) {
				
				// ذخیره مقادیر
				idOPEN = id;
				
				if (type != null && !type.isEmpty()) {
					typeOPEN = type;
				} else {
					typeOPEN = ""; // یا مقدار پیش‌فرض مثل "movie"
				}
			}
		}
		save.edit().putString("appStore", "myket").commit();
		if (save.getString("myteckets", "").isEmpty()) {
			save.edit().putString("myteckets", "0").commit();
		}
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF0f1620".replace("0xFF" , "#")));
		}
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
			Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);}
		getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN); if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { getWindow().setStatusBarColor(Color.TRANSPARENT); }
		_ui();
		_set();
		seen_new.startRequestNetwork(RequestNetworkController.GET, "https://zaya.io/gt6zj", "", _seen_new_request_listener);
		if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
				if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) 
				!= PackageManager.PERMISSION_GRANTED) {
					
					ActivityCompat.requestPermissions(this, 
					new String[]{Manifest.permission.POST_NOTIFICATIONS}, 
					1);  
				} else {
					
				}
			} else {
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
					CharSequence name = "Channel name 1";
					String description = "Notification channel";
					int importance = NotificationManager.IMPORTANCE_MAX;
					NotificationChannel channel = new NotificationChannel("id 1", name, importance);
					channel.setDescription(description);
					
					NotificationManager notificationManager = getSystemService(NotificationManager.class);
					notificationManager.createNotificationChannel(channel);
				}
			}
			if (SketchwareUtil.isConnected(getApplicationContext())) {
				if ("news".matches("[a-zA-Z0-9-_.~%]{1,900}")) {
					String topicName = java.text.Normalizer.normalize("news", java.text.Normalizer.Form.NFD);
					topicName = topicName.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
					FirebaseMessaging.getInstance().subscribeToTopic(topicName).addOnCompleteListener(new OnCompleteListener<Void>() {
						@Override
						public void onComplete(@NonNull Task<Void> task) {
							if (task.isSuccessful()) {
								if (getIntent().hasExtra("page")) {
									if (getIntent().getStringExtra("page").toString().trim().startsWith("http")) {
										pageName = getIntent().getStringExtra("page");
										open_link.setAction(Intent.ACTION_VIEW);
										open_link.setData(Uri.parse(pageName));
										startActivity(open_link);
									} else {
										if (getIntent().getStringExtra("page").toString().trim().startsWith("type")) {
											pageName = getIntent().getStringExtra("page");
											edittext1.setText(pageName);
											
											String input = edittext1.getText().toString().trim();
											
											if (!input.isEmpty()) {
												// مثال: type=book&id=12
												Uri data = Uri.parse("?" + input);
												
												String type = data.getQueryParameter("type");
												String id   = data.getQueryParameter("id");
												
												if (type != null && !type.isEmpty()) {
													typeOPEN = type;
												}
												
												if (id != null && !id.isEmpty()) {
													idOPEN = id;
												}
											}
											prd = new ProgressDialog(MainActivity.this);
											prd.setMessage("در حال جستجو بر اساس آیدی مورد نظر...");
											prd.setCancelable(true);
											prd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
											prd.show();
											_vpn();
											if (vpn()) {
												
											} else {
												headers = new HashMap<>();
												headers.put("X-API-Key", "mobile_app_v1_8x7k9Lm2");
												headers.put("Content-Type", "application/json");
												create = new HashMap<>();
												create.put("id", idOPEN);
												ch.setHeaders(headers);
												ch.setParams(create, RequestNetworkController.REQUEST_BODY);
												ch.startRequestNetwork(RequestNetworkController.POST, "https://".concat(save.getString("site", "").concat("/zakfilm.ir/app/getINFOapp.php")), "", _ch_request_listener);
											}
										} else {
											if (getIntent().getStringExtra("page").isEmpty()) {
												
											} else {
												pageName = getIntent().getStringExtra("page");
												
												try {
													Class<?> pageClass = Class.forName(
													getPackageName() + "." + pageName
													);
													
													i.setClass(getApplicationContext(), pageClass);
													startActivity(i);
													
												} catch (ClassNotFoundException e) {
													SketchwareUtil.showMessage(
													getApplicationContext(),
													"صفحه پیدا نشد: " + pageName
													);
												}
											}
										}
									}
								}
								
							} else {
								
								
							}}});
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Badly Formated Topic");
				}
			}
			else {
				SketchwareUtil.showMessage(getApplicationContext(), "No Internet Connection...");
			}
			PrivateKey = "-----BEGIN PRIVATE KEY-----\nMIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQC0Ox4BhWN17duN\n2mRN9LApnXb+tC4iMz2RZb2Yn549L2OP0/HRtX7BoQTaBUbAgYYHN1XTwl6AvTKn\nv13umqdnk4ZqHJiNia8ZA0IEUaeeEwq99H8KXTOAybGGCeqgqAg+7kEk0pv7muSG\n+nfTtLCh5ylwgrpRBIWZvHo+xzkPlWfydO6RLF0Cd34xInVcfYzQUVG/3nuDtrTb\nHbTlM4RhY9vD8DHZduKnfDfv8u80qD2sgPFIQtb4b4blkG2VcMX0zyQnBoa3eStT\nQSX7wkiMMqqlVdj0+nzxgEtLUHjv80Cv30j09yOr9FoYvOrjS03iQ/sMsIQYNEE3\ntcIaGLc9AgMBAAECggEADDO4a1fxjOlmpOr1QYXga2DazpG6UdxwPajKtkuQNgpA\nTluGErGb/FX/cxdKW/wo69ImQGj3ZvXoOQ0uudnEnbGSNxrqhSKeNS5QSOSSWZRm\ndMfZ1gTLWNvO5glD1k6qCECvLmQH5XfuIulQNYgVMVDqMFDZdmS8+tSU3i00wsY4\nfUQxOGmyeSK9Ugp4B1z5V6YTL6PAbyDnIbQL94dYp4B1MEds6gKyA5GjChjOeh5J\nNMxDff775tcTG+s/PMpkmodii4RgBym3ZZCZx46XbgTb1zMzbvebtiitrVOVk2qr\nggRqpUOH2TLEYAXsia89JJMGBg/tPjtItaFdPrNG4QKBgQDupBPS+JDP1YBhjjsb\nZFuTlt0Zi+yowyGeUnNv40Q6joRtzlAEQW/NZq/aWPg3HVJemY6uGYcutW0kve2o\nKXCYnm7q79izSx8bHS15J1p5maSgAhUZln55CoBiatB3FqdmJAWZRmJoIJE0r5Pl\nJ+sUvHISPeBzCBmI5XkPVO4I2QKBgQDBV1c2rbq2156i93/ILfapDEDhCi0ECDjf\nr+N3SSwISgKG5kz36SvzI5+7IaIfJEXtqpqL+xErapcvnOmdFvonZi93L/i2qMZi\npL05xgSDYyl8AhqS0UxgWIYt4cEYPCyWItjIVjy9HjCSH5Rr0eP0YlWJ5FYi0wfq\nD4kYixgDBQKBgQDDFk8+gQWhYiB5oBSh6AEVPpexcrodnKe3DiBgr6HvXOLWAXtY\nf0Yu3GuWTHVeWRIlU9NYcHYasSZwivPmLTpnCd4TIdA9goQDXm72RD2qevgh9pHZ\nQTZTLUqXKksRj+t5jKknDGsWRMlwELkO9PsxEH0QfJUodM6rIy08Y2nUwQKBgQCw\n5zagjDOEayP2nxknU48WvGR8xG/N+av4WBp8IdKNPxKy1fRk/c+958GWWr7ZWbo2\nLVy9ahsaq6vr39oNZ2G6PRB/MMCUeTcUOQH+48VrZocltVMVNTZ6DWWwg5jHkP+G\n3BmYrPdkX0Q333dRdDnseTElO2zo7kiWjGJ3t4Vf9QKBgQDk7HNnGVErEorQUDpj\nYAe1e7Wnb9obbvRUuc0plTlj/Cse87XmRGeoVgJX3RkgYz2hGiYGC1mS7tOyLaS2\nJv8KwkiH1SdbZ0JK9ZxMqY150aKoSybMsuKcDdVuQOX4Vc4mYlSEztCHP6ENpKn3\nCMiOAj7bIGUkqQwnSoMsUvuH3Q==\n-----END PRIVATE KEY-----\n";
			ClientEmail = "firebase-adminsdk-fbsvc@sartain-3812d.iam.gserviceaccount.com";
			try {
				String privateKeyPem = PrivateKey;
				String 	clientEmail = ClientEmail;
				String header = "{\"alg\":\"RS256\",\"typ\":\"JWT\"}";
				long now = System.currentTimeMillis();
				long exp = now + 3600 * 1000; // 1 hour expiration
				String payload = String.format(
				"{\"iss\":\"%s\",\"aud\":\"https://oauth2.googleapis.com/token\",\"exp\":%d,\"iat\":%d,\"scope\":\"https://www.googleapis.com/auth/cloud-platform\"}",
				clientEmail, exp / 1000, now / 1000
				);
				
				String encodedHeader = Base64.getUrlEncoder().withoutPadding().encodeToString(header.getBytes(StandardCharsets.UTF_8));
				String encodedPayload = Base64.getUrlEncoder().withoutPadding().encodeToString(payload.getBytes(StandardCharsets.UTF_8));
				String unsignedJwt = encodedHeader + "." + encodedPayload;
				String signature = signWithPrivateKey(unsignedJwt, privateKeyPem);
				JTW_Generated = unsignedJwt + "." + signature;
				String endPoint = "https://oauth2.googleapis.com/token";
				body = new HashMap<>();
				body.put("grant_type", "urn:ietf:params:oauth:grant-type:jwt-bearer");
				body.put("assertion", JTW_Generated);
				accessToken.setParams(body, RequestNetworkController.REQUEST_BODY);
				accessToken.startRequestNetwork(RequestNetworkController.POST, endPoint, "a", _accessToken_request_listener);
			} catch (Exception e) {
				
			}
		} else {
			// پشتیبانی نمیشود
		}
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
		_vpn();
		if (vpn()) {
			i.setClass(getApplicationContext(), ErrorActivity.class);
			startActivity(i);
			MainActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
		} else {
			_get_theme_l_color();
			if (act.equals("home")) {
				showFragment(home);
				_l7();
			} else {
				if (act.equals("profile")) {
					showFragment(profile);
					_l4();
				} else {
					if (act.equals("search")) {
						showFragment(search);
						_l25();
					} else {
						if (act.equals("pishnhadat")) {
							showFragment(pishnhadat);
							_l6();
						} else {
							showFragment(home);
							_l7();
						}
					}
				}
			}
		}
	}
	
	@Override
	public void onBackPressed() {
		cus = new AlertDialog.Builder(MainActivity.this).create();
		LayoutInflater cusLI = getLayoutInflater();
		View cusCV = (View) cusLI.inflate(R.layout.exit_dialog, null);
		cus.setView(cusCV);
		final LinearLayout linear = (LinearLayout)
		cusCV.findViewById(R.id.linear1);
		final LinearLayout ok = (LinearLayout)
		cusCV.findViewById(R.id.ok);
		final LinearLayout cancel = (LinearLayout)
		cusCV.findViewById(R.id.cancel);
		linear.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFF222327));
		ok.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFFFF5252, Color.TRANSPARENT));
		cancel.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
		cus.setCancelable(true);
		cus.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		cus.show();
		ok.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				finishAffinity();
			}
		});
		cancel.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				cus.dismiss();
			}
		});
	}
	
	@Override
	public void onStart() {
		super.onStart();
		_get_theme_l_color();
		_checkClpboard();
		_sett();
	}
	public void _ui() {
		linear42.setVisibility(View.GONE);
		imageview5.setImageResource(R.drawable.search_24);
		_rippleRoundStroke(linear39, "#00000000", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), SketchwareUtil.getDip(getApplicationContext(), (int)(2)), "#60ffffff");
		_rippleRoundStroke(linear37, "#85ffffff", "#000000", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), SketchwareUtil.getDip(getApplicationContext(), (int)(2)), "#60ffffff");
		_rippleRoundStroke(linear40, "#85ffffff", "#000000", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), SketchwareUtil.getDip(getApplicationContext(), (int)(2)), "#60ffffff");
		_rippleRoundStroke(linear41, "#85ffffff", "#000000", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), SketchwareUtil.getDip(getApplicationContext(), (int)(2)), "#60ffffff");
		_sett();
		_ColourFilter(home_img, save.getString("theme", ""));
		getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		duration_main = 0;
		if (saved_video.getString("saved_video", "").isEmpty()) {
			saved_video.edit().putString("saved_video", "[]").commit();
		} else {
			
		}
		_get_theme_l_color();
		_ColourFilter(imageview5, "#000000");
		_ColourFilter(imageview6, "#000000");
		_ColourFilter(imageview7, "#000000");
		// ایجاد یک انیمیشن ترکیبی (شناورسازی خطی + نوسانی)
		TranslateAnimation floatAnim = new TranslateAnimation(
		0, 0,    // حرکت افقی (X ثابت)
		0, 50    // حرکت عمودی (Y به پایین 50 پیکسل)
		);
		floatAnim.setDuration(2000);     // زمان انیمیشن (۲ ثانیه)
		floatAnim.setRepeatCount(Animation.INFINITE); // تکرار بی‌نهایت
		floatAnim.setRepeatMode(Animation.REVERSE);   // برگشت رفت و برگشتی
		floatAnim.setInterpolator(new LinearInterpolator()); // حرکت خطی
		
		// اضافه کردن کمی لرزش (نوسان سینوسی)
		AnimationSet set = new AnimationSet(true);
		set.addAnimation(floatAnim);
		
		RotateAnimation swingAnim = new RotateAnimation(
		-3, 3,                // چرخش کوچک بین -۳ تا +۳ درجه
		Animation.RELATIVE_TO_SELF, 0.5f, // محور افقی مرکز
		Animation.RELATIVE_TO_SELF, 0.5f  // محور عمودی مرکز
		);
		swingAnim.setDuration(1000);
		swingAnim.setRepeatCount(Animation.INFINITE);
		swingAnim.setRepeatMode(Animation.REVERSE);
		
		set.addAnimation(swingAnim);
		
		// اجرای انیمیشن روی ویو دلخواه (مثلاً یک دکمه یا لایه)
		linear39.startAnimation(set);
	}
	
	
	public void _ColourFilter(final ImageView _imageview, final String _color) {
		_imageview.clearColorFilter(); 
		_imageview.setColorFilter(Color.parseColor(_color.toString()));
	}
	
	
	public void _clickAnimation(final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
	}
	
	
	public void _NavStatusBarColor(final String _color1, final String _color2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(Color.parseColor("#" + _color1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _color2.replace("#", "")));
		}
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
	
	
	public void _set() {
		showFragment(home);
	}
	private Fragment profile = new ProfileFragmentActivity();
	private Fragment search = new SearchFragmentActivity();
	private Fragment pishnhadat = new SeenedFragmentActivity();
	private Fragment home = new HomeFragmentActivity();
	private void showFragment(Fragment fragment) {
		getSupportFragmentManager().beginTransaction().replace(R.id.main0, fragment).commit();
	}
	{
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
	
	
	public void _start(final View _id) {
		a.setTarget(_id);
		a.setPropertyName("scaleX");
		a.setFloatValues((float)(1.2d));
		a.setDuration((int)(350));
		a.start();
		b.setTarget(_id);
		b.setPropertyName("scaleY");
		b.setFloatValues((float)(1.2d));
		b.setDuration((int)(350));
		b.start();
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
	
	
	public void _sett() {
		_ColourFilter(home_img, "#ffffff");
		_ColourFilter(seen_img, "#ffffff");
		_ColourFilter(download_img, "#ffffff");
		setting_txt.setTextColor(0xFFFFFFFF);
		download_txt.setTextColor(0xFFFFFFFF);
		seen_text.setTextColor(0xFFFFFFFF);
		home_txt.setTextColor(0xFFFFFFFF);
		lActivity1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), Color.TRANSPARENT));
		lActivity2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), Color.TRANSPARENT));
		lActivity3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), Color.TRANSPARENT));
		lActivity4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), Color.TRANSPARENT));
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
	
	
	public void _l7() {
		_sett();
		_ColourFilter(home_img, save.getString("theme", ""));
		home_txt.setTextColor(Color.parseColor(save.getString("theme", "")));
		_rippleRoundStroke(lActivity1, l_color, "#eeeeee", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0, "#ffffff");
		if (duration_main == 0) {
			
		} else {
			duration_main = 0;
			act = "home";
			linear42.setVisibility(View.GONE);
			linear39.setVisibility(View.VISIBLE);
			showFragment(home);
			a.setTarget(linear39);
			a.setPropertyName("alpha");
			a.setFloatValues((float)(1));
			a.setDuration((int)(200));
			a.start();
		}
	}
	
	
	public void _l4() {
		_sett();
		setting_txt.setTextColor(Color.parseColor(save.getString("theme", "")));
		_rippleRoundStroke(lActivity4, l_color, "#eeeeee", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0, "#ffffff");
		if (duration_main == 3) {
			
		} else {
			duration_main = 3;
			act = "profile";
			showFragment(profile);
			b.setTarget(linear39);
			b.setPropertyName("alpha");
			b.setFloatValues((float)(0));
			b.setDuration((int)(200));
			b.start();
		}
	}
	
	
	public void _l25() {
		_sett();
		_ColourFilter(download_img, save.getString("theme", ""));
		download_txt.setTextColor(Color.parseColor(save.getString("theme", "")));
		_rippleRoundStroke(lActivity3, l_color, "#eeeeee", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0, "#ffffff");
		if (duration_main == 2) {
			
		} else {
			duration_main = 2;
			act = "search";
			showFragment(search);
			b.setTarget(linear39);
			b.setPropertyName("alpha");
			b.setFloatValues((float)(0));
			b.setDuration((int)(200));
			b.start();
		}
	}
	
	
	public void _l6() {
		_sett();
		_ColourFilter(seen_img, save.getString("theme", ""));
		seen_text.setTextColor(Color.parseColor(save.getString("theme", "")));
		_rippleRoundStroke(lActivity2, l_color, "#eeeeee", SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0, "#ffffff");
		if (duration_main == 1) {
			
		} else {
			duration_main = 1;
			showFragment(pishnhadat);
			act = "pishnhadat";
			b.setTarget(linear39);
			b.setPropertyName("alpha");
			b.setFloatValues((float)(0));
			b.setDuration((int)(200));
			b.start();
		}
	}
	
	
	public void _check() {
		String addres = FileUtil.getPackageDataDir(getApplicationContext()).concat("/account.json");
		
		// بررسی وجود فایل
		if (!FileUtil.isExistFile(addres)) {
			
			//اگر فایل وجود نداشت
			gold.edit().putString("gold", "0").commit();
			save.edit().putString("ad", "0").commit();
			save.edit().putString("traffic", "0").commit();
			return;
		}
		
		try {
			// خواندن محتوای فایل JSON
			String json = FileUtil.readFile(addres);
			HashMap<String, Object> data = new Gson().fromJson(
			json,
			new TypeToken<HashMap<String, Object>>(){}.getType()
			);
			
			// دریافت تاریخ پایان اشتراک
			String dateEnd = data.get("date_end").toString();
			
			// قالب تاریخ
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date endDate = sdf.parse(dateEnd);
			Date nowDate = Calendar.getInstance().getTime();
			
			// محاسبه اختلاف روزها
			long diffMillis = endDate.getTime() - nowDate.getTime();
			long diffDays = (long) Math.floor((double) diffMillis / (1000 * 60 * 60 * 24));
			
			// بررسی وضعیت اشتراک
			if (diffDays > 0) {
				
				gold.edit().putString("gold", "dghdhegejzy6e728274").commit();
			} else if (diffDays == 0) {
				
				//آخرین روز اشتراک
				gold.edit().putString("gold", "0").commit();
				save.edit().putString("ad", "0").commit();
				save.edit().putString("traffic", "0").commit();
				
			} else {
				
				//اشتراک ندارید
				gold.edit().putString("gold", "0").commit();
				save.edit().putString("ad", "0").commit();
				save.edit().putString("traffic", "0").commit();
				
			}
			
		} catch (Exception e) {
			
			Log.e("SubscriptionCheck", e.toString());
		}
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
	
	
	public void _checkClipboard() {
		
		String input = edittext1.getText().toString().trim();
		
		if (!input.isEmpty()) {
			// مثال: type=book&id=12
			Uri data = Uri.parse("?" + input);
			
			String type = data.getQueryParameter("type");
			String id   = data.getQueryParameter("id");
			
			if (type != null && !type.isEmpty()) {
				typeOPEN = type;
			}
			
			if (id != null && !id.isEmpty()) {
				idOPEN = id;
			}
		}
		prd = new ProgressDialog(MainActivity.this);
		prd.setMessage("در حال جستجو بر اساس آیدی مورد نظر...");
		prd.setCancelable(true);
		prd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		prd.show();
		_vpn();
		if (vpn()) {
			
		} else {
			headers = new HashMap<>();
			headers.put("X-API-Key", "mobile_app_v1_8x7k9Lm2");
			headers.put("Content-Type", "application/json");
			create = new HashMap<>();
			create.put("id", idOPEN);
			ch.setHeaders(headers);
			ch.setParams(create, RequestNetworkController.REQUEST_BODY);
			ch.startRequestNetwork(RequestNetworkController.POST, "https://".concat(save.getString("site", "").concat("/zakfilm.ir/app/getINFOapp.php")), "", _ch_request_listener);
		}
	}
	
	
	public void _download(final String _upera, final String _quality, final String _language) {
		guality = "480";
		type_dl = 0;
		load = new AlertDialog.Builder(MainActivity.this).create();
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
		Glide.with(getApplicationContext())
		.load(save.getString("domain", "").concat("207&h=250&q=40".concat("&src=https://s35.upera.net/s3/posters/".concat(mpp.get("poster").toString()))))
		.placeholder(R.drawable.nul)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
		.into(poster);
		title.setText(mpp.get("name_fa").toString());
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
					load.dismiss();
					if (type_dl == 0) {
						if (getIntent().hasExtra("my")) {
							_download_notificationi(mpp.get("upera").toString(), "/Download".concat("/"), mpp.get("name_fa").toString().concat(_upera).concat(".".concat("mp4")));
						} else {
							_download_notificationi("https://relfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat(guality.concat(".mp4".concat("?ref=tvAd"))))), "/Download".concat("/"), mpp.get("name_fa").toString().concat(_upera).concat(".".concat("mp4")));
						}
						bv.vibrate((long)(100));
						SketchwareUtil.showMessage(getApplicationContext(), "شروع دانلود...");
					} else {
						if (getIntent().hasExtra("my")) {
							url = mpp.get("upera").toString();
							filen = mpp.get("upera").toString();
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
				} else {
					SketchwareUtil.showMessage(getApplicationContext(), "اشتراک ندارید!");
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
	}
	
	
	public void _download_notificationi(final String _url, final String _path, final String _name) {
		
		ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		boolean isConnected = false;
		
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			NetworkCapabilities capabilities = connMgr.getNetworkCapabilities(connMgr.getActiveNetwork());
			if (capabilities != null && capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)) {
				isConnected = true;
			}
		} else {
			android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
			if (networkInfo != null && networkInfo.isConnected()) {
				isConnected = true;
			}
		}
		
		if (isConnected) {
			final String urlDownload = _url;
			final String fileName = _name;
			
			DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
			request.setDescription("Downloading: " + fileName);
			request.setTitle(fileName);
			request.allowScanningByMediaScanner();
			request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
			
			// ذخیره ویدئو در پوشه Download عمومی
			request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName);
			
			final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
			final long downloadId = manager.enqueue(request);
			
			new Thread(new Runnable() {
				@Override
				public void run() {
					boolean downloading = true;
					
					while (downloading) {
						DownloadManager.Query query = new DownloadManager.Query();
						query.setFilterById(downloadId);
						
						Cursor cursor = manager.query(query);
						if (cursor != null && cursor.moveToFirst()) {
							int bytesDownloaded = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
							int bytesTotal = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
							
							if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_SUCCESSFUL) {
								downloading = false;
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										showMessage("دانلود کامل شد! فایل در پوشه Downloads ذخیره شد.");
									}
								});
							}
							
							if (bytesTotal > 0) {
								final int dlProgress = (int) ((bytesDownloaded * 100L) / bytesTotal);
								
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										// به‌روزرسانی UI در صورت نیاز
									}
								});
							}
						}
						
						if (cursor != null) {
							cursor.close();
						}
						
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
		} else {
			
			showMessage("اتصال به شبکه برقرار نیست!");
		}
		
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
	}
	
	
	public void _more_information() {
		final com.google.android.material.bottomsheet.BottomSheetDialog a = new com.google.android.material.bottomsheet.BottomSheetDialog(MainActivity.this);
		View lay = getLayoutInflater().inflate(R.layout.movie_info_dialog, null);
		a.setContentView(lay);
		a.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
		final TextView titleT  = (TextView)lay.findViewById(R.id.titleT);
		final TextView tagT  = (TextView)lay.findViewById(R.id.tagT);
		final TextView sdateT  = (TextView)lay.findViewById(R.id.sdateT);
		final TextView nameT  = (TextView)lay.findViewById(R.id.nameT);
		final TextView durationT  = (TextView)lay.findViewById(R.id.durationT);
		final TextView overview_fa  = (TextView)lay.findViewById(R.id.overview_fa);
		final ImageView imageview1  = (ImageView)lay.findViewById(R.id.imageview1);
		final ImageView imageview5  = (ImageView)lay.findViewById(R.id.imageview5);
		final ImageView imageview6  = (ImageView)lay.findViewById(R.id.imageview6);
		final ImageView imageview7  = (ImageView)lay.findViewById(R.id.imageview7);
		final LinearLayout play  = (LinearLayout)lay.findViewById(R.id.play);
		final LinearLayout cancel  = (LinearLayout)lay.findViewById(R.id.cancel);
		final LinearLayout like  = (LinearLayout)lay.findViewById(R.id.like);
		final LinearLayout download  = (LinearLayout)lay.findViewById(R.id.download);
		final LinearLayout share  = (LinearLayout)lay.findViewById(R.id.share);
		final LinearLayout linear4  = (LinearLayout)lay.findViewById(R.id.linear4);
		final LinearLayout linear37  = (LinearLayout)lay.findViewById(R.id.linear37);
		final androidx.cardview.widget.CardView cardview2  = (androidx.cardview.widget.CardView)lay.findViewById(R.id.cardview2);
		linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(7.5d)), 0x50000000));
		linear37.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(7.5d)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0x50FFC107, 0x20FFC107));
		_ColourFilter(imageview5, save.getString("theme", ""));
		_ColourFilter(imageview6, save.getString("theme", ""));
		_ColourFilter(imageview7, save.getString("theme", ""));
		titleT.setText(mpp.get("name_fa").toString());
		if (s == 0) {
			Glide.with(getApplicationContext())
			.load(save.getString("domain", "").concat("807&h=850&q=100".concat("&src=https://s35.upera.net/s3/posters/".concat(mpp.get("poster").toString()))))
			.placeholder(R.drawable.nul)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
			.into(imageview1);
		} else {
			titleT.setText("منتخب");
			if (mpp.get("poster").toString().toString().trim().startsWith("http")) {
				Glide.with(getApplicationContext())
				.load(mpp.get("poster").toString())
				.placeholder(R.drawable.nul)
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
				.into(imageview1);
			} else {
				Glide.with(getApplicationContext())
				.load(save.getString("domain", "").concat("807&h=850&q=100".concat("&src=https://s35.upera.net/s3/posters/".concat(mpp.get("poster").toString()))))
				.placeholder(R.drawable.nul)
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
				.into(imageview1);
			}
		}
		cardview2.setCardBackgroundColor(0xFF000000);
		cardview2.setRadius((float)SketchwareUtil.getDip(getApplicationContext(), (int)(15)));
		cardview2.setCardElevation((float)0);
		overview_fa.setText(mpp.get("overview_fa").toString());
		tagT.setText(mpp.get("genre").toString());
		sdateT.setText(String.valueOf((long)(Double.parseDouble(mpp.get("year").toString()))));
		durationT.setText(mpp.get("rate").toString());
		nameT.setText(mpp.get("age").toString());
		
		overview_fa.setMaxLines(7);
		overview_fa.setEllipsize(android.text.TextUtils.TruncateAt.END);
		_rippleRoundStroke(play, save.getString("theme", ""), "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getApplicationContext(), (int)(1)), "#ff8a80");
		_rippleRoundStroke(like, "#1d2733", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getApplicationContext(), (int)(1)), "#37474f");
		_rippleRoundStroke(download, "#1d2733", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getApplicationContext(), (int)(1)), "#37474f");
		_rippleRoundStroke(share, "#1d2733", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getApplicationContext(), (int)(1)), "#37474f");
		_rippleRoundStroke(cancel, "#1d2733", "#ffffff", SketchwareUtil.getDip(getApplicationContext(), (int)(15)), SketchwareUtil.getDip(getApplicationContext(), (int)(1)), "#37474f");
		a.setCancelable(false);
		a.show();
		play.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				to.setClass(getApplicationContext(), ViewActivity.class);
				to.putExtra("name", mpp.get("name_fa").toString());
				to.putExtra("image", mpp.get("poster").toString());
				to.putExtra("dasteh", "");
				to.putExtra("backdrop", mpp.get("backdrop").toString());
				if (s == 0) {
					
				} else {
					to.putExtra("my", "");
					to.putExtra("type", "movie");
					to.putExtra("id", mpp.get("id").toString());
				}
				startActivity(to);
				a.dismiss();
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "دیالوگ لغو شد."));
			}
		});
		download.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				if (s == 0) {
					_download(mpp.get("upera").toString(), save.getString("domain", "").concat("575&h=500&q=60&a=c&zc=1&src=https://cdn.upera.shop/s3/backdrops/").concat(mpp.get("backdrop").toString()), "0");
				} else {
					
				}
			}
		});
		cancel.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				a.dismiss();
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "دیالوگ لغو شد."));
			}
		});
	}
	
	
	public void _checkClpboard() {
		new Handler().postDelayed(() -> {
			
			android.content.ClipboardManager clipboard = 
			(android.content.ClipboardManager) getSystemService(android.content.Context.CLIPBOARD_SERVICE);
			
			if (clipboard != null && clipboard.hasPrimaryClip()) {
				
				android.content.ClipData clipData = clipboard.getPrimaryClip();
				
				if (clipData != null && clipData.getItemCount() > 0) {
					
					CharSequence cs = clipData.getItemAt(0).coerceToText(MainActivity.this);
					
					if (cs != null) {
						
						String clipboardText = cs.toString().trim();
						
						
						
						if (clipboardText.startsWith("type=")) {
							copied_text = clipboardText;
							
							if (!save.getString("recentId", "").equals(copied_text)) {
								edittext1.setText(copied_text);
								_checkClipboard();
							}
						} else {
							
						}
					}}}
			// clipboard code
		}, 500);
	}
	
	
	public void _animation_alpah_main0_linear() {
		relativelayout1.setAlpha((float)(0));
		alpah.setTarget(relativelayout1);
		alpah.setPropertyName("alpha");
		alpah.setFloatValues((float)(1));
		alpah.setDuration((int)(500));
		alpah.start();
	}
	
	
	public void _signWithPrivateKey() {
	}
	private String signWithPrivateKey(String data, String privateKeyPem) throws Exception {
		// Clean up the private key string
		privateKeyPem = privateKeyPem.replace("-----BEGIN PRIVATE KEY-----", "")
		.replace("-----END PRIVATE KEY-----", "")
		.replaceAll("\\s", "");
		
		// Decode the private key
		byte[] keyBytes = Base64.getDecoder().decode(privateKeyPem);
		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PrivateKey privateKey = keyFactory.generatePrivate(spec);
		
		// Create the signature
		Signature signature = Signature.getInstance("SHA256withRSA");
		signature.initSign(privateKey);
		signature.update(data.getBytes(StandardCharsets.UTF_8));
		byte[] signatureBytes = signature.sign();
		
		// Encode the signature in Base64 URL format
		return Base64.getUrlEncoder().withoutPadding().encodeToString(signatureBytes);
	}
	
	{
		endPoint = "";
		JTW_Generated = "";
		FCM_ProjectURL = "";
		ACCESS_TOKEN = "";
		PrivateKey = "";
		ClientEmail = "";
		body.put("", "");
		response_AccessToken.put("", "");
		Header.put("", "");
		message.put("", "");
		notification_Body.put("", "");
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