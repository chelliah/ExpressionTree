package edu.dkim2macalester.stepsequencer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Benas on 2/21/2015.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        final ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(40, 40));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(0, 0, 0, 0);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//0
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//1
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//2
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//3
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//4
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//5
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//6
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//7
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//8
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//9
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//10
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//12
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//13
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//14
            R.drawable.not_selected0, R.drawable.not_selected1,
            R.drawable.not_selected2, R.drawable.not_selected3,
            R.drawable.not_selected4, R.drawable.not_selected5,
            R.drawable.not_selected6, R.drawable.not_selected7,
            R.drawable.not_selected8, R.drawable.not_selected9,
            R.drawable.not_selected10, R.drawable.not_selected11,
            R.drawable.not_selected12, R.drawable.not_selected13,
            R.drawable.not_selected14, R.drawable.not_selected15,//15
    };
}