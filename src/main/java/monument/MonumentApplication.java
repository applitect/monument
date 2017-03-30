package monument;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MonumentApplication extends Application<MonumentConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MonumentApplication().run(args);
    }

    @Override
    public String getName() {
        return "The replacement of all imaging systems!";
    }

    @Override
    public void initialize(final Bootstrap<MonumentConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MonumentConfiguration configuration,
                    final Environment environment) {
    	DateFormat monumentDateFormat = new SimpleDateFormat(configuration.getDateFormat());
    	environment.getObjectMapper().setDateFormat(monumentDateFormat);
    }

}
