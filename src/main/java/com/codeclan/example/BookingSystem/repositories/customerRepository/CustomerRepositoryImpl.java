package com.codeclan.example.BookingSystem.repositories.customerRepository;

import com.codeclan.example.BookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.sql.rowset.serial.SerialStruct;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> GetCustomersByCourse(Long courseId) {
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("course.id", courseId));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    @Transactional
    public List<Customer> GetCustomersByTownAndCourse (String town, Long courseId) {
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("course.id", courseId));
            cr.add(Restrictions.eq("town", town));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
