package com.greatlearning.studentman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.studentman.repositary.Userrepositary;
import com.greatlearning.studentman.entity.User;
import com.greatlearning.studentman.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	   @Autowired
	    private Userrepositary userRepository;
	     
	    @Override
	    public UserDetails loadUserByUsername(String username)
	            throws UsernameNotFoundException {
	        User user = userRepository.getUserByUsername(username);
	         
	        if (user == null) {
	            throw new UsernameNotFoundException("Could not find user");
	        }
	         
	        retburn new MyUserDetails(user);
	    }

}
