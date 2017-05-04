package org.alarm;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class AlarmMessage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		new AlertDialog.Builder(this)
				.setIcon(R.drawable.pic_m)
				.setTitle("����ʱ���ѵ���")
				.setMessage(
						"������������ʱ�䣺"
								+ new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��")
										.format(new Date()))
				.setPositiveButton("�ر�", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						AlarmMessage.this.finish();
					}
				}).show();
	}

}
