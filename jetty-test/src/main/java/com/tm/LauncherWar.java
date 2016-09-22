package com.tm;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class LauncherWar {
    public static void main(String[] args) {
        Server server = new Server(8000);
        WebAppContext webAppContext = new WebAppContext();
        // method1:设置路径
        webAppContext.setDescriptor("D:\\workspace\\gome-search-basicdata2\\target\\gome-search-basicdata-1.0.0\\WEB-INF\\web.xml");
        webAppContext.setResourceBase("D:\\workspace\\gome-search-basicdata2\\target\\gome-search-basicdata-1.0.0");

        // method2:设置war
        // webAppContext.setWar("D:\\workspace\\gome-search-basicdata2\\target\\gome-search-basicdata-1.0.0.war");

        webAppContext.setContextPath("/jetty");
        server.setHandler(webAppContext);

        try {
            server.start();
            server.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
