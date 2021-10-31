package com.andrej.hibernate.table_per_class;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KnifeRepo extends JpaRepository<Knife, Long> {
}
