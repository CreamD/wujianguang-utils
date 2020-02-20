package com.wujianguang.utils.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.junit.Test;


import com.wujianguang.utils.DistanceUtil;
import com.wujianguang.utils.StreamUtil;

public class DistanceUtilTest {

	@Test
	public void testGetDistance() throws IOException {
		//鐩爣鍧愭爣
		double j=116.425249;//缁忓害
		double w=39.914504;//缁村害
		//璇诲叆鏁版嵁
		List<String> read = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
		for (String str : read) {
			String[] s = str.split(",");
			double d = DistanceUtil.getDistance(j,w,Double.parseDouble(s[2]), Double.parseDouble(s[3]));
			 //保留两位小数
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("目标距离?"+df.format(d)+"米");
		}
		
	}


}
