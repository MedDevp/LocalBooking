package org.example.backendsalles.Service;

import org.example.backendsalles.Entity.Event;
import org.example.backendsalles.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }
    // Implement methods for CRUD operations
}
