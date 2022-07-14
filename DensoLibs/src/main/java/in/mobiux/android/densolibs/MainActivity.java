package in.mobiux.android.densolibs;

import android.os.Bundle;
import android.widget.TextView;

import in.mobiux.android.commonlibs.activity.AppActivity;
import in.mobiux.android.densolibs.core.DensoBaseActivity;

//public class MainActivity extends AppActivity {
public class MainActivity extends DensoBaseActivity {
    private static final String TAG = "MainActivity";

    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = findViewById(R.id.tvMessage);
        tvMessage.setText("This is Denso Libs Activity");
    }

    @Override
    public void onBarcodeScan(String barcode) {
//        super.onBarcodeScan(barcode);

        tvMessage.setText("" + barcode);
    }
}