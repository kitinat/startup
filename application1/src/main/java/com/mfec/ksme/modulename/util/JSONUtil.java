package com.mfec.ksme.modulename.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Soravit
 */
public class JSONUtil {

	private static JSONUtil instance = null;

	private JSONUtil() {
	}

	public static JSONUtil getInstance() {
		if (instance == null) {
			instance = new JSONUtil();
		}
		return instance;
	}

	public <T> T parseJSONStringToObject(String json, Class<T> cls) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(json, cls);
	}

	public String parseObjectToJSONString(Object obj) {
		String jsonString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonString = mapper.writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonString;
	}

}