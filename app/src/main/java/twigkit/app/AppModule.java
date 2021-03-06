package twigkit.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import twigkit.AbstractTwigKitModule;
import twigkit.client.service.ConfigService;
import twigkit.client.service.UserService;

/**
 * Main application module
 *
 * @author scottbrown
 */
public class AppModule extends AbstractTwigKitModule {

    private static final Logger logger = LoggerFactory.getLogger(AppModule.class);

    public AppModule() {
        super(Priority.HIGHEST);
    }

    @Override
    protected void configure() {
        bind(UserService.class);
        bind(ConfigService.class);
        logger.info("Application Module loaded!");
    }
}
