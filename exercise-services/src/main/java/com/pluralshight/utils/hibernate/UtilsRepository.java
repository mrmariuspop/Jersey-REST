package com.pluralshight.utils.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.transform.ResultTransformer;

import javax.persistence.NoResultException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Marius Pop
 * @since 30/October/2019
 */
public class UtilsRepository {
    public static List getDataAsListByAliasBean(SessionFactory sessionFactory, String query, Class type) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).list();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static List getDataAsListByAliasBean1Params(SessionFactory sessionFactory, String query, Class type, String paramName1, Object param1) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).list();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }


    public static List getDataAsList1Params(SessionFactory sessionFactory, String query, Class type, String paramName1, Object param1) throws Exception {
        try {
            Query query2 = sessionFactory.getCurrentSession().createNativeQuery(query);
            query2.setParameter(paramName1, param1);
            return query2.list();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static Object getDataAsListByAliasBean1ParamsSingleResult(SessionFactory sessionFactory, String query, Class type, String paramName1, Object param1) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).getSingleResult();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static Object getDataAsListByAliasBeanSingleResult(SessionFactory sessionFactory, String query, Class type) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).getSingleResult();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static Object getDataAsListByAliasBean2ParamssingleResult(SessionFactory sessionFactory, String query, Class type, String paramName1, Object param1, String paramName2, Object param2) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            q.setParameter(paramName2, param2);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static List getDataAsListByAliasBean2Params(SessionFactory sessionFactory, String query, Class type, String paramName1, Object param1, String paramName2, Object param2) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            q.setParameter(paramName2, param2);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).list();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static List getDataAsListByAliasBean3Params(SessionFactory sessionFactory, String query, Class type, String paramName1, Object param1, String paramName2, Object param2, String paramName3, Object param3) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            q.setParameter(paramName2, param2);
            q.setParameter(paramName3, param3);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).list();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static List getDataAsListByAliasBean4Params(SessionFactory sessionFactory, String query, Class type, String paramName1, Object param1, String paramName2, Object param2, String paramName3, Object param3, String paramName4, Object param4) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            q.setParameter(paramName2, param2);
            q.setParameter(paramName3, param3);
            q.setParameter(paramName4, param4);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).list();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static List getDataAsListByAliasBean5Params(SessionFactory sessionFactory, String query, Class type, String paramName1, Object param1, String paramName2, Object param2, String paramName3, Object param3, String paramName4, Object param4, String paramName5, Object param5) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            q.setParameter(paramName2, param2);
            q.setParameter(paramName3, param3);
            q.setParameter(paramName4, param4);
            q.setParameter(paramName5, param5);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).list();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static List getDataAsListByAliasBean6Params(SessionFactory sessionFactory, String query, Class type,
                                                       String paramName1, Object param1,
                                                       String paramName2, Object param2,
                                                       String paramName3, Object param3,
                                                       String paramName4, Object param4,
                                                       String paramName5, Object param5,
                                                       String paramName6, Object param6) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            q.setParameter(paramName2, param2);
            q.setParameter(paramName3, param3);
            q.setParameter(paramName4, param4);
            q.setParameter(paramName5, param5);
            q.setParameter(paramName6, param6);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).list();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static List getDataAsListByAliasBean7Params(SessionFactory sessionFactory, String query, Class type,
                                                       String paramName1, Object param1,
                                                       String paramName2, Object param2,
                                                       String paramName3, Object param3,
                                                       String paramName4, Object param4,
                                                       String paramName5, Object param5,
                                                       String paramName6, Object param6,
                                                       String paramName7, Object param7) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            q.setParameter(paramName2, param2);
            q.setParameter(paramName3, param3);
            q.setParameter(paramName4, param4);
            q.setParameter(paramName5, param5);
            q.setParameter(paramName6, param6);
            q.setParameter(paramName7, param7);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).list();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static List getDataAsListByAliasBean9Params(SessionFactory sessionFactory, String query, Class type,
                                                       String paramName1, Object param1,
                                                       String paramName2, Object param2,
                                                       String paramName3, Object param3,
                                                       String paramName4, Object param4,
                                                       String paramName5, Object param5,
                                                       String paramName6, Object param6,
                                                       String paramName7, Object param7,
                                                       String paramName8, Object param8,
                                                       String paramName9, Object param9) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            q.setParameter(paramName2, param2);
            q.setParameter(paramName3, param3);
            q.setParameter(paramName4, param4);
            q.setParameter(paramName5, param5);
            q.setParameter(paramName6, param6);
            q.setParameter(paramName7, param7);
            q.setParameter(paramName8, param8);
            q.setParameter(paramName9, param9);
            ResultTransformer aliasToBean = CustomTransformers.aliasToBean(type);
            return q.setResultTransformer(aliasToBean).list();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }


    public static Object getObjectById(SessionFactory sessionFactory, Class objectType, Object id) throws Exception {
        try {
            return sessionFactory.getCurrentSession().get(objectType, (Serializable) id);
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static BigDecimal getNextValue(SessionFactory sessionFactory, String query) throws Exception {
        try {
            Session session = sessionFactory.getCurrentSession();
            Query q = session.createNativeQuery(query);
            return (BigDecimal) q.getSingleResult();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
            return null;
        }
    }

    public static void create(SessionFactory sessionFactory, Object object) throws Exception {
        try {
            sessionFactory.getCurrentSession().persist(object);
        } catch (Exception e) {
            e.printStackTrace();
            throwDatabaseException(e.getMessage());
        }
    }

    public static void createOrUpdate(SessionFactory sessionFactory, Object object) throws Exception {
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(object);
        } catch (Exception e) {
            e.printStackTrace();
            throwDatabaseException(e.getMessage());
        }
    }

    public static void deleteObject(SessionFactory sessionFactory, Object object) throws Exception {
        try {
            sessionFactory.getCurrentSession().delete(object);
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
        }
    }

    public static void update(SessionFactory sessionFactory, Object object) throws Exception {
        try {
            sessionFactory.getCurrentSession().merge(object);
        } catch (Exception e) {
            e.printStackTrace();
            throwDatabaseException(e.getMessage());
        }
    }

    public static void executeQuery3Params(SessionFactory sessionFactory, String query, String paramName1, Object param1, String paramName2, Object param2, String paramName3, Object param3) throws Exception {
        try {
            Query q = sessionFactory.getCurrentSession().createNativeQuery(query);
            q.setParameter(paramName1, param1);
            q.setParameter(paramName2, param2);
            q.setParameter(paramName3, param3);
            q.executeUpdate();
        } catch (Exception e) {
            throwDatabaseException(e.getMessage());
        }
    }

    public static void throwDatabaseException(String message) throws Exception {
        throw new Exception("Database problem: " + message + " INTERNAL SERVER ERROR");
    }


}