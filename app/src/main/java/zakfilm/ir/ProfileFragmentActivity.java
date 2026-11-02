package zakfilm.ir;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
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
import android.webkit.*;
import android.widget.*;
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
import de.hdodenhof.circleimageview.*;
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
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;
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
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ProfileFragmentActivity extends Fragment {
	
	private ArrayList<HashMap<String, Object>> g = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> a = new ArrayList<>();
	
	private LinearLayout linear23;
	private ScrollView vscroll1;
	private LinearLayout linear29;
	private RelativeLayout relativelayout1;
	private LinearLayout linear31;
	private LinearLayout linear43;
	private LinearLayout linear30;
	private ImageView imageview17;
	private CircleImageView circleimageview1;
	private LinearLayout linear2;
	private LinearLayout linear34;
	private TextView name;
	private TextView email;
	private LinearLayout linear27;
	private LinearLayout linear5;
	private RelativeLayout relativelayout2;
	private TextView textview20;
	private RecyclerView recyclerview1;
	private LinearLayout linear32;
	private LinearLayout edit_account;
	private LinearLayout linear_exit_account;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear10;
	private LinearLayout linear12;
	private LinearLayout linear35;
	private TextView textview5;
	private LinearLayout l1;
	private ImageView imageview1;
	private LinearLayout linear36;
	private TextView textview6;
	private LinearLayout l2;
	private ImageView imageview2;
	private LinearLayout linear37;
	private TextView textview7;
	private LinearLayout l3;
	private ImageView imageview3;
	private LinearLayout linear38;
	private TextView textview8;
	private LinearLayout l4;
	private ImageView imageview4;
	private LinearLayout linear44;
	private LinearLayout share_banner;
	private ImageView imageview18;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private ImageView imageview5;
	private LinearLayout linear17;
	private TextView textview13;
	private LinearLayout linear42;
	private TextView email1;
	private TextView textview2;
	private TextView textview23;
	private LinearLayout linear18;
	private LinearLayout linear41;
	private LinearLayout linear19;
	private LinearLayout linear40;
	private LinearLayout linear20;
	private LinearLayout linear39;
	private LinearLayout linear21;
	private ImageView imageview7;
	private TextView textview14;
	private ImageView imageview6;
	private ImageView imageview8;
	private TextView textview15;
	private ImageView imageview14;
	private ImageView imageview10;
	private TextView textview16;
	private ImageView imageview15;
	private ImageView imageview12;
	private TextView textview17;
	private ImageView imageview16;
	private TextView textview18;
	private TextView textview19;
	
	private Intent i = new Intent();
	private SharedPreferences em;
	private SharedPreferences name_pr;
	private SharedPreferences profile_pr;
	private SharedPreferences id_pr;
	private Intent to = new Intent();
	private Vibrator vib;
	private AlertDialog.Builder dialog;
	private Intent go_setting = new Intent();
	private Intent go_info = new Intent();
	private SharedPreferences play_list;
	private Intent intent = new Intent();
	private AlertDialog cus;
	private SharedPreferences save;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.profile_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		FirebaseApp.initializeApp(getContext());
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		linear23 = _view.findViewById(R.id.linear23);
		vscroll1 = _view.findViewById(R.id.vscroll1);
		linear29 = _view.findViewById(R.id.linear29);
		relativelayout1 = _view.findViewById(R.id.relativelayout1);
		linear31 = _view.findViewById(R.id.linear31);
		linear43 = _view.findViewById(R.id.linear43);
		linear30 = _view.findViewById(R.id.linear30);
		imageview17 = _view.findViewById(R.id.imageview17);
		circleimageview1 = _view.findViewById(R.id.circleimageview1);
		linear2 = _view.findViewById(R.id.linear2);
		linear34 = _view.findViewById(R.id.linear34);
		name = _view.findViewById(R.id.name);
		email = _view.findViewById(R.id.email);
		linear27 = _view.findViewById(R.id.linear27);
		linear5 = _view.findViewById(R.id.linear5);
		relativelayout2 = _view.findViewById(R.id.relativelayout2);
		textview20 = _view.findViewById(R.id.textview20);
		recyclerview1 = _view.findViewById(R.id.recyclerview1);
		linear32 = _view.findViewById(R.id.linear32);
		edit_account = _view.findViewById(R.id.edit_account);
		linear_exit_account = _view.findViewById(R.id.linear_exit_account);
		linear7 = _view.findViewById(R.id.linear7);
		linear8 = _view.findViewById(R.id.linear8);
		linear10 = _view.findViewById(R.id.linear10);
		linear12 = _view.findViewById(R.id.linear12);
		linear35 = _view.findViewById(R.id.linear35);
		textview5 = _view.findViewById(R.id.textview5);
		l1 = _view.findViewById(R.id.l1);
		imageview1 = _view.findViewById(R.id.imageview1);
		linear36 = _view.findViewById(R.id.linear36);
		textview6 = _view.findViewById(R.id.textview6);
		l2 = _view.findViewById(R.id.l2);
		imageview2 = _view.findViewById(R.id.imageview2);
		linear37 = _view.findViewById(R.id.linear37);
		textview7 = _view.findViewById(R.id.textview7);
		l3 = _view.findViewById(R.id.l3);
		imageview3 = _view.findViewById(R.id.imageview3);
		linear38 = _view.findViewById(R.id.linear38);
		textview8 = _view.findViewById(R.id.textview8);
		l4 = _view.findViewById(R.id.l4);
		imageview4 = _view.findViewById(R.id.imageview4);
		linear44 = _view.findViewById(R.id.linear44);
		share_banner = _view.findViewById(R.id.share_banner);
		imageview18 = _view.findViewById(R.id.imageview18);
		linear14 = _view.findViewById(R.id.linear14);
		linear15 = _view.findViewById(R.id.linear15);
		imageview5 = _view.findViewById(R.id.imageview5);
		linear17 = _view.findViewById(R.id.linear17);
		textview13 = _view.findViewById(R.id.textview13);
		linear42 = _view.findViewById(R.id.linear42);
		email1 = _view.findViewById(R.id.email1);
		textview2 = _view.findViewById(R.id.textview2);
		textview23 = _view.findViewById(R.id.textview23);
		linear18 = _view.findViewById(R.id.linear18);
		linear41 = _view.findViewById(R.id.linear41);
		linear19 = _view.findViewById(R.id.linear19);
		linear40 = _view.findViewById(R.id.linear40);
		linear20 = _view.findViewById(R.id.linear20);
		linear39 = _view.findViewById(R.id.linear39);
		linear21 = _view.findViewById(R.id.linear21);
		imageview7 = _view.findViewById(R.id.imageview7);
		textview14 = _view.findViewById(R.id.textview14);
		imageview6 = _view.findViewById(R.id.imageview6);
		imageview8 = _view.findViewById(R.id.imageview8);
		textview15 = _view.findViewById(R.id.textview15);
		imageview14 = _view.findViewById(R.id.imageview14);
		imageview10 = _view.findViewById(R.id.imageview10);
		textview16 = _view.findViewById(R.id.textview16);
		imageview15 = _view.findViewById(R.id.imageview15);
		imageview12 = _view.findViewById(R.id.imageview12);
		textview17 = _view.findViewById(R.id.textview17);
		imageview16 = _view.findViewById(R.id.imageview16);
		textview18 = _view.findViewById(R.id.textview18);
		textview19 = _view.findViewById(R.id.textview19);
		em = getContext().getSharedPreferences("em", Activity.MODE_PRIVATE);
		name_pr = getContext().getSharedPreferences("name_pr", Activity.MODE_PRIVATE);
		profile_pr = getContext().getSharedPreferences("profile_pr", Activity.MODE_PRIVATE);
		id_pr = getContext().getSharedPreferences("id_pr", Activity.MODE_PRIVATE);
		vib = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
		dialog = new AlertDialog.Builder(getActivity());
		play_list = getContext().getSharedPreferences("play_list", Activity.MODE_PRIVATE);
		save = getContext().getSharedPreferences("save", Activity.MODE_PRIVATE);
		
		recyclerview1.addOnScrollListener(new RecyclerView.OnScrollListener() {
			@Override
			public void onScrollStateChanged(RecyclerView recyclerView, int _scrollState) {
				super.onScrollStateChanged(recyclerView, _scrollState);
				
			}
			
			@Override
			public void onScrolled(RecyclerView recyclerView, int _offsetX, int _offsetY) {
				super.onScrolled(recyclerView, _offsetX, _offsetY);
				
			}
		});
		
		edit_account.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext().getApplicationContext(), EditAccountActivity.class);
				startActivity(i);
				getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext().getApplicationContext(), SavesActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(i);
				getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getContext().getApplicationContext(), "درحال حاضر در دسترس نیست");
				vib.vibrate((long)(100));
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getContext().getApplicationContext(), "درحال حاضر در دسترس نیست");
				vib.vibrate((long)(100));
			}
		});
		
		linear12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext().getApplicationContext(), PlayListActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(i);
				getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext().getApplicationContext(), NewBuyEshActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(i);
				getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				go_setting.setClass(getContext().getApplicationContext(), SettingActivity.class);
				go_setting.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(go_setting);
				getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
			}
		});
		
		linear19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				go_info.setClass(getContext().getApplicationContext(), InfoActivity.class);
				go_info.putExtra("key", "question");
				startActivity(go_info);
				getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
			}
		});
		
		linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				go_info.setClass(getContext().getApplicationContext(), InfoActivity.class);
				go_info.putExtra("key", "call");
				startActivity(go_info);
				getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
			}
		});
		
		linear21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				go_info.setClass(getContext().getApplicationContext(), InfoActivity.class);
				go_info.putExtra("key", "info");
				startActivity(go_info);
				getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
			}
		});
	}
	
	private void initializeLogic() {
		BlurUtil.applyBlur(getContext().getApplicationContext(), linear43, 30f);
		getActivity().getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		_ui();
		if (play_list.contains("play_list66655")) {
			textview20.setVisibility(View.VISIBLE);
			recyclerview1.setVisibility(View.VISIBLE);
			a = new Gson().fromJson(play_list.getString("play_list", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			Collections.reverse(a);
			recyclerview1.setAdapter(new Recyclerview1Adapter(a));
			if (new Gson().toJson(a).equals("[]")) {
				textview20.setVisibility(View.GONE);
				recyclerview1.setVisibility(View.GONE);
			}
		} else {
			textview20.setVisibility(View.GONE);
			recyclerview1.setVisibility(View.GONE);
		}
		recyclerview1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false));
		OverScrollDecoratorHelper.setUpOverScroll(vscroll1);
		_getData();
	}
	
	
	@Override
	public void onStart() {
		super.onStart();
		if (name_pr.contains("name_pr")) {
			name.setText(name_pr.getString("name_pr", ""));
		} else {
			name.setText("مهمان");
		}
		_getData();
		_check();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		play_list.edit().putString("play_list", new Gson().toJson(a)).commit();
		recyclerview1.setAdapter(new Recyclerview1Adapter(a));
		if (a.size() == 0) {
			recyclerview1.setVisibility(View.GONE);
			textview20.setVisibility(View.GONE);
		}
		if (name_pr.contains("name_pr")) {
			name.setText(name_pr.getString("name_pr", ""));
		} else {
			name.setText("مهمان");
		}
		_getData();
		_check();
	}
	public void _ui() {
		Glide.with(getContext().getApplicationContext())
		.load(save.getString("poster", ""))
		.placeholder(R.drawable.nul)
		.transform(new RoundedCorners(1))
		.transition(DrawableTransitionOptions.withCrossFade(300))
		.into(imageview17);
		l1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)0, 0x500F1620, 0xFF1D2733));
		l2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)0, 0x500F1620, 0xFF1D2733));
		l3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)0, 0x500F1620, 0xFF1D2733));
		l4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)0, 0x500F1620, 0xFF1D2733));
		linear35.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFF1D2733, Color.TRANSPARENT));
		linear36.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFF1D2733, Color.TRANSPARENT));
		linear37.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFF1D2733, Color.TRANSPARENT));
		linear38.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFF1D2733, Color.TRANSPARENT));
		relativelayout2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		linear32.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		linear17.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), 0xFFFFFFFF));
		edit_account.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(1)), 0xFF1D2733, Color.TRANSPARENT));
		linear_exit_account.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(1)), 0xFF37474F, 0xFF1D2733));
		_removeScollBar(vscroll1);
		_RippleEffects("#bdbdbd", imageview7);
		_RippleEffects("#bdbdbd", imageview8);
		_RippleEffects("#bdbdbd", imageview10);
		_RippleEffects("#bdbdbd", imageview12);
		imageview6.clearColorFilter(); imageview6.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		imageview14.clearColorFilter(); imageview14.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		imageview15.clearColorFilter(); imageview15.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		imageview16.clearColorFilter(); imageview16.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		imageview1.clearColorFilter(); imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		imageview2.clearColorFilter(); imageview2.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		imageview3.clearColorFilter(); imageview3.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		imageview4.clearColorFilter(); imageview4.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _RippleEffects(final String _color, final View _view) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_color)});
		android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null);
		_view.setBackground(ripdr);
	}
	
	
	public void _delete_position(final double _pos) {
		a.remove((int)(_pos));
		play_list.edit().putString("play_list", new Gson().toJson(a)).commit();
		recyclerview1.setAdapter(new Recyclerview1Adapter(a));
		if (a.size() == 0) {
			recyclerview1.setVisibility(View.GONE);
			textview20.setVisibility(View.GONE);
		}
	}
	
	
	public void _ColourFilter(final ImageView _imageview, final String _color) {
		_imageview.clearColorFilter(); 
		_imageview.setColorFilter(Color.parseColor(_color.toString()));
	}
	
	
	public void _getData() {
		
	}
	
	
	public void _check() {
		String addres = FileUtil.getPackageDataDir(getContext().getApplicationContext()).concat("/account.json");
		
		// بررسی وجود فایل
		if (!FileUtil.isExistFile(addres)) {
			
			//اگر فایل وجود نداشت
			textview2.setText("ندارید");
			textview2.setTextColor(0xFFFF1744);
			email1.setText("شما در حال حاضر اشتراک فعال ندارید. برای استفاده از تمام بخش‌ها و قابلیت‌های برنامه، اشتراک تهیه کنید");
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
				textview2.setText(diffDays + " روز مانده");
				
				textview2.setTextColor(0xFF00E676);
				email1.setText("🎉 اشتراک شما با موفقیت فعال شد! از حالا می‌توانید بدون محدودیت از تمامی امکانات و قابلیت‌های برنامه استفاده کنید.");
			} else if (diffDays == 0) {
				
				//آخرین روز اشتراک
				textview2.setText("آخرین روز اشتراک");
				email1.setText("🎉 اشتراک شما با موفقیت فعال شد! از حالا می‌توانید بدون محدودیت از تمامی امکانات و قابلیت‌های برنامه استفاده کنید.");
				textview2.setTextColor(0xFFFFD740);
				
			} else {
				
				//اشتراک ندارید
				textview2.setText("ندارید");
				email1.setText("شما در حال حاضر اشتراک فعال ندارید. برای استفاده از تمام بخش‌ها و قابلیت‌های برنامه، اشتراک تهیه کنید");
				textview2.setTextColor(0xFFFF1744);
				
			}
			
		} catch (Exception e) {
			textview2.setText("خطا در خواندن اطلاعات اشتراک");
			Log.e("SubscriptionCheck", e.toString());
		}
	}
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getActivity().getLayoutInflater();
			View _v = _inflater.inflate(R.layout.clustom_play, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final ProgressBar progressbar1 = _view.findViewById(R.id.progressbar1);
			final ImageView imageview2 = _view.findViewById(R.id.imageview2);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			cardview1.setCardBackgroundColor(0x99263238);
			cardview1.setRadius((float)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)));
			cardview1.setCardElevation((float)0);
			textview1.setText(_data.get((int)_position).get("name").toString());
			Glide.with(getContext().getApplicationContext())
			.load(save.getString("domain", "").concat("575&h=500&q=60&a=c&zc=1&src=https://cdn.upera.shop/s3/backdrops/").concat(_data.get((int)_position).get("backdrop").toString()))
			.placeholder(R.drawable.nul)
			.transform(new RoundedCorners(1))
			.transition(DrawableTransitionOptions.withCrossFade(300))
			.into(imageview2);
			if (!_data.get((int)_position).get("max").toString().equals("0")) {
				progressbar1.setMax((int)Double.parseDouble(_data.get((int)_position).get("max").toString()));
				progressbar1.setProgress((int)Double.parseDouble(_data.get((int)_position).get("position").toString()));
			}
			progressbar1.getProgressDrawable().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
			linear1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					intent.setClass(getContext().getApplicationContext(), ViewActivity.class);
					intent.putExtra("id", _data.get((int)_position).get("id").toString());
					intent.putExtra("name", _data.get((int)_position).get("name").toString());
					intent.putExtra("image", _data.get((int)_position).get("image").toString());
					intent.putExtra("type", _data.get((int)_position).get("type").toString());
					intent.putExtra("dasteh", "");
					intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(intent);
					getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
				}
			});
			linear3.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View _view){
					cus = new AlertDialog.Builder(requireActivity()).create();
					LayoutInflater cusLI = getActivity().getLayoutInflater();
					View cusCV = (View) cusLI.inflate(R.layout.exit_dialog, null);
					cus.setView(cusCV);
					final LinearLayout linear = (LinearLayout)
					cusCV.findViewById(R.id.linear1);
					final LinearLayout ok = (LinearLayout)
					cusCV.findViewById(R.id.ok);
					final LinearLayout cancel = (LinearLayout)
					cusCV.findViewById(R.id.cancel);
					final TextView textview1 = (TextView)
					cusCV.findViewById(R.id.textview1);
					final TextView textview2 = (TextView)
					cusCV.findViewById(R.id.textview2);
					final TextView textview3 = (TextView)
					cusCV.findViewById(R.id.textview3);
					final ImageView imageview1 = (ImageView)
					cusCV.findViewById(R.id.imageview1);
					imageview1.setImageResource(R.drawable.icon_delete_outline_round);
					_ColourFilter(imageview1, "#ff5252");
					textview1.setText("حذف");
					textview2.setText("آیا میخواهید این ویدیو را از لیست ادامه تماشا حذف کنید؟");
					textview3.setText("حذف از ادامه تماشا");
					linear.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), 0xFF222327));
					ok.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFFFF5252, Color.TRANSPARENT));
					cancel.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(8)), (int)SketchwareUtil.getDip(getContext().getApplicationContext(), (int)(2)), 0xFF4C4F56, Color.TRANSPARENT));
					cus.setCancelable(true);
					cus.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
					cus.show();
					ok.setOnClickListener(new View.OnClickListener(){
						@Override
						public void onClick(View _view){
							_delete_position(_position);
							cus.dismiss();
						}
					});
					cancel.setOnClickListener(new View.OnClickListener(){
						@Override
						public void onClick(View _view){
							cus.dismiss();
						}
					});
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
}