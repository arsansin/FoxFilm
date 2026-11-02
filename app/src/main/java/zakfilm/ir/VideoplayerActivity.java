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
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.adivery.sdk.*;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.ui.*;
import com.google.android.exoplayer2.ui.PlayerView;
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
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.Factory;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import java.io.File;
import android.net.Uri;
import android.graphics.Color;
import com.google.android.material.slider.Slider;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
;
import com.google.android.exoplayer2.upstream.DataSource;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.Glide;
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
import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import java.util.stream.Collectors;
import com.adivery.sdk.*;
import com.adivery.sdk.Adivery;
import com.adivery.sdk.AdiveryBannerAdView;
import com.adivery.sdk.BannerSize;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import android.telephony.TelephonyManager;


public class VideoplayerActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private  SimpleExoPlayer player;
	private  MediaSource mediaSource;
	private boolean loading = false;
	private String link = "";
	private double playbackState = 0;
	private double position = 0;
	private  PlaybackParams param;
	private double size_video = 0;
	private String type_video = "";
	private AudioManager audioManager;
	private String quality = "";
	private double seek = 0;
	private double tick_speed = 0;
	private boolean zir = false;
	private boolean lock = false;
	private double p = 0;
	private HashMap<String, Object> pl = new HashMap<>();
	private boolean orien = false;
	private boolean fit = false;
	private boolean max = false;
	private double seekt = 0;
	private boolean if_visible_linear_play = false;
	private boolean shenawar = false;
	private boolean isFirstResource = false;
	private String videoUri = "";
	private boolean play_thumnnail = false;
	private double maxx = 0;
	private String guality = "";
	private double type_dl = 0;
	private String sizem1 = "";
	private String sizem = "";
	private String sizem2 = "";
	private String url = "";
	private String filen = "";
	private boolean isAppInstalled = false;
	private String idd1 = "";
	private String l_color = "";
	private boolean placementId = false;
	private boolean ad_play = false;
	AdiveryListener myAdiveryListener;
	private String operator_name = "";
	
	private ArrayList<HashMap<String, Object>> pla = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> moy = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listQulity = new ArrayList<>();
	
	private LinearLayout linear1;
	private RelativeLayout relativelayout1;
	private PlayerView player_view;
	private LinearLayout controlss;
	private RelativeLayout linear9;
	private ImageView ful_yes;
	private ImageView ful_no;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private EditText edittext1;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout cont;
	private LinearLayout linear65;
	private LinearLayout linear66;
	private LinearLayout linear_unloack;
	private LinearLayout linear67;
	private TextView love;
	private TextView cuple;
	private LinearLayout linear122;
	private LinearLayout linear175;
	private LinearLayout linear121;
	private ImageView imageview41;
	private LinearLayout nett;
	private TextView title;
	private TextView textview81;
	private ImageView trafic_img;
	private LinearLayout linear90;
	private ImageView setting;
	private ProgressBar progressbar1;
	private LinearLayout can_back22;
	private RelativeLayout linear108;
	private LinearLayout can_go22;
	private LinearLayout linear163;
	private LinearLayout linear162;
	private LinearLayout linear136;
	private LinearLayout exo_rew;
	private LinearLayout linear16;
	private LinearLayout linear141;
	private LinearLayout linear147;
	private ImageView imageview14;
	private LinearLayout linear_play;
	private LinearLayout linear_loading;
	private LinearLayout pause1;
	private LinearLayout play1;
	private ImageView image_paus;
	private ImageView image_ply;
	private ProgressBar prg;
	private LinearLayout exo_ffwd;
	private LinearLayout linear133;
	private LinearLayout linear149;
	private LinearLayout linear164;
	private ImageView imageview15;
	private LinearLayout linear140;
	private ImageView imageview38;
	private LinearLayout linear148;
	private ImageView imageview52;
	private SeekBar seekbar7;
	private LinearLayout linear88;
	private TextView textview69;
	private TextView textview70;
	private RecyclerView recyclerview1;
	private ImageView imageview39;
	private TextView textview73;
	private ImageView imageview27;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear124;
	private LinearLayout pr;
	private LinearLayout linear169;
	private TextView exo_position;
	private TextView textview72;
	private TextView exo_duration;
	private LinearLayout restart;
	private TextView textview71;
	private LinearLayout linear165;
	private LinearLayout linear132;
	private LinearLayout linear127;
	private LinearLayout linear166;
	private LinearLayout linear128;
	private LinearLayout linear168;
	private LinearLayout linear167;
	private LinearLayout l_volume;
	private ImageView imageview44;
	private LinearLayout l_play;
	private ImageView imageview43;
	private TextView textview76;
	private TextView textview75;
	private TextView textview74;
	private LinearLayout l_speed;
	private ImageView imageview45;
	private LinearLayout l_qulity;
	private ImageView imageview46;
	private RelativeLayout relativelayout2;
	private SeekBar seekbar5;
	private SeekBar exo_progress;
	private LinearLayout linear173;
	private LinearLayout linear170;
	private LinearLayout linear171;
	private LinearLayout linear172;
	private LinearLayout linear174;
	private ImageView imageview42;
	private TextView textview78;
	private ImageView imageview53;
	private TextView textview79;
	private ImageView imageview54;
	private TextView textview80;
	private ImageView imageview55;
	
	private TimerTask check;
	private ObjectAnimator m = new ObjectAnimator();
	private TimerTask tim;
	private ObjectAnimator mo = new ObjectAnimator();
	private ObjectAnimator ani_control = new ObjectAnimator();
	private ObjectAnimator vb = new ObjectAnimator();
	private ObjectAnimator ubb = new ObjectAnimator();
	private ObjectAnimator r766ih = new ObjectAnimator();
	private ObjectAnimator vvb = new ObjectAnimator();
	private SharedPreferences duration_video_uid;
	private Intent to = new Intent();
	private ObjectAnimator ani = new ObjectAnimator();
	private ObjectAnimator afi = new ObjectAnimator();
	private SharedPreferences play_list;
	private TimerTask timo;
	private AlertDialog c;
	private TimerTask ti9;
	private SharedPreferences duration_video_uid_m;
	private AlertDialog q;
	private Intent go_dl = new Intent();
	private Intent i = new Intent();
	private Intent lock1 = new Intent();
	private ObjectAnimator loc = new ObjectAnimator();
	private ObjectAnimator loc1 = new ObjectAnimator();
	private ObjectAnimator ffwd = new ObjectAnimator();
	private ObjectAnimator ffwd1 = new ObjectAnimator();
	private ObjectAnimator rew = new ObjectAnimator();
	private ObjectAnimator rew1 = new ObjectAnimator();
	private Vibrator vib;
	private ObjectAnimator loc2 = new ObjectAnimator();
	private ObjectAnimator ani_cv = new ObjectAnimator();
	private Intent ani_vb = new Intent();
	private ObjectAnimator ani_vob = new ObjectAnimator();
	private ObjectAnimator ani_ubb = new ObjectAnimator();
	private ObjectAnimator ani_lock = new ObjectAnimator();
	private ObjectAnimator v1 = new ObjectAnimator();
	private ObjectAnimator v2 = new ObjectAnimator();
	private ObjectAnimator end1 = new ObjectAnimator();
	private ObjectAnimator end2 = new ObjectAnimator();
	private SharedPreferences round_img;
	private SharedPreferences width_img;
	private SharedPreferences height_img;
	private ObjectAnimator bnb = new ObjectAnimator();
	private ObjectAnimator oban = new ObjectAnimator();
	private SharedPreferences d_video_uid;
	private AlertDialog load;
	private SharedPreferences save;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.videoplayer);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		relativelayout1 = findViewById(R.id.relativelayout1);
		player_view = findViewById(R.id.player_view);
		controlss = findViewById(R.id.controlss);
		linear9 = findViewById(R.id.linear9);
		ful_yes = findViewById(R.id.ful_yes);
		ful_no = findViewById(R.id.ful_no);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		edittext1 = findViewById(R.id.edittext1);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		cont = findViewById(R.id.cont);
		linear65 = findViewById(R.id.linear65);
		linear66 = findViewById(R.id.linear66);
		linear_unloack = findViewById(R.id.linear_unloack);
		linear67 = findViewById(R.id.linear67);
		love = findViewById(R.id.love);
		cuple = findViewById(R.id.cuple);
		linear122 = findViewById(R.id.linear122);
		linear175 = findViewById(R.id.linear175);
		linear121 = findViewById(R.id.linear121);
		imageview41 = findViewById(R.id.imageview41);
		nett = findViewById(R.id.nett);
		title = findViewById(R.id.title);
		textview81 = findViewById(R.id.textview81);
		trafic_img = findViewById(R.id.trafic_img);
		linear90 = findViewById(R.id.linear90);
		setting = findViewById(R.id.setting);
		progressbar1 = findViewById(R.id.progressbar1);
		can_back22 = findViewById(R.id.can_back22);
		linear108 = findViewById(R.id.linear108);
		can_go22 = findViewById(R.id.can_go22);
		linear163 = findViewById(R.id.linear163);
		linear162 = findViewById(R.id.linear162);
		linear136 = findViewById(R.id.linear136);
		exo_rew = findViewById(R.id.exo_rew);
		linear16 = findViewById(R.id.linear16);
		linear141 = findViewById(R.id.linear141);
		linear147 = findViewById(R.id.linear147);
		imageview14 = findViewById(R.id.imageview14);
		linear_play = findViewById(R.id.linear_play);
		linear_loading = findViewById(R.id.linear_loading);
		pause1 = findViewById(R.id.pause1);
		play1 = findViewById(R.id.play1);
		image_paus = findViewById(R.id.image_paus);
		image_ply = findViewById(R.id.image_ply);
		prg = findViewById(R.id.prg);
		exo_ffwd = findViewById(R.id.exo_ffwd);
		linear133 = findViewById(R.id.linear133);
		linear149 = findViewById(R.id.linear149);
		linear164 = findViewById(R.id.linear164);
		imageview15 = findViewById(R.id.imageview15);
		linear140 = findViewById(R.id.linear140);
		imageview38 = findViewById(R.id.imageview38);
		linear148 = findViewById(R.id.linear148);
		imageview52 = findViewById(R.id.imageview52);
		seekbar7 = findViewById(R.id.seekbar7);
		linear88 = findViewById(R.id.linear88);
		textview69 = findViewById(R.id.textview69);
		textview70 = findViewById(R.id.textview70);
		recyclerview1 = findViewById(R.id.recyclerview1);
		imageview39 = findViewById(R.id.imageview39);
		textview73 = findViewById(R.id.textview73);
		imageview27 = findViewById(R.id.imageview27);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear124 = findViewById(R.id.linear124);
		pr = findViewById(R.id.pr);
		linear169 = findViewById(R.id.linear169);
		exo_position = findViewById(R.id.exo_position);
		textview72 = findViewById(R.id.textview72);
		exo_duration = findViewById(R.id.exo_duration);
		restart = findViewById(R.id.restart);
		textview71 = findViewById(R.id.textview71);
		linear165 = findViewById(R.id.linear165);
		linear132 = findViewById(R.id.linear132);
		linear127 = findViewById(R.id.linear127);
		linear166 = findViewById(R.id.linear166);
		linear128 = findViewById(R.id.linear128);
		linear168 = findViewById(R.id.linear168);
		linear167 = findViewById(R.id.linear167);
		l_volume = findViewById(R.id.l_volume);
		imageview44 = findViewById(R.id.imageview44);
		l_play = findViewById(R.id.l_play);
		imageview43 = findViewById(R.id.imageview43);
		textview76 = findViewById(R.id.textview76);
		textview75 = findViewById(R.id.textview75);
		textview74 = findViewById(R.id.textview74);
		l_speed = findViewById(R.id.l_speed);
		imageview45 = findViewById(R.id.imageview45);
		l_qulity = findViewById(R.id.l_qulity);
		imageview46 = findViewById(R.id.imageview46);
		relativelayout2 = findViewById(R.id.relativelayout2);
		seekbar5 = findViewById(R.id.seekbar5);
		exo_progress = findViewById(R.id.exo_progress);
		linear173 = findViewById(R.id.linear173);
		linear170 = findViewById(R.id.linear170);
		linear171 = findViewById(R.id.linear171);
		linear172 = findViewById(R.id.linear172);
		linear174 = findViewById(R.id.linear174);
		imageview42 = findViewById(R.id.imageview42);
		textview78 = findViewById(R.id.textview78);
		imageview53 = findViewById(R.id.imageview53);
		textview79 = findViewById(R.id.textview79);
		imageview54 = findViewById(R.id.imageview54);
		textview80 = findViewById(R.id.textview80);
		imageview55 = findViewById(R.id.imageview55);
		duration_video_uid = getSharedPreferences("duration_video_uid", Activity.MODE_PRIVATE);
		play_list = getSharedPreferences("play_list", Activity.MODE_PRIVATE);
		duration_video_uid_m = getSharedPreferences("duration_video_uid_m", Activity.MODE_PRIVATE);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		round_img = getSharedPreferences("round_img", Activity.MODE_PRIVATE);
		width_img = getSharedPreferences("width_img", Activity.MODE_PRIVATE);
		height_img = getSharedPreferences("height_img", Activity.MODE_PRIVATE);
		d_video_uid = getSharedPreferences("d_video_uid", Activity.MODE_PRIVATE);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		
		linear122.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (orien) {
					//افقی
					setRequestedOrientation(1);
					orien = false;
					_setMargin(linear11, 5, 5, 0, 50);
					linear122.setVisibility(View.VISIBLE);
					linear169.setVisibility(View.GONE);
					linear122.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
					player_view.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FIT);
					fit = true;
					imageview42.setImageResource(R.drawable.fit_2);
					linear124.setVisibility(View.VISIBLE);
					linear12.setVisibility(View.GONE);
					linear108.setVisibility(View.GONE);
					can_back22.setVisibility(View.GONE);
					can_go22.setVisibility(View.GONE);
					
					if (player.getPlayWhenReady()) {
						textview74.setText(_formatDuration(player.getDuration()));
					}
					else {
						textview74.setText(_formatDuration(player.getDuration()));
					}
					if (!play_thumnnail) {
						ful_no.setVisibility(View.VISIBLE);
						ful_yes.setVisibility(View.GONE);
					}
				} else {
					//عمودی
					setRequestedOrientation(0);
					_setMargin(linear11, 18, 18, 0, 0);
					linear122.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0x991D2733));
					linear122.setVisibility(View.VISIBLE);
					linear169.setVisibility(View.VISIBLE);
					linear124.setVisibility(View.GONE);
					linear12.setVisibility(View.VISIBLE);
					linear108.setVisibility(View.VISIBLE);
					can_back22.setVisibility(View.VISIBLE);
					can_go22.setVisibility(View.VISIBLE);
					progressbar1.setVisibility(View.GONE);
					
					if (player.getPlayWhenReady()) {
						exo_duration.setText(_formatDuration(player.getDuration()));
					}
					else {
						exo_duration.setText(_formatDuration(player.getDuration()));
					}
					if (!play_thumnnail) {
						ful_no.setVisibility(View.GONE);
						ful_yes.setVisibility(View.VISIBLE);
					}
					orien = true;
				}
			}
		});
		
		linear90.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(linear90);
				if (player != null) {
					
					
					player.setPlayWhenReady(false);
					player.getPlaybackState();
					
				}
				duration_video_uid.edit().putString("position".concat(link), String.valueOf(player.getCurrentPosition())).commit();
				duration_video_uid.edit().putString("max".concat(link), String.valueOf(player.getDuration())).commit();
				finishAndRemoveTask();
				overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
			}
		});
		
		linear136.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				controlss.setVisibility(View.INVISIBLE);
				shenawar = true;
				//Adapt the code to your activity 
				
				if (android.os.Build.VERSION.SDK_INT >= 26) {
					//Trigger PiP mode
					try {
						Rational rational = new Rational(player_view.getWidth(), player_view.getHeight());
						
						PictureInPictureParams mParams =
						new PictureInPictureParams.Builder()
						.setAspectRatio(rational)
						.build();
						
						enterPictureInPictureMode(mParams);
					} catch (IllegalStateException e) {
						e.printStackTrace();
					}
				} else {
					Toast.makeText(VideoplayerActivity.this, "Background player not supported on your device", Toast.LENGTH_SHORT).show();
					finish();
				}
			}
		});
		
		exo_rew.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rew.setTarget(exo_rew);
				rew.setPropertyName("rotation");
				rew.setFloatValues((float)(-80));
				rew.setDuration((int)(100));
				rew.start();
			}
		});
		
		pause1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				pause1.setVisibility(View.GONE);
				play1.setVisibility(View.VISIBLE);
				
				player.setPlayWhenReady(false);
				try {
					ti9.cancel();
				} catch (Exception e) {
					
				}
			}
		});
		
		play1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (exo_duration.getText().toString().equals(exo_position.getText().toString()) || textview76.getText().toString().equals(textview74.getText().toString())) {
					seek = 0;
					
					
					player.seekTo((long) seek);
				}
				play1.setVisibility(View.GONE);
				pause1.setVisibility(View.VISIBLE);
				
				player.setPlayWhenReady(true);
				_t();
			}
		});
		
		exo_ffwd.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ffwd.setTarget(exo_ffwd);
				ffwd.setPropertyName("rotation");
				ffwd.setFloatValues((float)(80));
				ffwd.setDuration((int)(100));
				ffwd.start();
			}
		});
		
		linear133.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				loc.setTarget(imageview38);
				loc.setPropertyName("rotation");
				loc.setFloatValues((float)(80));
				loc.setDuration((int)(100));
				loc.start();
			}
		});
		
		seekbar7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, _progressValue, 0);
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				try {
					ti9.cancel();
				} catch (Exception e) {
					
				}
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				_t();
			}
		});
		
		linear88.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (imageview39.getVisibility() == View.VISIBLE) {
					lock = false;
					linear_unloack.setVisibility(View.GONE);
					linear67.setVisibility(View.VISIBLE);
					linear66.setVisibility(View.VISIBLE);
					_linear_visible();
				} else {
					textview73.setVisibility(View.VISIBLE);
					imageview39.setVisibility(View.VISIBLE);
					imageview27.setVisibility(View.GONE);
				}
			}
		});
		
		restart.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				player.prepare(mediaSource);
				
				player.setPlayWhenReady(true);
			}
		});
		
		l_volume.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (player.getVolume() > 0) {
					imageview44.setImageResource(R.drawable.icon_volume_off_round);
					player.setVolume(0f);
					
				} else {
					imageview44.setImageResource(R.drawable.icon_volume_up_round);
					player.setVolume(1f);
				}
			}
		});
		
		l_play.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (play1.getVisibility() == View.VISIBLE) {
					imageview43.setImageResource(R.drawable.icvb7);
					play1.setVisibility(View.GONE);
					pause1.setVisibility(View.VISIBLE);
					
					player.setPlayWhenReady(true);
				} else {
					imageview43.setImageResource(R.drawable.play_2);
					pause1.setVisibility(View.GONE);
					play1.setVisibility(View.VISIBLE);
					
					player.setPlayWhenReady(false);
				}
			}
		});
		
		l_speed.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_speed();
			}
		});
		
		l_qulity.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_qulity();
			}
		});
		
		exo_progress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				seek = _progressValue;
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
				player.setPlayWhenReady(false);
				pause1.setVisibility(View.GONE);
				play1.setVisibility(View.VISIBLE);
				try {
					timo.cancel();
				} catch (Exception e) {
					
				}
				try {
					ti9.cancel();
				} catch (Exception e) {
					
				}
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				long seekPosition = (long) seek; // مقدار seek را به long تبدیل کنید
				player.seekTo(seekPosition); // موقعیت پخش را تغییر دهید
				pause1.setVisibility(View.VISIBLE);
				play1.setVisibility(View.GONE);
				
				player.setPlayWhenReady(true);
				_t();
				_hadler();
			}
		});
		
		linear173.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (fit) {
					player_view.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_ZOOM);
					fit = false;
					imageview42.setImageResource(R.drawable.fit_1);
				} else {
					player_view.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FIT);
					fit = true;
					imageview42.setImageResource(R.drawable.fit_2);
				}
			}
		});
		
		linear170.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_speed();
			}
		});
		
		linear171.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_qulity();
			}
		});
		
		linear172.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		ani.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				afi.setTarget(imageview1);
				afi.setPropertyName("alpha");
				afi.setFloatValues((float)(1));
				afi.setDuration((int)(200));
				afi.start();
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		afi.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				ani.setTarget(imageview1);
				ani.setPropertyName("alpha");
				ani.setFloatValues((float)(0));
				ani.setDuration((int)(200));
				ani.start();
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		loc.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				loc1.setTarget(imageview38);
				loc1.setPropertyName("rotation");
				loc1.setFloatValues((float)(-80));
				loc1.setDuration((int)(100));
				loc1.start();
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		loc1.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				loc2.setTarget(imageview38);
				loc2.setPropertyName("rotation");
				loc2.setFloatValues((float)(0));
				loc2.setDuration((int)(350));
				loc2.start();
				vib.vibrate((long)(75));
				lock = true;
				ani_control.setTarget(linear65);
				ani_control.setPropertyName("translationY");
				ani_control.setFloatValues((float)(-300));
				ani_control.setDuration((int)(150));
				ani_control.start();
				vb.setTarget(linear67);
				vb.setPropertyName("translationY");
				vb.setFloatValues((float)(200));
				vb.setDuration((int)(150));
				vb.start();
				ubb.setTarget(linear66);
				ubb.setPropertyName("alpha");
				ubb.setFloatValues((float)(0.0d));
				ubb.setDuration((int)(200));
				ubb.start();
				r766ih.setTarget(linear88);
				r766ih.setPropertyName("alpha");
				r766ih.setFloatValues((float)(1.0d));
				r766ih.setDuration((int)(200));
				r766ih.start();
				tim = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								linear_unloack.setVisibility(View.VISIBLE);
								getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
								linear67.setVisibility(View.GONE);
								linear66.setVisibility(View.GONE);
								textview73.setVisibility(View.GONE);
								imageview39.setVisibility(View.GONE);
								imageview27.setVisibility(View.VISIBLE);
								_animation_view_unlock_visibe();
								try {
									ti9.cancel();
								} catch (Exception e) {
									
								}
								_t();
							}
						});
					}
				};
				_timer.schedule(tim, (int)(200));
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		ffwd.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				vib.vibrate((long)(75));
				seek = seek + 10000;
				long seekPosition = (long) seek; // مقدار seek را به long تبدیل کنید
				player.seekTo(seekPosition); // موقعیت پخش را تغییر دهید
				ffwd1.setTarget(exo_ffwd);
				ffwd1.setPropertyName("rotation");
				ffwd1.setFloatValues((float)(0));
				ffwd1.setDuration((int)(100));
				ffwd1.start();
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		rew.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				vib.vibrate((long)(75));
				if ((player.getCurrentPosition() == 0) || (player.getCurrentPosition() < 0)) {
					exo_position.setText("00:00");
				} else {
					seek = seek - 10000;
					long seekPosition = (long) seek; // مقدار seek را به long تبدیل کنید
					player.seekTo(seekPosition); // موقعیت پخش را تغییر دهید
				}
				rew1.setTarget(exo_rew);
				rew1.setPropertyName("rotation");
				rew1.setFloatValues((float)(0));
				rew1.setDuration((int)(100));
				rew1.start();
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		ani_ubb.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				linear_play.setVisibility(View.VISIBLE);
				exo_rew.setVisibility(View.VISIBLE);
				exo_ffwd.setVisibility(View.VISIBLE);
				linear163.setVisibility(View.VISIBLE);
				linear164.setVisibility(View.VISIBLE);
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				if (if_visible_linear_play) {
					
				} else {
					linear_play.setVisibility(View.GONE);
					exo_rew.setVisibility(View.GONE);
					exo_ffwd.setVisibility(View.GONE);
					linear163.setVisibility(View.GONE);
					linear164.setVisibility(View.GONE);
				}
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		v2.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				end1.setTarget(linear88);
				end1.setPropertyName("scaleX");
				end1.setFloatValues((float)(1));
				end1.setDuration((int)(300));
				end1.start();
				end2.setTarget(linear88);
				end2.setPropertyName("scaleY");
				end2.setFloatValues((float)(1));
				end2.setDuration((int)(300));
				end2.start();
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		bnb.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				ful_no.setVisibility(View.GONE);
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		oban.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				ful_yes.setVisibility(View.GONE);
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		_check();
		getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
		
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) { getWindow().getAttributes().layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES; }
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
		getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); 
		getWindow().setNavigationBarColor(0xFF000000);
		getWindow().setStatusBarColor(0xFF000000);
		// داخل متد onCreate اکتیویتی
		getWindow().getDecorView().setBackgroundColor(Color.parseColor("#000000"));
		_play();
		Glide.with(getApplicationContext())
		.load("https://thumb.upera.shop/thumb?w=900&h=800&q=60&a=c&zc=1&src=https://cdn.upera.shop/s3/backdrops/".concat(getIntent().getStringExtra("image")))
		.placeholder(R.drawable.nul)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
		.into(ful_yes);
		Glide.with(getApplicationContext())
		.load("https://thumb.upera.shop/thumb?w=500&h=1000&q=60&a=c&zc=1&src=https://cdn.upera.shop/s3/posters/".concat(getIntent().getStringExtra("profile")))
		.placeholder(R.drawable.nul)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
		.into(ful_no);
		ful_no.setVisibility(View.VISIBLE);
		ful_yes.setVisibility(View.GONE);
		_setMargin(linear11, 5, 5, 0, 50);
		orien = false;
		if (getIntent().getStringExtra("zirnevis").equals("دارد")) {
			type_video = "-11-";
		} else {
			type_video = "-0-";
		}
		if (getIntent().getStringExtra("dooble").equals("دارد")) {
			type_video = "-0-";
		} else {
			type_video = "-11-";
		}
		loading = true;
		type_video = "-0-";
		quality = "480";
		if (getIntent().hasExtra("my")) {
			listQulity = new Gson().fromJson(getIntent().getStringExtra("mp4"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			link = listQulity.get((int)0).get("url").toString();
			quality = "0";
		} else {
			link = "https://relfilm.upera.tv/".concat(getIntent().getStringExtra("url").concat(type_video.concat(quality.concat(".mp4".concat("?ref=tvAd")))));
		}
		
		player = ExoPlayerFactory.newSimpleInstance(this, new DefaultTrackSelector(new Factory(new DefaultBandwidthMeter())), new DefaultLoadControl());
		
		String Url_Player = link;
		Uri videoUrl = Uri.parse(Url_Player);
		mediaSource = new ExtractorMediaSource(videoUrl, new DefaultHttpDataSourceFactory("exoplayer_video"), new DefaultExtractorsFactory(), null, null);
		
		player_view.setPlayer(player);
		
		player_view.setKeepScreenOn(true);
		
		player.prepare(mediaSource);
		// مقداردهی اولیه AudioManager در onCreate
		audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
		seekbar7.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF000000".replace("0xFF" , "#")));
		}
		restart.setVisibility(View.GONE);
		
		player.setPlayWhenReady(true);
		_Events();
		linear5.setVisibility(View.GONE);
		if (getIntent().getStringExtra("dooble").equals("دارد")) {
			zir = false;
		} else {
			// ایجاد DefaultTrackSelector با استفاده از DefaultBandwidthMeter
			DefaultBandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
			DefaultTrackSelector trackSelector = new DefaultTrackSelector(bandwidthMeter);
			
			// ایجاد SimpleExoPlayer
			SimpleExoPlayer player = ExoPlayerFactory.newSimpleInstance(this, trackSelector);
			
			// دریافت MappedTrackInfo از TrackSelector
			DefaultTrackSelector.MappedTrackInfo mappedTrackInfo = trackSelector.getCurrentMappedTrackInfo();
			
			if (mappedTrackInfo != null) {
				// پیدا کردن index رندرر مربوط به زیرنویس (معمولاً رندرر 2)
				int rendererIndex = 2;
				TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(rendererIndex);
				
				// بررسی اینکه آیا زیرنویس موجود است یا خیر
				if (trackGroups.length != 0) {
					// فعال‌سازی اولین زیرنویس موجود
					DefaultTrackSelector.Parameters parameters = trackSelector.getParameters();
					
					// اعمال تنظیمات override به پارامترهای trackSelector
					trackSelector.setParameters(parameters);
				}
			}
			zir = true;
		}
		_add_to_playlist();
		_ui();
		controlss.setOnTouchListener(new View.OnTouchListener(){
			@Override
			public boolean onTouch(View v, MotionEvent event){
				int ev = event.getAction();
				switch (ev) {
					case MotionEvent.ACTION_DOWN:
					
					if (!loading) {
						if (!(linear65.getTranslationY() == SketchwareUtil.getDip(getApplicationContext(), (int)(-200)))) {
							_linear_gone();
						} else {
							_linear_visible();
							try {
								ti9.cancel();
							} catch (Exception e) {
								
							}
							
							if (player.getPlayWhenReady()) {
								_t();
							}
							else {
								
							}
						}
						_check_linear_unlock();
					}
					
					break;
					case MotionEvent.ACTION_UP:
					
					
					
					break;
				} return true;
			}
		});
		player_view.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FIT);
		fit = true;
		_piss();
		//Check if ADM install
		PackageManager packageManager = getApplicationContext().getPackageManager();
		try {
			packageManager.getPackageInfo("com.dv.adm", PackageManager.GET_ACTIVITIES);
			isAppInstalled = true;
		} catch (PackageManager.NameNotFoundException e) {
			isAppInstalled = false;
		}
	}
	
	
	@Override
	public void onPause() {
		super.onPause();
		if (!shenawar) {
			if (player != null) {
				
				
				player.setPlayWhenReady(false);
				player.getPlaybackState();
				
			}
		}
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		idd1 = getIntent().getStringExtra("id");
		d_video_uid.edit().putString("max".concat(getIntent().getStringExtra("url")), String.valueOf(player.getDuration())).commit();
		d_video_uid.edit().putString("position".concat(getIntent().getStringExtra("url")), String.valueOf(player.getCurrentPosition())).commit();
		ArrayList<HashMap<String, Object>> a = new Gson().fromJson(play_list.getString("play_list", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		
		for (HashMap<String, Object> item : a) {
			if (item.containsKey("id") && item.get("id").toString().equals(idd1)) {
				String urlKey = getIntent().getStringExtra("url");
				String max = String.valueOf(player.getDuration());
				String position = String.valueOf(player.getCurrentPosition());
				
				d_video_uid.edit().putString("max".concat(urlKey), max).commit();
				d_video_uid.edit().putString("position".concat(urlKey), position).commit();
				
				// ذخیره در لیست
				item.put("max", max);
				item.put("position", position);
				
				break;
			}
		}
		
		// ذخیره‌ی مجدد لیست در SharedPreferences
		String updatedJson = new Gson().toJson(a);
		play_list.edit().putString("play_list", updatedJson).apply();
		if (!shenawar) {
			if (player != null) {
				
				player_view.setPlayer(null);
				
				player.release();
				
				player = null;
				
			}
		}
		
		if (myAdiveryListener != null) {
			com.adivery.sdk.Adivery.removeGlobalListener(myAdiveryListener);
		}
	}
	
	@Override
	public void onBackPressed() {
		if (lock) {
			
		} else {
			if (orien) {
				linear122.performClick();
			} else {
				if (player != null) {
					
					
					player.setPlayWhenReady(false);
					player.getPlaybackState();
					
				}
				finishAndRemoveTask();
				overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
			}
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		pause1.setVisibility(View.VISIBLE);
		play1.setVisibility(View.GONE);
		shenawar = false;
		controlss.setVisibility(View.VISIBLE);
		_hadler();
		_vpn();
		if (vpn()) {
			i.setClass(getApplicationContext(), ErrorActivity.class);
			startActivity(i);
			VideoplayerActivity.this.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
			SketchwareUtil.showMessage(getApplicationContext(), "فلیتر شکن خود را خاموش کنید");
		} else {
			
		}
	}
	
	@Override
	public void onStop() {
		super.onStop();
		if (!shenawar) {
			if (player != null) {
				
				
				player.setPlayWhenReady(false);
				player.getPlaybackState();
				
			}
		}
	}
	public void _SplashView() {
		//If this causes you problems, delete it
	}
	
	
	public void _HLS() {
		
	}
	private MediaSource buildMediaSource(Uri uri) {
		DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(this, "exoplayer-codelab");
		return new HlsMediaSource.Factory(dataSourceFactory).createMediaSource(uri);
	}
	{
	}
	
	
	public void _Extra() {
	}
	protected void onRestart() {
		super.onRestart();
		if (player != null) {
			
			player.setPlayWhenReady(true);
			player.getPlaybackState();
			
		}
	}
	{
	}
	
	
	public void _Events() {
		
		player.addListener(new EventListener() {
			
			public void onTimelineChanged(Timeline timeline, Object manifest, int reason) {
				
			}
			
			public void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections) {
				_hadler();
				if (d_video_uid.contains("max".concat(getIntent().getStringExtra("url")))) {
					// فرض: maxx و seek رو به درستی گرفتی
					double seek = Double.parseDouble(d_video_uid.getString("position".concat(getIntent().getStringExtra("url")), ""));
					
					player.seekTo((long) seek);
				}
				if (!max) {
					exo_progress.setMax((int)player.getDuration());
					max = true;
					if (linear124.getVisibility() == View.VISIBLE) {
						textview74.setText(_formatDuration(player.getDuration()));
					} else {
						exo_duration.setText(_formatDuration(player.getDuration()));
					}
					if (d_video_uid.contains("max".concat(getIntent().getStringExtra("url")))) {
						if (p == 9) {
							
						} else {
							restart.setVisibility(View.GONE);
						}
						check = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										restart.setVisibility(View.GONE);
										p = 9;
									}
								});
							}
						};
						_timer.schedule(check, (int)(3000));
					}
				}
				loading = false;
				pause1.setVisibility(View.VISIBLE);
				prg.setVisibility(View.GONE);
				progressbar1.setVisibility(View.GONE);
			}
			
			public void onLoadingChanged(boolean isLoading) {
				
			}
			
			public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
				if (playbackState == 2) {
					loading = true;
					prg.setVisibility(View.VISIBLE);
					if (linear124.getVisibility() == View.VISIBLE) {
						progressbar1.setVisibility(View.VISIBLE);
					}
				} else {
					if (playbackState == 3) {
						loading = false;
						prg.setVisibility(View.GONE);
						progressbar1.setVisibility(View.GONE);
					}
				}
				
				if (player.getPlayWhenReady()) {
					imageview43.setImageResource(R.drawable.play_1);
					try {
						_t();
					} catch (Exception e) {
						
					}
					if (ful_no.getVisibility() == View.VISIBLE) {
						_anim();
						play_thumnnail = true;
					}
					if (ful_yes.getVisibility() == View.VISIBLE) {
						_anim();
						play_thumnnail = true;
					}
				}
				else {
					imageview43.setImageResource(R.drawable.play_2);
					try {
						ti9.cancel();
					} catch (Exception e) {
						
					}
				}
				if (exo_duration.getText().toString().equals(exo_position.getText().toString()) || textview76.getText().toString().equals(textview74.getText().toString())) {
					pause1.setVisibility(View.GONE);
					play1.setVisibility(View.VISIBLE);
					try {
						ti9.cancel();
					} catch (Exception e) {
						
					}
				}
			}
			public void onRepeatModeChanged(int repeatMode) {
				
			}
			public void onShuffleModeEnabledChanged(boolean shuffleModeEnabled) {
				
			}
			public void onPlayerError(ExoPlaybackException error) {
				
			}
			public void onPositionDiscontinuity(int reason) {
				
			}
			public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
				
			}
			public void onSeekProcessed() {
				
			}
			
		});
	}
	
	
	public void _Progress(final ProgressBar _prgs, final String _color) {
		if
		(android.os.Build.VERSION.SDK_INT >= 21) {
			_prgs.getIndeterminateDrawable().setColorFilter(Color.parseColor(_color),
			PorterDuff.Mode.SRC_IN);
		}
	}
	
	
	public void _speed_types() {
	}
	String[] speed = {"x 0.25","x 0.75","Normal","x 2.5","x 4.5"};
	{
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
	
	
	public void _ColourFilter(final ImageView _imageview, final String _color) {
		_imageview.clearColorFilter(); 
		_imageview.setColorFilter(Color.parseColor(_color.toString()));
	}
	
	
	public void _enable() {
		// ایجاد DefaultTrackSelector با استفاده از DefaultBandwidthMeter
		DefaultBandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
		DefaultTrackSelector trackSelector = new DefaultTrackSelector(bandwidthMeter);
		
		// ایجاد SimpleExoPlayer
		SimpleExoPlayer player = ExoPlayerFactory.newSimpleInstance(this, trackSelector);
		
		// دریافت MappedTrackInfo از TrackSelector
		DefaultTrackSelector.MappedTrackInfo mappedTrackInfo = trackSelector.getCurrentMappedTrackInfo();
		
		if (mappedTrackInfo != null) {
			// پیدا کردن index رندرر مربوط به زیرنویس (معمولاً رندرر 2)
			int rendererIndex = 2;
			TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(rendererIndex);
			
			// بررسی اینکه آیا زیرنویس موجود است یا خیر
			if (trackGroups.length != 0) {
				// فعال‌سازی اولین زیرنویس موجود
				DefaultTrackSelector.Parameters parameters = trackSelector.getParameters();
				
				// اعمال تنظیمات override به پارامترهای trackSelector
				trackSelector.setParameters(parameters);
			}
		}
	}
	
	
	public void _deas() {
		// ایجاد DefaultTrackSelector با استفاده از DefaultBandwidthMeter
		DefaultBandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
		DefaultTrackSelector trackSelector = new DefaultTrackSelector(bandwidthMeter);
		
		// ایجاد SimpleExoPlayer
		SimpleExoPlayer player = ExoPlayerFactory.newSimpleInstance(this, trackSelector);
		
		// دریافت MappedTrackInfo از TrackSelector
		DefaultTrackSelector.MappedTrackInfo mappedTrackInfo = trackSelector.getCurrentMappedTrackInfo();
		
		if (mappedTrackInfo != null) {
			// پیدا کردن index رندرر مربوط به زیرنویس (معمولاً رندرر 2)
			int rendererIndex = 2;
			TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(rendererIndex);
			
			// بررسی اینکه آیا زیرنویس موجود است یا خیر
			if (trackGroups.length != 0) {
				// غیرفعال‌سازی تمام زیرنویس‌ها
				DefaultTrackSelector.Parameters parameters = trackSelector.getParameters();
				
				// تنظیم زیرنویس به null
				DefaultTrackSelector.ParametersBuilder parametersBuilder = parameters.buildUpon();
				parametersBuilder.setPreferredTextLanguage(null); // غیرفعال‌سازی زیرنویس
				
				// اعمال تنظیمات override به پارامترهای trackSelector
				trackSelector.setParameters(parametersBuilder.build());
			}
		}
	}
	
	
	public void _clickAnimation(final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
	}
	
	
	public void _yhh(final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
	}
	
	
	public void _an() {
		ani.setTarget(imageview1);
		ani.setPropertyName("alpha");
		ani.setFloatValues((float)(0));
		ani.setDuration((int)(200));
		ani.start();
	}
	
	
	public void _add_to_playlist() {
		edittext1.setText(link);
		if (play_list.getString("play_list", "").isEmpty()) {
			pla = new Gson().fromJson("[]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		} else {
			pla = new Gson().fromJson(play_list.getString("play_list", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		}
		boolean notFound = true;
		String searchText = edittext1.getText().toString(); // دریافت مقدار از EditText
		
		for (int i = 0; i < pla.size(); i++) {
			HashMap<String, Object> item = pla.get(i);
			if (item.get("link").toString().equals(searchText)) {
				notFound = false; // اگر آیتم پیدا شد، مقدار false می‌شود
				break; // جستجو متوقف می‌شود
			}
		}
		
		if (notFound) {
			
			pl = new HashMap<>();
			pl.put("id", getIntent().getStringExtra("id"));
			pl.put("name", getIntent().getStringExtra("name"));
			pl.put("image", getIntent().getStringExtra("profile"));
			pl.put("backdrop", getIntent().getStringExtra("image"));
			pl.put("type", getIntent().getStringExtra("type"));
			pl.put("link", link);
			pl.put("position", "0");
			pl.put("max", "0");
			pla.add(pl);
			play_list.edit().putString("play_list", new Gson().toJson(pla)).commit();
		} else {
			
		}
	}
	
	
	public void _ui() {
		shenawar = false;
		title.setText(URLUtil.guessFileName(link, null, null));
		//UI
		linear122.setVisibility(View.VISIBLE);
		linear122.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
		linear90.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)999, 0x991D2733));
		linear140.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFFFFFFFF, Color.TRANSPARENT));
		linear141.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFFFFFFFF, Color.TRANSPARENT));
		linear147.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)0, 0xFFFFFFFF, 0xFFFFFFFF));
		linear165.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF1D2733, Color.TRANSPARENT));
		linear166.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF1D2733, Color.TRANSPARENT));
		linear167.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF1D2733, Color.TRANSPARENT));
		linear168.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF1D2733, Color.TRANSPARENT));
		nett.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(999)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(1)), 0x50FFFFFF, 0x20FFFFFF));
		linear169.setVisibility(View.GONE);
		linear_unloack.setVisibility(View.GONE);
		pause1.setVisibility(View.GONE);
		textview73.setVisibility(View.GONE);
		imageview39.setVisibility(View.GONE);
		linear12.setVisibility(View.GONE);
		linear108.setVisibility(View.GONE);
		can_back22.setVisibility(View.GONE);
		can_go22.setVisibility(View.GONE);
		_GradientDrawable(linear88, 999, 0, 10, "#ffffff", "#bdbdbd", false, false, 0);
		_get_theme_l_color();
		l_volume.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)999, (int)0, 0xFFBDBDBD, 0xFF1D2733));
		l_play.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)999, (int)0, 0xFFBDBDBD, 0xFF1D2733));
		l_speed.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)999, (int)0, 0xFFBDBDBD, 0xFF1D2733));
		l_qulity.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)999, (int)0, 0xFFBDBDBD, 0xFF1D2733));
		exo_position.setShadowLayer(9, 2, 2, Color.parseColor("#000000"));
		exo_duration.setShadowLayer(9, 2, 2, Color.parseColor("#000000"));
		textview72.setShadowLayer(9, 2, 2, Color.parseColor("#000000"));
		exo_progress.getProgressDrawable().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
		exo_progress.getThumb().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
		seekbar5.getProgressDrawable().setColorFilter(Color.parseColor("#448aff"), PorterDuff.Mode.SRC_IN);
		seekbar5.setThumb(null);
		title.setText(getIntent().getStringExtra("name"));
		restart.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFFFF));
		_ColourFilter(imageview27, "#000000");
		_ColourFilter(imageview39, "#000000");
		_ColourFilter(imageview14, "#ffffff");
		_ColourFilter(imageview15, "#ffffff");
		_ColourFilter(imageview53, "#ffffff");
		_ColourFilter(imageview54, "#ffffff");
		_ColourFilter(imageview55, "#ffffff");
		_Progress(prg, "#ffffff");
		_Progress(progressbar1, save.getString("theme", ""));
	}
	
	
	public String _getDuration(final double _duration) {
		long millie = (long)_duration;
		long seconds = (millie / 1000);
		long second = seconds % 60;
		long minute = (seconds / 60) % 60;
		long hour = (seconds / (60 * 60)) % 24;
		
		String result = "";  
		if (hour > 0) {  
			return String.format("%02d:%02d:%02d", hour, minute, second);  
		}  
		else {  
			return String.format("%02d:%02d" , minute, second);  
		}
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
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
	
	
	public void _t() {
		if (!loading) {
			try {
				ti9.cancel();
			} catch (Exception e) {
				
			}
			ti9 = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							if (!(linear65.getTranslationY() == SketchwareUtil.getDip(getApplicationContext(), (int)(-200)))) {
								_linear_gone();
								ani_lock.setTarget(linear_unloack);
								ani_lock.setPropertyName("translationY");
								ani_lock.setFloatValues((float)(SketchwareUtil.getDip(getApplicationContext(), (int)(200))));
								ani_lock.setDuration((int)(150));
								ani_lock.start();
							}
						}
					});
				}
			};
			_timer.schedule(ti9, (int)(6000));
		}
	}
	
	
	public void _speed() {
		try {
			
			player.setPlayWhenReady(false);
		} catch (Exception e) {
			
		}
		c = new AlertDialog.Builder(VideoplayerActivity.this).create();
		LayoutInflater cLI = getLayoutInflater();
		View cCV = (View) cLI.inflate(R.layout.select_speed, null);
		c.setView(cCV);
		final LinearLayout linear1 = (LinearLayout)
		cCV.findViewById(R.id.linear1);
		final LinearLayout close = (LinearLayout)
		cCV.findViewById(R.id.close);
		final LinearLayout lin1 = (LinearLayout)
		cCV.findViewById(R.id.lin1);
		final LinearLayout lin2 = (LinearLayout)
		cCV.findViewById(R.id.lin2);
		final LinearLayout lin3 = (LinearLayout)
		cCV.findViewById(R.id.lin3);
		final LinearLayout lin4 = (LinearLayout)
		cCV.findViewById(R.id.lin4);
		final LinearLayout lin5 = (LinearLayout)
		cCV.findViewById(R.id.lin5);
		final LinearLayout linear = (LinearLayout)
		cCV.findViewById(R.id.linear);
		final ImageView tick1 = (ImageView)
		cCV.findViewById(R.id.tick1);
		final ImageView tick2 = (ImageView)
		cCV.findViewById(R.id.tick2);
		final ImageView tick3 = (ImageView)
		cCV.findViewById(R.id.tick3);
		final ImageView tick4 = (ImageView)
		cCV.findViewById(R.id.tick4);
		final ImageView tick5 = (ImageView)
		cCV.findViewById(R.id.tick5);
		final ScrollView vscroll1 = (ScrollView)
		cCV.findViewById(R.id.vscroll1);
		c.dismiss();
		c.setCancelable(false);
		c.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		c.show();
		_ColourFilter(tick1, "#2196f3");
		_ColourFilter(tick2, "#2196f3");
		_ColourFilter(tick3, "#2196f3");
		_ColourFilter(tick4, "#2196f3");
		_ColourFilter(tick5, "#2196f3");
		linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF0F1620));
		close.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)999, 0xFF0F1620));
		lin1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				
				try {
					PlaybackParams param = new PlaybackParams();
					param.setSpeed(0.2f);
					player.setPlaybackParams(param);
					
					tick_speed = 1;
					c.dismiss();
					
					player.setPlayWhenReady(true);
				} catch(Exception e) {
					
				}
			}
		});
		lin2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				
				try {
					PlaybackParams param = new PlaybackParams();
					param.setSpeed(0.5f);
					player.setPlaybackParams(param);
					
					tick_speed = 2;
					c.dismiss();
					
					player.setPlayWhenReady(true);
				} catch(Exception e) {
					
				}
			}
		});
		lin3.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				
				try {
					PlaybackParams param = new PlaybackParams();
					param.setSpeed(1f);
					player.setPlaybackParams(param);
					
					tick_speed = 3;
					c.dismiss();
					
					player.setPlayWhenReady(true);
				} catch(Exception e) {
					
				}
			}
		});
		lin4.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				
				try {
					PlaybackParams param = new PlaybackParams();
					param.setSpeed(1.5f);
					player.setPlaybackParams(param);
					
					tick_speed = 4;
					c.dismiss();
					
					player.setPlayWhenReady(true);
				} catch(Exception e) {
					
				}
			}
		});
		lin5.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				
				try {
					PlaybackParams param = new PlaybackParams();
					param.setSpeed(2f);
					player.setPlaybackParams(param);
					
					tick_speed = 5;
					c.dismiss();
					
					player.setPlayWhenReady(true);
				} catch(Exception e) {
					
				}
			}
		});
		close.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				c.dismiss();
				
				player.setPlayWhenReady(true);
				pause1.setVisibility(View.VISIBLE);
				play1.setVisibility(View.GONE);
			}
		});
		tick1.setVisibility(View.GONE);
		tick2.setVisibility(View.GONE);
		tick3.setVisibility(View.GONE);
		tick4.setVisibility(View.GONE);
		tick5.setVisibility(View.GONE);
		if (tick_speed == 1) {
			tick1.setVisibility(View.VISIBLE);
		} else {
			if (tick_speed == 2) {
				tick2.setVisibility(View.VISIBLE);
			} else {
				if (tick_speed == 3) {
					tick3.setVisibility(View.VISIBLE);
				} else {
					if (tick_speed == 4) {
						tick4.setVisibility(View.VISIBLE);
					} else {
						if (tick_speed == 5) {
							tick5.setVisibility(View.VISIBLE);
						} else {
							tick3.setVisibility(View.VISIBLE);
						}
					}
				}
			}
		}
		_removeScollBar(vscroll1);
	}
	
	
	public void _qulity() {
		try {
			
			player.setPlayWhenReady(false);
		} catch (Exception e) {
			
		}
		q = new AlertDialog.Builder(VideoplayerActivity.this).create();
		LayoutInflater qLI = getLayoutInflater();
		View qCV = (View) qLI.inflate(R.layout.select_quality, null);
		q.setView(qCV);
		final LinearLayout linear1 = (LinearLayout)
		qCV.findViewById(R.id.linear1);
		final LinearLayout close = (LinearLayout)
		qCV.findViewById(R.id.close);
		final LinearLayout linear = (LinearLayout)
		qCV.findViewById(R.id.linear);
		final ImageView tick480 = (ImageView)
		qCV.findViewById(R.id.tick480);
		final ImageView tick720 = (ImageView)
		qCV.findViewById(R.id.tick720);
		final ImageView tick1080 = (ImageView)
		qCV.findViewById(R.id.tick1080);
		final LinearLayout lin1 = (LinearLayout)
		qCV.findViewById(R.id.lin1);
		final LinearLayout lin2 = (LinearLayout)
		qCV.findViewById(R.id.lin2);
		final LinearLayout lin3 = (LinearLayout)
		qCV.findViewById(R.id.lin3);
		final ScrollView vscroll1 = (ScrollView)
		qCV.findViewById(R.id.vscroll1);
		final zakfilm.ir.ExpandableRecyclerView recyclerview1 = (zakfilm.ir.ExpandableRecyclerView)
		qCV.findViewById(R.id.recyclerview1);
		q.setCancelable(false);
		q.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		q.show();
		_removeScollBar(vscroll1);
		_ColourFilter(tick480, "#2196f3");
		_ColourFilter(tick720, "#2196f3");
		_ColourFilter(tick1080, "#2196f3");
		recyclerview1.setAdapter(new Myrecyclerview1_0Adapter(listQulity));
		recyclerview1.setLayoutManager(new LinearLayoutManager(VideoplayerActivity.this));
		recyclerview1.setExpanded(true);
		recyclerview1.setNestedScrollingEnabled(false);
		if (getIntent().hasExtra("my")) {
			vscroll1.setVisibility(View.GONE);
			recyclerview1.setVisibility(View.VISIBLE);
		} else {
			vscroll1.setVisibility(View.VISIBLE);
			recyclerview1.setVisibility(View.GONE);
		}
		lin1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				if (quality.equals("480")) {
					
				} else {
					quality = "480";
					seek = player.getCurrentPosition();
					
					String Url_Player = "https://relfilm.upera.tv/".concat(getIntent().getStringExtra("url").concat(type_video.concat(quality.concat(".mp4".concat("?ref=tvAd")))));
					Uri videoUrl = Uri.parse(Url_Player);
					mediaSource = new ExtractorMediaSource(videoUrl, new DefaultHttpDataSourceFactory("exoplayer_video"), new DefaultExtractorsFactory(), null, null);
					
					player.prepare(mediaSource);
					
					player.setPlayWhenReady(true);
					long seekPosition = (long) seek; // مقدار seek را به long تبدیل کنید
					player.seekTo(seekPosition); // موقعیت پخش را تغییر دهید
					q.dismiss();
				}
			}
		});
		lin2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				if (quality.equals("720")) {
					
				} else {
					quality = "720";
					seek = player.getCurrentPosition();
					
					String Url_Player = "https://relfilm.upera.tv/".concat(getIntent().getStringExtra("url").concat(type_video.concat(quality.concat(".mp4".concat("?ref=tvAd")))));
					Uri videoUrl = Uri.parse(Url_Player);
					mediaSource = new ExtractorMediaSource(videoUrl, new DefaultHttpDataSourceFactory("exoplayer_video"), new DefaultExtractorsFactory(), null, null);
					
					player.prepare(mediaSource);
					
					player.setPlayWhenReady(true);
					long seekPosition = (long) seek; // مقدار seek را به long تبدیل کنید
					player.seekTo(seekPosition); // موقعیت پخش را تغییر دهید
					q.dismiss();
				}
			}
		});
		lin3.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				if (quality.equals("1080")) {
					
				} else {
					quality = "1080";
					seek = player.getCurrentPosition();
					
					String Url_Player = "https://relfilm.upera.tv/".concat(getIntent().getStringExtra("url").concat(type_video.concat(quality.concat(".mp4".concat("?ref=tvAd")))));
					Uri videoUrl = Uri.parse(Url_Player);
					mediaSource = new ExtractorMediaSource(videoUrl, new DefaultHttpDataSourceFactory("exoplayer_video"), new DefaultExtractorsFactory(), null, null);
					
					player.prepare(mediaSource);
					
					player.setPlayWhenReady(true);
					long seekPosition = (long) seek; // مقدار seek را به long تبدیل کنید
					player.seekTo(seekPosition); // موقعیت پخش را تغییر دهید
					q.dismiss();
				}
			}
		});
		close.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				q.dismiss();
				
				player.setPlayWhenReady(true);
				pause1.setVisibility(View.VISIBLE);
				play1.setVisibility(View.GONE);
			}
		});
		linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF0F1620));
		close.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)999, 0xFF0F1620));
		if (quality.equals("480")) {
			tick480.setVisibility(View.VISIBLE);
			tick720.setVisibility(View.GONE);
			tick1080.setVisibility(View.GONE);
		} else {
			if (quality.equals("720")) {
				tick480.setVisibility(View.GONE);
				tick720.setVisibility(View.VISIBLE);
				tick1080.setVisibility(View.GONE);
			} else {
				if (quality.equals("1080")) {
					tick480.setVisibility(View.GONE);
					tick720.setVisibility(View.GONE);
					tick1080.setVisibility(View.VISIBLE);
				} else {
					tick480.setVisibility(View.VISIBLE);
					tick720.setVisibility(View.GONE);
					tick1080.setVisibility(View.GONE);
				}
			}
		}
	}
	
	
	public String _formatDuration(final double _duration) {
		
		long seconds = (long) (_duration / 1000);
		long minutes = (seconds / 60) % 60;
		long hours = (seconds / 3600);
		long sec = seconds % 60;
		
		return (hours > 0) 
		? String.format("%02d:%02d:%02d", hours, minutes, sec) 
		: String.format("%02d:%02d", minutes, sec);
	}
	
	
	public void _hadler() {
		final Handler handler = new Handler();
		Runnable updatePosition = new Runnable() {
			@Override
			public void run() {
				if (player != null) {
					textview76.setText(_getDuration(player.getCurrentPosition())); 
					
					// فرض کنید progressBuffer یک ProgressBar است.
					int bufferedPercentage = player.getBufferedPercentage();
					seekbar5.setProgress(bufferedPercentage);
					
					if (player.getPlayWhenReady()) {
						exo_progress.setProgress((int)player.getCurrentPosition());
						if (linear124.getVisibility() == View.VISIBLE) {
							textview76.setText(_getDuration(player.getCurrentPosition()));
						} else {
							exo_position.setText(_getDuration(player.getCurrentPosition()));
						}
					}
					else {
						
					}
					handler.postDelayed(this, 500); // به‌روزرسانی هر 500 میلی‌ثانیه
				}
			}
		};
		handler.post(updatePosition);
	}
	
	
	public void _question() {
		q = new AlertDialog.Builder(VideoplayerActivity.this).create();
		LayoutInflater qLI = getLayoutInflater();
		View qCV = (View) qLI.inflate(R.layout.check, null);
		q.setView(qCV);
		final LinearLayout linear1 = (LinearLayout)
		qCV.findViewById(R.id.linear1);
		final LinearLayout yes = (LinearLayout)
		qCV.findViewById(R.id.yes);
		final LinearLayout no = (LinearLayout)
		qCV.findViewById(R.id.no);
		q.setCancelable(false);
		q.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF1D2733));
		yes.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF448AFF));
		yes.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				exo_progress.setMax((int)Double.parseDouble(duration_video_uid_m.getString("max".concat(link), "")));
				exo_progress.setProgress((int)Double.parseDouble(duration_video_uid.getString("position".concat(link), "")));
				exo_duration.setText(_formatDuration(Double.parseDouble(duration_video_uid_m.getString("max".concat(link), ""))));
				textview74.setText(_formatDuration(Double.parseDouble(duration_video_uid_m.getString("max".concat(link), ""))));
				seek = Double.parseDouble(duration_video_uid.getString("position".concat(link), ""));
				
				player.prepare(mediaSource);
				
				player.setPlayWhenReady(true);
				long seekPosition = (long) seek; // مقدار seek را به long تبدیل کنید
				player.seekTo(seekPosition); // موقعیت پخش را تغییر دهید
				restart.setVisibility(View.GONE);
				q.dismiss();
			}
		});
		ful_no.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				restart.setVisibility(View.GONE);
				
				player.setPlayWhenReady(true);
				q.dismiss();
			}
		});
		q.show();
	}
	
	
	public void _piss() {
		exo_ffwd.setOnTouchListener(new View.OnTouchListener() {
			private Handler handler = new Handler();
			private boolean isLongPressed = false;
			
			// تعریف Runnable برای کلیک طولانی
			private Runnable longPressRunnable = new Runnable() {
				@Override
				public void run() {
					isLongPressed = true;
					// فعالیتی که باید هنگام کلیک طولانی انجام شود
					
					if (!lock) {
						try {
							ti9.cancel();
						} catch (Exception e) {
							
						}
						linear5.setVisibility(View.VISIBLE);
						_an();
						
						try {
							PlaybackParams param = new PlaybackParams();
							param.setSpeed(2.0f);
							player.setPlaybackParams(param);
							
							
						} catch(Exception e) {
							
						}
					}
					
				}
			};
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
					case MotionEvent.ACTION_DOWN:
					// زمانبندی برای کلیک طولانی
					handler.postDelayed(longPressRunnable, 500); // 500 میلی‌ثانیه برای تشخیص کلیک طولانی
					return false; // اجازه می‌دهد کلیک عادی هم توسط Sketchware مدیریت شود
					
					case MotionEvent.ACTION_UP:
					// اگر کلیک طولانی انجام شده باشد
					handler.removeCallbacks(longPressRunnable);
					if (isLongPressed) {
						// فعالیتی که باید پس از رهاسازی کلیک طولانی انجام شود
						
						if (!lock) {
							_t();
							linear5.setVisibility(View.GONE);
							
							try {
								PlaybackParams param = new PlaybackParams();
								param.setSpeed(1.0f);
								player.setPlaybackParams(param);
								
								
							} catch(Exception e) {
								
							}
							try {
								ani.cancel();
							} catch (Exception e) {
								
							}
							try {
								afi.cancel();
							} catch (Exception e) {
								
							}
						}
						isLongPressed = 
						false;
						return true; // جلوگیری از اجرای کلیک عادی پس از کلیک طولانی
					}
					return false; // اجازه می‌دهد کلیک عادی کار کند
					
					case MotionEvent.ACTION_CANCEL:
					// زمانی که کلیک لغو می‌شود
					handler.removeCallbacks(longPressRunnable);
					return true;
				}
				return false;
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
	
	
	public void _linear_gone() {
		if_visible_linear_play = false;
		ani_cv.setTarget(linear65);
		ani_cv.setPropertyName("translationY");
		ani_cv.setFloatValues((float)(SketchwareUtil.getDip(getApplicationContext(), (int)(-200))));
		ani_cv.setDuration((int)(150));
		ani_cv.start();
		ani_vob.setTarget(linear67);
		ani_vob.setPropertyName("translationY");
		ani_vob.setFloatValues((float)(SketchwareUtil.getDip(getApplicationContext(), (int)(200))));
		ani_vob.setDuration((int)(150));
		ani_vob.start();
		ani_lock.setTarget(linear_unloack);
		ani_lock.setPropertyName("translationY");
		ani_lock.setFloatValues((float)(SketchwareUtil.getDip(getApplicationContext(), (int)(200))));
		ani_lock.setDuration((int)(150));
		ani_lock.start();
		ani_ubb.setTarget(linear66);
		ani_ubb.setPropertyName("alpha");
		ani_ubb.setFloatValues((float)(0.0d));
		ani_ubb.setDuration((int)(200));
		ani_ubb.start();
	}
	
	
	public void _linear_visible() {
		if (lock) {
			ani_lock.setTarget(linear_unloack);
			ani_lock.setPropertyName("translationY");
			ani_lock.setFloatValues((float)(0));
			ani_lock.setDuration((int)(150));
			ani_lock.start();
		} else {
			if_visible_linear_play = true;
			ani_cv.setTarget(linear65);
			ani_cv.setPropertyName("translationY");
			ani_cv.setFloatValues((float)(0));
			ani_cv.setDuration((int)(150));
			ani_cv.start();
			ani_vob.setTarget(linear67);
			ani_vob.setPropertyName("translationY");
			ani_vob.setFloatValues((float)(0));
			ani_vob.setDuration((int)(150));
			ani_vob.start();
			ani_lock.setTarget(linear_unloack);
			ani_lock.setPropertyName("translationY");
			ani_lock.setFloatValues((float)(0));
			ani_lock.setDuration((int)(150));
			ani_lock.start();
			ani_ubb.setTarget(linear66);
			ani_ubb.setPropertyName("alpha");
			ani_ubb.setFloatValues((float)(1));
			ani_ubb.setDuration((int)(200));
			ani_ubb.start();
		}
	}
	
	
	public void _check_linear_unlock() {
		if (linear_unloack.getTranslationY() == SketchwareUtil.getDip(getApplicationContext(), (int)(200))) {
			ani_lock.setTarget(linear_unloack);
			ani_lock.setPropertyName("translationY");
			ani_lock.setFloatValues((float)(SketchwareUtil.getDip(getApplicationContext(), (int)(0))));
			ani_lock.setDuration((int)(150));
			ani_lock.start();
			_t();
		} else {
			ani_lock.setTarget(linear_unloack);
			ani_lock.setPropertyName("translationY");
			ani_lock.setFloatValues((float)(SketchwareUtil.getDip(getApplicationContext(), (int)(200))));
			ani_lock.setDuration((int)(150));
			ani_lock.start();
			textview73.setVisibility(View.GONE);
			imageview39.setVisibility(View.GONE);
			imageview27.setVisibility(View.VISIBLE);
		}
	}
	
	
	public void _animation_view_unlock_visibe() {
		v1.setTarget(linear88);
		v1.setPropertyName("scaleX");
		v1.setFloatValues((float)(1.1d));
		v1.setDuration((int)(300));
		v1.start();
		v2.setTarget(linear88);
		v2.setPropertyName("scaleY");
		v2.setFloatValues((float)(1.1d));
		v2.setDuration((int)(300));
		v2.start();
	}
	
	
	public void _play() {
		
	}
	
	
	public void _anim() {
		vib.vibrate((long)(100));
		bnb.setTarget(ful_no);
		bnb.setPropertyName("translationY");
		bnb.setFloatValues((float)(Double.parseDouble("-".concat(String.valueOf((long)(SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) + 50))))));
		bnb.setDuration((int)(150));
		bnb.start();
		oban.setTarget(ful_yes);
		oban.setPropertyName("translationY");
		oban.setFloatValues((float)(Double.parseDouble("-".concat(String.valueOf((long)(SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) + 50))))));
		oban.setDuration((int)(150));
		oban.start();
	}
	
	
	public void _download(final String _upera, final String _quality, final String _language) {
		guality = "480";
		type_dl = 0;
		load = new AlertDialog.Builder(VideoplayerActivity.this).create();
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
		size_1080.setVisibility(View.GONE);
		size_720.setVisibility(View.GONE);
		size_480.setVisibility(View.GONE);
		Glide.with(getApplicationContext())
		.load(getIntent().getStringExtra("profile"))
		.placeholder(R.drawable.shadertop)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
		.into(background);
		Glide.with(getApplicationContext())
		.load("https://s35.upera.net/thumb?w=207&h=250&q=".concat("40".concat("&src=https://s35.upera.net/s3/posters/".concat(getIntent().getStringExtra("image")))))
		.placeholder(R.drawable.nul)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
		.into(poster);
		title.setText(title.getText().toString());
		l1080.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
		l720.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
		l480.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFFFF5252));
		dl_0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFFFF5252));
		dl_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
		btn_start.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), 0xFF448AFF));
		size_1080.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(4)), 0xFFFFFFFF));
		size_720.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(4)), 0xFFFFFFFF));
		size_480.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(4)), 0xFFFFFFFF));
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
		sizem1 = "https://zakfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat("1080".concat(".mp4".concat("?ref=tvAd")))));
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
						size_1080.setVisibility(View.VISIBLE);
						_TransitionManager(linear11, 300);
					}
				});
			}
		}).start();
		
		sizem = "https://zakfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat("720".concat(".mp4".concat("?ref=tvAd")))));
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
						size_720.setVisibility(View.VISIBLE);
						_TransitionManager(linear11, 300);
					}
				});
			}
		}).start();
		sizem2 = "https://zakfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat("480".concat(".mp4".concat("?ref=tvAd")))));
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
						size_480.setVisibility(View.VISIBLE);
						_TransitionManager(linear11, 300);
					}
				});
			}
		}).start();
		l1080.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				l1080.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFFFF5252));
				l720.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				l480.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				guality = "1080";
			}
		});
		l720.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				l1080.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				l720.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFFFF5252));
				l480.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				guality = "720";
			}
		});
		l480.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				l1080.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				l720.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				l480.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFFFF5252));
				guality = "480";
			}
		});
		dl_0.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				dl_0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFFFF5252));
				dl_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				type_dl = 0;
			}
		});
		dl_1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				dl_0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
				dl_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0xFF4C4F56, 0xFFFF5252));
				type_dl = 1;
			}
		});
		btn_start.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View _view){
				load.dismiss();
				if (type_dl == 0) {
					_download_notificationi("https://zakfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat(guality.concat(".mp4".concat("?ref=tvAd"))))), "/Download".concat("/"), title.getText().toString().concat(_upera).concat(".".concat("mp4")));
					vib.vibrate((long)(100));
					SketchwareUtil.showMessage(getApplicationContext(), "شروع دانلود...");
				} else {
					url = "https://zakfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat(guality.concat(".mp4".concat("?ref=tvAd"))))).concat(".".concat("mp4"));
					filen = "https://zakfilm.upera.tv/".concat(_upera.concat("-".concat(String.valueOf((long)(0)).concat("-")).concat(guality.concat(".mp4".concat("?ref=tvAd"))))).concat(".".concat("mp4"));
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
		});
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
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
			
			// ذخیره فایل در پوشه Download عمومی
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
			FileUtil.writeFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/.path.d/t.txt"), 
			String.valueOf((long) (Double.parseDouble(FileUtil.readFile(FileUtil.getExternalStorageDir().concat("/.bmh/.nomedia").concat("/.path.d/t.txt"))) + 1)));
			showMessage("اتصال به شبکه برقرار نیست!");
		}
		
	}
	
	
	public void _get_theme_l_color() {
		if (save.getString("theme", "").equals("#FF8E2D")) {
			l_color = "#99FF8E2D";
		} else {
			if (save.getString("theme", "").equals("#536DFE")) {
				l_color = "#99536DFE";
			} else {
				if (save.getString("theme", "").equals("#FF5252")) {
					l_color = "#99FF5252";
				} else {
					if (save.getString("theme", "").equals("#FF4081")) {
						l_color = "#99FF4081";
					} else {
						if (save.getString("theme", "").equals("#7C4DFF")) {
							l_color = "#997C4DFF";
						} else {
							l_color = "#9900C853";
						}
					}
				}
			}
		}
		_GradientDrawable(pause1, SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0, 0, l_color, save.getString("theme", ""), false, false, 0);
		_GradientDrawable(play1, SketchwareUtil.getDip(getApplicationContext(), (int)(999)), 0, 0, l_color, save.getString("theme", ""), false, false, 0);
		_GradientDrawable(linear108, 999, SketchwareUtil.getDip(getApplicationContext(), (int)(2)), 0, "#00000000", save.getString("theme", ""), false, false, 0);
	}
	
	
	public void _adivery() {
		/*کانفیگ کردن ادیوری
Configuring the Adivery*/
		com.adivery.sdk.Adivery.configure(getApplication(), "70469118-a436-407f-8ca1-c65a0a0c1b9b");
		//تبلیغ ویدئویی
		//Video ad
		/*راه اندازی تبلیغات جایزه ای
Launching reward campaigns*/
		com.adivery.sdk.Adivery.prepareRewardedAd(this, "6486ab4f-5170-4394-ab8f-900432c9bb46");
		/*لیستنر کامل برای تبلیغات ها
Full listener for ads*/
		myAdiveryListener = new AdiveryListener() {
			@Override
			public void onRewardedAdLoaded(String placementId) {
				
				/*تبلیغ جایزه‌ای بارگذاری شده
Rewarded ad loaded*/
				
			}
			@Override
			public void onRewardedAdClosed(String placementId, boolean isRewarded) {
				
				/*بررسی کنید که آیا کاربر جایزه دریافت می‌کند یا خیر
Check if the user receives a reward.*/
				if (isRewarded) {
					/*تا آخر دیده شد*/
					ad_play = true;
				} else {
					/*نصف و نیمه دیده شد*/
					ad_play = true;
				}
				if (save.getString("traffic", "").equals("1")) {
					
				} else {
					title.setVisibility(View.GONE);
					nett.setVisibility(View.VISIBLE);
					timo = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									title.setVisibility(View.VISIBLE);
									nett.setVisibility(View.GONE);
								}
							});
						}
					};
					_timer.schedule(timo, (int)(10000));
				}
				if (!orien) {
					linear122.performClick();
				}
				play1.setVisibility(View.GONE);
				pause1.setVisibility(View.VISIBLE);
				
				player.setPlayWhenReady(true);
				_t();
				
			}
			@Override
			public void log(String placementId, String log) {
				
				/*پیغام را چاپ کنید
Print the message.*/
				SketchwareUtil.showMessage(getApplicationContext(), log);
				
			}
		};
		com.adivery.sdk.Adivery.addGlobalListener(myAdiveryListener);
		
		/*//نمایش تبلیغ ویدیویی*/
		_replay_ads();
	}
	
	
	public void _replay_ads() {
		if (com.adivery.sdk.Adivery.isLoaded("6486ab4f-5170-4394-ab8f-900432c9bb46")) {
			com.adivery.sdk.Adivery.showAd("6486ab4f-5170-4394-ab8f-900432c9bb46");
		} else {
			ti9 = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							_replay_ads();
						}
					});
				}
			};
			_timer.schedule(ti9, (int)(1000));
		}
	}
	
	
	public void _adapterQulity() {
	}
	public class Myrecyclerview1_0Adapter extends RecyclerView.Adapter<Myrecyclerview1_0Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Myrecyclerview1_0Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.quity, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			
			final TextView
 textview1 = 
			_view.findViewById(R.id.textview1);
			
			final ImageView
 tick = 
			_view.findViewById(R.id.tick);
			
			final LinearLayout
 lin = 
			_view.findViewById(R.id.lin);
			tick.setVisibility(View.GONE);
			textview1.setText("کیفیت ".concat(listQulity.get((int)_position).get("quality").toString()));
			lin.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					quality = String.valueOf((long)(_position));
					seek = player.getCurrentPosition();
					
					String Url_Player = listQulity.get((int)_position).get("url").toString();
					Uri videoUrl = Uri.parse(Url_Player);
					mediaSource = new ExtractorMediaSource(videoUrl, new DefaultHttpDataSourceFactory("exoplayer_video"), new DefaultExtractorsFactory(), null, null);
					
					player.prepare(mediaSource);
					
					player.setPlayWhenReady(true);
					long seekPosition = (long) seek; // مقدار seek را به long تبدیل کنید
					player.seekTo(seekPosition); // موقعیت پخش را تغییر دهید
				}
			});
			if (_position == Double.parseDouble(quality)) {
				tick.setVisibility(View.VISIBLE);
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
	
	
	public void _check() {
		TelephonyManager tm =
		(TelephonyManager) getSystemService(TELEPHONY_SERVICE);
		
		String operator = tm.getNetworkOperatorName();
		
		if (operator == null) {
			operator = "";
		}
		
		if (operator.toLowerCase().contains("mci")) {
			
			operator_name = "mci";
			
		} else if (operator.toLowerCase().contains("irancell")) {
			
			operator_name = "mtn";
			
		} else if (operator.toLowerCase().contains("rightel")) {
			
			operator_name = "rtl";
			
		} else {
			
			operator_name = "operator";
		}
		if (operator_name.equals("wifi")) {
			trafic_img.setImageResource(R.drawable.sett_2);
		} else {
			if (operator_name.equals("mci")) {
				trafic_img.setImageResource(R.drawable.logj_2);
			} else {
				if (operator_name.equals("mtn")) {
					trafic_img.setImageResource(R.drawable.logj_1);
				} else {
					if (operator_name.equals("rtl")) {
						trafic_img.setImageResource(R.drawable.new_logo4);
					} else {
						trafic_img.setImageResource(R.drawable.sett_2);
					}
				}
			}
		}
		title.setVisibility(View.VISIBLE);
		nett.setVisibility(View.GONE);
		ad_play = false;
		String addres = FileUtil.getPackageDataDir(getApplicationContext()).concat("/account.json");
		
		// بررسی وجود فایل
		if (!FileUtil.isExistFile(addres)) {
			
			//اگر فایل وجود نداشت
			if (!save.getString("ad", "").equals("1")) {
				_adivery();
			}
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
				
				if (save.getString("ad", "").equals("1")) {
					_linear_visible();
					if (!orien) {
						linear122.performClick();
					}
					play1.setVisibility(View.GONE);
					pause1.setVisibility(View.VISIBLE);
					
					player.setPlayWhenReady(true);
					_t();
					if (save.getString("traffic", "").equals("1")) {
						SketchwareUtil.showMessage(getApplicationContext(), "انجام");
						_linear_visible();
					} else {
						title.setVisibility(View.GONE);
						nett.setVisibility(View.VISIBLE);
						timo = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										title.setVisibility(View.VISIBLE);
										nett.setVisibility(View.GONE);
									}
								});
							}
						};
						_timer.schedule(timo, (int)(10000));
					}
				} else {
					_adivery();
				}
			} else if (diffDays == 0) {
				
				//آخرین روز اشتراک
				if (save.getString("ad", "").equals("1")) {
					if (!orien) {
						linear122.performClick();
					}
					play1.setVisibility(View.GONE);
					pause1.setVisibility(View.VISIBLE);
					
					player.setPlayWhenReady(true);
					_t();
					if (save.getString("traffic", "").equals("1")) {
						SketchwareUtil.showMessage(getApplicationContext(), "انجام");
						_linear_visible();
					} else {
						title.setVisibility(View.GONE);
						nett.setVisibility(View.VISIBLE);
						timo = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										title.setVisibility(View.VISIBLE);
										nett.setVisibility(View.GONE);
									}
								});
							}
						};
						_timer.schedule(timo, (int)(10000));
					}
				} else {
					_adivery();
				}
				
			} else {
				
				//اشتراک ندارید
				_adivery();
				
			}
			
		} catch (Exception e) {
			
			Log.e("SubscriptionCheck", e.toString());
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
