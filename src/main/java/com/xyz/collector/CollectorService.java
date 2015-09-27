package com.xyz.collector;

import com.xyz.collector.configuration.CollectorConfiguration;
import com.xyz.collector.resources.EchoResource;
import com.xyz.collector.resources.RouterResources;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class CollectorService extends Application<CollectorConfiguration> {

	public static void main(String[] args) throws Exception {
        new CollectorService().run(args);
    }

	@Override
	public void run(CollectorConfiguration conf, Environment env)
			throws Exception {
		env.jersey().register(new EchoResource());
		env.jersey().register(new RouterResources());
	}

	@Override
	public void initialize(Bootstrap<CollectorConfiguration> bootstrap) {
		//bootstrap.setName("CollecorService");
	}
}
