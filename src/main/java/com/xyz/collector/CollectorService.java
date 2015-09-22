package com.xyz.collector;

import com.xyz.collector.configuration.CollectorConfiguration;
import com.xyz.collector.resources.EchoResource;
import com.xyz.collector.resources.RouterResources;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;



public class CollectorService extends Service<CollectorConfiguration> {

	public static void main(String[] args) throws Exception {
        new CollectorService().run(args);
    }
	
	@Override
	public void initialize(Bootstrap<CollectorConfiguration> bootstrap) {
		bootstrap.setName("CollecorService");
		
	}

	@Override
	public void run(CollectorConfiguration conf, Environment env)
			throws Exception {
		env.addResource(new EchoResource());
		env.addResource(new RouterResources());
	}

}
