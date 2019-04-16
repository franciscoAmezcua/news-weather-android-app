package com.franciscoamezcua.assignment7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.franciscoamezcua.assignment7.Adapter.FeedAdapter;
import com.franciscoamezcua.assignment7.Interface.ItemClickListener;
import com.franciscoamezcua.assignment7.MainActivity;
import com.franciscoamezcua.assignment7.Model.Feed;
import com.franciscoamezcua.assignment7.Model.RSSObject;
import com.franciscoamezcua.assignment7.R;

import org.w3c.dom.Text;

/**
 * Created by famezcua
 */



public class DisplayMessageActivity extends AppCompatActivity {

    TextView titleTxt, dateTxt, contentTxt, linkTxt;
    private ItemClickListener itemClickListener;
    private Context mContext;
    private  RSSObject rssObject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        titleTxt = (TextView) findViewById(R.id.txtTitleActivity2);
        dateTxt = (TextView) findViewById(R.id.txtPubDateActivity2);
        contentTxt = (TextView) findViewById(R.id.txtContentActivity2);
        linkTxt = (TextView) findViewById(R.id.linkA);

        Intent i = this.getIntent();
        String title = i.getExtras().getString("TITLE_KEY");
        String date = i.getExtras().getString("DATE_KEY");
        String content = i.getExtras().getString("CONTENT_KEY");
        final String linkText = i.getExtras().getString("LINK_KEY");


        titleTxt.setText(title);
        dateTxt.setText(date);
        contentTxt.setText(content);
        linkTxt.setText(linkText);

        titleTxt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Uri linkParse = Uri.parse(linkText);
                Intent goToBrowser = new Intent(Intent.ACTION_VIEW,linkParse);
                startActivity(goToBrowser);
            }
        });

        dateTxt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Uri linkParse = Uri.parse(linkText);
                Intent goToBrowser = new Intent(Intent.ACTION_VIEW,linkParse);
                startActivity(goToBrowser);
            }
        });

        contentTxt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Uri linkParse = Uri.parse(linkText);
                Intent goToBrowser = new Intent(Intent.ACTION_VIEW,linkParse);
                startActivity(goToBrowser);
            }
        });

        linkTxt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Uri linkParse = Uri.parse(linkText);
                Intent goToBrowser = new Intent(Intent.ACTION_VIEW,linkParse);
                startActivity(goToBrowser);
            }
        });

    }


}
