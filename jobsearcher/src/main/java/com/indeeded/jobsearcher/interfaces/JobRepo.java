package com.indeeded.jobsearcher.interfaces;

import com.indeeded.jobsearcher.model.Jobs;
import org.springframework.data.repository.CrudRepository;

public interface JobRepo extends CrudRepository<Jobs,Integer> {
}
