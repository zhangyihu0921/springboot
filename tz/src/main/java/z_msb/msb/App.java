package z_msb.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//这个是springboot2.0.1版本的包
/*import org.springframework.boot.autoconfigure.http.HttpMessageConverters;*/
//这个是springboot1.5版本的包
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
/**
 * 将springboot自带的JSON换成fastjson 第一种方法
 * @return
 */
/*public class App  extends  WebMvcConfigurerAdapter
{
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		super.configureMessageConverters(converters);
		FastJsonHttpMessageConverter  fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig   fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
		converters.add(fastJsonHttpMessageConverter);
	}*/
	/**
	 * 将springboot自带的JSON换成fastjson 第二种方法
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		
		FastJsonHttpMessageConverter  fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig   fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;
		return new HttpMessageConverters(converter);
	}

	public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
