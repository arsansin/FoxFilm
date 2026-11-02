package zakfilm.ir;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.adivery.sdk.*;
import com.google.android.exoplayer2.ui.*;
import com.google.firebase.FirebaseApp;
import eightbitlab.com.blurview.*;
import ir.amirsina.mykey.util.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;
import smartdevelop.ir.eram.showcaseviewlib.*;

public class VitrinFragmentActivity extends Fragment {
	
	private HashMap<String, Object> map = new HashMap<>();
	private HashMap<String, Object> sete = new HashMap<>();
	private boolean isFirstResource = false;
	private double num = 0;
	private boolean isRequesting = false;
	private String token = "";
	private double height = 0;
	private HashMap<String, Object> height_map = new HashMap<>();
	private HashMap<String, Object> p = new HashMap<>();
	private HashMap<String, Object> ch = new HashMap<>();
	private HashMap<String, Object> info = new HashMap<>();
	private String next_start_id = "";
	private double c = 0;
	
	private ArrayList<HashMap<String, Object>> mp = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> hashtag = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> sett = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_new = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> off = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> off1 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list_new1 = new ArrayList<>();
	
	private LinearLayout linear1;
	private TextView textview3;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.vitrin_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		FirebaseApp.initializeApp(getContext());
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		linear1 = _view.findViewById(R.id.linear1);
		textview3 = _view.findViewById(R.id.textview3);
	}
	
	private void initializeLogic() {
	}
	
}