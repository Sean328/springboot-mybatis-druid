package com.sean.mybatis;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * Created by sean on 2017/11/20.
 *
 * @author sean
 * @desc
 * @date 2017/11/20 23:03.
 */
public class EffectiveJava {

	public static void main(String[] args) {
		Long sum = 0L;
		int a = LocalTime.now().toSecondOfDay();
		System.out.println(a);
		for(long i =0; i<Integer.MAX_VALUE;i++){
			sum+=i;
		}

		int b = LocalTime.now().toSecondOfDay();
		int c = b-a;

		System.out.println(b);
		System.out.println(c);
		System.out.println(LocalDateTime.now().getNano());


		Instant timestamp = Instant.now();
		System.out.println(timestamp);

	}

	public static void testAll(){
		System.out.println("fuck world");
	}
}
