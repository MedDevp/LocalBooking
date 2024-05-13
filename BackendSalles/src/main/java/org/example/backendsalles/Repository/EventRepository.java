package org.example.backendsalles.Repository;

import org.example.backendsalles.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    // Additional query methods can be defined here if needed
}
