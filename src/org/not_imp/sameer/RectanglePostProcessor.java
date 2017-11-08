package org.not_imp.sameer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;

public class RectanglePostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("rectangle")){
			//we will inject the diagonal Object
			ApplicationContext context = ((Rectangle)bean).getContext();
			Diagonal diagonalObj = (Diagonal)context.getBean("diagonal");
			((Rectangle)bean).setDiagonal(diagonalObj);
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("rectangle")){
			
		}
		return bean;
	}

}
