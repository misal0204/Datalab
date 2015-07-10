package molino_moderno.es.datalab.adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import molinos_modernos.es.datalab.R;

/**
 * Created by Misael on 22/06/2015.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public ImageAdapter(Context c)
    {
        mContext=c;
    }

    @Override
    public int getCount() {
        return  mIconos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageview;
        if(convertView == null)
        {
            imageview = new ImageView(mContext);
            imageview.setLayoutParams(new GridView.LayoutParams(500,500));
            imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageview.setPadding(8,8,8,8);
        }
        else
        {
            imageview=(ImageView) convertView;
        }

        imageview.setImageResource(mIconos[position]);
        return imageview;
    }

    private Integer[] mIconos={
            R.drawable.dl_dl,
            R.drawable.admon_dl,
            R.drawable.inter_dl,
            R.drawable.nc_dl,
            R.drawable.dinamo_dl
    };
}
