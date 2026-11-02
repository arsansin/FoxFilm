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
import android.widget.CompoundButton;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
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
import java.io.InputStream;
import java.text.*;
import java.util.*;
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
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class SettingActivity extends AppCompatActivity {
	
	private double round = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear65;
	private ScrollView vscroll1;
	private TextView love;
	private TextView cuple;
	private LinearLayout linear89;
	private TextView textview3;
	private LinearLayout linear90;
	private ImageView setting;
	private LinearLayout linear97;
	private LinearLayout linear2;
	private LinearLayout linear91;
	private LinearLayout linear96;
	private LinearLayout linear98;
	private ImageView imageview7;
	private TextView textview1;
	private ImageView imageview1;
	private LinearLayout linear92;
	private RelativeLayout relativelayout1;
	private LinearLayout linear5;
	private LinearLayout linear95;
	private TextView textview9;
	private LinearLayout linear94;
	private TextView textview5;
	private TextView textview4;
	private ImageView imageview2;
	private ImageView imageview3;
	private LinearLayout linear3;
	private TextView textview6;
	private LinearLayout linear6;
	private LinearLayout linear4;
	private ImageView imageview4;
	private TextView name;
	private SeekBar seekbar2;
	private TextView textview8;
	private SeekBar seekbar1;
	private TextView textview7;
	private Switch switch1;
	private TextView textview10;
	private ImageView imageview9;
	private LinearLayout linear99;
	private HorizontalScrollView hscroll1;
	private TextView textview13;
	private ImageView imageview10;
	private LinearLayout linear102;
	private LinearLayout linear106;
	private LinearLayout linear108;
	private LinearLayout linear110;
	private LinearLayout linear112;
	private LinearLayout linear114;
	private LinearLayout linear116;
	private LinearLayout color1;
	private ImageView tick1;
	private LinearLayout color2;
	private ImageView tick2;
	private LinearLayout color3;
	private ImageView tick3;
	private LinearLayout color4;
	private ImageView tick4;
	private LinearLayout color5;
	private ImageView tick5;
	private LinearLayout color6;
	private ImageView tick6;
	
	private SharedPreferences round_img;
	private SharedPreferences width_img;
	private SharedPreferences height_img;
	private SharedPreferences type_videoplayer;
	private Intent i = new Intent();
	private SharedPreferences save;
	private SharedPreferences data;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.setting);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear65 = findViewById(R.id.linear65);
		vscroll1 = findViewById(R.id.vscroll1);
		love = findViewById(R.id.love);
		cuple = findViewById(R.id.cuple);
		linear89 = findViewById(R.id.linear89);
		textview3 = findViewById(R.id.textview3);
		linear90 = findViewById(R.id.linear90);
		setting = findViewById(R.id.setting);
		linear97 = findViewById(R.id.linear97);
		linear2 = findViewById(R.id.linear2);
		linear91 = findViewById(R.id.linear91);
		linear96 = findViewById(R.id.linear96);
		linear98 = findViewById(R.id.linear98);
		imageview7 = findViewById(R.id.imageview7);
		textview1 = findViewById(R.id.textview1);
		imageview1 = findViewById(R.id.imageview1);
		linear92 = findViewById(R.id.linear92);
		relativelayout1 = findViewById(R.id.relativelayout1);
		linear5 = findViewById(R.id.linear5);
		linear95 = findViewById(R.id.linear95);
		textview9 = findViewById(R.id.textview9);
		linear94 = findViewById(R.id.linear94);
		textview5 = findViewById(R.id.textview5);
		textview4 = findViewById(R.id.textview4);
		imageview2 = findViewById(R.id.imageview2);
		imageview3 = findViewById(R.id.imageview3);
		linear3 = findViewById(R.id.linear3);
		textview6 = findViewById(R.id.textview6);
		linear6 = findViewById(R.id.linear6);
		linear4 = findViewById(R.id.linear4);
		imageview4 = findViewById(R.id.imageview4);
		name = findViewById(R.id.name);
		seekbar2 = findViewById(R.id.seekbar2);
		textview8 = findViewById(R.id.textview8);
		seekbar1 = findViewById(R.id.seekbar1);
		textview7 = findViewById(R.id.textview7);
		switch1 = findViewById(R.id.switch1);
		textview10 = findViewById(R.id.textview10);
		imageview9 = findViewById(R.id.imageview9);
		linear99 = findViewById(R.id.linear99);
		hscroll1 = findViewById(R.id.hscroll1);
		textview13 = findViewById(R.id.textview13);
		imageview10 = findViewById(R.id.imageview10);
		linear102 = findViewById(R.id.linear102);
		linear106 = findViewById(R.id.linear106);
		linear108 = findViewById(R.id.linear108);
		linear110 = findViewById(R.id.linear110);
		linear112 = findViewById(R.id.linear112);
		linear114 = findViewById(R.id.linear114);
		linear116 = findViewById(R.id.linear116);
		color1 = findViewById(R.id.color1);
		tick1 = findViewById(R.id.tick1);
		color2 = findViewById(R.id.color2);
		tick2 = findViewById(R.id.tick2);
		color3 = findViewById(R.id.color3);
		tick3 = findViewById(R.id.tick3);
		color4 = findViewById(R.id.color4);
		tick4 = findViewById(R.id.tick4);
		color5 = findViewById(R.id.color5);
		tick5 = findViewById(R.id.tick5);
		color6 = findViewById(R.id.color6);
		tick6 = findViewById(R.id.tick6);
		round_img = getSharedPreferences("round_img", Activity.MODE_PRIVATE);
		width_img = getSharedPreferences("width_img", Activity.MODE_PRIVATE);
		height_img = getSharedPreferences("height_img", Activity.MODE_PRIVATE);
		type_videoplayer = getSharedPreferences("type_videoplayer", Activity.MODE_PRIVATE);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		data = getSharedPreferences("data", Activity.MODE_PRIVATE);
		
		linear90.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
				overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
			}
		});
		
		linear2.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				i.setClass(getApplicationContext(), VideoplayerwebActivity.class);
				startActivity(i);
				return true;
			}
		});
		
		linear2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final com.google.android.material.bottomsheet.BottomSheetDialog a = new com.google.android.material.bottomsheet.BottomSheetDialog(SettingActivity.this);
				View lay = getLayoutInflater().inflate(R.layout.support, null);
				a.setContentView(lay);
				a.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
				final LinearLayout linear1  = (LinearLayout)lay.findViewById(R.id.linear1);
				final LinearLayout linear14  = (LinearLayout)lay.findViewById(R.id.linear14);
				final LinearLayout linear17  = (LinearLayout)lay.findViewById(R.id.linear17);
				final LinearLayout linear18  = (LinearLayout)lay.findViewById(R.id.linear18);
				final ImageView tick1  = (ImageView)lay.findViewById(R.id.tick1);
				final ImageView tick2  = (ImageView)lay.findViewById(R.id.tick2);
				final androidx.cardview.widget.CardView cardview1  = (androidx.cardview.widget.CardView)lay.findViewById(R.id.cardview1);
				final androidx.cardview.widget.CardView cardview2  = (androidx.cardview.widget.CardView)lay.findViewById(R.id.cardview2);
				cardview1.setRadius((float)Math.round(30));
				cardview2.setRadius((float)Math.round(30));
				cardview1.setCardElevation((float)8);
				cardview2.setCardElevation((float)8);
				cardview1.setCardBackgroundColor(0xFF000000);
				cardview2.setCardBackgroundColor(0xFF000000);
				linear14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)999, 0xFFFFFFFF));
				_shape(40, 40, 0, 0, "#0f1620", "#0f1620", 0, linear1);
				linear17.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						a.dismiss();
						type_videoplayer.edit().putString("type_videoplayer", "orginal").commit();
					}
				});
				linear18.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						a.dismiss();
						type_videoplayer.edit().putString("type_videoplayer", "web").commit();
					}
				});
				a.setCancelable(true);
				a.show();
				if (type_videoplayer.getString("type_videoplayer", "").equals("web")) {
					tick1.setVisibility(View.GONE);
					tick2.setVisibility(View.VISIBLE);
				} else {
					tick1.setVisibility(View.VISIBLE);
					tick2.setVisibility(View.GONE);
				}
			}
		});
		
		linear96.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (switch1.isChecked()) {
					switch1.setChecked(false);
				} else {
					switch1.setChecked(true);
				}
			}
		});
		
		relativelayout1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		seekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				if (_progressValue == 0) {
					Glide.with(getApplicationContext())
					.load(save.getString("domain", "").concat("145".concat("&h=".concat("210".concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
					.placeholder(R.drawable.lino)
					.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
					.transition(DrawableTransitionOptions.withCrossFade(350))
					.into(imageview3);
					height_img.edit().putString("height_img", "240").commit();
					width_img.edit().putString("width_img", "130").commit();
					textview6.setText("کیفیت 10%");
				} else {
					if (_progressValue == 1) {
						Glide.with(getApplicationContext())
						.load(save.getString("domain", "").concat("200".concat("&h=".concat("300".concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
						.placeholder(R.drawable.lino)
						.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
						.transition(DrawableTransitionOptions.withCrossFade(350))
						.into(imageview3);
						height_img.edit().putString("height_img", "400").commit();
						width_img.edit().putString("width_img", "200").commit();
						textview6.setText("کیفیت 30%");
					} else {
						if (_progressValue == 2) {
							Glide.with(getApplicationContext())
							.load(save.getString("domain", "").concat("300".concat("&h=".concat("475".concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
							.placeholder(R.drawable.lino)
							.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
							.transition(DrawableTransitionOptions.withCrossFade(350))
							.into(imageview3);
							height_img.edit().putString("height_img", "575").commit();
							width_img.edit().putString("width_img", "300").commit();
							textview6.setText("کیفیت 50%");
						} else {
							if (_progressValue == 3) {
								Glide.with(getApplicationContext())
								.load(save.getString("domain", "").concat("400".concat("&h=".concat("640".concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
								.placeholder(R.drawable.lino)
								.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
								.transition(DrawableTransitionOptions.withCrossFade(350))
								.into(imageview3);
								height_img.edit().putString("height_img", "740").commit();
								width_img.edit().putString("width_img", "400").commit();
								textview6.setText("کیفیت 100%");
							} else {
								Glide.with(getApplicationContext())
								.load(save.getString("domain", "").concat("200".concat("&h=".concat("300".concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
								.placeholder(R.drawable.lino)
								.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
								.transition(DrawableTransitionOptions.withCrossFade(350))
								.into(imageview3);
								height_img.edit().putString("height_img", "400").commit();
								width_img.edit().putString("width_img", "200").commit();
								textview6.setText("کیفیت 30%");
							}
						}
					}
				}
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				if (_progressValue == 0) {
					Glide.with(getApplicationContext())
					.load("https://s35.upera.net/thumb?w=".concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
					.placeholder(R.drawable.lino)
					.transform(new RoundedCorners(1))
					.transition(DrawableTransitionOptions.withCrossFade(350))
					.into(imageview3);
					round_img.edit().putString("round_img", String.valueOf((long)(1))).commit();
				} else {
					round_img.edit().putString("round_img", String.valueOf((long)(_progressValue))).commit();
					Glide.with(getApplicationContext())
					.load("https://s35.upera.net/thumb?w=".concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
					.placeholder(R.drawable.lino)
					.transform(new RoundedCorners(_progressValue))
					.diskCacheStrategy(DiskCacheStrategy.ALL) // افزایش سرعت بارگذاری
					.into(imageview3);
				}
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					switch1.getTrackDrawable().setAlpha((int)0);
					if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
						Drawable thumbDrawable = switch1.getThumbDrawable();
						if (thumbDrawable != null) {
							thumbDrawable.setColorFilter(0xFFFFFFFF, android.graphics.PorterDuff.Mode.SRC_IN);
							switch1.setThumbDrawable(thumbDrawable);
						}
					}
					switch1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)999, (int)0, 0xFF0277BD, 0xFF448AFF));
					save.edit().putString("visible_title", "1").commit();
					linear5.setVisibility(View.VISIBLE);
				} else {
					switch1.getTrackDrawable().setAlpha((int)0);
					if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
						Drawable thumbDrawable = switch1.getThumbDrawable();
						if (thumbDrawable != null) {
							thumbDrawable.setColorFilter(0xFFCFD8DC, android.graphics.PorterDuff.Mode.SRC_IN);
							switch1.setThumbDrawable(thumbDrawable);
						}
					}
					switch1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)999, (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFFCFD8DC, Color.TRANSPARENT));
					save.edit().putString("visible_title", "0").commit();
					linear5.setVisibility(View.GONE);
				}
				_TransitionManager(linear1, 300);
			}
		});
		
		color1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				save.edit().putString("theme", "#FF8E2D").commit();
				_check_tick();
			}
		});
		
		color2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				save.edit().putString("theme", "#536DFE").commit();
				_check_tick();
			}
		});
		
		color3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				save.edit().putString("theme", "#FF5252").commit();
				_check_tick();
			}
		});
		
		color4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				save.edit().putString("theme", "#FF4081").commit();
				_check_tick();
			}
		});
		
		color5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				save.edit().putString("theme", "#7C4DFF").commit();
				_check_tick();
			}
		});
		
		color6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				save.edit().putString("theme", "#00C853").commit();
				_check_tick();
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF0f1620".replace("0xFF" , "#")));
		}
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			final Window window = SettingActivity.this.getWindow();
			window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			window.setStatusBarColor(0xFF0F1620);
		}
		if (Integer.parseInt(height_img.getString("height_img", "")) == 240) {
			Glide.with(getApplicationContext())
			.load("https://s35.upera.net/thumb?w=".concat("145".concat("&h=".concat("210".concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
			.placeholder(R.drawable.lino)
			.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
			.transition(DrawableTransitionOptions.withCrossFade(350))
			.into(imageview3);
			textview6.setText("کیفیت 10%");
			seekbar2.setProgress((int)0);
		} else {
			if (Integer.parseInt(height_img.getString("height_img", "")) == 400) {
				Glide.with(getApplicationContext())
				.load(save.getString("domain", "").concat("200".concat("&h=".concat("300".concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
				.placeholder(R.drawable.lino)
				.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
				.transition(DrawableTransitionOptions.withCrossFade(350))
				.into(imageview3);
				textview6.setText("کیفیت 30%");
				seekbar2.setProgress((int)1);
			} else {
				if (Integer.parseInt(height_img.getString("height_img", "")) == 575) {
					Glide.with(getApplicationContext())
					.load(save.getString("domain", "").concat("300".concat("&h=".concat("475".concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
					.placeholder(R.drawable.lino)
					.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
					.transition(DrawableTransitionOptions.withCrossFade(350))
					.into(imageview3);
					textview6.setText("کیفیت 50%");
					seekbar2.setProgress((int)2);
				} else {
					if (Integer.parseInt(height_img.getString("height_img", "")) == 740) {
						Glide.with(getApplicationContext())
						.load(save.getString("domain", "").concat("400".concat("&h=".concat("640".concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
						.placeholder(R.drawable.lino)
						.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
						.transition(DrawableTransitionOptions.withCrossFade(350))
						.into(imageview3);
						textview6.setText("کیفیت 100%");
						seekbar2.setProgress((int)3);
					} else {
						Glide.with(getApplicationContext())
						.load(save.getString("domain", "").concat("200".concat("&h=".concat("300".concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
						.placeholder(R.drawable.lino)
						.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
						.transition(DrawableTransitionOptions.withCrossFade(350))
						.into(imageview3);
						textview6.setText("کیفیت 30%");
						seekbar2.setProgress((int)1);
					}
				}
			}
		}
		if (round_img.contains("round_img")) {
			Glide.with(getApplicationContext())
			.load(save.getString("domain", "").concat(width_img.getString("width_img", "").concat("&h=".concat(height_img.getString("height_img", "").concat("&q=90&src=https://s35.upera.net/s3/posters/".concat("Udl9atxzOXXqvhqhgZz5.jpg"))))))
			.placeholder(R.drawable.lino)
			.transform(new RoundedCorners(Integer.parseInt(round_img.getString("round_img", ""))))
			.transition(DrawableTransitionOptions.withCrossFade(350))
			.into(imageview3);
			seekbar1.setProgress((int)Integer.parseInt(round_img.getString("round_img", "")));
		} else {
			seekbar1.setProgress((int)30);
		}
		if (save.getString("visible_title", "").equals("0")) {
			linear5.setVisibility(View.GONE);
			switch1.setChecked(false);
			switch1.getTrackDrawable().setAlpha((int)0);
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
				Drawable thumbDrawable = switch1.getThumbDrawable();
				if (thumbDrawable != null) {
					thumbDrawable.setColorFilter(0xFFCFD8DC, android.graphics.PorterDuff.Mode.SRC_IN);
					switch1.setThumbDrawable(thumbDrawable);
				}
			}
			switch1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)999, (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFFCFD8DC, Color.TRANSPARENT));
		} else {
			linear5.setVisibility(View.VISIBLE);
			switch1.setChecked(true);
			switch1.getTrackDrawable().setAlpha((int)0);
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
				Drawable thumbDrawable = switch1.getThumbDrawable();
				if (thumbDrawable != null) {
					thumbDrawable.setColorFilter(0xFFFFFFFF, android.graphics.PorterDuff.Mode.SRC_IN);
					switch1.setThumbDrawable(thumbDrawable);
				}
			}
			switch1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)999, (int)0, 0xFF448AFF, 0xFF448AFF));
		}
		_ui();
		OverScrollDecoratorHelper.setUpOverScroll(vscroll1);
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
		_vpn();
		if (vpn()) {
			i.setClass(getApplicationContext(), ErrorActivity.class);
			startActivity(i);
			SettingActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
		} else {
			
		}
	}
	public void _ui() {
		linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0x50000000));
		linear90.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF37474F, 0xFF1D2730));
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF37474F, 0xFF1D2730));
		linear91.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF37474F, 0xFF1D2730));
		linear96.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF37474F, 0xFF1D2730));
		linear98.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF37474F, 0xFF1D2730));
		textview6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(4)), 0xFF448AFF));
		seekbar2.getProgressDrawable().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
		seekbar1.getProgressDrawable().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
		_ColourFilter(imageview4, "#FFFFFF");
		_ColourFilter(imageview1, "#FFFFFF");
		_ColourFilter(imageview2, "#ffffff");
		_ColourFilter(imageview9, "#ffffff");
		_removeScollBar(vscroll1);
		color1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFFFF8E2D));
		linear106.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFFFF8E2D, Color.TRANSPARENT));
		color2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFF536DFE));
		linear108.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF536DFE, Color.TRANSPARENT));
		color3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFFFF5252));
		linear110.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFFFF5252, Color.TRANSPARENT));
		color4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFFFF4081));
		linear112.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFFFF4081, Color.TRANSPARENT));
		color5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFF7C4DFF));
		linear114.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF7C4DFF, Color.TRANSPARENT));
		color6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFF00C853));
		linear116.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF00C853, Color.TRANSPARENT));
		tick1.setVisibility(View.VISIBLE);
		tick2.setVisibility(View.GONE);
		tick3.setVisibility(View.GONE);
		tick4.setVisibility(View.GONE);
		tick5.setVisibility(View.GONE);
		tick6.setVisibility(View.GONE);
		_removeScollBar(hscroll1);
		_check_tick();
	}
	
	
	public void _ColourFilter(final ImageView _imageview, final String _color) {
		_imageview.clearColorFilter(); 
		_imageview.setColorFilter(Color.parseColor(_color.toString()));
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
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
	}
	
	
	public void _MaterializeSwitch(final Switch _view, final String _track_off_color, final String _track_on_color, final String _thumb_off_color, final String _thumb_on_color, final double _duration) {
		if (_view.isChecked()) {
			animateTrack(_view, Color.parseColor(_track_off_color), Color.parseColor(_track_on_color), 0);
			animateThumb(_view, Color.parseColor(_thumb_off_color), Color.parseColor(_thumb_on_color), 0);
		} else {
			animateTrack(_view, Color.parseColor(_track_on_color), Color.parseColor(_track_off_color), 0);
			animateThumb(_view, Color.parseColor(_thumb_on_color), Color.parseColor(_thumb_off_color), 0);
		}
		
		_view.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					animateTrack(_view, Color.parseColor(_track_off_color), Color.parseColor(_track_on_color), (int)_duration);
					animateThumb(_view, Color.parseColor(_thumb_off_color), Color.parseColor(_thumb_on_color), (int)_duration);
				} else {
					animateTrack(_view, Color.parseColor(_track_on_color), Color.parseColor(_track_off_color), (int)_duration);
					animateThumb(_view, Color.parseColor(_thumb_on_color), Color.parseColor(_thumb_off_color), (int)_duration);
				}
			}
		});
		
	}
	public void animateTrack(Switch _view, int _start, int _end, int _duration) {
		final Switch vaV = _view;
		ValueAnimator va1 = ValueAnimator.ofArgb(getColor(vaV, _start), getColor(vaV, _end));
		va1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
			@Override
			public void onAnimationUpdate(ValueAnimator animator) {
				_radius(vaV, 999, (int)animator.getAnimatedValue());
				vaV.setTrackTintList(ColorStateList.valueOf(Color.TRANSPARENT));
			}
		});
		va1.setDuration(_duration);
		va1.start();
	}
	
	public void animateThumb(Switch _view, int _start, int _end, int _duration) {
		final Switch vaV = _view;
		ValueAnimator va2 = ValueAnimator.ofArgb(getColor(vaV, _start), getColor(vaV, _end));
		va2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
			@Override
			public void onAnimationUpdate(ValueAnimator animator) {
				vaV.setThumbTintList(ColorStateList.valueOf((int)animator.getAnimatedValue()));
			}
		});
		va2.setDuration(_duration);
		va2.start();
	}
	
	public void _radius(View view, int _radius, int _color) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(_color);
		gd.setCornerRadius(_radius);
		view.setBackground(gd);
	}
	
	public int getColor(View _view, int _color) {
		Drawable drawable = _view.getBackground();
		if (drawable instanceof ColorDrawable) {
			ColorDrawable colorDrawable = (ColorDrawable) drawable;
			if (Build.VERSION.SDK_INT >= 11) {
				return colorDrawable.getColor();
			}
		}
		return _color;
	}
	
	{
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _check_tick() {
		tick1.setVisibility(View.GONE);
		tick2.setVisibility(View.GONE);
		tick3.setVisibility(View.GONE);
		tick4.setVisibility(View.GONE);
		tick5.setVisibility(View.GONE);
		tick6.setVisibility(View.GONE);
		if (save.getString("theme", "").equals("#FF8E2D")) {
			tick1.setVisibility(View.VISIBLE);
		} else {
			if (save.getString("theme", "").equals("#536DFE")) {
				tick2.setVisibility(View.VISIBLE);
			} else {
				if (save.getString("theme", "").equals("#FF5252")) {
					tick3.setVisibility(View.VISIBLE);
				} else {
					if (save.getString("theme", "").equals("#FF4081")) {
						tick4.setVisibility(View.VISIBLE);
					} else {
						if (save.getString("theme", "").equals("#7C4DFF")) {
							tick5.setVisibility(View.VISIBLE);
						} else {
							if (save.getString("theme", "").equals("#00C853")) {
								tick6.setVisibility(View.VISIBLE);
							} else {
								tick1.setVisibility(View.VISIBLE);
								save.edit().putString("theme", "#FF8E2D").commit();
							}
						}
					}
				}
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