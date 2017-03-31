package monument;

import io.dropwizard.Configuration;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class MonumentConfiguration extends Configuration {
	@NotEmpty
	private String dateFormat;

	@JsonProperty("swagger")
	public SwaggerBundleConfiguration swaggerBundleConfiguration;
	
	public String getDateFormat() {
		return dateFormat;
	}
	
}
