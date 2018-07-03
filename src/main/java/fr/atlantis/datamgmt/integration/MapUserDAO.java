/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.atlantis.datamgmt.integration;

import fr.atlantis.datamgmt.domain.LoginStatus;
import fr.atlantis.datamgmt.domain.User;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author gmartin
 */
@ApplicationScoped
public class MapUserDAO implements UserDAO {

    private AtomicLong count = new AtomicLong(1);
    private Map<Long, User> users = new ConcurrentHashMap<>();
    
    @Override
    public User add(User user) {
        user.setId((count.getAndIncrement()));
        user.setStatus(LoginStatus.VALIDATED);
        users.put(user.getId(), user);
        return user;
    }
    
}
