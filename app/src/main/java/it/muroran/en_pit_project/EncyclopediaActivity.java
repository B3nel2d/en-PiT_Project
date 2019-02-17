package it.muroran.en_pit_project;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Gravity;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import org.w3c.dom.Text;

public class EncyclopediaActivity extends AppCompatActivity{

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encyclopedia);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_encyclopedia, menu);
        return true;
    }

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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_encyclopedia, container, false);

            int imageViews[] = {
                R.id.imageView1,
                R.id.imageView2,
                R.id.imageView3,
                R.id.imageView4
            };

            int textViews[] = {
                R.id.textView1,
                R.id.textView2,
                R.id.textView3,
                R.id.textView4
            };

            int resource_id = 0;
            String text = "";

            for(int index = 0; index < imageViews.length; index++){
                if(AppManager.getInstance().fishes.get(index).isCaptured()){
                    resource_id = AppManager.getInstance().fishes.get(index).getImageId();
                    text = AppManager.getInstance().fishes.get(index).getName();
                }
                else{
                    resource_id = R.drawable.sakana_fish_27220;
                    text = "？？？？？";
                }

                ((ImageView)rootView.findViewById(imageViews[index])).setImageResource(resource_id);
                ((TextView)rootView.findViewById(textViews[index])).setText(text);
            }

            return rootView;
        }

        @Override
        public void onStart(){
            super.onStart();
        }

        @Override
        public void onResume(){
            super.onResume();
        }

        public void setViewContent(int id, String text){
            //((TextView)rootView.findViewById(id)).setText(text);
        }
        public void setViewContent(int view_id, int image_id){
            //((ImageView)rootView.findViewById(view_id)).setImageResource(image_id);
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // ページ数を変更
            return 2;
        }
    }

    public void onButtonTapped(View view) {
        if(view == null){
            return;
        }

        Fish content = null;
        int imageId = 0;
        switch(view.getId()){
            case R.id.imageView1:
                content = AppManager.getInstance().fishes.get(0);
                imageId = R.drawable.stoneflounder;
                break;
            case R.id.imageView2:
                content = AppManager.getInstance().fishes.get(1);
                imageId = R.drawable.searaven;
                break;
            case R.id.imageView3:
                content = AppManager.getInstance().fishes.get(2);
                imageId = R.drawable.alaskapollock;
                break;
            case R.id.imageView4:
                content = AppManager.getInstance().fishes.get(3);
                imageId = R.drawable.redkingcrab;
                break;
        }

        if(content != null && content.isCaptured()){
            setContentView(R.layout.content1);

            TextView contentName = findViewById(R.id.contentName);
            ImageView contentImage = findViewById(R.id.contentImage);
            TextView contentFamily = findViewById(R.id.contentFamily);
            TextView contentSize = findViewById(R.id.contentSize);
            TextView contentDescription = findViewById(R.id.contentDescription);

            contentName.setText(content.getName());
            contentImage.setImageResource(imageId);
            contentFamily.setText(content.getFamily());
            contentSize.setText(content.getSize());
            contentDescription.setText(content.getDescription());
        }
    }

}
