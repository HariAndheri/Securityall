package com.slokam.oauth.RestSec;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepo ur;

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		Collection<GrantedAuthorityImpl> x = ur.getrolesbyusername(arg0);
		UserDetailsImpl y = ur.getuserbyusername(arg0);
		y.setAuthority(x);
		y.setPassword("{noop}"+y.getPassword());

		/*
		 * UserDetailsImpl impl = new UserDetailsImpl();
		 * impl.setAccountNonExpired(true); impl.setAccountNonLocked(true);
		 * impl.setCredentialsNonExpired(true); impl.setEnabled(true); impl.setId(1);
		 * impl.setUsername(arg0); impl.setPassword("{noop}password1");
		 * 
		 * Collection<GrantedAuthorityImpl> authority=new
		 * ArrayList<GrantedAuthorityImpl>(); impl.setAuthority(authority);
		 */

		return y;

	}

}
