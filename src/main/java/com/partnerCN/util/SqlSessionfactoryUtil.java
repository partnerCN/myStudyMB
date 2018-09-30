package com.partnerCN.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/*
 * @Author:YKK_LiaoJJ
 * @Time:2018-08-28(17:30)
 * @Content:
 */
public class SqlSessionfactoryUtil {

    private static SqlSessionFactory SSF;
    public static SqlSessionFactory getSqlSessionFactory(){
        if(SSF == null){
            InputStream is = null;
            try {
                is = Resources.getResourceAsStream("SqlMapConfig.xml");
                SSF = new SqlSessionFactoryBuilder().build(is);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return SSF;
    }

    public static SqlSession openSession(){
        return getSqlSessionFactory().openSession();
    }
}
