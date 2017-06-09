package com.infinitysports.designwithmenu;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.exceptions.CleverTapMetaDataNotFoundException;
import com.clevertap.android.sdk.exceptions.CleverTapPermissionsNotSatisfied;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        CleverTapAPI cleverTap;
        try {
            cleverTap = CleverTapAPI.getInstance(getApplicationContext());
        } catch (CleverTapMetaDataNotFoundException e) {
            // thrown if you haven't specified your CleverTap Account ID or Token in your AndroidManifest.xml
        } catch (CleverTapPermissionsNotSatisfied e) {
            // thrown if you haven’t requested the required permissions in your AndroidManifest.xml
        }


        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));






        //Intents for News Button + Textview

        TextView news_textview = (TextView) findViewById(R.id.tv_news_title);
        ImageViewPefectSquare news_imageview = (ImageViewPefectSquare) findViewById(R.id.button_news);

        news_textview.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, News.class);
                startActivity(intent);
            }
        });

        news_imageview.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, News.class);
                startActivity(intent);
            }
        });




        //Intents for Commentary Button + Textview

        TextView commentary_textview = (TextView) findViewById(R.id.tv_commentary_title);
        ImageViewPefectSquare commentary_imageview = (ImageViewPefectSquare) findViewById(R.id.button_commentary);

        commentary_textview.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Commentary.class);
                startActivity(intent);
            }
        });

        commentary_imageview.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Commentary.class);
                startActivity(intent);
            }
        });





        //Intents for fixtures Button + Textview

        TextView fixtures_textview = (TextView) findViewById(R.id.tv_fixtures_title);
        ImageViewPefectSquare fixtures_imageview = (ImageViewPefectSquare) findViewById(R.id.button_fixtures);

        fixtures_textview.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Fixtures.class);
                startActivity(intent);
            }
        });

        fixtures_imageview.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Fixtures.class);
                startActivity(intent);
            }
        });








        //Intents for Live Button + Textview

        TextView live_videos_textview = (TextView) findViewById(R.id.tv_live_title);
        ImageViewPefectSquare live_videos_imageview = (ImageViewPefectSquare) findViewById(R.id.button_live);

        live_videos_textview.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Live_videos.class);
                startActivity(intent);
            }
        });

        live_videos_imageview.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Live_videos.class);
                startActivity(intent);
            }
        });











        //Intents for About_Club Button + Textview

        TextView chants_textview = (TextView) findViewById(R.id.tv_about_club_title);
        ImageViewPefectSquare about_club_imageview = (ImageViewPefectSquare) findViewById(R.id.button_about_club);


        chants_textview.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, About_club.class);
                startActivity(intent);
            }
        });

        about_club_imageview.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, About_club.class);
                startActivity(intent);
            }
        });



/*

        //Setting Font
        TextView tx = (TextView)findViewById(R.id.live_videos1);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/font.ttf");
        tx.setTypeface(typeface);
*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

/*
        Settings menu : Right top corner of Toolbar

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_check_update) {
            Toast.makeText(this, "Add check Update Code here", Toast.LENGTH_LONG).show();

            // Handle the camera action
        } else if (id == R.id.nav_share) {
            Toast.makeText(this, "Add share app code here", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_help) {
            Intent intent = new Intent(MainActivity.this, Help.class);
            startActivity(intent);

        } else if (id == R.id.nav_about_us) {
            Intent intent = new Intent(MainActivity.this, About_us.class);
            startActivity(intent);

        } else if (id == R.id.nav_rate) {
            Toast.makeText(this, "Add rate code here", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_pp) {
            Intent intent = new Intent(MainActivity.this, Privacy_policy.class);
            startActivity(intent);

        } else if (id == R.id.nav_tnc) {
            Intent intent = new Intent(MainActivity.this, Terms_and_conditions.class);
            startActivity(intent);

        } else if (id == R.id.nav_app_version) {
            Toast.makeText(this, "Add App version code here", Toast.LENGTH_LONG).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return super.onOptionsItemSelected(item);
    }




    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch (pos) {

                case 0:
                    return FirstFragment.newInstance(getResources().getString(R.string.heading_1));
                case 1:
                    return SecondFragment.newInstance(getResources().getString(R.string.heading_2));
                case 2:
                    return ThirdFragment.newInstance(getResources().getString(R.string.heading_3));
                default:
                    return ThirdFragment.newInstance(getResources().getString(R.string.heading_1));
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }



}
