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
import com.google.firebase.FirebaseApp;
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

public class EditAccountActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private boolean visibility = false;
	private HashMap<String, Object> map = new HashMap<>();
	private boolean cancable_dialog_loader = false;
	private String path = "";
	private String name = "";
	private String upload_url = "";
	
	private ArrayList<HashMap<String, Object>> gg = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear13;
	private LinearLayout linear9;
	private LinearLayout linear2;
	private ImageView imageview4;
	private LinearLayout linear16;
	private TextView textview1;
	private LinearLayout linear5;
	private LinearLayout linear11;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private RelativeLayout linear3;
	private CircleImageView circleimageview1;
	private LinearLayout linear4;
	private CircleImageView circleimageview3;
	private CircleImageView circleimageview5;
	private CircleImageView circleimageview7;
	private CircleImageView circleimageview6;
	private CircleImageView circleimageview4;
	private CircleImageView circleimageview2;
	private EditText name1;
	private TextView textview4;
	private TextView textview2;
	private TextView email;
	private LinearLayout linear10;
	private ImageView imageview3;
	private TextView textview3;
	
	private AlertDialog load;
	private SharedPreferences em;
	private RequestNetwork edit_account;
	private RequestNetwork.RequestListener _edit_account_request_listener;
	private SharedPreferences name_pr;
	private SharedPreferences profile_pr;
	private SharedPreferences id_pr;
	private Vibrator vib;
	private TimerTask t;
	private Intent to = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.edit_account);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear13 = findViewById(R.id.linear13);
		linear9 = findViewById(R.id.linear9);
		linear2 = findViewById(R.id.linear2);
		imageview4 = findViewById(R.id.imageview4);
		linear16 = findViewById(R.id.linear16);
		textview1 = findViewById(R.id.textview1);
		linear5 = findViewById(R.id.linear5);
		linear11 = findViewById(R.id.linear11);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear3 = findViewById(R.id.linear3);
		circleimageview1 = findViewById(R.id.circleimageview1);
		linear4 = findViewById(R.id.linear4);
		circleimageview3 = findViewById(R.id.circleimageview3);
		circleimageview5 = findViewById(R.id.circleimageview5);
		circleimageview7 = findViewById(R.id.circleimageview7);
		circleimageview6 = findViewById(R.id.circleimageview6);
		circleimageview4 = findViewById(R.id.circleimageview4);
		circleimageview2 = findViewById(R.id.circleimageview2);
		name1 = findViewById(R.id.name1);
		textview4 = findViewById(R.id.textview4);
		textview2 = findViewById(R.id.textview2);
		email = findViewById(R.id.email);
		linear10 = findViewById(R.id.linear10);
		imageview3 = findViewById(R.id.imageview3);
		textview3 = findViewById(R.id.textview3);
		em = getSharedPreferences("em", Activity.MODE_PRIVATE);
		edit_account = new RequestNetwork(this);
		name_pr = getSharedPreferences("name_pr", Activity.MODE_PRIVATE);
		profile_pr = getSharedPreferences("profile_pr", Activity.MODE_PRIVATE);
		id_pr = getSharedPreferences("id_pr", Activity.MODE_PRIVATE);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (name1.getText().toString().isEmpty()) {
					vib.vibrate((long)(100));
				} else {
					name_pr.edit().putString("name_pr", name1.getText().toString()).commit();
					finish();
				}
			}
		});
		
		linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		circleimageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				upload_url = "https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387893.jpg";
				Glide.with(getApplicationContext())
				.load(upload_url)
				.placeholder(R.drawable.profile)
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
				.into(circleimageview1);
				_clickAnimation(circleimageview3);
				_clickAnimation(circleimageview1);
			}
		});
		
		circleimageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				upload_url = "https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387892.jpg";
				Glide.with(getApplicationContext())
				.load(upload_url)
				.placeholder(R.drawable.profile)
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
				.into(circleimageview1);
				_clickAnimation(circleimageview5);
				_clickAnimation(circleimageview1);
			}
		});
		
		circleimageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				upload_url = "https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387889.jpg";
				Glide.with(getApplicationContext())
				.load(upload_url)
				.placeholder(R.drawable.profile)
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
				.into(circleimageview1);
				_clickAnimation(circleimageview7);
				_clickAnimation(circleimageview1);
			}
		});
		
		circleimageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				upload_url = "https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387890.jpg";
				Glide.with(getApplicationContext())
				.load(upload_url)
				.placeholder(R.drawable.profile)
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
				.into(circleimageview1);
				_clickAnimation(circleimageview6);
				_clickAnimation(circleimageview1);
			}
		});
		
		circleimageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				upload_url = "https://www.zakfilm.ir/appfilm/uploads/uploader/file/images-6.jpeg";
				Glide.with(getApplicationContext())
				.load(upload_url)
				.placeholder(R.drawable.profile)
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
				.into(circleimageview1);
				_clickAnimation(circleimageview4);
				_clickAnimation(circleimageview1);
			}
		});
		
		circleimageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				upload_url = "https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387891.jpg";
				Glide.with(getApplicationContext())
				.load(upload_url)
				.placeholder(R.drawable.profile)
				.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
				.into(circleimageview1);
				_clickAnimation(circleimageview2);
				_clickAnimation(circleimageview1);
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				vib.vibrate((long)(80));
			}
		});
		
		_edit_account_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				name_pr.edit().putString("name_pr", name1.getText().toString()).commit();
				if (upload_url.isEmpty()) {
					profile_pr.edit().putString("profile_pr", profile_pr.getString("profile_pr", "")).commit();
				} else {
					profile_pr.edit().putString("profile_pr", upload_url).commit();
				}
				id_pr.edit().putString("id_pr", id_pr.getString("id_pr", "")).commit();
				em.edit().putString("em", email.getText().toString()).commit();
				finish();
				overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
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
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF1d2733".replace("0xFF" , "#")));
		}
		getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		Glide.with(getApplicationContext())
		.load(profile_pr.getString("profile_pr", ""))
		.placeholder(R.drawable.profile)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(30))
		.into(circleimageview1);
		upload_url = profile_pr.getString("profile_pr", "");
		_ui();
		if (name_pr.contains("name_pr")) {
			name1.setText(name_pr.getString("name_pr", ""));
		} else {
			name1.setText("مهمان");
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
		
	}
	public void _ui() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			final Window window = EditAccountActivity.this.getWindow();
			window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			window.setStatusBarColor(0xFF0F1620);
		}
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF0f1620".replace("0xFF" , "#")));
		}
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF1D2733));
		linear16.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF1D2733));
		linear7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF1D2733));
		linear8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)999, 0xFFFFFFFF));
		linear10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0x700F1620));
		Glide.with(getApplicationContext())
		.load("https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387891.jpg")
		.placeholder(R.drawable.profile)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
		.into(circleimageview2);
		Glide.with(getApplicationContext())
		.load("https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387893.jpg")
		.placeholder(R.drawable.profile)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
		.into(circleimageview3);
		Glide.with(getApplicationContext())
		.load("https://www.zakfilm.ir/appfilm/uploads/uploader/file/images-6.jpeg")
		.placeholder(R.drawable.profile)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
		.into(circleimageview4);
		Glide.with(getApplicationContext())
		.load("https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387892.jpg")
		.placeholder(R.drawable.profile)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
		.into(circleimageview5);
		Glide.with(getApplicationContext())
		.load("https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387890.jpg")
		.placeholder(R.drawable.profile)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
		.into(circleimageview6);
		Glide.with(getApplicationContext())
		.load("https://www.zakfilm.ir/appfilm/uploads/uploader/file/1000387889.jpg")
		.placeholder(R.drawable.profile)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
		.into(circleimageview7);
	}
	
	
	public void _clickAnimation(final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
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