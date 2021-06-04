package kodlamaio.hrms;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class HrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);
	}
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("kodlamaio.hrms"))                                       
          .build();                                           
    }
	
	@Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
	
	@Bean
    public Cloudinary cloudinaryService(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dqwan4kq8",
                "api_key", "574759389525456",
                "api_secret", "ZR7flIhG1u8FaD9UdqmbluIav1E"));
    }

}
