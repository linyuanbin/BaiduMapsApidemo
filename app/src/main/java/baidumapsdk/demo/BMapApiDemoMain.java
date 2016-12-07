package baidumapsdk.demo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import baidumapsdk.demo.view.CircleLayout;
import baidumapsdk.demo.view.CircleLayout.OnItemSelectedListener;
import com.baidu.mapapi.SDKInitializer;

public class BMapApiDemoMain extends Activity implements
		baidumapsdk.demo.view.CircleLayout.OnItemClickListener,
		OnItemSelectedListener {

	/**
	 * 构造广播监听类，监听 SDK key 验证以及网络异常广播
	 */
	public class SDKReceiver extends BroadcastReceiver {
		public void onReceive(Context context, Intent intent) {
			String s = intent.getAction();
			if (s.equals(SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR)) {
				//Toast.makeText(getApplicationContext(), R.string.key_error, Toast.LENGTH_LONG).show();
			} else if (s
					.equals(SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR)) {
				Toast.makeText(getApplicationContext(), "网络出错！", Toast.LENGTH_LONG).show();
			}
		}
	}

	private SDKReceiver mReceiver;
	private CircleLayout circleLayout;
	private TextView selectedTextView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);

		circleLayout = (CircleLayout) findViewById(R.id.main_circle_layout);
		circleLayout.setOnItemClickListener(this);
		circleLayout.setOnItemSelectedListener(this);

		selectedTextView = (TextView) findViewById(R.id.main_selected_textView);

		// 注册 SDK 广播监听者
		IntentFilter iFilter = new IntentFilter();
		iFilter.addAction(SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR);
		iFilter.addAction(SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR);
		mReceiver = new SDKReceiver();
		registerReceiver(mReceiver, iFilter);
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		// 取消监听 SDK 广播
		unregisterReceiver(mReceiver);
	}

	@Override
	public void onItemSelected(View view, int position, long id, String name) {
		Animation zoomin = AnimationUtils.loadAnimation(
				getApplicationContext(), R.anim.zoom_in);

		switch (position) {

		// 定位功能
		case 0:
			selectedTextView.setText(R.string.location);
			selectedTextView.startAnimation(zoomin);

			break;

		case 1:
			selectedTextView.setText(R.string.about);
			selectedTextView.startAnimation(zoomin);
			break;

		case 2:
			selectedTextView.setText(R.string.nearby_search);
			selectedTextView.startAnimation(zoomin);
			break;

		case 3:
			selectedTextView.setText(R.string.offline_map);
			selectedTextView.startAnimation(zoomin);
			break;

		case 4:
			selectedTextView.setText(R.string.route_plan);
			selectedTextView.startAnimation(zoomin);
			break;
		}
	}

	@Override
	public void onItemClick(View view, int position, long id, String name) {
		Intent intent;
		switch (position) {
		// 定位功能
		case 0:
			intent = new Intent(BMapApiDemoMain.this, Location.class);
			startActivity(intent);
			break;

		case 1:
			View view2 = LayoutInflater.from(BMapApiDemoMain.this).inflate(
					R.layout.about, null);
			new AlertDialog.Builder(BMapApiDemoMain.this)
					.setTitle(R.string.about).setView(view2).create().show();
			break;

		case 2:
			intent = new Intent(BMapApiDemoMain.this, Poidemo.class);
			startActivity(intent);
			break;

		// 离线地图
		case 3:
			intent = new Intent(BMapApiDemoMain.this, OfflineDemo.class);
			startActivity(intent);
			break;

		case 4:
			// 路径规划
			intent = new Intent(BMapApiDemoMain.this, RoutePlanDemo.class);
			startActivity(intent);
			break;
		}
	}
}