package com.example.gestion_onglets.ui.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.gestion_onglets.R;

import java.util.Locale;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0:
                return SeasonsFragment.newInstance(0,"Seasons",R.drawable.winter,R.drawable.s,R.drawable.s1,R.drawable.a);
            case 1:
                return NatureFragment.newInstance(1, "Winter",R.drawable.winter);
            case 2:
                return NatureFragment.newInstance(2, "Spring",R.drawable.s);
            case 3:
                return NatureFragment.newInstance(3,"Summer",R.drawable.s1);
            case 4:
                return NatureFragment.newInstance(4, "Autumn",R.drawable.a);
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        String titre="";
        Drawable icone=null;
        switch (position) {
            case 0:
                titre = "Seasons".toUpperCase(l);
                icone = mContext.getResources().getDrawable(R.drawable.ic_baseline_flare_24);
                break;
            case 1:
                titre = "Winter".toUpperCase(l);
                icone = mContext.getResources().getDrawable(R.drawable.ic_baseline_flare_24);
                break;
            case 2:
                titre = "Spring".toUpperCase(l);
                icone = mContext.getResources().getDrawable(R.drawable.ic_baseline_flare_24);
                break;
            case 3:
                titre = "Summer".toUpperCase(l);
                icone = mContext.getResources().getDrawable(R.drawable.ic_baseline_flare_24);
                break;
            case 4:
                titre = "Autumn".toUpperCase(l);
                icone = mContext.getResources().getDrawable(R.drawable.ic_baseline_flare_24);

            break;
        }
        SpannableString sb = new SpannableString(" " + titre);
        // un espace est ajouté pour séparer le texte de l'image

        icone.setBounds(0, 0, icone.getIntrinsicWidth(), icone.getIntrinsicHeight());
        ImageSpan span = new ImageSpan(icone, ImageSpan.ALIGN_BASELINE);
        sb.setSpan(span, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;

    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 5;
    }
}