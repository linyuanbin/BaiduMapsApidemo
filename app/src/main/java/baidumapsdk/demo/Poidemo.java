package baidumapsdk.demo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import baidumapsdk.demo.util.GridViewAdapter;

public class Poidemo extends Activity {

	private GridView gridView;
	private GridViewAdapter adapter;
	private String choice = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_poidemo);
		gridView = (GridView) findViewById(R.id.gridview);
		adapter = new GridViewAdapter(Poidemo.this);
		gridView.setAdapter(adapter);
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View view,
					int position, long arg3) {
				switch (position) {
				case 0:
					cateringDialog();
					break;
				case 1:
					shoppingDialog();
					break;
				case 2:
					bankDialog();
					break;
				case 3:
					trafficDialog();
					break;
				case 4:
					stayDialog();
					break;
				case 5:
					liveDialog();
					break;
				case 6:
					entertainmentDialog();
					break;
				case 7:
					pubFacilitiesDilog();
					break;
				case 8:
					carServiceDialog();
					break;
				case 9:
					governmentDialog();
					break;
				}
			}
		});
	}

	private void cateringDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(Poidemo.this);
		builder.setTitle("查询");
		builder.setSingleChoiceItems(new String[] { "餐厅", "中餐厅", "快餐厅", "咖啡厅",
				"蛋糕房", "肯德基", "麦当劳", "必胜客", "自助餐" }, -1,
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
						case 0:
							choice = "餐厅";
							break;
						case 1:
							choice = "中餐厅";
							break;
						case 2:
							choice = "快餐厅";
							break;
						case 3:
							choice = "咖啡厅";
							break;
						case 4:
							choice = "蛋糕房";
							break;
						case 5:
							choice = "肯德基";
							break;
						case 6:
							choice = "麦当劳";
							break;
						case 7:
							choice = "必胜客";
							break;
						case 8:
							choice = "自助餐";
							break;
						}
					}
				});
		builder.setPositiveButton("搜索", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				System.out.println(choice);
				startMyActivity(choice);
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	private void shoppingDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(Poidemo.this);
		builder.setTitle("查询");
		builder.setSingleChoiceItems(new String[] { "商场", "超市", "书店", "市场" },
				-1, new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {

						switch (which) {
						case 0:
							choice = "商场";
							break;
						case 1:
							choice = "超市";
							break;
						case 2:
							choice = "书店";
							break;
						case 3:
							choice = "市场";
							break;
						}
					}
				});
		builder.setPositiveButton("搜索", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				System.out.println(choice);
				startMyActivity(choice);
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	private void bankDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(Poidemo.this);
		builder.setTitle("查询");
		builder.setSingleChoiceItems(new String[] { "银行", "ATM", "招商银行",
				"工商银行", "中国银行", "建设银行", "农业银行", "交通银行", "邮政储蓄" }, -1,
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
						case 0:
							choice = "银行";
							break;
						case 1:
							choice = "ATM";
							break;
						case 2:
							choice = "招商银行";
							break;
						case 3:
							choice = "工商银行";
							break;
						case 4:
							choice = "中国银行";
							break;
						case 5:
							choice = "建设银行";
							break;
						case 6:
							choice = "农业银行";
							break;
						case 7:
							choice = "交通银行";
							break;
						case 8:
							choice = "邮政储蓄";
							break;
						}
					}
				});
		builder.setPositiveButton("搜索", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				System.out.println(choice);
				startMyActivity(choice);
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	private void trafficDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(Poidemo.this);
		builder.setTitle("查询");
		builder.setSingleChoiceItems(new String[] { "机场", "火车站", "公交站", "停车场",
				"轻轨站", "地铁站", "长途汽车站", "火车票代售点", "飞机票代售点" }, -1,
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
						case 0:
							choice = "机场";
							break;
						case 1:
							choice = "火车站";
							break;
						case 2:
							choice = "公交站";
							break;
						case 3:
							choice = "停车场";
							break;
						case 4:
							choice = "轻轨站";
							break;
						case 5:
							choice = "地铁站";
							break;
						case 6:
							choice = "长途汽车站";
							break;
						case 7:
							choice = "火车票代售点";
							break;
						case 8:
							choice = "飞机票代售点";
						}
					}
				});
		builder.setPositiveButton("搜索", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				System.out.println(choice);
				startMyActivity(choice);
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	private void stayDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(Poidemo.this);
		builder.setTitle("查询");
		builder.setSingleChoiceItems(new String[] { "饭店", "酒店", "宾馆", "旅馆" },
				-1, new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
						case 0:
							choice = "饭店";
							break;
						case 1:
							choice = "酒店";
							break;
						case 2:
							choice = "宾馆";
							break;
						case 3:
							choice = "旅馆";
						}
					}
				});
		builder.setPositiveButton("搜索", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				System.out.println(choice);
				startMyActivity(choice);
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	private void liveDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(Poidemo.this);
		builder.setTitle("查询");
		builder.setSingleChoiceItems(new String[] { "学校", "邮局", "药店", "医院",
				"图书馆", "移动营业厅", "联通营业厅", "电信营业厅", "美容美发", "摄影冲印" }, -1,
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
						case 0:
							choice = "学校";
							break;
						case 1:
							choice = "邮局";
							break;
						case 2:
							choice = "药店";
						case 3:
							choice = "医院";
							break;
						case 4:
							choice = "图书馆";
							break;
						case 5:
							choice = "移动营业厅";
							break;
						case 6:
							choice = "联通营业厅";
							break;
						case 7:
							choice = "电信营业厅";
							break;
						case 8:
							choice = "美容美发";
							break;
						case 9:
							choice = "摄影冲印";
						}
					}
				});
		builder.setPositiveButton("搜索", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				System.out.println(choice);
				startMyActivity(choice);
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	private void entertainmentDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(Poidemo.this);
		builder.setTitle("查询");
		builder.setSingleChoiceItems(new String[] { "电影院", "KTV", "洗浴", "网吧",
				"台球厅", "酒吧", "茶馆", "景点" }, -1,
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
						case 0:
							choice = "电影院";
							break;
						case 1:
							choice = "KTV";
							break;
						case 2:
							choice = "洗浴";
							break;
						case 3:
							choice = "网吧";
							break;
						case 4:
							choice = "台球厅";
							break;
						case 5:
							choice = "酒吧";
							break;
						case 6:
							choice = "茶馆";
							break;
						case 7:
							choice = "景点";
						}
					}
				});
		builder.setPositiveButton("搜索", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				System.out.println(choice);
				startMyActivity(choice);
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	private void pubFacilitiesDilog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(Poidemo.this);
		builder.setTitle("查询");
		builder.setSingleChoiceItems(new String[] { "公厕", "公园", "公交站", "轻轨站",
				"地铁站" }, -1, new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				switch (which) {
				case 0:
					choice = "公厕";
					break;
				case 1:
					choice = "公园";
					break;
				case 2:
					choice = "公交站";
					break;
				case 3:
					choice = "轻轨站";
					break;
				case 4:
					choice = "地铁站";
				}
			}
		});
		builder.setPositiveButton("搜索", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				System.out.println(choice);
				startMyActivity(choice);
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	private void carServiceDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(Poidemo.this);
		builder.setTitle("查询");
		builder.setSingleChoiceItems(new String[] { "加油站", "停车场", "汽车维修",
				"汽车服务" }, -1, new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				switch (which) {
				case 0:
					choice = "加油站";
					break;
				case 1:
					choice = "停车场";
					break;
				case 2:
					choice = "汽车维修";
					break;
				case 3:
					choice = "汽车服务";
				}
			}
		});
		builder.setPositiveButton("搜索", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				System.out.println(choice);
				startMyActivity(choice);
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	private void governmentDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(Poidemo.this);
		builder.setTitle("查询");
		builder.setSingleChoiceItems(new String[] { "市政府", "公安局", "消防局", "街道办",
				"法院" }, -1, new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				switch (which) {
				case 0:
					choice = "市政府";
					break;
				case 1:
					choice = "公安局";
					break;
				case 2:
					choice = "消防局";
					break;
				case 3:
					choice = "街道办";
					break;
				case 4:
					choice = "法院";
				}
			}
		});
		builder.setPositiveButton("搜索", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				startMyActivity(choice);
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	private void startMyActivity(String choice) {
		Intent intent = new Intent(Poidemo.this, Poisearch.class);
		intent.putExtra("choice", choice);
		startActivity(intent);
	}

}
