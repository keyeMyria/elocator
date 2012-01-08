package feri.rvir.elocator.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import feri.rvir.elocator.rest.resource.location.LocationServerResource;
import feri.rvir.elocator.rest.resource.tracking.TrackingServerResource;
import feri.rvir.elocator.rest.resource.user.UserServerResource;
import feri.rvir.elocator.rest.resource.user.UsersServerResource;


public class RestletApplication extends Application {
	
	@Override
	public Restlet createInboundRoot() {
		Router router=new Router(getContext());
		router.attach("/users",UsersServerResource.class);
		router.attach("/users/{authToken}",UserServerResource.class);
		router.attach("/users/{authToken}/tracking",TrackingServerResource.class);
		router.attach("/users/{authToken}/location/{timestamp}",LocationServerResource.class);
		return router;
	}

}
