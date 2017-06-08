package net.yuzumone.expandable.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import net.expandable.ExpandableTextView;
import net.expandable.OnExpandableClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExpandableTextView textView = (ExpandableTextView) findViewById(R.id.text);
        textView.setOnExpandableClickListener(new OnExpandableClickListener() {
            @Override
            public void expand(ExpandableTextView expandableTextView) {
                showToast("Expand");
            }

            @Override
            public void collapse(ExpandableTextView expandableTextView) {
                showToast("Collapse");
            }
        });
    }

    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
