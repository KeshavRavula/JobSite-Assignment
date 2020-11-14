package com.indeeded.jobsearcher.interfaces;

import com.indeeded.jobsearcher.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
