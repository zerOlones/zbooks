package com.test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Generator {

    public static void main(String[] args) {
        List<String> warnings = new ArrayList<String>();
        try {
//		导入配置表generator-config.xml
            File configFile = new File("src/main/resources/generator-config.xml");
//		解析
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
//		是否覆盖
            DefaultShellCallback dsc = new DefaultShellCallback(true);
            MyBatisGenerator mg = new MyBatisGenerator(config, dsc, warnings);
            mg.generate(null);
            System.out.println("创建成功!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("创建失败!");
        }
    }

}
