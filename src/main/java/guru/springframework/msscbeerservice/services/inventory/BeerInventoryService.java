package guru.springframework.msscbeerservice.services.inventory;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface BeerInventoryService {

    Integer getOnHandInventory(UUID id);
}
