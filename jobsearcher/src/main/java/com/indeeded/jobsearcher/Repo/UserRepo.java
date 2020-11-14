package com.indeeded.jobsearcher.Repo;
import org.springframework.data.repository.CrudRepository;
import com.indeeded.jobsearcher.model.User;
public interface UserRepo extends CrudRepository<User, Integer>
{
}
