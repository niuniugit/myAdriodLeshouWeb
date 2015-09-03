package com.zeng.LeShouAPP.Utils;

import android.text.TextUtils;

public class MobileUtils {
	
	public static boolean isMobileNumber(String mobileNumber){
		String telRegex = "[1][358]\\d{9}";
		if(TextUtils.isEmpty(mobileNumber)){
			return false;
		}else{
			return mobileNumber.matches(telRegex);
		}
	}
}
