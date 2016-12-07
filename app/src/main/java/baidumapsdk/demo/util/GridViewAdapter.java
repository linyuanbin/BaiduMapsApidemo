package baidumapsdk.demo.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import baidumapsdk.demo.R;

public class GridViewAdapter extends BaseAdapter {

	private int imgRecouse[];

	private String title[];

	// -------------------

	LayoutInflater inflater;

	Context context;

	public GridViewAdapter(Context context) {

		this.context = context;

		inflater = LayoutInflater.from(context);

		imgRecouse = new int[] { R.drawable.repast, R.drawable.shopping, R.drawable.bank,
				R.drawable.traffic, R.drawable.stay, R.drawable.life, R.drawable.entertainment,
				R.drawable.pub, R.drawable.car_service,R.drawable.government };

		title = new String[] { "餐饮", "购物", "银行", "交通", "住宿", "生活",
				"娱乐休闲", "公共设施","汽车服务","政府机关" };
	}

	public int getCount() {

		return imgRecouse.length;
	}

	public Object getItem(int position) {
		
		return imgRecouse[position];
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View currentView, ViewGroup arg2) {

		currentView = inflater.inflate(R.layout.imagebutton, null);

		ImageView imageView = (ImageView) currentView
				.findViewById(R.id.imgbtn_img);
		TextView textView = (TextView) currentView
				.findViewById(R.id.imgbtn_text);

		imageView.setBackgroundResource(imgRecouse[position]);
		textView.setText(title[position]);

		return currentView;
	}

}
