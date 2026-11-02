package zakfilm.ir;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Context;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
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
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.ui.*;
import com.google.firebase.FirebaseApp;
import eightbitlab.com.blurview.*;
import ir.amirsina.mykey.util.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;
import smartdevelop.ir.eram.showcaseviewlib.*;

public class SendCommentActivity extends AppCompatActivity {
	
	private HashMap<String, Object> s = new HashMap<>();
	
	private LinearLayout linear83;
	private LinearLayout linear91;
	private LinearLayout linear1;
	private TextView textview47;
	private ImageView imageview40;
	private LinearLayout linear85;
	private ImageView imageview39;
	private LinearLayout linear86;
	private TextView textview48;
	private LinearLayout linear92;
	private ScrollView vscroll1;
	private LinearLayout linear93;
	private LinearLayout linear90;
	private LinearLayout linear89;
	private ImageView imageview41;
	private ImageView imageview42;
	private ImageView imageview43;
	private ImageView imageview44;
	private ImageView imageview45;
	private TextView textview49;
	private LinearLayout linear87;
	private EditText edittext1;
	private TextView position;
	private TextView duration;
	private TextView textview50;
	
	private RequestNetwork send;
	private RequestNetwork.RequestListener _send_request_listener;
	private Vibrator vib;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.send_comment);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear83 = findViewById(R.id.linear83);
		linear91 = findViewById(R.id.linear91);
		linear1 = findViewById(R.id.linear1);
		textview47 = findViewById(R.id.textview47);
		imageview40 = findViewById(R.id.imageview40);
		linear85 = findViewById(R.id.linear85);
		imageview39 = findViewById(R.id.imageview39);
		linear86 = findViewById(R.id.linear86);
		textview48 = findViewById(R.id.textview48);
		linear92 = findViewById(R.id.linear92);
		vscroll1 = findViewById(R.id.vscroll1);
		linear93 = findViewById(R.id.linear93);
		linear90 = findViewById(R.id.linear90);
		linear89 = findViewById(R.id.linear89);
		imageview41 = findViewById(R.id.imageview41);
		imageview42 = findViewById(R.id.imageview42);
		imageview43 = findViewById(R.id.imageview43);
		imageview44 = findViewById(R.id.imageview44);
		imageview45 = findViewById(R.id.imageview45);
		textview49 = findViewById(R.id.textview49);
		linear87 = findViewById(R.id.linear87);
		edittext1 = findViewById(R.id.edittext1);
		position = findViewById(R.id.position);
		duration = findViewById(R.id.duration);
		textview50 = findViewById(R.id.textview50);
		send = new RequestNetwork(this);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		linear85.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
				overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
			}
		});
		
		linear89.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().isEmpty()) {
					vib.vibrate((long)(100));
				} else {
					s = new HashMap<>();
					s.put("id", "a0061c00-679c-11ea-b87b-95577a710fed");
					s.put("type", getIntent().getStringExtra("type"));
					s.put("text", edittext1.getText().toString());
					s.put("parent", "0");
					s.put("autor", "zakfilm");
					s.put("email", "zakfilm.ir@gmail.com");
					send.setParams(s, RequestNetworkController.REQUEST_PARAM);
					send.startRequestNetwork(RequestNetworkController.POST, "https://api.upera.tv/api/v1/ghost/commentsV2", "", _send_request_listener);
				}
			}
		});
		
		imageview41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview41.setImageResource(R.drawable.stars_2);
				imageview42.setImageResource(R.drawable.stars_1);
				imageview43.setImageResource(R.drawable.stars_1);
				imageview44.setImageResource(R.drawable.stars_1);
				imageview45.setImageResource(R.drawable.stars_1);
				textview48.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0x50F44336));
				textview48.setTextColor(0xFFFF1744);
				textview48.setText("خیلی بد");
				_clickAnimation(imageview41);
			}
		});
		
		imageview42.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview41.setImageResource(R.drawable.stars_2);
				imageview42.setImageResource(R.drawable.stars_2);
				imageview43.setImageResource(R.drawable.stars_1);
				imageview44.setImageResource(R.drawable.stars_1);
				imageview45.setImageResource(R.drawable.stars_1);
				textview48.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0x50F44336));
				textview48.setTextColor(0xFFFF1744);
				textview48.setText("بد");
				_clickAnimation(imageview41);
				_clickAnimation(imageview42);
			}
		});
		
		imageview43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview41.setImageResource(R.drawable.stars_2);
				imageview42.setImageResource(R.drawable.stars_2);
				imageview43.setImageResource(R.drawable.stars_2);
				imageview44.setImageResource(R.drawable.stars_1);
				imageview45.setImageResource(R.drawable.stars_1);
				textview48.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0x50FFC107));
				textview48.setTextColor(0xFFFFD740);
				textview48.setText("معمولی");
				_clickAnimation(imageview41);
				_clickAnimation(imageview42);
				_clickAnimation(imageview43);
			}
		});
		
		imageview44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview41.setImageResource(R.drawable.stars_2);
				imageview42.setImageResource(R.drawable.stars_2);
				imageview43.setImageResource(R.drawable.stars_2);
				imageview44.setImageResource(R.drawable.stars_2);
				imageview45.setImageResource(R.drawable.stars_1);
				textview48.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0x504CAF50));
				textview48.setTextColor(0xFF00E676);
				textview48.setText("خوب");
				_clickAnimation(imageview41);
				_clickAnimation(imageview42);
				_clickAnimation(imageview43);
				_clickAnimation(imageview44);
			}
		});
		
		imageview45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview41.setImageResource(R.drawable.stars_2);
				imageview42.setImageResource(R.drawable.stars_2);
				imageview43.setImageResource(R.drawable.stars_2);
				imageview44.setImageResource(R.drawable.stars_2);
				imageview45.setImageResource(R.drawable.stars_2);
				textview48.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0x504CAF50));
				textview48.setTextColor(0xFF00E676);
				textview48.setText("خیلی خوب");
				_clickAnimation(imageview41);
				_clickAnimation(imageview42);
				_clickAnimation(imageview43);
				_clickAnimation(imageview44);
				_clickAnimation(imageview45);
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				position.setText(String.valueOf((long)(_charSeq.length())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		_send_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				SketchwareUtil.showMessage(getApplicationContext(), "پس از بررسی ثبت میشود");
				finish();
				overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
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
		getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		Glide.with(getApplicationContext())
		.load("https://s35.upera.net/thumb?w=207&h=207&q=".concat("100".concat("&src=https://s35.upera.net/s3/posters/".concat(getIntent().getStringExtra("image")))))
		.placeholder(R.drawable.back)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(999))
		.into(imageview40);
		textview47.setText(getIntent().getStringExtra("name"));
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			final Window window = SendCommentActivity.this.getWindow();
			window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			window.setStatusBarColor(0xFF0F1620);
		}
		_ui();
		if (getIntent().getStringExtra("r").equals("1")) {
			imageview41.setImageResource(R.drawable.stars_2);
			textview48.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0x50F44336));
			textview48.setTextColor(0xFFFF1744);
			textview48.setText("خیلی بد");
		} else {
			imageview41.setImageResource(R.drawable.stars_2);
			imageview42.setImageResource(R.drawable.stars_2);
			imageview43.setImageResource(R.drawable.stars_2);
			imageview44.setImageResource(R.drawable.stars_2);
			imageview45.setImageResource(R.drawable.stars_2);
			textview48.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0x504CAF50));
			textview48.setTextColor(0xFF00E676);
			textview48.setText("خیلی خوب");
		}
	}
	
	@Override
	public void onBackPressed() {
		finish();
		overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
	}
	public void _ui() {
		linear87.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)20, (int)3, 0xFF9E9E9E, Color.TRANSPARENT));
		linear89.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)20, (int)0, 0xFF9E9E9E, 0xFF448AFF));
		_ColourFilter(imageview41, "#448aff");
		_ColourFilter(imageview42, "#448aff");
		_ColourFilter(imageview43, "#448aff");
		_ColourFilter(imageview44, "#448aff");
		_ColourFilter(imageview45, "#448aff");
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