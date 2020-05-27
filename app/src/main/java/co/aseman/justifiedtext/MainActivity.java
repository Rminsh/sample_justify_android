package co.aseman.justifiedtext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    JustifiedTextView text = findViewById(R.id.sampleText);
    text.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets() , "fonts/Shabnam.ttf"));
  }
}
