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
import android.graphics.Typeface;
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
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import smartdevelop.ir.eram.showcaseviewlib.*;
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class LoginActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private String code2 = "";
	private HashMap<String, Object> map = new HashMap<>();
	private boolean visibility = false;
	private String e = "";
	private String uid = "";
	private boolean cancable_dialog_loader = false;
	private double c = 0;
	private HashMap<String, Object> mlp = new HashMap<>();
	private String decrypted = "";
	
	private ArrayList<HashMap<String, Object>> g = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> mop = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> mno = new ArrayList<>();
	
	private LinearLayout linear33;
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private RelativeLayout linear3;
	private LinearLayout linear10;
	private LinearLayout linear23;
	private LinearLayout linear5;
	private ImageView imageview8;
	private ImageView imageview11;
	private LinearLayout linear16;
	private LinearLayout linear2;
	private LinearLayout linear21;
	private LinearLayout linear17;
	private TextView textview7;
	private ImageView imageview2;
	private TextView textview2;
	private LinearLayout linear24;
	private LinearLayout linear18;
	private LinearLayout linear15;
	private LinearLayout linear27;
	private LinearLayout linear22;
	private TextView textview10;
	private LinearLayout linear25;
	private ImageView imageview3;
	private LinearLayout linear20;
	private EditText edittext1;
	private LinearLayout linear26;
	private ImageView imageview9;
	private TextView textview6;
	private TextView textview5;
	private TextView textview4;
	private LinearLayout linear8;
	private LinearLayout linear28;
	private LinearLayout linear32;
	private TextView textview1;
	private LinearLayout linear31;
	private TextView textview11;
	private LinearLayout linear29;
	private TextView textview12;
	private ImageView imageview10;
	private TextView textview8;
	
	private Intent i = new Intent();
	private Vibrator vob;
	private AlertDialog load;
	private TimerTask t;
	private TimerTask tt;
	private RequestNetwork add_account;
	private RequestNetwork.RequestListener _add_account_request_listener;
	private SharedPreferences em;
	private RequestNetwork check;
	private RequestNetwork.RequestListener _check_request_listener;
	private SharedPreferences id_pr;
	private Intent to = new Intent();
	private RequestNetwork get_info;
	private RequestNetwork.RequestListener _get_info_request_listener;
	private RequestNetwork co;
	private RequestNetwork.RequestListener _co_request_listener;
	private SharedPreferences name_pr;
	private SharedPreferences profile_pr;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.login);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear33 = findViewById(R.id.linear33);
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear3 = findViewById(R.id.linear3);
		linear10 = findViewById(R.id.linear10);
		linear23 = findViewById(R.id.linear23);
		linear5 = findViewById(R.id.linear5);
		imageview8 = findViewById(R.id.imageview8);
		imageview11 = findViewById(R.id.imageview11);
		linear16 = findViewById(R.id.linear16);
		linear2 = findViewById(R.id.linear2);
		linear21 = findViewById(R.id.linear21);
		linear17 = findViewById(R.id.linear17);
		textview7 = findViewById(R.id.textview7);
		imageview2 = findViewById(R.id.imageview2);
		textview2 = findViewById(R.id.textview2);
		linear24 = findViewById(R.id.linear24);
		linear18 = findViewById(R.id.linear18);
		linear15 = findViewById(R.id.linear15);
		linear27 = findViewById(R.id.linear27);
		linear22 = findViewById(R.id.linear22);
		textview10 = findViewById(R.id.textview10);
		linear25 = findViewById(R.id.linear25);
		imageview3 = findViewById(R.id.imageview3);
		linear20 = findViewById(R.id.linear20);
		edittext1 = findViewById(R.id.edittext1);
		linear26 = findViewById(R.id.linear26);
		imageview9 = findViewById(R.id.imageview9);
		textview6 = findViewById(R.id.textview6);
		textview5 = findViewById(R.id.textview5);
		textview4 = findViewById(R.id.textview4);
		linear8 = findViewById(R.id.linear8);
		linear28 = findViewById(R.id.linear28);
		linear32 = findViewById(R.id.linear32);
		textview1 = findViewById(R.id.textview1);
		linear31 = findViewById(R.id.linear31);
		textview11 = findViewById(R.id.textview11);
		linear29 = findViewById(R.id.linear29);
		textview12 = findViewById(R.id.textview12);
		imageview10 = findViewById(R.id.imageview10);
		textview8 = findViewById(R.id.textview8);
		vob = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		add_account = new RequestNetwork(this);
		em = getSharedPreferences("em", Activity.MODE_PRIVATE);
		check = new RequestNetwork(this);
		id_pr = getSharedPreferences("id_pr", Activity.MODE_PRIVATE);
		get_info = new RequestNetwork(this);
		co = new RequestNetwork(this);
		name_pr = getSharedPreferences("name_pr", Activity.MODE_PRIVATE);
		profile_pr = getSharedPreferences("profile_pr", Activity.MODE_PRIVATE);
		
		linear21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				to.setClass(getApplicationContext(), MainActivity.class);
				id_pr.edit().remove("id_pr").commit();
				name_pr.edit().remove("name_pr").commit();
				profile_pr.edit().remove("profile_pr").commit();
				em.edit().remove("em").commit();
				startActivity(to);
				finish();
				overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
				overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
			}
		});
		
		linear22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_telegramLoaderDialog(true);
				co.startRequestNetwork(RequestNetworkController.GET, "https://www.zakfilm.ir/appfilm/search_account.php?uid=".concat(mlp.get("uid00").toString()), edittext1.getText().toString(), _co_request_listener);
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.isEmpty()) {
					_ColourFilter(imageview9, "#bdbdbd");
				} else {
					_ColourFilter(imageview9, "#ffffff");
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		linear26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext1.setText("");
				vob.vibrate((long)(70));
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().isEmpty()) {
					SketchwareUtil.showMessage(getApplicationContext(), "آدرس ایمیل خود را وارد کنید");
				} else {
					_telegramLoaderDialog(true);
					visibility = visibility;
					check.startRequestNetwork(RequestNetworkController.GET, "https://www.zakfilm.ir/appfilm/check_account.php?email=".concat(edittext1.getText().toString()), edittext1.getText().toString(), _check_request_listener);
				}
			}
		});
		
		_add_account_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				linear22.setVisibility(View.VISIBLE);
				linear27.setVisibility(View.GONE);
				textview2.setText("پیغامی به همراه کد تایید به ایمیل ".concat(edittext1.getText().toString().concat("ارسال شد لطفا آن را وارد کنید")));
				edittext1.setHint("کد تایید را وارد کنید");
				edittext1.setText("");
				imageview3.setImageResource(R.drawable.ic_drafts_white);
				_telegramLoaderDialog(false);
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_check_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				e = _tag;
				mlp = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
				if (mlp.get("state").toString().equals("OK")) {
					get_info.startRequestNetwork(RequestNetworkController.GET, "https://www.zakfilm.ir/appfilm/search_account.php?uid=".concat(mlp.get("uid00").toString()), mlp.get("uid00").toString(), _get_info_request_listener);
					c = Double.parseDouble(mlp.get("uid00").toString());
				} else {
					uid = String.valueOf((long)(SketchwareUtil.getRandom((int)(10000), (int)(99999))));
					map = new HashMap<>();
					map.put("name00", "مهمان");
					map.put("profile00", "https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387889.jpg");
					map.put("uid00", uid);
					map.put("email00", _tag);
					c = Double.parseDouble(uid);
					add_account.setParams(map, RequestNetworkController.REQUEST_PARAM);
					add_account.startRequestNetwork(RequestNetworkController.POST, "https://www.zakfilm.ir/appfilm/add_account.php", uid, _add_account_request_listener);
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_get_info_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				g = new Gson().fromJson(_response, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
				map = new HashMap<>();
				map.put("name00", g.get((int)0).get("name00").toString());
				map.put("profile00", g.get((int)0).get("profile00").toString());
				map.put("uid00", g.get((int)0).get("uid00").toString());
				map.put("email00", g.get((int)0).get("email00").toString());
				add_account.setParams(map, RequestNetworkController.REQUEST_PARAM);
				add_account.startRequestNetwork(RequestNetworkController.POST, "https://www.zakfilm.ir/appfilm/add_account.php", g.get((int)0).get("email00").toString(), _add_account_request_listener);
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_co_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				mop = new Gson().fromJson(_response, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
				if (_tag.equals(String.valueOf((long)(Double.parseDouble(mop.get((int)0).get("code00").toString()))))) {
					em.edit().putString("em", mop.get((int)0).get("email00").toString()).commit();
					id_pr.edit().putString("id_pr", mop.get((int)0).get("uid00").toString()).commit();
					name_pr.edit().putString("name_pr", mop.get((int)0).get("name00").toString()).commit();
					profile_pr.edit().putString("profile_pr", mop.get((int)0).get("profile00").toString()).commit();
					finish();
					overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
				} else {
					SketchwareUtil.showMessage(getApplicationContext(), "کد تایید اشتباه");
					_telegramLoaderDialog(false);
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
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
			Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);}
		getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN); if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { getWindow().setStatusBarColor(Color.TRANSPARENT); }
		getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		linear22.setVisibility(View.GONE);
		_ui();
	}
	
	@Override
	public void onBackPressed() {
		if (textview2.getText().toString().equals("برای تماشا و دانلود نامحدود فیلم و سریال آدرس ایمیل خود را وارد کنید")) {
			finish();
			overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
		} else {
			linear22.setVisibility(View.GONE);
			linear27.setVisibility(View.VISIBLE);
			textview2.setText("برای تماشا و دانلود نامحدود فیلم و سریال آدرس ایمیل خود را وارد کنید");
			edittext1.setHint("ایمیل خود را وارد کنید");
			imageview3.setImageResource(R.drawable.ic_markunread_white);
			_TransitionManager(linear1, 300);
		}
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
		
	}
	public void _ui() {
		_rippleRoundStroke(linear8, "#ffffff", "#000000", 999, 0, "#9e9e9e");
		_rippleRoundStroke(linear22, "#ffffff", "#000000", 999, 0, "#9e9e9e");
		_rippleRoundStroke(linear18, "#1d2733", "#424242", 40, 0, "#ffffff");
		_rippleRoundStroke(linear17, "#99000000", "#000000", 999, 0, "#000000");
		_rippleRoundStroke(linear21, "#99000000", "#000000", 999, 0, "#000000");
		_rippleRoundStroke(linear32, "#1d2733", "#000000", 999, 0, "#000000");
		linear25.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)999, 0xFF2979FF));
		_RippleEffects("#eeeeee", imageview9);
		_removeScollBar(vscroll1);
		OverScrollDecoratorHelper.setUpOverScroll(vscroll1);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF0f1620".replace("0xFF" , "#")));
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
	
	
	public void _fade_translate() {
		overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
	}
	
	
	public void _telegramLoaderDialog(final boolean _visibility) {
		if (_visibility) {
			// در متد ایجاد دیالوگ
			load = new AlertDialog.Builder(LoginActivity.this).create();
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
	
	
	public void _RippleEffects(final String _color, final View _view) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_color)});
		android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null);
		_view.setBackground(ripdr);
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
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