package monument;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import monument.resource.v1.PyxResource;

public class MonumentApplication extends Application<MonumentConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MonumentApplication().run(args);
    }

    @Override
    public String getName() {
        return "Monument: The replacement of all imaging systems!";
    }

    @Override
    public void initialize(final Bootstrap<MonumentConfiguration> bootstrap) {
    	bootstrap.addBundle(new SwaggerBundle<MonumentConfiguration>() {
			@Override
			protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(MonumentConfiguration configuration) {
				 return configuration.swaggerBundleConfiguration;
			}
    	});
    }

    @Override
    public void run(final MonumentConfiguration configuration,
                    final Environment environment) {
    	
    	DateFormat monumentDateFormat = new SimpleDateFormat(configuration.getDateFormat());
    	environment.getObjectMapper().setDateFormat(monumentDateFormat);
    	
    	PyxResource pyxResource = new PyxResource();
    	environment.jersey().register(pyxResource);
    }
}
