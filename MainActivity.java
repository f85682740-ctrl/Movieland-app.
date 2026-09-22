package com.example.freemovieapp;
import android.app.*; import android.os.*; import android.graphics.Color; import android.view.*; import android.widget.*;
public class MainActivity extends Activity {
  LinearLayout box;
  public void onCreate(Bundle b){super.onCreate(b); showHome();}
  TextView t(String s,int z){TextView v=new TextView(this);v.setText(s);v.setTextSize(z);v.setTextColor(Color.WHITE);v.setPadding(20,16,20,16);return v;}
  void showHome(){
    ScrollView sv=new ScrollView(this); box=new LinearLayout(this); box.setOrientation(LinearLayout.VERTICAL); box.setPadding(18,24,18,24); box.setBackgroundColor(Color.rgb(16,18,16));
    TextView title=t("FREE MOVIE APP",28); box.addView(title);
    TextView sub=t("New releases • Search • Favorites",15); box.addView(sub);
    EditText search=new EditText(this); search.setHint("Search movies"); search.setTextColor(Color.WHITE); search.setHintTextColor(Color.GRAY); box.addView(search);
    String[] cards={"New Releases","Action","Comedy","Drama","Animation","Popular Movies"};
    for(String c:cards){TextView v=t(c+"\nBrowse movies and legal viewing sources",20);v.setBackgroundColor(Color.rgb(35,38,35));LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,120);p.setMargins(0,10,0,0);box.addView(v,p);}
    TextView note=t("\nThis starter app is ready for a legal movie API.\nIt does not bypass subscriptions or distribute copyrighted movie files.",14);box.addView(note);
    sv.addView(box);setContentView(sv);
  }
}
