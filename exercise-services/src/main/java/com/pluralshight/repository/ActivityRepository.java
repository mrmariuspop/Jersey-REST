package com.pluralshight.repository;

import com.pluralshight.model.Activity;
import com.pluralshight.model.User;

import java.util.List;

public interface ActivityRepository {

    List<Activity> findAllActivities();

    List<Activity> findAllActivitiesDao() throws Exception;

    Activity findById(String activityId);

    void create(Activity activity);

    void update(Activity activity) throws Exception;

    void insert(Activity activity) throws Exception;

    void delete(Activity activity) throws Exception;
}
