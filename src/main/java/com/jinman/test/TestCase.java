package com.jinman.test;

import com.jinman.dao.GoodsMapper;
import com.jinman.entity.Goods;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */

public class TestCase {

    /**
     * 运行逆向工程配置文件
     *
     * @throws Exception
     */
    @Test
    public void testMbg() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("bmg.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    private static SqlSessionFactory ssf = null;

    @BeforeClass
    public static void beforeClass() {
        InputStream is = TestCase.class.getResourceAsStream("/mybatis-config.xml");
        ssf = new SqlSessionFactoryBuilder().build(is);
    }

    /**
     * 测试Mybatis3Simple逆向工程生成的功能
     */
//    @Test
//    public void testMybatis3Simple() {
//        SqlSession session = ssf.openSession();
//        GoodsMapper goodsDao = session.getMapper(GoodsMapper.class);
//        List<Goods> list = goodsDao.selectAll();
//        for (Goods goods : list) {
//            System.out.println(goods.getId());
//        }
//        session.close();
//    }

}