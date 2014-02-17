package com.itso.example;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ITSOJaxrsApplication extends Application {

	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(ITSOJaxrsExample.class);
		return classes;
	}
}
