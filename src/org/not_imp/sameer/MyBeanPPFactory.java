package org.not_imp.sameer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

// note that spring also has its own post processor bean factory
public class MyBeanPPFactory implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("woohoo! just called the method for ppbeanfactory... and arg0 is " + arg0.toString());
		
	}

}
