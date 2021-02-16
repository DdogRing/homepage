package com.ddogring.homepage.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DdogRing
 * @date 2021/1/6 09:19
 * @description mybatis逆向工程启动类
 */
public class GeneratorRunClass {
    public static void main(String[] args) {
        try {
            GeneratorRunClass generatorRunClass = new GeneratorRunClass();
            generatorRunClass.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void generator() throws Exception{

            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            String file = Thread.currentThread().getContextClassLoader().getResource("").getPath();
            File configFile = new File(file+"GeneratorMapper.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
    }
}
