package com.pluralshight.resource;

import com.pluralshight.model.Activity;
import com.pluralshight.model.User;
import com.pluralshight.repository.ActivityRepository;
import com.pluralshight.repository.ActivityRepositoryStub;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("activities")
public class ActivityResource {

    private ActivityRepository activityRepository = new ActivityRepositoryStub();

    @PUT
    @Path("activity")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Activity updateActivity(Activity activity) throws Exception {
        activityRepository.update(activity);
        return activity;
    }

    @DELETE
    @Path("activity")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Activity deleteActivity(Activity activity) throws Exception {
        activityRepository.delete(activity);
        return activity;
    }

    @POST
    @Path("activity")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Activity createActivity(Activity activity) {

        //verificare preluare params corect din interfata
        System.out.println(activity.toString());
        activityRepository.create(activity);
        return activity;
    }

    @GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Activity> getAllActivities() {
        return activityRepository.findAllActivities();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/dao")
    public List<Activity> getAllActivitiesDao() throws Exception {
        return activityRepository.findAllActivitiesDao();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{activityId}")
    public Activity getActivity(@PathParam("activityId") String activityId) {
        return activityRepository.findById(activityId);
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{activityId}/user")
    public User getUserActivity(@PathParam("activityId") String activityId) {
        return activityRepository.findById(activityId).getUser();
    }
}
