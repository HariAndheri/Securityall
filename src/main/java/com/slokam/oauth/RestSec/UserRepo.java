package com.slokam.oauth.RestSec;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<UserDetailsImpl, Integer> {

	@Query("select a from UserDetailsImpl u join u.authority a where u.username=?1 ")
	public Collection<GrantedAuthorityImpl> getrolesbyusername(String username);

	
	
	
	@Query(" from UserDetailsImpl u where u.username=?1 ")
	public UserDetailsImpl getuserbyusername(String username);

}
