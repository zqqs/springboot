package com.qing.zhang;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * @Description:
 * @author: qing.zhang
 * @date: 2016/11/28 14:47
 */
public class TestDateUtils {

    public static void main(String[] args) {
        Date date = DateUtils.addMinutes(new Date(), -48);
        System.out.println(date);
        date = DateUtils.addHours(new Date(),-48);
        System.out.println(date);

    }
}
