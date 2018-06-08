package jp.aftec.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnCreateContextMenuListener {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_product:
                    mTextMessage.setText(R.string.title_product);
                    return true;
                case R.id.navigation_cart:
                    mTextMessage.setText(R.string.title_cart);
                    return true;
                case R.id.navigation_delivery_status:
                    mTextMessage.setText(R.string.title_delivery_status);
                    return true;
                case R.id.navigation_mypage:
                    mTextMessage.setText(R.string.title_mypage);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //クリック処理
    public void setmOnNavigationItemSelectedListener (View v){
        Intent intent = new Intent(this,cartActivity.class); //画面指定
        startActivity(intent); //画面を開く
    }
}
