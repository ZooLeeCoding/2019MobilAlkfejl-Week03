package hu.szte.mobilalk.maf_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "hu.szte.mobilalk.maf_02.REPLY";

    private TextView displayView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent starterIntent = getIntent();
        String message = starterIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        this.displayView = findViewById(R.id.displayView);
        this.displayView.setText(message);
    }

    public void back(View view) {
        String reply = "I'm back!";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
