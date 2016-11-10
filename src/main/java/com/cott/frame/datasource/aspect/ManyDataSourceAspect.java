package com.cott.frame.datasource.aspect;

import java.lang.reflect.Method;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManyDataSourceAspect {
	private static Logger logger = LoggerFactory.getLogger(ManyDataSourceAspect.class);

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void before(JoinPoint point) throws Exception {
		Object target = point.getTarget();

		String methodName = point.getSignature().getName();

		Class[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();
		Class[] clazzs = target.getClass().getInterfaces();
		Class clazz = null;
		if ((clazzs != null) && (clazzs.length > 0)) {
			clazz = clazzs[0];
		}

		if (clazz == null) {
			throw new RuntimeException("not found Class.");
		}

		Method m = clazz.getMethod(methodName, parameterTypes);
		if ((m != null) && (m.isAnnotationPresent(DataSource.class))) {
			DataSource ca = (DataSource) m.getAnnotation(DataSource.class);
			if (StringUtils.isNotBlank(ca.value())) {
				ManyDataSourceSwitch.setDataSourceType(ca.value());
				return;
			}
		}

		m = target.getClass().getMethod(methodName, parameterTypes);
		if ((m != null) && (m.isAnnotationPresent(DataSource.class))) {
			DataSource ca = (DataSource) m.getAnnotation(DataSource.class);
			if (StringUtils.isNotBlank(ca.value())) {
				ManyDataSourceSwitch.setDataSourceType(ca.value());
				return;
			}

		}

		DataSource can = (DataSource) clazz.getAnnotation(DataSource.class);
		if ((can != null) && (StringUtils.isNotBlank(can.value()))) {
			ManyDataSourceSwitch.setDataSourceType(can.value());
			return;
		}
		logger.warn(target.getClass() + "not found DataSource annotation,datasource will use defaultTargetDataSource.");
	}
}
