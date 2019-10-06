package com.hq.training.exception;

/**
 * feign 异常自定义捕获
 */
public class FeignExceptionConfiguration {
	/*
	 * 
	 * @Bean public ErrorDecoder errorDecoder() { return new UserErrorDecoder();
	 * }
	 * 
	 * public class UserErrorDecoder implements ErrorDecoder {
	 * 
	 * public Exception decode(String methodKey, Response response) { Exception
	 * exception = null; ObjectMapper mapper = new ObjectMapper();
	 * 
	 * //空属性处理
	 * mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);
	 * 
	 * //设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
	 * mapper.configure(DeserializationConfig.Feature.
	 * FAIL_ON_UNKNOWN_PROPERTIES, false);
	 * 
	 * //禁止使用int代表enum的order来反序列化enum
	 * mapper.configure(DeserializationConfig.Feature.FAIL_ON_NUMBERS_FOR_ENUMS,
	 * true); try { String json = Util.toString(response.body().asReader());
	 * exception = new RuntimeException(json); if (StringUtils.isEmpty(json)) {
	 * return null; } FeignFaildResult result = mapper.readValue(json,
	 * FeignFaildResult.class); // 业务异常包装成自定义异常类MyException if
	 * (result.getStatus() != HttpStatus.OK.value()) { exception = new
	 * MyException(result.getMessage(),result.getStatus()); } } catch
	 * (IOException ex) { log.error(ex.getMessage(), ex); } return exception; }
	 * 
	 * }
	 */}
