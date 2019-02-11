package com.ffrowies.horizontalmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.darwindeveloper.horizontalscrollmenulibrary.custom_views.HorizontalScrollMenuView;
import com.darwindeveloper.horizontalscrollmenulibrary.extras.MenuItem;

public class MainActivity extends AppCompatActivity {

    HorizontalScrollMenuView menu;
    TextView txvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (HorizontalScrollMenuView) findViewById(R.id.menu);
        txvText = (TextView) findViewById(R.id.txvText);

        //Create menu
        initMenu();
    }

    private void initMenu() {
        menu.addItem("Transaction", R.drawable.ic_money);
        menu.addItem("Payment", R.drawable.ic_payment);
        menu.addItem("Account", R.drawable.ic_acc);
        menu.addItem("Support", R.drawable.ic_note_add);
        menu.addItem("Call", R.drawable.ic_phone);
        menu.addItem("Check", R.drawable.ic_check);

        menu.setOnHSMenuClickListener(new HorizontalScrollMenuView.OnHSMenuClickListener() {
            @Override
            public void onHSMClick(MenuItem menuItem, int position) {
                Toast.makeText(MainActivity.this, ""+menuItem.getText(), Toast.LENGTH_SHORT).show();
                txvText.setText(menuItem.getText());
            }
        });
    }
}
