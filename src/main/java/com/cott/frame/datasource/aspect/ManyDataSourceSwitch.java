package com.cott.frame.datasource.aspect;

public class ManyDataSourceSwitch {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static final ThreadLocal<String> contextHolder = new ThreadLocal();

	public static void setDataSourceType(String dataSourceType) {
		contextHolder.set(dataSourceType);
	}

	public static String getDataSourceType() {
		return ((String) contextHolder.get());
	}

	public static void clearDataSourceType() {
		contextHolder.remove();
	}
}