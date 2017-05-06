package image.duia.com.popo2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_start;
    // 心型气泡
    private PeriscopeLayout periscopeLayout;
    Handler hand = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            periscopeLayout.addHeart();
        }
    };
    int j=200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mymy);
        // 初始化
        periscopeLayout = (PeriscopeLayout) findViewById(R.id.periscope);

        btn_start = (Button) findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                j=200;
                // 调用添加泡泡的方法
                for(int k=0;k<50;k++){
                    hand.sendEmptyMessageDelayed(0x001,j);
                    j+=400;
                    }
            }
        });
    }
}
