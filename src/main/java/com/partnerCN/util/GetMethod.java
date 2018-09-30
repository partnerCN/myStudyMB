package com.partnerCN.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @Author:YKK_LiaoJJ
 * @Time:2018-08-28(17:12)
 * @Content:
 */
public class GetMethod {

    public String getCurrentDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }

}
