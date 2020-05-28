package com.pluralshight.repository;

import com.pluralshight.model.Activity;
import com.pluralshight.model.User;
import com.pluralshight.utils.hibernate.UtilsRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ActivityRepositoryStub implements ActivityRepository {

    @Autowired
    SessionFactory sessionFactory;

    public List<Activity> findAllActivities() {
        List<Activity> activities = new ArrayList<Activity>();

        Activity activity1 = new Activity();

        activity1.setDescription("Swimming");
        activity1.setDuration(55);

        activities.add(activity1);

        Activity activity2 = new Activity();

        activity2.setDescription("Cycling");
        activity2.setDuration(120);

        activities.add(activity2);

        return activities;
    }

    public Activity findById(String activityId) {

        Activity activity = new Activity();

        activity.setId("1234");
        activity.setDescription("Swimming");
        activity.setDuration(55);

        User user = new User();
        user.setName("Marius");
        user.setId("111");
        activity.setUser(user);


        return activity;
    }

    public void create(Activity activity) {
        //should issue insert statement to the db;
    }

    public List<Activity> findAllActivitiesDao() throws Exception {
        return UtilsRepository.getDataAsListByAliasBean(sessionFactory, "select * from activity",Activity.class);
    }

    public void update(Activity activity) throws Exception {
        UtilsRepository.update(sessionFactory,activity);
    }

    public void delete(Activity activity) throws Exception {
        UtilsRepository.deleteObject(sessionFactory,activity);
    }

    public void insert(Activity activity) throws Exception {
        UtilsRepository.create(sessionFactory,activity);
    }

}
