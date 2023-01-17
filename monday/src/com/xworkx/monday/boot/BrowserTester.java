package com.xworkx.monday.boot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkx.monday.browse.Browser;
import com.xworkx.monday.browse.Provider;
import com.xworkx.monday.configuration.BrowserConfiguration;

public class BrowserTester {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		
	  Browser refOfBrowser = spring.getBean(Browser.class);
	  refOfBrowser.browse();
	  
	}

}
