package top.wefor.goneview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayoutCompat mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout = (LinearLayoutCompat) findViewById(R.id.linearLayout);
        setChildClickListener();
    }

    private void setChildClickListener() {
        for (int i = 0; i < mLinearLayout.getChildCount(); i++) {
            final int index = i;
            mLinearLayout.getChildAt(index).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AppCompatTextView textView = (AppCompatTextView) view;
                    switch (index) {
                        case 0:
                            textView.setVisibility(View.GONE);
                            break;
                        case 1:
                            textView.setVisibility(View.INVISIBLE);
                            break;
                        case 2:
                            textView.setAlpha(0);
                            break;
                        case 3:
                            textView.setTextColor(0x00123456);
                            break;
                        case 4:
                            textView.setText("");
                            break;
                        case 5:
                            textView.animate().alpha(0);
                            break;
                        case 6:
                            textView.animate().x(3000);
                            break;
                        case 7:
                            textView.animate().scaleX(0);
                            break;
                        case 8:
                            ((ViewGroup) textView.getParent()).removeView(textView);
                            break;
                        case 9:
                            textView.setBackgroundColor(0xff000000);
                            break;
                        default:
                            Toast.makeText(MainActivity.this, "Unexpected index！", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });
        }
    }


}
