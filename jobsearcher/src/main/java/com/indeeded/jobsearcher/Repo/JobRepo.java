package com.indeeded.jobsearcher.Repo;
import org.springframework.data.repository.CrudRepository;
import com.indeeded.jobsearcher.model.Jobs;
public interface JobRepo extends CrudRepository<Jobs, Integer>
{
}
