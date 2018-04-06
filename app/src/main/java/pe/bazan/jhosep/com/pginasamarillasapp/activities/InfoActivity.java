package pe.bazan.jhosep.com.pginasamarillasapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import pe.bazan.jhosep.com.pginasamarillasapp.R;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String info = "";
        String name = "";
        String address = "";
        String phone = "";
        String category = "";
        String logo = "";



        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            info = extra.getString("info");
            name = extra.getString("name");
            address = extra.getString("address");
            phone = extra.getString("phone");
            category = extra.getString("category");
            logo = extra.getString("logo");


        }

        TextView text1 = findViewById(R.id.infoText);
        text1.setText(info);

        TextView text2 = findViewById(R.id.nameText);
        text2.setText(name);

        TextView text3 = findViewById(R.id.addressText);
        text3.setText(address);

        TextView text4 = findViewById(R.id.phoneText);
        text4.setText(phone);

        TextView text5 = findViewById(R.id.categoryText);
        text5.setText(category);

        ImageView imageView = findViewById(R.id.pictureImage);

        switch (logo){
            case "ic_company1":
                imageView.setImageResource(R.drawable.ic_company1);
                break;
            case "ic_company2":
                imageView.setImageResource(R.drawable.ic_company2);
                break;
            case "ic_company3":
                imageView.setImageResource(R.drawable.ic_company3);
                break;
            case "ic_company4":
                imageView.setImageResource(R.drawable.ic_company4);
                break;
            case "ic_company5":
                imageView.setImageResource(R.drawable.ic_company5);
                break;
            case "ic_company6":
                imageView.setImageResource(R.drawable.ic_company6);
                break;
            case "ic_company7":
                imageView.setImageResource(R.drawable.ic_company7);
                break;
            case "ic_company8":
                imageView.setImageResource(R.drawable.ic_company8);
                break;
            case "ic_company9":
                imageView.setImageResource(R.drawable.ic_company9);
                break;
            case "ic_company0":
                imageView.setImageResource(R.drawable.ic_company0);
                break;

        }

    }
}
